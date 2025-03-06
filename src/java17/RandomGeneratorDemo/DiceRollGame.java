package java17.RandomGeneratorDemo;

import java.util.Random;

public class DiceRollGame {
    public static void main(String[] args) {
        Random random = new Random();

        // Roll two dice
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        System.out.println("You rolled: " + dice1 + " and " + dice2);

        if (dice1 + dice2 == 7) {
            System.out.println("Congratulations! You win with a lucky 7! 🎉");
        } else {
            System.out.println("Try again! Total: " + (dice1 + dice2));
        }
    }
}

