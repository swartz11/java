import java.util.*;

class Headset {
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    // Parameterized Constructor
    public Headset(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    // Getters and Setters
    public String getHeadsetName() {
        return headsetName;
    }

    public void setHeadsetName(String headsetName) {
        this.headsetName = headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

public class HeadSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Headset[] headsets = new Headset[4];

        for (int i = 0; i < 4; i++) {
            String name = sc.nextLine();
            String brand = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            boolean available = Boolean.parseBoolean(sc.nextLine());

            headsets[i] = new Headset(name, brand, price, available);
        }

        String searchBrand = sc.nextLine();

        int totalPrice = findTotalPriceForGivenBrand(headsets, searchBrand);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("No Headsets available with the given brand");
        }

        Headset secondMin = findAvailableHeadsetWithSecondMinPrice(headsets);
        if (secondMin != null) {
            System.out.println(secondMin.getHeadsetName());
            System.out.println(secondMin.getPrice());
        } else {
            System.out.println("No Headsets available");
        }

        sc.close();
    }

    public static int findTotalPriceForGivenBrand(Headset[] headsets, String brand) {
        int total = 0;
        for (Headset h : headsets) {
            if (h.getBrand().equalsIgnoreCase(brand)) {
                total += h.getPrice();
            }
        }
        return total;
    }

    public static Headset findAvailableHeadsetWithSecondMinPrice(Headset[] headsets) {
        List<Headset> availableList = new ArrayList<>();
        for (Headset h : headsets) {
            if (h.isAvailable()) {
                availableList.add(h);
            }
        }

        if (availableList.size() < 2) {
            return null;
        }

        // Sort by price
        availableList.sort(Comparator.comparingInt(Headset::getPrice));

        return availableList.get(1); // second min
    }
}
