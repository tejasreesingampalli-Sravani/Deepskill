class Customer {
    int customerId;
    String name;
    int age;
    double loanInterestRate;

    Customer(int customerId, String name, int age, double loanInterestRate) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.loanInterestRate = loanInterestRate;
    }
}

public class LoanDiscount {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer(1, "John", 65, 8.5),
            new Customer(2, "Mary", 45, 9.0),
            new Customer(3, "David", 70, 7.5)
        };

        for (Customer customer : customers) {
            if (customer.age > 60) {
                customer.loanInterestRate -= 1.0;
                System.out.println(customer.name +
                        " - New Interest Rate: " +
                        customer.loanInterestRate + "%");
            }
        }
    }
}