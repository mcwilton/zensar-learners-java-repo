import java.util.*;

public class Employer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tax = 0.2;
		double uif = 0.01;
		char level = 'z';
		

		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter your Name :");
	    String employeName = myObj.nextLine();
	    
	    Scanner myObj2 = new Scanner(System.in);
	    System.out.println("Enter your Salary :");
	    int employeSalary = myObj.nextInt();
	    
	    if (employeSalary < 0) {
	    	System.out.println("Invalid input");
	    	return;
	    }
	    
	    if (employeSalary <= 7333) {
	    	tax = 0;
	    	level = 'A';
	    	System.out.println("You Pay R0% Tax because you are in Level " + level);
	    }
	    else if (employeSalary > 7333 && employeSalary <= 18016){
	    	tax = 0.18;
	    	level = 'B';
	    	System.out.println("You Pay R18% Tax because you are in Level " + level);
	    }
	    else {
	    	tax = 0.18;
	    	level = 'C';
	    	System.out.println("You Pay R18% Tax because you are in Level " + level);
	    }
	    switch (level) {
	    case 'A':
		    System.out.println("***LOWER ClASS");
		    break;
	    case 'B':
	    	System.out.println("***MIDDLE CLASS***");
	    	break;
	    case 'C':
	    	System.out.println("***SOFT LIFE***");
	    	break;
	    } 
	    double calc_tax = employeSalary * tax;
	    double calc_Uif = employeSalary * uif;
	    double net_salary = employeSalary - (calc_tax + calc_Uif);
	    System.out.println("");
	    
	    System.out.println("Associate name : " + employeName);
	    System.out.println("");
	    System.out.println("Tax deduction is R"+ calc_tax);
	    System.out.println("");
	    System.out.println("Uif deduction is R"+ calc_Uif) ;
	    System.out.println("");
	    System.out.println("Take Home Salary R"+net_salary);
	    
	    
	    
	}

}
