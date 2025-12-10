
/*
 * Irene Feng Nov 2022
 * This is the class where we create the Quiz and run it. It has the main method. 
 * Aditya Garg 12/9/2025: Added questions, re made the way to find the winning category
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) throws Exception {
                // Create Categories
                Category owl = new Category("Owl", "You are thoughtful, calm, and intellectual.");
                Category dolphin = new Category("Dolphin", "You are social, upbeat, and adaptable.");
                Category fox = new Category("Fox", "You are clever, quick, and flexible.");
                Category lion = new Category("Lion", "You are confident, a leader, and bold.");
                Category cat = new Category("Cat","You are chill, independent, and observant.");
                Category dog = new Category("Dog","You are loyal, energetic, and cheerful.");
                // Create Questions
                // Attach Answers to Questions
               
        Question q1 = new Question("How do you usually study for a big test?");
        q1.possibleAnswers[0] = new Answer("Make a full study guide and review calmly.", owl);
        q1.possibleAnswers[1] = new Answer("Form a group and teach each other.", dolphin);
        q1.possibleAnswers[2] = new Answer("Grind it out last minute but somehow make it work.", fox);
        q1.possibleAnswers[3] = new Answer("Start early and stay consistent.", lion);
        q1.possibleAnswers[4] = new Answer("Study only what you know will be on the test.", cat);
        q1.possibleAnswers[5] = new Answer("Flashcards", dog);

        Question q2 = new Question("What are you like during group work?");
        q2.possibleAnswers[0] = new Answer("You naturally take charge.", lion);
        q2.possibleAnswers[1] = new Answer("You keep everyone focused + organized.", owl);
        q2.possibleAnswers[2] = new Answer("You work quietly and pick up the slack.", cat);
        q2.possibleAnswers[3] = new Answer("You encourage the group and make people feel included.", dog);
        q2.possibleAnswers[4] = new Answer("You come up with ideas no one else thought of.", fox);

        Question q3 = new Question("What's your favorite school subject?");
        q3.possibleAnswers[0] = new Answer("English", owl);
        q3.possibleAnswers[1] = new Answer("Math", fox);
        q3.possibleAnswers[2] = new Answer("Science", dolphin);
        q3.possibleAnswers[3] = new Answer("Computer Science", cat);
        q3.possibleAnswers[4] = new Answer("History", dog);

        Question q4 = new Question("What's your ideal weekend activity?");
        q4.possibleAnswers[0] = new Answer("Going out with friends", dolphin);
        q4.possibleAnswers[1] = new Answer("Watching movies alone and chilling", cat);
        q4.possibleAnswers[2] = new Answer("Sports or outdoor stuff", dog);
        q4.possibleAnswers[3] = new Answer("Reading, journaling, deep dive hobbies", owl);
        q4.possibleAnswers[4] = new Answer("Getting ahead / working on goals", lion);
        q4.possibleAnswers[5] = new Answer("Spontaneous adventures", fox);

        Question q5 = new Question("Which trait do people compliment you on the most?");
        q5.possibleAnswers[0] = new Answer("Leadership", lion);
        q5.possibleAnswers[1] = new Answer("Wisdom or maturity", owl);
        q5.possibleAnswers[2] = new Answer("Humor", dolphin);
        q5.possibleAnswers[3] = new Answer("Chill personality", cat);
        q5.possibleAnswers[4] = new Answer("Loyalty / kindness", dog);
        q5.possibleAnswers[5] = new Answer("Creativity", fox);

        Question q6 = new Question("What do you do if your teacher assigns a surprise group presentation?");
        q6.possibleAnswers[0] = new Answer("You start planning instantly.", lion);
        q6.possibleAnswers[1] = new Answer("You analyze what needs to be done and divide it.", owl);
        q6.possibleAnswers[2] = new Answer("You boost morale and make it fun.", dolphin);
        q6.possibleAnswers[3] = new Answer("You quietly work on your part and avoid chaos.", cat);
        q6.possibleAnswers[4] = new Answer("You volunteer to present since others are nervous.", dog);

        Question q7 = new Question("Pick a random setting.");
        q7.possibleAnswers[0] = new Answer("Minimalist desk with soft lighting.", owl);
        q7.possibleAnswers[1] = new Answer("Vibrant room full of posters + memories.", dolphin);
        q7.possibleAnswers[2] = new Answer("Clean and bold, motivational quotes.", lion);
        q7.possibleAnswers[3] = new Answer("Sports gear, water bottle, ready to go.", dog);
        q7.possibleAnswers[4] = new Answer("Organized chaos: looks messy but you know where everything is.", fox);

        Question q8 = new Question("Which hallway behavior matches you?");
        q8.possibleAnswers[0] = new Answer("Walking fast like you have somewhere IMPORTANT to be.", lion);
        q8.possibleAnswers[1] = new Answer("Walking while zoned out thinking about life.", owl);
        q8.possibleAnswers[2] = new Answer("Talking to everyone you pass.", dolphin);
        q8.possibleAnswers[3] = new Answer("Hugging the wall avoiding crowds.", cat);
        q8.possibleAnswers[4] = new Answer("Taking shortcuts and weird side routes.", fox);

        Question q9 = new Question("What's your reaction when a teacher calls on you unexpectedly?");
        q9.possibleAnswers[0] = new Answer("Answer confidently even if unsure.", lion);
        q9.possibleAnswers[1] = new Answer("Laugh it off and try your best.", dolphin);
        q9.possibleAnswers[2] = new Answer("Give the shortest answer possible.", cat);
        q9.possibleAnswers[3] = new Answer("Sit up straight and give it a real shot.", dog);
        q9.possibleAnswers[4] = new Answer("Give a weirdly clever answer that surprises the class.", fox);

        Question q10 = new Question("Choose a snack to get through the school day.");
        q10.possibleAnswers[0] = new Answer("Energy bar", lion);
        q10.possibleAnswers[1] = new Answer("Dark chocolate or tea", owl);
        q10.possibleAnswers[2] = new Answer("Fruit snacks", dolphin);
        q10.possibleAnswers[3] = new Answer("Chips", cat);
        q10.possibleAnswers[4] = new Answer("Granola + yogurt", dog);
        q10.possibleAnswers[5] = new Answer("Flip your bag inside out and look for an old snack.", fox);

        Question qBonus = new Question("Tiebreaker: Your school announces a mysterious “Secret After-Hours Challenge” and gives every student a key to an unknown room. What do you do first?");
        qBonus.possibleAnswers[0] = new Answer("Gather your closest friends so you can figure it out as a team", dog);      
        qBonus.possibleAnswers[1] = new Answer("Head there immediately because it sounds fun and chaotic", dolphin);
        qBonus.possibleAnswers[2] = new Answer("Walk in confidently like you're ready to take charge of whatever happens", lion);
        qBonus.possibleAnswers[3] = new Answer("Study the key, the school map, and any clues before going", owl);   
        qBonus.possibleAnswers[4] = new Answer("Sneak around the hallways to see what other people are doing first", fox); 
        qBonus.possibleAnswers[5] = new Answer("Take your time, think through every possibility, and go only when you're prepared", cat); 

                // ... more questions here

                // For each question, ask, read input, store answer.
                gameIntro();
                Question[] qList = { q1, q2, q3, q4, q5, q6, q7, q8, q9, q10 };
                for (Question q : qList) {
                        Category c = q.ask(sc);
                        c.points++;
                }
                // Get most common category from the questions asked
                // Return Category
                

                Category[] cList = {dog, dolphin, lion, owl, fox, cat };
                // these need to be in the same order or the points will be incorrect!

               Category bonus = qBonus.bonus(sc,getMostPopularCatIndex(cList),cList);
               for (int i =0; i <= 70; i++){System.out.print("*");}
                System.out.println("\nIf you were an animal, you would be " + bonus.label + ".");
                System.out.println(bonus.description);
                for (int i =0; i <= 70; i++){System.out.print("*");} 
                System.out.println("");
                answerCounterPrinter(createpointCounter(cList),bonus,cList, getMostPopularCatIndex(cList));
        }

        public static void gameIntro() {
                // requires 1 to keep going
                System.out.println("Which Animal Are You?");
                System.out.println("You get to choose numbers 1-5 or 1-6 for every question. Enter '1' to play!");
                int play = sc.nextInt();
                if (play != 1) {
                        System.out.println("Unidentifiable input. Please enter '1' to play");
                        gameIntro();
                }
        }
        //returns the index of the tie/most selected
        public static ArrayList getMostPopularCatIndex(Category[] counts) throws Exception {
               //this method is essentially just something that connects to the rest of the methods
                return indexFinder(getMax(createpointCounter(counts),1,0));

        }
        public static ArrayList createpointCounter(Category[] counts) throws Exception {
                ArrayList <Integer> pointCounter = new ArrayList<>();
            for (Category count : counts) {
                pointCounter.add(count.points);
            }

                return pointCounter;//creates pointCounter Array list based on the fields from clist --> field points
                

        } 
        public static ArrayList getMax(ArrayList<Integer> pointCounter, int counter, int maxCount)throws Exception{
                for (int i  = 0; i <pointCounter.size(); i++){
                        if ( pointCounter.get(i) == null || pointCounter.get(i) < maxCount ){
                        pointCounter.set(i, null); //removes the values that are less than the current maxCount
                        }else{ 
                                maxCount = pointCounter.get(i);
                }}
                if (counter !=0){
                return getMax(pointCounter,counter -1,maxCount);//running my code twice bc it could have been in ascending order, now maxCount is adjusted
                }
                return pointCounter;//this is my final output, while I know this is supposed to go above as BC, it was causing a headache trying to run it recursively the other way 
        }

        public static ArrayList indexFinder(ArrayList <Integer> pointsNullArray){
                ArrayList <Integer> indexer = new ArrayList<>();
                for (int i = pointsNullArray.size()-1; i >=0; i--){//going downwards bc I am removing items but storing their index, otherwise the indexes could all be the same
                        if (pointsNullArray.get(i) != null){//store the indexes of the winnning categories in indexer
                                indexer.add(i);
                        }else  pointsNullArray.remove(i);//removes the null from the array, this step is not needed 
                }
             return indexer;
        }

        //this method is going to print the array of final scores
        public static void answerCounterPrinter(ArrayList <Integer> pointCounter, Category bonus, Category[] categoryList, ArrayList <Integer> indexer) throws InterruptedException{
                Thread.sleep(6);
                System.out.println("Amount of times you selected each question: ");
                for (int i = 0; i < categoryList.length; i++){
                        if( categoryList[i].label.equals(bonus.label) && indexer.size() > 1){//java requests equal() here
                                int pointsFor = pointCounter.get(i) + 1;
                                pointCounter.set(i, pointsFor);
                        }
                        Thread.sleep(6);
                        System.out.println(categoryList[i].label + ": " + pointCounter.get(i));                        
                }

        }
}
