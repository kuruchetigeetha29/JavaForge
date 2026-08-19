import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame
{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
         int randomNumber=random.nextInt(100)+1;
         int guess;
         int attempts=0;
       System.out.println("Guess a number between 1 and 100");
       while(true)
       {
        System.out.print("enter your guess:");
        guess=sc.nextInt();
        attempts++;
      if (guess==randomNumber)
      {
        System.out.println("correct!");
        System.out.println("you guessed it in " + attempts + "attempts.");
        break;
      }
      else if(guess<randomNumber)
     {
      System.out.println("too low!");
     }
     else
     {
     System.out.println("too high!");
     }
     }
     sc.close();
    }
}