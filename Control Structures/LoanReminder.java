import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Loan {
    int loanId;
    String customerName;
    LocalDate dueDate;

    Loan(int loanId, String customerName, LocalDate dueDate) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.dueDate = dueDate;
    }
}

public class LoanReminder {
    public static void main(String[] args) {
        Loan[] loans = {
            new Loan(101, "John", LocalDate.now().plusDays(10)),
            new Loan(102, "Mary", LocalDate.now().plusDays(40)),
            new Loan(103, "David", LocalDate.now().plusDays(25))
        };

        for (Loan loan : loans) {
            long daysLeft = ChronoUnit.DAYS.between(
                    LocalDate.now(), loan.dueDate);

            if (daysLeft <= 30 && daysLeft >= 0) {
                System.out.println("Reminder: Loan for "
                        + loan.customerName
                        + " is due on "
                        + loan.dueDate);
            }
        }
    }
}