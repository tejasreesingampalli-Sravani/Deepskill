import java.util.Scanner;

public class FinancialForecasting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = principal * Math.pow((1 + rate / 100), years);

        System.out.printf("Forecasted Amount after %d years = %.2f%n",
                years, futureValue);

        sc.close();
    }
}