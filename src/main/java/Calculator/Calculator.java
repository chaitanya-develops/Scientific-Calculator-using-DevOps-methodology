package Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;


public class Calculator {
    private static final Scanner input = new Scanner(System.in);
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int choice;
        System.out.println("----------------------------------------------------------------");
        System.out.println("                       Scientific Calculator                    ");
        System.out.println("----------------------------------------------------------------");
        System.out.println(" ");
        while (true){
            System.out.println("Choose an operation : ");
            System.out.println("1. Square Root");
            System.out.println("2. Exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    double number;
                    double result;
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("                       SQUARE ROOT                              ");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Enter a positive number to calculate square root : ");
                    number = input.nextDouble();
                    result = calculator.squareRoot(number);
//                    System.out.println("The square root of [" + number + "] is [" + result + "]");
                    System.out.println("√" + number + " = " + result);
                    logger.info("[SQRT] - INPUT : "+ number + " - OUTPUT : " + result);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Exiting . . .");
                    return;
                default:
                    return;
            }
        }
    }
    public double squareRoot(double number){
        return Math.sqrt(number);
    }

}
