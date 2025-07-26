import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

    public static void main(String[] args) {
        HashSet<Integer> secretNumbers = randomNumberGenerator();
        String stringNumber = setToStringConverter(secretNumbers);
        System.out.println(stringNumber);
        System.out.println("Geheime code gegenereerd. Probeer te raden!");
        feedback(stringNumber);
    }

    public static HashSet<Integer> randomNumberGenerator(){
        Random random = new Random();
        HashSet<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size() < 4) {
            randomNumbers.add(random.nextInt(10));
        }

        return randomNumbers;
    }

    public static String setToStringConverter(HashSet<Integer> secretNumbers){
        StringBuilder numbersString = new StringBuilder();
        for (Integer secretNumber : secretNumbers) {
            numbersString.append(secretNumber.toString());
        }

        return numbersString.toString();
    }


    public static void feedback(String stringNumber) {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        String invalidInput = "Ongeldige invoer";

        while (play) {
            System.out.println("\nType 's' om te stoppen \nType 'g' om te gokken");

            String input = scanner.nextLine();

            if (input.equals("s")) {
                play = false;
                System.out.println("Spel gestopt.");
            } else if (input.equals("g")) {
                System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
                System.out.println("Doe een gok, Let op: vul 4 getallen in.");
                String guess = scanner.nextLine();

                if (guess.length() != 4) {
                    System.out.println("Ongeldige invoer, vul precies 4 cijfers in.");
                    continue;
                }

                if (Objects.equals(guess, stringNumber)) {
                    System.out.println("Gefeliciteerd! Je hebt het goed geraden: " + stringNumber);
                    play = false;
                } else {
                    StringBuilder feedback = new StringBuilder();

                    for (int i = 0; i < 4; i++) {
                        if (guess.charAt(i) == stringNumber.charAt(i)) {
                            feedback.append("+");
                        } else if (stringNumber.contains(String.valueOf(guess.charAt(i)))) {
                            feedback.append("O");
                        } else {
                            feedback.append("X");
                        }
                    }

                    System.out.println(feedback);
                }
            } else {
                System.out.println(invalidInput);
            }
        }
        scanner.close();
    }
}

//HashSet is niet ideaal omdat elk cijfer dan maar 1 keer mag voorkomen, in een HashSet zijn alle waardes namelijk uniek