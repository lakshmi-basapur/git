import java.util.*;
public class AddAccount extends CustomerDetails {

    //System.out.println("amt is ");
    Scanner aa = new Scanner(System.in);

    int amt=aa.nextInt() ;
    @Override

    void customer() {



        super.customer();

    }

   void addacc() {


        System.out.println(id);
        Scanner aa = new Scanner(System.in);
        System.out.println("enter account number");
        int accno = aa.nextInt();
        System.out.println("enter branch name");
        String branch = aa.next();

    }


   void typetransaction() {

        System.out.println("enter amount   "+amt);


        System.out.println("enter the action of your choice");
        int x = aa.nextInt();



        if (x == 1) {

            System.out.println("enter the previous amount   " + amt);
            System.out.println("enter the cretied amount   ");
            int creamt = aa.nextInt();
            amt = amt + creamt;
            System.out.println("enter the total amount " + amt);
        } else {

            System.out.println("enter the debited amount ");
            int debamt = aa.nextInt();

            amt = amt - debamt;
            System.out.println("enter the total amount   " + amt);

        }

    }
}