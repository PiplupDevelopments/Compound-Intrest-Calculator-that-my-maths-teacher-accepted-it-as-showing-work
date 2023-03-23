import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Intrest (1.15 = 15%)");
        double intrest = Double.valueOf(scan.nextLine());
        System.out.println("Input amount");
        double amount = Double.valueOf(scan.nextLine());
        System.out.println("Input years");
        int years = Integer.valueOf(scan.nextLine());
        int index = 0;
        while (years > index) {
            amount = amount * intrest;
            index++;
        }
        System.out.println("Final amount: " + amount);
    }
}