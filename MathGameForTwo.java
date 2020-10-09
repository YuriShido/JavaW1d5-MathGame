import java.util.Scanner;
import java.lang.Math;
  
public class MathGameForTwo {
  
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Hello and welcome to the two player math game, would you like to play?  (y/n) ");
      char YS = input.next().charAt(0);
      if(YS == 'y' || YS == 'Y') {

        System.out.println("You each have 3 lives");
        
        int count = 1;
        int P1LiveCounter = 3;
        int P2LiveCounter = 3;
        while(P1LiveCounter > 0 && P2LiveCounter > 0) {
          int randomNum1 = (int)(Math.random() * 100) + 1;
          int randomNum2 = (int)(Math.random() * 100) + 1;
          
          int correctAnswer = randomNum1 + randomNum2;
          //valid player1 or 2
            if(count % 2 != 0){
              //question 
                System.out.println("Player1: What is " + randomNum1 +  " + " + randomNum2 + "?");
                int player1 = input.nextInt();
                if(player1 == correctAnswer) {
                  System.out.println("Correct!");
                  
                } else {
                  System.out.println("Incorrect! The answer was " + correctAnswer);
                  P1LiveCounter -= 1;
                }
                System.out.println("The lives: Player1: " + P1LiveCounter +"/3 " +" Player2: " + P2LiveCounter + "/3");
                count++;

            } else if(count % 2 == 0) {
              
                System.out.println("Player2: What is " + randomNum1 +  " + " + randomNum2 + "?");
                int player2 = input.nextInt();
                if(player2 == correctAnswer) {
                  System.out.println("Correct!");
                  
                } else {
                  System.out.println("Incorrect! The answer was " + correctAnswer);
                  P2LiveCounter -= 1;
                }
                System.out.println("The lives: Player1: " + P1LiveCounter +"/3 " +" Player2: " + P2LiveCounter + "/3");
                count++;
              }  System.out.println("****************************************");
        }
        
          if(P1LiveCounter == 0) {
            System.out.println("Player 2 wins!");
    
          } else if(P2LiveCounter == 0) {
            System.out.println("Player 1 wins!");
          }

      } else if(YS == 'n' || YS == 'N') {
          System.out.println("See you Next time!");
      } else {
          System.out.println("It's invalid input! Please start again!");
      }


    }
}


