class Customer {
    int customerId;
    String name;
    double balance;
    boolean isVIP;

    Customer(int customerId, String name, double balance) {
        this.customerId = customerId;
        this.name = name;
        this.balance = balance;
        this.isVIP = false;
    }
}

public class VIPPromotion {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer(1, "John", 15000),
            new Customer(2, "Mary", 8000),
            new Customer(3, "David", 12000)
        };

        for (Customer customer : customers) {
            if (customer.balance > 10000) {
                customer.isVIP = true;
            }

            System.out.println(customer.name +
                    " - VIP Status: " +
                    customer.isVIP);
        }
    }
}