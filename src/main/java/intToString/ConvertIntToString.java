package intToString;

import java.util.Scanner;

/** This class convert String to int.
 * @author Dmitriy Smyk
 * @version 1.0
 */
public class ConvertIntToString {
    /**
     * a variable that will show the final result
     */
   int num;

    public static void main(String[] args) {

        ConvertIntToString convert = new ConvertIntToString();
        convert.userInput();
    }

    /**
     *this method converts string to number using conversion method transformationCycle
     * firstChar - first symbol in string
     * @param input - user input of a numeric string
     * @return - returns the converted string to a number
     * @throws NumberFormatException - if user input is alphabetic rather than numbers
     */
    public String stringToInt(String input) throws NumberFormatException {

        char firstChar = input.charAt(0);
        if (firstChar == '+' | firstChar == '-') {
            transformationCycle(1, input);
            if (firstChar == '+') {
                System.out.println(num );
            } else {
                System.out.println( "-" + num);
            }
        } else {
            transformationCycle(0, input);
            System.out.println( num);
        }
        return input;
    }

    /**
     *loop to convert string to number
     * @param a - variable with which '+' or '-' or their absence is validated
     * @param input - user input of a numeric string
     */
    public  void transformationCycle(int a, String input) {

        for (int i= a; i < input.length(); i++) {
            if ((input.charAt(i) >= 48) && (input.charAt(i) <= 59)) {
                num = num * 10 + (input.charAt(i) - 48);
            } else {
                throw new NumberFormatException();
            }
        }
    }

    /**
     * this method implements custom input with the condition of string length, 0 input and empty input
     * @return user input
     */
    public String userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input = sc.nextLine();
        double maxLimit = Math.pow(2,32) - 1;
        while (true) {
            if (input.length() >= 2 && input.length() <= maxLimit || input.equals("0")) {
                stringToInt(input);
                break;
            }
            else {
                System.out.println("If you need to enter numbers [1-9]. Add '+' or '-' at the beginning");
                System.out.println("Repeat enter");
                input = sc.nextLine();
            }
        }
        return input;
    }
}
