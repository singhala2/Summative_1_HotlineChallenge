import java.util.Scanner; //import Scanner for input

public class Main
{
    public static int convertNumber(char letter) //converts the input from a character to a number/integer
    {
        int number = 0;

        //switch equates certain upper-case value characters to number values based on their position on a feature phone keypad
        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
                number = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                number = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                number = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                number = 9;
        }
        return number; //returns the converted character in the form of an integer
    }

    public static void main(String[] args)
    {
        String startingNumbers = "1800-"; //the beginning of the 1800 hotline number

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word or a string: ");
        String stringVal = in.nextLine(); //takes in the string inputted by the user
        String stringValSpaceless = stringVal.replaceAll(" ", ""); //removes all spaces

        System.out.print(startingNumbers); //prints 1800- to start the hotline number and doesn't break a line

        //for statement converting and printing first three characters of inputted string to numbers
        for (int i = 0; i < 3; i++) {
            if (Character.isLetter(stringValSpaceless.charAt(i)))
                System.out.print(convertNumber(Character.toUpperCase(stringValSpaceless
                        .charAt(i))));
            else
                System.out.print(stringValSpaceless.charAt(i));
        }

        System.out.print("-");

        for (int i = 3; i < 7; i++) {
            if (Character.isLetter(stringValSpaceless.charAt(i)))
                System.out.print(convertNumber(Character.toUpperCase(stringValSpaceless
                        .charAt(i))));
            else
                System.out.print(stringValSpaceless.charAt(i));
        }
    }
}

