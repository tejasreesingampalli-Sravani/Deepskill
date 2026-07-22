import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceSearch {

    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Smart Watch");
        products.add("Keyboard");
        products.add("Mouse");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name to search: ");
        String searchItem = sc.nextLine();

        boolean found = false;

        for (String product : products) {
            if (product.equalsIgnoreCase(searchItem)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product Found: " + searchItem);
        } else {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}