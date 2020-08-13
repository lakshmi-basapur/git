import java.util.Scanner;

public class CustomerDetails {

        Scanner sc = new Scanner(System.in);
    int i = 1000;
    int id = i + 1;

        void customer() {

            {


                if (id > 1000) {
                    System.out.println("enter your customerid" + id);
                    System.out.println("enter your name");
                    String name = sc.next();
                    System.out.println("enter your age");
                    int age = sc.nextInt();
                    System.out.println("enter your mobno");
                    int mobno = sc.nextInt();
                    System.out.println("enter your address");
                    String address = sc.next();
                    System.out.println("enter your id details");
                    System.out.println("ID type is  ");
                    String Idtype = sc.next();
                    System.out.println("enter your ID number  ");
                    int Idno = sc.nextInt();
                    System.out.println("sex");
                    String sex = sc.next();
                    System.out.println("enter your nominee name");
                    String nomineename = sc.next();


                } else
                    {
                    System.out.println("account already exist");
                   }
            }


        }


    }





