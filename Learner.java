import java.util.Scanner;

public class Learner {

	
	public static void main(String[] args) {
		
		int n, total = 0;
		double  cost = 1500;
		int GPA = 0;
		double totalCost = 0;
		double balance = 0.0;
		double Levy = 500;
		

		
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter Student Name :");
	    String studentName = myObj.nextLine();
	    
	    if (studentName.length() <= 2) {
	    	System.out.println("Invalid input");
        	return;
	    } 
	
	    System.out.println("Enter Course Name :");
	    String course = myObj.nextLine();
	    
	    if ( course.length() <= 2) {
	    	System.out.println("Invalid input");
        	return;
	    }
	    
        System.out.print("No of Subjects for your " + course + " Course :");
        n = myObj.nextInt();
        
        if (n < 0) {
        	System.out.println("Invalid input");
        	return;
        }
        
        int marks[] = new int[n];
        System.out.println("Enter semester marks for " + n + " Subjects");
        for(int i = 0; i < n; i++)
        {
            marks[i] = myObj.nextInt();
            total = total + marks[i];
             GPA = total / n;
             totalCost = (n * cost) + Levy;
           
        }
        System.out.println("");
        
        System.out.println("Sum: "+total);
        System.out.println("GPA: "+GPA);
        System.out.println("");
        System.out.println("Course Amount:"+totalCost);
        
        System.out.println("");
        
        if (GPA < 50) {
			System.out.println("We regret to inform that You Failed:-(");
			balance = totalCost;
			System.out.println("you Owe:"+ totalCost + " Including your Levy fees");
		}else if(GPA >= 50 && GPA < 75){
			System.out.println(" ** You Passed, You got 10% discount **");
			balance = totalCost - (totalCost*0.10);
			System.out.println("You owe:"+ balance + " Including your Levy fees");
		}
		else {
			System.out.println("** Excellent you Qualify for 15% discount **");
			balance = totalCost - (totalCost*0.15);
			System.out.println("You owe: R"+ balance + " Including your Levy fees");
			
		}
        System.out.println("");
        System.out.println("**Enter Amount to Pay***");
        double Paid = myObj.nextInt();
        double FinalBalance = balance - Paid;
        System.out.println("");
        System.out.println("Amount Paid was R" + Paid);
        System.out.println("");
        if (FinalBalance != 0 ) {
        	System.out.println("Please Pay the remaining amount of R" +FinalBalance);
        }
        else {
        	System.out.println("***Successfully paid all outstanding balance***");
        }
       
	}
}
