import java.util.Scanner;

public class Atm {
    int bal=1000;
    void deposite(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount to deposite");
        int amt=sc.nextInt();
        bal=bal+amt;
    }
    void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount to withdraw");
        int withdraw=sc.nextInt();
        if(bal>=withdraw){
            bal=bal-withdraw;
            System.out.println("Withdraw successful");
            System.out.println("Balance: "+bal);
        }
        else{
            System.out.println("Insufficent balance");
        }
    }
    void balance(){
        System.out.println("Balance: "+bal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm obj = new Atm();
        System.out.println("Enter account number:");
        String acc = sc.nextLine();

        System.out.println("Account number: " + acc);
        while(true){
            System.out.println("1) Deposite\n" +
                    "2) Withdraw\n" +
                    "3) Balance\n" +
                    "4) Exit");
            System.out.println("Enter Your Choice");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    obj.deposite();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3:
                    obj.balance();
                    break;
                case 4: System.exit(1);
            }
        }
    }
}