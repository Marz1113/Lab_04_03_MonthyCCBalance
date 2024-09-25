public class Main
{
    public static void main(String[] args)
    {
        double balance = 5000.00;
        double interestRate = .17;

        double firstmonthInterest = balance + interestRate;
        double balanceAfterMonth = balance + firstmonthInterest;

        double secondMonthInterest = balanceAfterMonth + interestRate;
        double balanceAfterTwoMonth = balanceAfterMonth + secondMonthInterest;

        System.out.println("the balance after one month is: $" + balanceAfterMonth);
        System.out.println("the interest due after one month passes is: $" + firstmonthInterest);
        System.out.println("the balance after two months is: $" + balanceAfterTwoMonth);
        System.out.println("the interest due after two months is: $" + secondMonthInterest);
    }
}