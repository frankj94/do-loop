import java.util.Scanner;

public class guessing {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        String introduction = "I have chosen a number between 1 and 10. Try to guess it.";
        String wrong = "That is incorrect. Guess again.";
        String choice = "Your guess:";
        String correct = "That's right! You're a good guesser.";
        int player;
        boolean guess = true;
        while (guess) {

            System.out.println(introduction);
            player = num.nextInt();

            if (player == 1) {
                System.out.println(choice + player);
                System.out.println(wrong);
            }
                if (player == 2) {
                    System.out.println(choice + player);
                    System.out.println(wrong);
                }

                if (player == 3) {
                    System.out.println(choice + player);
                    System.out.println(wrong);
                }

                    if (player == 4) {
                        System.out.println(choice + player);
                        System.out.println(wrong);
                    }

                        if (player == 5) {
                            System.out.println(choice + player);
                            System.out.println(wrong);
                        }

                            if (player == 6) {
                                System.out.println(choice + player);
                                System.out.println(wrong);
                            }

                                if (player == 7) {
                                    System.out.println(choice + player);
                                    System.out.println(wrong);
                                }

                                    if (player == 9) {
                                        System.out.println(choice + player);
                                        System.out.println(wrong);
                                    }

                                        if (player == 10) {
                                            System.out.println(choice + player);
                                            System.out.println(wrong);
                                        }

                                            if (player == 0) {
                                                System.out.println(choice + player);
                                                System.out.println(wrong);
                                            }
                if (player == 8) {
                    System.out.println(choice + player);
                    System.out.println(correct);
                    guess = false;
                }
            }
        }
    }
