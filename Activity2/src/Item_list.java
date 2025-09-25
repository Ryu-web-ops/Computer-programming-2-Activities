import java.util.ArrayList;
import java.util.Scanner;
    public class Item_list {

        String item_name;
        int price;
        int sold;
        int stock;

        public Item_list(String item_name, int price, int sold, int stock) {
            this.item_name = item_name;
            this.price = price;
            this.sold = sold;
            this.stock = stock;
        }

        public void log_details() {
            System.out.println("Item: " + this.item_name);
            System.out.println("Price: " + this.price);
            System.out.println("Sold: "+ this.sold);
            System.out.println("Stocks: " + this.stock);
        }
        public void buy_item () {

            if (stock > 0) {
                stock = stock - 1;
                sold = sold + 1;
                System.out.println("Thanks  for you rpurhase");
            } else if (stock == 0) {
                System.out.println("Out of stock");
            }
        }

           public void return_item () {
                if (sold > 0) {
                    stock = stock + 1;
                    sold = sold - 1;
                    System.out.println ("Return successful.");
                } else if (sold == 0) {
                    System.out.println("you have returned all the items \n");
                }
            }

    public static void main (String []args) {
        Item_list obj = new Item_list("Notebook", 20, 0, 3);
        Item_list obj2 = new Item_list("Notebook", 20, 0, 5);
        Item_list obj3 = new Item_list("Notebook", 20, 0, 1);

        System.out.println("buy 3 item,  return 1");
        obj.log_details();
        System.out.println("");
        obj.buy_item();
        obj.buy_item();
        obj.buy_item();


        System.out.println("buy 2 item,  return 2");

        obj.log_details();
        System.out.println("");
        obj.buy_item();
        obj.buy_item();
        obj.return_item();
        obj.return_item();


        System.out.println("Set 5 stocks,  return 3");

        obj2.log_details();
        System.out.println("");
        obj2.return_item();
        obj2.return_item();
        obj2.return_item();


        System.out.println("Set 1 stocks,  buy 2");
        obj3.log_details();
        System.out.println("");
        obj3.buy_item();
        obj3.buy_item();

    }
}
