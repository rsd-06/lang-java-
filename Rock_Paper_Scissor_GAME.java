package Rock_Paper_Scissor_GAME;


import java.util.*;
// IMPORTS ALL CLASSES AND METHODS OF JAVA.UTILITY CLASSES
// DOING THIS FOR IMPORTING java.util.random class !


public class Rock_Paper_Scissor_GAME {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rounds you want to Play: ");
        short rounds = sc.nextShort();

        short win_Count = 0;

        for ( int i = 1; i <= rounds; i += 1) {

            System.out.print("Enter 1 for Rock\n2 for Paper\n3 for Scissor: ");
            Random rand = new Random();
            byte gameplay = sc.nextByte();

            int random_num = rand.nextInt(1,4);


            if (gameplay == 1 && random_num == 1) {
                System.out.println("Oops, The round is Nulled !");
            }
            else if (gameplay == 1 && random_num == 2) {
                System.out.println("Bad luck,Lost the Round !");
            }
            else if (gameplay == 1 && random_num == 3) {
                System.out.println("Less goooo,Won the Round !");
                win_Count += 1;
            }

            if (gameplay == 2 && random_num == 1) {
                System.out.println("Less goooo,Won the Round !");
                win_Count += 1;
            }
            else if (gameplay == 2 && random_num == 2) {
                System.out.println("Oops, The round is Nulled !");
            }
            else if (gameplay == 2 && random_num == 3) {
                System.out.println("Bad luck,Lost the Round !");
            }

            if (gameplay == 3 && random_num == 1) {
                System.out.println("Bad luck,Lost the Round !");
            }
            else if (gameplay == 3 && random_num == 2) {
                System.out.println("Less goooo,Won the Round !");
                win_Count += 1;
            }
            else if (gameplay == 3 && random_num == 3) {
                System.out.println("Oops, The round is Nulled !");
            }

            System.out.println("WINS: " + win_Count);
        }
    }
}







/*

                                           JAVA.UTIL CLASS

java.util.* ----> this means that you import all the classes of the utility package in the program.
java.util.* ----> means all of the classes are imported to this program. if you import Java.io.
if you import Java.io.* ---> this means that you import all the classes of the input output package in the program.


package java.util.
Contains the collections framework, some internationalization support classes, a service loader, properties, random number generation,
string parsing and scanning classes, base64 encoding and decoding, a bit array, and several miscellaneous utility classes.
*/



/*                                    GENERATING RANDOM NUMBER IN JAVA

Java provides three ways to generate random numbers using some built-in methods and classes as listed below:

java.util.Random class
Math.random method : Can Generate Random Numbers of double type.
ThreadLocalRandom class



1) java.util.Random
For using this class to generate random numbers, we have to first create an instance of this class and then invoke methods such as
nextInt(), nextDouble(), nextLong() etc using that instance.
We can generate random numbers of types integers, float, double, long, booleans using this class.
We can pass arguments to the methods for placing an upper bound on the range of the numbers to be generated.
For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive.

Random rand = new Random();
int randomNum = rand.nextInt(max – min + 1) + min;

or int randomNum = rand.nextInt(min,max) --> max is excluded !




2)Math.random()
The class Math contains various methods for performing various numeric operations such as, calculating exponentiation, logarithms etc.
One of these methods is random(), this method returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
The returned values are chosen pseudo randomly. This method can only generate random numbers of type Doubles. Below program explains how to use this method:

System.out.println("Random doubles: " + Math.random());
( after importing java.util.random* )


 */