package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("House: " + this.game.getHouseCards().toString());
        System.out.println("You: " + this.game.getYourCards().toString());
        int yourScore = game.score(game.getYourCards());
        System.out.println("Score: " + yourScore);
    }

    @Override
    public boolean hitMe() {
         System.out.println("Hit? type y or n");
         String choice = user.nextLine();
         boolean hit = false;
         switch (choice){
            case "y":
                hit = true;
                break;
            case "n":
                hit = false;
                break;
            default:
                System.out.println("Reply y or n");
                hitMe();
         }
         return hit;
    }

    @Override
    public void gameOver() {
        this.display();
        int yourScore = game.score(game.getYourCards());
        int houseScore = game.score(game.getHouseCards());
        System.out.println("House score:" + houseScore + " Your score: " + yourScore);
        if ((yourScore > houseScore || houseScore > 21) && (yourScore <= 21)){
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

}
