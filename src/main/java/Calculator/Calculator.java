package Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Calculator {
    private static final Scanner input = new Scanner(System.in);
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        while (true){
            int choice;
            System.out.println("----------------------------------------------------------------");
            System.out.println("                       Scientific Calculator                    ");
            System.out.println("----------------------------------------------------------------");
            System.out.println(" ");
            System.out.println("Choose an operation : ");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");
            try {
                choice = input.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Wrong Input Choose from the given option only.");
                break;
            }

            switch (choice){
                case 1:
                    double sqrtNumber;
                    double sqrtResult;
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("                       SQUARE ROOT                              ");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Enter a positive number to calculate square root : ");

                    sqrtNumber = input.nextDouble();
                    if (sqrtNumber>=0){
                        sqrtResult = calculator.squareRoot(sqrtNumber);
                    }
                    else{
                        System.out.println("Positive Numbers only!!");
                        logger.info("[SQRT] - INPUT : "+ sqrtNumber + " - OUTPUT : " + "Not a positive number");
                        break;
                    }


//                    System.out.println("The square root of [" + number + "] is [" + result + "]");
                    System.out.println("√" + sqrtNumber + " = " + sqrtResult);
                    logger.info("[SQRT] - INPUT : "+ sqrtNumber + " - OUTPUT : " + sqrtResult);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 2:
                    int factNumber;
                    int factResult;
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("                       Factorial                                ");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Enter a positive integer to calculate factorial : ");
                    factNumber = input.nextInt();
                    if(factNumber>=0){
                        factResult = calculator.factorial(factNumber);
                    }
                    else{
                        System.out.println("Positive Integers only !!!");
                        logger.info("[FACT] - INPUT : "+ factNumber + " - OUTPUT : " + "Not a positive number");
                        break;
                    }

                    System.out.println("!" + factNumber + " = " + factResult);
                    logger.info("[FACT] - INPUT : "+ factNumber + " - OUTPUT : " + factResult);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 3:
                    double logNumber;
                    double logResult;
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("                       Natural Logarithm                        ");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Enter a positive number to calculate natural logarithm : ");
                    logNumber = input.nextDouble();
                    if(logNumber>=0){
                        logResult = calculator.naturalLog(logNumber);
                    }
                    else{
                        System.out.println("Positive numbers only !!!");
                        logger.info("[LOGe] - INPUT : "+ logNumber + " - OUTPUT : " + "Not a positive number");
                        break;
                    }

                    System.out.println("log("  + logNumber + ") = " + logResult);
                    logger.info("[LOGe] - INPUT : "+ logNumber + " - OUTPUT : " + logResult);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 4:
                    double powerNumber1;
                    double powerNumber2;
                    double powerResult;
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("                       Power Function                           ");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("Enter base number to calculate the power : ");
                    powerNumber1 = input.nextDouble();
                    System.out.println("Enter power to raise for the base number : ");
                    powerNumber2 = input.nextDouble();
                    powerResult = calculator.powerFunction(powerNumber1,powerNumber2);
                    System.out.println( powerNumber1 + "^" + powerNumber2 + " = " + powerResult);
                    logger.info("[POW] - INPUT : "+ powerNumber1 + "," +powerNumber2 + " - OUTPUT : " + powerResult);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;

                case 5:
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

    public Integer factorial(int number){
        int result = 1;
        while (number>0) {
            result = result * number;
            number--;
        }
        return result;
    }

    public double naturalLog(double number){
        return Math.log(number);
    }

    public double powerFunction(double number1,double number2){
        return Math.pow(number1,number2);
    }


}
