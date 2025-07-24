import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class HeadSets{
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand,int price, boolean available){
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getHeadsetName(){
        return headsetName;
    }
    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setHeadsetName(String headsetName){
        this.headsetName =headsetName;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(int price){
        this.price =price;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}

public class BrandSoln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets[] set = new HeadSets[4];
        for (int i=0; i<4;i++){
            String name = sc.nextLine();
            String brand = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean available = sc.nextBoolean();
            sc.nextLine();
            set[i] = new HeadSets(name, brand, price, available);
        }

        String givenBrand = sc.nextLine();


        int totalPrice = findTotalPriceForGivenBrand(set, givenBrand);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("No Headsets available with the given brand");
        }

        HeadSets result = findAvailablHeadSetWihSecondMinPrice(set);
        if (result != null) {
            System.out.println(result.getHeadsetName());
            System.out.println(result.getPrice());
        } else {
            System.out.println("No Headsets available");
        }

    }

    public static int findTotalPriceForGivenBrand(HeadSets[] set, String givenBrand){
        int sum =0;
        for(HeadSets hs: set){
            if(hs.getBrand().equalsIgnoreCase(givenBrand)){
                sum += hs.getPrice();
            }
        } return sum;
    }

    public static HeadSets findAvailablHeadSetWihSecondMinPrice(HeadSets[] set){
        List<HeadSets> availablity = new ArrayList<>();
        for(HeadSets hs: set){
            if (hs.getAvailable()){
                availablity.add(hs);
            }
        }
        if (availablity.size() < 2) return null;
        availablity.sort(Comparator.comparingInt(HeadSets::getPrice));
         
        return availablity.get(1);

        
    }

}