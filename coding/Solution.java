import java.util.Scanner;

class Projector{
    private int projectorId;
    private String projectorName;
    private int price;
    private int rating;
    private String availableIn;

    public Projector(int projectorId, String projectorName, int price, int rating, String availableIn){
        this.projectorId = projectorId;
        this.projectorName = projectorName;
        this.price = price;
        this.rating = rating;
        this.availableIn = availableIn;
    }

    public int getProjectorId(){
        return projectorId;
    }

    public String getProjectorName(){
        return projectorName;
    }

    public int getPrice(){
        return price;
    }

    public int getRating(){
        return rating;
    }
    
    public String getAvailableIn(){
        return availableIn;
    }

    public void setProjectorId(int projectorId){
        this.projectorId =projectorId;
    }

    public void setProjectorName(String projectorName){
        this.projectorName = projectorName;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public void setAvailableIn(String availableIn){
        this.availableIn = availableIn;
    }
    
}

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Projector[] proj = new Projector[4];

        for (int i=0; i < 4; i++){
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int rating = Integer.parseInt(sc.nextLine());
            String availableIn = sc.nextLine();
            proj[i] = new Projector(id, name, price, rating, availableIn);
        }

        int ratingInput = Integer.parseInt(sc.nextLine());
        Projector result = findMaxPriceByRating(proj, ratingInput);

        if ( result != null){
        System.out.println(result.getProjectorId());
    } else {
        System.out.println("NO such projector found.");
    }
    sc.close();
    }
        
    public static Projector findMaxPriceByRating(Projector[] proj, int ratingInput){
        
        Projector maxProjector = null;
        int maxPrice = Integer.MIN_VALUE;

        for (Projector p: proj){
            if (p.getRating() > ratingInput && p.getAvailableIn().equalsIgnoreCase("TataCliq")){
                if (p.getPrice() > maxPrice){
                    maxPrice = p.getPrice();
                    maxProjector = p;
                }
            }
        }
        return maxProjector;    
        }
    
    
        
}