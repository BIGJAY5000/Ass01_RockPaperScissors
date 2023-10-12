import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        String player1 = "";
        String player2 = "";
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        boolean done4 = false;
        String condition;
        do {
            do {
            System.out.println("Player 1, please enter your option R, P, S");
            if (scan.hasNextLine()) {
                player1 = scan.nextLine();
                player1 = player1.toUpperCase();
                if (player1.equals("R")) {
                    done1 = true;
                }
                else if (player1.equals("P")) {
                    done1 = true;
                }
                else if (player1.equals("S")) {
                    done1 = true;
                }
                else {
                    System.out.println("You have entered an invalid value. Please try again.");
                }
            }
        } while (!done1);
            do {
                System.out.println("Player 2, please enter your option R, P, S");
                if (scan.hasNextLine()) {
                    player2 = scan.nextLine();
                    player2 = player2.toUpperCase();
                    if (player2.equals("R")) {
                        done2 = true;
                    }
                    else if (player2.equals("P")) {
                        done2 = true;
                    }
                    else if (player2.equals("S")) {
                        done2 = true;
                    }
                    else {
                        System.out.println("You have entered an invalid value. Please try again.");
                    }
                }
            } while (!done2);
            if (player1.equals("R") && player2.equals("P")) {
                System.out.println("Player 2 wins!");
            }
            else if (player1.equals("R") && player2.equals("S")) {
                System.out.println("Player 1 wins!");
            }
            else if (player1.equals("S") && player2.equals("R")) {
                System.out.println("Player 2 wins!");
            }
            else if (player1.equals("S") && player2.equals("P")) {
                System.out.println("Player 1 wins!");
            }
            else if (player1.equals("P") && player2.equals("R")) {
                System.out.println("Player 1 wins!");
            }
            else if (player1.equals("P") && player2.equals("S")) {
                System.out.println("Player 2 wins!");
            }
            else if (player1.equals(player2)) {
                System.out.println("It's a tie!");
            }
            System.out.println(" Please enter Y to continue or N stop");
            do {
                    condition = scan.nextLine();
                    condition = condition.toUpperCase();
                    if (condition.equals("Y")) {
                        done4 = true;
                    }
                    else if (condition.equals("N")) {
                        done3 = true;
                        done4 = true;
                    }
                    else {
                        System.out.println("You have entered an invalid condition, please try again");
                    }
            } while (!done4);
        } while (!done3);

    }
}

