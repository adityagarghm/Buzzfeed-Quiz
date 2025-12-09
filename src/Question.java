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
            if (this.possibleAnswers[i] == null) break;
            String choice = Integer.toString(i + 1);
            System.out.println("[" + choice + "]:" +
                    this.possibleAnswers[i].label);

        }
        int ans = sc.nextInt();
        if (ans > this.possibleAnswers.length + 1){
            System.out.println("Please input a number between 1 and " + this.possibleAnswers.length);
            return ask(sc);
        }
        return possibleAnswers[ans - 1].cat;
    }
}
    //  if (this.possibleAnswers[i].label != ""){