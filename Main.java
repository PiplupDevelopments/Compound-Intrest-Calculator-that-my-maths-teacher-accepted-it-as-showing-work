import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Intrest (0.15 = 15%)");
        double intrest = Double.valueOf(scan.nextLine());
        System.out.println("Input amount");
        double amount = Double.valueOf(scan.nextLine());
        System.out.println("Input years");
        int years = Integer.valueOf(scan.nextLine());
        System.out.println("Monthly or Anually (true = monthly, false = Yearly)");
        boolean compound = Boolean.valueOf(scan.nextLine());

        int index = 0;
        if (compound = true) {
            intrest = intrest / 12;
            intrest = intrest + 1;
            years = years * 12;
            while (years > index) {
                amount = amount * intrest;
                index++;
            }
        } else {
            intrest = intrest + 1;
            while (years > index) {

                amount = amount * intrest;
                index++;
            }
        }

        System.out.println("Final amount: " + amount);
    }
}
