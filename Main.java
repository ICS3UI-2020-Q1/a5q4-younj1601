import java.util.Scanner;
/**
 *Calculate the compound interest based on the users info
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for input
    Scanner input = new Scanner(System.in);

    //Get all of the information from the user
    System.out.println("Please enter a starting balance");
    double balance = input.nextDouble();

    System.out.println("Please enter your interest rate");
    double interest = input.nextDouble();

    System.out.println("Please enter the number of years you will invest for");
    int years = input.nextInt();

    //get the interest into a decimal place
    interest = interest*0.01;

    //for loop to calculate how much the user will gain
    for(int count = 1; count <= years; count++){
      balance = balance + interest*balance;
    }
    System.out.println("Your final balance would be $" + balance);
  }
}
