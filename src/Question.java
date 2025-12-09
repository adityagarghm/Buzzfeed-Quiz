/* Irene Feng 10/12/2022
A question class with Answers.
*/ 
import java.util.Scanner;

public class Question {
    // Fields
    String label;
    Answer[] possibleAnswers = new Answer[6];

    Question(String label) {
        this.label = label;
    }

    // ask a question, and return the category that corresponds to the answer
    Category ask(Scanner sc) {
        System.out.println(this.label);
        // prints out all the answer choices
        for (int i = 0; i < this.possibleAnswers.length; i++) {
            if (this.possibleAnswers[i] == null) break; //bc some questions have less possible answers, this ends the loop if there are less than 6 
            String choice = Integer.toString(i + 1);
            System.out.println("[" + choice + "]:" +
                    this.possibleAnswers[i].label);

        }
        int ans = sc.nextInt();
        /*if (ans > this.possibleAnswers.length){
            System.out.println("Please input a number between 1 and " + this.possibleAnswers.length);
            return this.ask(sc);
        }*/
       int validCount = 0;
        for (Answer a : possibleAnswers) {
            if (a == null) break;
            validCount++;
        }

// Validate using validCount instead of array length
        if (ans < 1 || ans > validCount) {
            System.out.println("Please input a number between 1 and " + validCount);
            return this.ask(sc);
        }   
        return possibleAnswers[ans - 1].cat;
    }
}
