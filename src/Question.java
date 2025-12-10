/* Irene Feng 10/12/2022
A question class with Answers.
Aditya Garg 12/9/2025: Added bonus question method and revised ask() method
*/ 
import java.util.ArrayList;
import java.util.Scanner;
public class Question {
    // Fields
    String label;
    Answer[] possibleAnswers = new Answer[6];

    Question(String label) {
        this.label = label;
    }

    // ask bonus
    Category bonus(Scanner sc, ArrayList <Integer> indexes, Category[] categoryList) {
       ArrayList <Answer> bonusAnswers = new ArrayList<>();
        if (indexes.size() == 1){
            return categoryList[indexes.get(0)];
        }
        for (int j = 0; j <70; j++){
            System.out.print("*");
        }
        System.out.println("\n" + this.label);

        int counter = 0;
        for (int i = (indexes.size()-1); i>=0; i--) {//going left to right bc values are descending
            String choice = Integer.toString(counter + 1);
            counter ++; //can't rely on i, as i is decreasing and counter needs to be increasing
            System.out.println("[" + choice + "]:" + this.possibleAnswers[indexes.get(i)].label);
            bonusAnswers.add(possibleAnswers[indexes.get(i)]);
        }
        int ans = sc.nextInt();
       int validCount = indexes.size();
        if (ans < 1 || ans > validCount) {
            System.out.println("Please input a number between 1 and " + validCount);//checks the input
            return this.bonus(sc, indexes,categoryList);
        }   
        return bonusAnswers.get(ans - 1).cat;
    }

    Category ask(Scanner sc) {
        for (int j = 0; j <70; j++){
            System.out.print("*");
        }
        System.out.println("\n" + this.label);
        // prints out all the answer choices
        for (int i = 0; i < this.possibleAnswers.length; i++) {
            if (this.possibleAnswers[i] == null) break; //bc some questions have less possible answers, this ends the loop if there are less than 6 
            String choice = Integer.toString(i + 1);
            System.out.println("[" + choice + "]:" +
                    this.possibleAnswers[i].label);

        }
        int ans = 0; 
        boolean answerTest = sc.hasNextInt(); 
        if (answerTest == true){ans = sc.nextInt();
        }
        int validCount = 0;
        for (Answer a : possibleAnswers) {
            if (a == null) break;
            validCount++;
        }
        if (ans < 1 || ans > validCount || answerTest == false) {
            System.out.println("Please input a number between 1 and " + validCount);//checks the iunput
            sc.next();
            return this.ask(sc);
        }   
        return possibleAnswers[ans - 1].cat;
    }
}
