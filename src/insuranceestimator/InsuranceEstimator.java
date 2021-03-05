
package insuranceestimator;
import java.util.Scanner;

public class InsuranceEstimator {
    
    public static Integer calculateInsurance(Integer number){
        int sum = (5*number)+300;
        return sum;
    }
    
    public static void main(String[] args) {
       try{
    int number;
    Scanner inputName = new Scanner (System.in);
    System.out.print("Please enter your age:");
    number = inputName.nextInt();
    int sum = calculateInsurance(number);
    System.out.println("Estimated Life Insurance cost is $"+ sum+"/year");
    inputName.close();
    }catch(Exception e){
      System.out.println("Please enter number only");
    }
    }
    
}
