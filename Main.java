import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100.\n" +
                "You have 5 chances to guess the correct number.\n" +
                "\n" +
                "Please select the difficulty level:\n" +
                "1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)\n\n"+
                "Enter your choice: ");

        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        int iterationCount = 0;
        String levelName = "";
        switch (level){
            case 1:
                iterationCount = 10;
                levelName = "Easy";
                break;
            case 2:
                iterationCount = 5;
                levelName = "Medium";
                break;
            case 3:
                iterationCount = 3;
                levelName = "High";
                break;
        }
        System.out.println("Great! You have selected the "+levelName+" difficulty level.\n"+"Let's start the game!");

        //random number btw 1-100
        int randomNumber = (int) (Math.random() * (100 - 1 + 1))+1;
        boolean success = false;
        for(int i = 0; i<iterationCount;i++) {
            System.out.println("Enter your guess : ");
            int guess = sc.nextInt();
            if(guess>randomNumber) {
                System.out.println("Incorrect! The number is lesser than "+guess);
            } else if (guess<randomNumber) {
                System.out.println("Incorrect! The number is greater than "+guess);
            } else {
                System.out.println("Congratulations! You guessed the correct number in "+i+ " attempts.");
                success = true;
                break;
            }
        }

        if(!success) {
            System.out.println("\nSorry you lost the game! Please try again!");
        }
    }
}
