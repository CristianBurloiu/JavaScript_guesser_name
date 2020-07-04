//Importing Scanner and random for the external classes
import java.util.Scanner;
import  java.util.Random;

public class Magic8 {

  public  static void main(String[] args) {
    //Magic 8 Ball Application
    //User asks a question, and computer gives an answer

    //Create a scanner to allow the user to type am answer
    Scanner keyboardInput = new Scanner(System.in);
    Random randomInt = new Random();
    //We have just created two instances: one  for the scanner  and one for the random class.


    //Created three variables for the question,random and answer.
    String question;
    int random = randomInt.nextInt(10)+1;//max=3, min=1 (1,10)
    String answer;

    System.out.println("Ask your question: ");
    question = keyboardInput.nextLine();

    if (random == 1) {
      answer = "Yes";
    } else if (random == 2) {
      answer = "No";
    } else if (random == 3){
      answer = "You may rely on it.";
    } else if (random == 4) {
      answer = "It is certain.";
    } else if (random == 5){
      answer = "It is decidedly so.";
    }  else if (random == 6) {
      answer = "Most likely.";
    } else if (random == 7){
      answer = "Signs point to yes.";
    } else if (random == 8) {
      answer = "Cannot predict now.";
    } else if (random == 9){
      answer = "Outlook good.";
    } else if (random == 10){
      answer = "Outlook not so good.";
    } else {
      answer = "Could be true!";
    }
    System.out.println(answer);
  }
}
