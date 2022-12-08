import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        // int atmnumber=12345;
        int atmpin=123;
        Scanner in=new Scanner(System.in);
        System.out.println("\n\nWelcome to ATM Machine !!! -- Developed by The Terminators\n\n#####################");
        System.out.print("\n\nEnter Atm Number (1-10): ");
        int atmNumber=in.nextInt();
        System.out.print("\nEnter Pin: ");
        int pin=in.nextInt();
        if((atmNumber>0 && atmNumber<10)&&(atmpin==pin)){
            while(true){
                System.out.println("\n\nActions Available:\n1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("\nEnter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("\nEnter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("\nEnter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("\nCollect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("\nPlease enter correct choice");
                }
            }
        }
        else{
            System.out.println("\nIncorrect Atm Number or pin");
            System.exit(0);
        }


    }
}