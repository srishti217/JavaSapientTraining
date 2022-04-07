
import java.util.Scanner;

public class BankMain {
	 public static void main(String args[])
	    {
	        Scanner s=new Scanner(System.in);
	        CurrentAcc ca=new CurrentAcc();
	        BankAccount acc=new BankAccount();
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("Enter owner Name ");
	        acc.setOwnerName(sc.nextInt());
	        sc.nextLine();
	        
	        System.out.println("Enter owner state");
	        acc.setState(sc.nextInt());
	        sc.nextLine();
	        
	        
	        System.out.println("Enter account type: ");
	        acc.setAccountType(sc.nextLine());
	        
	        
	        ca.deposit();
	        ca.withdraw();
	        SavingsAcc sa=new SavingsAcc();
	        sa.getdata();
	        sa.putdata();
	        sa.deposit1();
	        sa.withdraw1();
	        DematAcc da=new DematAcc();
	        da.getdata();
	        da.putdata();
	        da.deposit2();
	        da.withdraw2();
	        int ch;
	        System.out.println("enter ur choice");
	        ch=s.nextInt();
	        System.out.println("Enter 1 for current acc details");
	        System.out.println("Enter 2 for saving acc details");
	        switch(ch)
	        {
	            case 1:
	                    int choice;
	                    System.out.println("1.withdraw");
	                    System.out.println("2.deposite");
	                    System.out.println("enter the choice");
	                    choice=s.nextInt();
	                    switch(choice)
	                    {
	                        case 1:
	                                ca.withdraw();
	                                break;
	                        case 2:
	                                ca.deposit();
	                                break;
	                        default:
	                                System.out.println("wrong choice");
	                                break;
	                    }
	                break;
	            case 2:
	                    int choice1;
	                    System.out.println("1.withdraw1");
	                    System.out.println("2.deposite2");
	                    System.out.println("enter the choice");
	                    choice1=s.nextInt();
	                    switch(choice1)
	                    {
	                        case 1:
	                                sa.withdraw1();
	                                break;
	                        case 2:
	                                sa.deposit1();
	                                break;
	                        default:
	                                System.out.println("wrong choice");
	                                break;
	                    }
	 
	                break;
	            case 3:
                    int choice2;
                    System.out.println("1.withdraw1");
                    System.out.println("2.deposite2");
                    System.out.println("enter the choice");
                    choice1=s.nextInt();
                    switch(choice2)
                    {
                        case 1:
                                da.withdraw1();
                                break;
                        case 2:
                                da.deposit1();
                                break;
                        default:
                                System.out.println("wrong choice");
                                break;
                    }
 
                break;
	            default:
	                System.out.println("u entered wrong choice");
	                
	       } 
	        
	    }
}