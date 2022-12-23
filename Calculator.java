
import java.util.Scanner;  // Import the Scanner class

public class Calculator {
    public static void main(String[] args) {
        double firstNum, secondNum, result = 0;
        boolean calculated = false;
        char op;
        Scanner scn = new Scanner(System.in);  
        
        while (true) {
            System.out.print("Input the first number: ");
            firstNum = scn.nextDouble();

            System.out.print("Input the second number: ");
            secondNum = scn.nextDouble();

            System.out.print("Input operator: +, -, *, /, ^: ");
            op = scn.next().charAt(0);
            
            switch (op) {
                case '+':
                    result = firstNum + secondNum;
                    calculated = true;
                    break;
                case '-':
                    result = firstNum - secondNum;
                    calculated = true;
                    break;
                case '*':
                    result = firstNum * secondNum;
                    calculated = true;
                    break;
                case '/':
                    if(secondNum == 0) {
                        System.out.println("The division should not be zero!");
                    } else {
                        calculated = true;
                        result = firstNum / secondNum;
                    }
                    break;
                case '^':
                    result = Math.pow(firstNum, secondNum); 
                    calculated = true;
                    break;
                // case .. further operator here
                default:
                    System.out.println("Invalid operator!!! PLEASE TRY AGAIN.");
            }
            if (calculated == true) { 
                // input are accepted and result is calculated
                System.out.println("Result of " + firstNum + op + secondNum + " is " + result);
            }

            System.out.println("Do you want to continue? Y/N");
            op = scn.next().charAt(0);
            if (op != 'Y' && op != 'y') {
                // the user does not want to continue the program
                // so, exit (`break` the `while` loop)
                System.out.println("BYE");
                break;
            }
        }
    }
}
