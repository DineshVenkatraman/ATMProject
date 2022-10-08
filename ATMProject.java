package ATMConceptProject;

import java.util.*;
import java.io.*;
class ATMProject
{
    DataInputStream da=new DataInputStream(System.in);
    Scanner scanner=new Scanner(System.in);
    public void atminput()
    {
        try{
            int pin=1234;
            int balance =10000;
            int addamount=0;
            int takeamount=0;
            String name;
            System.out.println("Enter your pin Number :");
            int password=scanner.nextInt();
            if(password==pin)
            {
                System.out.println("Enter your Name :");
                name=da.readLine();
                System.out.println("Welcome !!! "+name);
                while(true)
                {
                    System.out.println("-----------------------");
                    System.out.println("Press 1 to check your Balance");
                    System.out.println("Press 2 to add amount");
                    System.out.println("Press 3 to take amount");
                    System.out.println("Press 4 to take receipt");
                    System.out.println("Press 5 to EXIT");
                    System.out.println("-----------------------");
                    int opt=scanner.nextInt();
                    if(opt==1)
                    {
                        System.out.println("Your current Balance :"+balance);
                    }
                    else if(opt==2)
                    {
                        System.out.println("How much amount did you add to your account");
                        addamount=scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance=addamount+balance;
                    }
                    else if(opt==3)
                    {
                        System.out.println("How much amount did you take from your account");
                        takeamount=scanner.nextInt();
                        if(takeamount>balance)
                        {
                            System.out.println("Your Balance is insufficient");
                        }
                        else
                        {
                            System.out.println("successfully taken");
                            balance=balance-takeamount;
                        }
                    }
                    else if(opt==4)
                    {
                        System.out.println("Welcome to ABC BANK");
                        System.out.println("Available Balance : "+balance);
                        System.out.println("Amount Deposited : "+addamount);
                        System.out.println("Amount Taken : "+takeamount);
                        System.out.println("Thank you for Comming!!!");
                    }
                    else if(opt==5)
                    {
                        System.out.println("Thank you");
                        break;
                    }
                }
            }
            else
            {
                System.out.println("Wrong Pin Number");
            }
        }catch(Exception o){}
    }
}