import java.util.ArrayList;
import java.util.Scanner;

public class Activity1 {

    static void act() {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Integer> Price = new ArrayList<>();

        String order;
        int price1;
        while (true) {
            System.out.println("Menu:  1. Add order || 2. Cart || 3. cancel order");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Whats your order?: ");
                order = sc.nextLine();

                System.out.print("Enter the price: ");
                price1 = sc.nextInt();

                data.add(order);
                Price.add(price1);

            }if (choice == 2) {
                System.out.println("Cart: \n");
                if (data.isEmpty()) {
                    System.out.println("No Item yet\n");
                }int j = 1;
                for (int i = 0; i < data.size(); i++) {

                    System.out.print(j++ + "." + data.get(i) + "= "+ Price.get(i) + "\n");
                    System.out.println("");

                }
                int sum = 0;
                for (int g : Price) {
                    sum += g;
                }
                System.out.println("---------------------");
                System.out.println("TOTAL: " + sum + "\n");

            } if (choice == 3) {
                System.out.print("thank you");

                break;
            }
        }sc.close();
    }

}