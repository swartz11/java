import java.util.Scanner;

class InnerTravelAgencies {
    private int regNo;
    private String agencyName; 
    private String packageType;
    private int price;
    private boolean flightFacility;

public InnerTravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
    this.regNo = regNo;
    this.agencyName = agencyName;
    this.packageType = packageType;
    this.price = price;
    this.flightFacility = flightFacility;
}

public int getRegNo(){
    return regNo;
}
public String getAgencyName(){
    return agencyName;
}
public String getPackageType(){
    return packageType;
}
public int getPrice(){
    return price;

}
public boolean getFlightFacility(){
    return flightFacility;
}

public void setRegNo(int regNo){
    this.regNo = regNo;
}
public void setAgencyName(String agencyName){
    this.agencyName = agencyName;
}
public void setPackageType(String packageType){
    this.packageType = packageType;
}
public void setPrice(int price){
    this.price = price;
}
public void setFlightFacility(boolean flightFacility){
    this.flightFacility = flightFacility;
}
}


public class TravelAgencies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        InnerTravelAgencies[] ita = new InnerTravelAgencies[4];
        for(int i=0;i<4;i++){
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean facility = Boolean.parseBoolean(sc.nextLine());
            ita[i] = new InnerTravelAgencies(id, name, type, price, facility);

        }
        int takeId =Integer.parseInt(sc.nextLine());
        String takeAgency = sc.nextLine();
        int highPackage = findAgencyWithHighestPackagePrice(ita);
        InnerTravelAgencies details = agencyDetailsforGivenIdAndType(ita, takeId, takeAgency);

        System.out.println(highPackage);
        if(details != null){ 
        System.out.println(details.getAgencyName() + ":"+ details.getPrice());
    }}

    public static int findAgencyWithHighestPackagePrice(InnerTravelAgencies[] ita){
        int max =Integer.MIN_VALUE;
        for(InnerTravelAgencies in: ita){
            
            if(in.getPrice()>max){
                max= in.getPrice();
            }
        } 
        return max;
    }

    public static InnerTravelAgencies agencyDetailsforGivenIdAndType(InnerTravelAgencies[] ita, int takeId, String takeAgency){
        for(InnerTravelAgencies in: ita){
        if(in.getFlightFacility() && in.getRegNo()==takeId && in.getPackageType().equalsIgnoreCase(takeAgency)){
            return in;
        }
    }
    return null;
}
}
