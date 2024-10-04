import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};

        Translator translator = new Translator(alphabetic, numeric);

        boolean play = true;
        String invalidInput = "invalid input";

        Scanner scanner = new Scanner(System.in);

        while (play) {
            System.out.println("Type 'q' to quit \n Type 'p' to play");

            String input = scanner.nextLine();

            if (input.equals("q")) {
                play = false;
            } else if (input.equals("p")) {
                System.out.println("Type a number from 0 to 9");

                int number = Integer.parseInt(scanner.nextLine());

                if (number >= 0 && number < 10) {
                    String result = translator.translate(number);
                    System.out.println("The translation of the number " + number + " is: " + result);
                } else {
                    System.out.println(invalidInput);
                }
            } else {
                System.out.println(invalidInput);
            }
        }
    }
}
