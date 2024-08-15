package Guess_the_Number_GAME;
/*
Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */

import java.util.Random;
import java.util.Scanner;

class Game{

    public int guess;
    private int random;
    public int noOfGuesses;

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a Number (1-100):  ");
        guess = sc.nextInt();
    }

    Game(){
        Random rand = new Random();
        random = rand.nextInt(1, 101);
    }

    public boolean isCorrectNumber(){
//        if (random == guess){
//            System.out.println("Hurray, Guessed it!");
//            key = true;
//        }
//        if (random - guess>20 || random - guess>-20){
//                System.out.println("Too Far Away!");
//        }
//        if (random - guess<10 || random - guess<-10){
//            System.out.println("Far Away Still!");
//        }
//        if (random - guess<3 || random - guess<-3){
//            System.out.println("Just a bit off! Guess smarter!");
//        }
//        THE ABOVE IF's EACH WILL RUN SEPERATELY. THAT IS EACH WILL CHECK THE CONDITION AGAIN AND AGAIN, SO IF A NUMBER IS LESS THAT 3 IT IS TRUE FOR ALL THE THREE
//        CONDITIONS, HENCE ALL THREE SOUT'S WILL BE PRINTED! HAVE TO USE IF-ELSE TO VERIFY FOR 1 CONDTION!

        boolean key = false;
        if (random == guess){
            System.out.println("Hurray, Guessed it!");
            key = true;
        }
        else if((random - guess)>20 || (random - guess)<-20){
            System.out.println("Too Far Away!");
        }
        else if((random - guess)>10 || (random - guess)<-10){
            System.out.println("Far Away Still!");
        }
        else if((random - guess)>3 || (random - guess)<-3){
            System.out.println("Closer!");
        }
        else {
            System.out.println("Just a bit off! Guess smarter!");
        }
        return key;
    }
}

public class Guess_the_Number_GAME {
    public static void main(String[] args) {

        System.out.println("Heyy, Welcome to Guess the Number Game!");
        Game player = new Game();
        System.out.println("Lets Start");
        while (true){
            player.noOfGuesses += 1;
            player.takeUserInput();
            if(player.isCorrectNumber()){
                break;
            }
        }
        System.out.println("YOUR SCORE: " + player.noOfGuesses);
    }
}
