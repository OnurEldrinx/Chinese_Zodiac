import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        int birthYear;
        String zodiacSign = null;

        System.out.print("The year you were born : ");
        birthYear = keyboard.nextInt();

        if (birthYear % 12 == 0) { zodiacSign = "Monkey"; }
        if (birthYear % 12 == 1) { zodiacSign = "Rooster"; }
        if (birthYear % 12 == 2) { zodiacSign = "Dog"; }
        if (birthYear % 12 == 3) { zodiacSign = "Pig"; }
        if (birthYear % 12 == 4) { zodiacSign = "Rat"; }
        if (birthYear % 12 == 5) { zodiacSign = "Ox"; }
        if (birthYear % 12 == 6) { zodiacSign = "Tiger"; }
        if (birthYear % 12 == 7) { zodiacSign = "Rabbit"; }
        if (birthYear % 12 == 8) { zodiacSign = "Dragon"; }
        if (birthYear % 12 == 9) { zodiacSign = "Snake"; }
        if (birthYear % 12 == 10){ zodiacSign = "Horse"; }
        if (birthYear % 12 == 11){ zodiacSign = "Sheep"; }

        System.out.println("Your Chinese Zodiac Sign : " + zodiacSign);








    }
}
