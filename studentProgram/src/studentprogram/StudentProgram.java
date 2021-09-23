/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentprogram;
  import java.util.Scanner;

/**
 *
 * @author Kailen
 */
public class StudentProgram {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
        String naamee = "Jim Parsins";
        String StudentNumber = "128509";
        String degree = "QA Tesing";
        String modules = "Automation and Manual testing";
        double total;
        double TotalFees = 30000.00;
        double FeesPaid = 1234.50; 
        double FeesRemaining;
        double levy = 2560;
        double TotalGrade = 144;
        double TotalCredits = 12;
        double GPA;
        String[] student = {"STUDENT NAME :"+naamee , "STUDENT NUMBER :"+StudentNumber , "DEGREE ENROLLED FOR :"+degree , "MODULES REGISTERED FOR :"+modules};
        for (String i : student){
                System.out.println(i);
        }
        System.out.println("THE TOTAL FEES ARE :" + "R"+TotalFees);
        System.out.println("THE FEES PAID ARE :" + "R"+FeesPaid);
        FeesRemaining = TotalFees- FeesPaid;
        System.out.println("FEES REMAINING ARE : "+"R"+FeesRemaining);
        System.out.println("LEVIES ARE :" + "R"+levy);
        GPA = TotalGrade/TotalCredits ;
        System.out.println("OUR GPA IS :" + GPA);
       
    }
    
}
