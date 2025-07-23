import java.util.Scanner;

class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private int price;
    private int rating;
    
    public Resort(int resortId, String resortName, String category, int price, int rating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    public int getResortId(){
        return resortId;
    }
    public String getResortName(){
        return resortName;
    }
    public String getCategory(){
        return category;
    }
    public int getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }

    public void setResortId(int resortId){
        this.resortId = resortId;
    }
    public void setResortName(String resortName){
        this.resortName = resortName;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setRating(int rating){
        this.rating = rating;
    }

    
}

public class ResortSoln{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] valley = new Resort[4];
        for (int i=0; i<4; i++){
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String category = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            int rating = Integer.parseInt(sc.nextLine());
            valley[i] = new Resort(id, name, category, price, rating);
        }

        String catResort = sc.nextLine();
        int result = findAvgPriceByCategory(valley, catResort);
        if (result>0){
            System.out.println(result);
        }else{
            System.out.println("no resort found");
        }
    }


    public static int findAvgPriceByCategory(Resort[] valley, String catResort){
        int count =0;
        int sum =0;
        int avgPrice =0;
        for (Resort v:valley){
            if (v.getRating()>4 && v.getCategory().equalsIgnoreCase(catResort)){
                sum += v.getPrice();
                count++;
            }
            }
            if(count>0){avgPrice =  sum/count;}
         return avgPrice;
    }
}
