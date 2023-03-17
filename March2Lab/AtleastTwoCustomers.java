package March2Lab;

public class AtleastTwoCustomers {
    public static void main(String[] args) {
        customer c = new customer();

        c.setAccountNumber(6567526572L);
        c.setAccountName("Kashish");
        c.setAccountBalance(50000);
        c.setWithdrawAmount(2000);

        System.out.println("First Account Number is: "+c.getAccountNumber());
        System.out.println("Account Name is: "+c.getAccountName());
        System.out.println("Account Balance is: "+c.getAccountBalance());
        System.out.println("Withdraw Amount is: "+c.getWithdrawAmount());

        c.setAccountNumber1(6473267477L);
        c.setAccountName1("Aakash");
        c.setAccountBalane1(100000);
        c.setWithdrawAmount1(4000);

        System.out.println("Second Account Number is: "+c.getAccountNumber1());
        System.out.println("Account Name is: "+c.getAccountName1());
        System.out.println("Account Balance is: "+c.getAccountBalane1());
        System.out.println("Withdraw Amount is: "+c.getWithdrawAmount1());
    }
}
