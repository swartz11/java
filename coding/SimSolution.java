import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Sim {
    private int id;
    private String company;
    private int balance;
    private double ratePerSecond;
    private String circle;

    public Sim(int id, String company, int balance, double ratePerSecond, String circle) {
        this.id = id;
        this.company = company;
        this.balance = balance;
        this.ratePerSecond = ratePerSecond;
        this.circle = circle;
    }

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public int getBalance() {
        return balance;
    }

    public double getRatePerSecond() {
        return ratePerSecond;
    }

    public String getCircle() {
        return circle;
    }

    public void setSim(int id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond = ratePerSecond;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}

public class SimSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sim[] air = new Sim[4];

        for (int i = 0; i < 4; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int amt = Integer.parseInt(sc.nextLine());
            double rate = Double.parseDouble(sc.nextLine());
            String cir = sc.nextLine();
            air[i] = new Sim(id, name, amt, rate, cir);
        }

        String search_circle = sc.nextLine();
        double search_rate = Double.parseDouble(sc.nextLine());

        Sim[] result = matchAndSort(air, search_circle, search_rate);

        for (Sim sim : result) {
            System.out.println(sim.getId());
        }

        sc.close();
    }

    public static Sim[] matchAndSort(Sim[] air, String search_circle, double search_rate) {
        List<Sim> filtered = new ArrayList<>();

        for (Sim a : air) {
            if (a.getCircle().equalsIgnoreCase(search_circle) && a.getRatePerSecond() < search_rate) {
                filtered.add(a);
            }
        }
        filtered.sort((a, b) -> b.getBalance() - a.getBalance());
        // filtered.sort(Comparator.comparingInt(Sim::getBalance).reversed());

        return filtered.toArray(new Sim[0]);
    }
}
