import java.util.Scanner;
class Bank
{
	static String name;
	static String address;
	static Long adharNo;
	static Long phoneNo;
	static double bal;
	static int upiPin;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//outer loop
		for (; ; )
		 {
		   System.out.println("*****Welcome to LakshmiChitFund");
		   System.out.println();
		   System.out.println("1. Create Account");
		   System.out.println("2. Existing Account Holder");
		   System.out.print("Enter a option:");
		   int option=sc.nextInt();
		   System.out.println();
		   switch(option)
		   {
		   case 1:{
		   	    System.out.println("***Create Account Holder***");
		   	    sc.nextLine();
		   	    System.out.print("Enter your name:");
		   	    name=sc.nextLine();
		   	    System.out.print("Enter your address:");
		   	    address=sc.nextLine();
		   	    System.out.print("Phone number:");
		   	    phoneNo=sc.nextLong();
		   	    System.out.print("Enter your Adhar number:");
		   	    adharNo=sc.nextLong();
		   	    System.out.print("Deposit Amount:");
		   	    bal=sc.nextDouble();
		   	    System.out.print("Enter a upi pin:");
		   	    upiPin=sc.nextInt();
		   	    System.out.println("Account craeted successfully.");
		   	    System.out.println();
		   	    break;
		      }
		  case 2:{
                 for(;;)
                 {
                 	System.out.println("***features***");
                 	System.out.println("1.check balance 2.Deposit 3.Withdraw 4.Info 5.Logout ");
                 	System.out.println();
                 	System.out.print("Enter an option:");
                 	int opt=sc.nextInt();
                 	switch(opt)
                 	{
                 	case 1:{
                 		System.out.println("***Check Balance***");
                 		System.out.print("Enter  upi pin:");
                 		int userPin=sc.nextInt();
                 		if(userPin==upiPin)
                 		{
                 			System.out.println("your account balance is:"+bal+"Rs");
                 		}else 
                 		{
                 			System.out.println("wrong Upi Pin");
                 		}
                 		break;
                 	  }
                 	case 2:{
                 		System.out.println("***Deposit amount***");
                 		System.out.println();
                 		System.out.print("Enter Amount:");
                 		double depAmount=sc.nextDouble();
                 		bal+=depAmount;
                 		System.out.println("Amount deposited successfully");
                 		break;
                 	  }
                 	case 3:{
                 		System.out.println("***Withdraw amount***");
                 		System.out.println();
                 		System.out.print("Enter upi pin:");
                 		int userPin1=sc.nextInt();
                 		if(userPin1==upiPin)
                 		{
                 			System.out.print("Enter an amount:");
                 		    double withdrawAmount=sc.nextDouble();
                 		    if(withdrawAmount<=bal)
                 		    {
                 		    	System.out.println("Amount withdraw successfully.");
                 		    	bal=bal-withdrawAmount;
                 		    }else 
                 		    {
                 		    	System.out.println("Insufficient Funds");
                 		    }
                 		
                 		}else 
                 		{
                 			System.out.println("Wrong upi Pin");
                 		}
                 		break;
                 	}
                 case 4:{
                 	System.out.println("***Account info***");
                 	System.out.println();
                 	System.out.println("Account holder name:"+name);
                 	System.out.println("Address:"+address);
                 	System.out.println("phone Number:"+phoneNo);
                 	System.out.println("Adhar Number:"+adharNo);
                 	break;
                 }
             case 5:{
             	System.exit(0);
             }
         default:System.out.println("Invalid option");break;

                 	}
                 }

		     }
		 default:System.out.println("Invalid option");break;
 
		   }	
		 }
	}
}