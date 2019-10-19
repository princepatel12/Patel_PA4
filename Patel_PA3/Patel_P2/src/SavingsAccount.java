public class SavingsAccount {

    static private double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount()
    {

    }

    public SavingsAccount(double savingBalance)
    {
        this.savingsBalance=savingBalance;
    }

    public double getSavingBalance()
    {
        return this.savingsBalance;
    }

    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyInt;
        monthlyInt= (double)(this.savingsBalance * annualInterestRate/12);
        this.savingsBalance += monthlyInt;
    }


    public static void main(String[] args) {

        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);

        int total = 0;


        SavingsAccount.modifyInterestRate (0.04);
        System.out.println(" Balance for Saver 1");
        for(int i=0; i<12; i++) {

            saver1.calculateMonthlyInterest();

            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("\n Balance for Saver 2\n");
        for(int i=0; i<12; i++) {

            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }

        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("Interest rate to 0.05 Printing Balance for Saver 1");
        for(int i=0; i<12; i++) {

            saver1.calculateMonthlyInterest();

            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("\n Interest rate to 0.05 Printing Balance for Saver 2\n");
        for(int i=0; i<12; i++) {

            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }

    }
}