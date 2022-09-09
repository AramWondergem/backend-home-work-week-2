package scr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> questionContinue = new ArrayList<>();
        questionContinue.add("Wilt u het recept/boodschappenlijst nog een keer zien of wilt u stoppen?");
        questionContinue.add("nog een keer");
        questionContinue.add("stoppen");



        ArrayList<String> questionNumberOfPies = new ArrayList<>();
        questionNumberOfPies.add("Hoeveel taarten wil je bakken?");
        questionNumberOfPies.add("taart");

        for (int i = 0; i < 9; i++) {
            questionNumberOfPies.add("taarten");
        }

        int numberOfPies = askingQuestion(questionNumberOfPies);

        ApplePieRecipe userRecipe = new ApplePieRecipe(numberOfPies);

        do {


            ArrayList<String> questionFirstGroceriesListOrSteps = new ArrayList<>();
            questionFirstGroceriesListOrSteps.add("Wat wil je zien? De boodschappenlijst voor het recept of de stappen van het recept");
            questionFirstGroceriesListOrSteps.add("Boodschappenlijst");
            questionFirstGroceriesListOrSteps.add("Recept");

            switch (askingQuestion(questionFirstGroceriesListOrSteps)) {
                case 1:
                    System.out.println("----Boodschappenlijst----");
                    userRecipe.printIngredients();
                    break;
                case 2:
                    userRecipe.printSteps();
                    break;
            }
        }
        while (askingQuestion(questionContinue)==1);

        FileManager fileManager = new FileManager(userRecipe);
        fileManager.saveToFile();

        System.out.println("Doei");
        String[] a = new String[5];

        a[0]=" ||||||| ";
        a[1]="[| o o |]";
        a[2]=" |  ^  | ";
        a[3]=" | '-' |";
        a[4]=" +-----+";

        for (int i=0;i<5;i++) {
            System.out.println(a[i]);
        }

        }

        public static int askingQuestion (ArrayList < String > questionAndAnswers) {

            // This method works with an arraylist. The string with index 0 should be the questions. All the other entries should be answers
            Scanner userInput = new Scanner(System.in);
            boolean answerIsCorrect;
            int answer = -1;
            System.out.println("\r\nVraag:" + questionAndAnswers.get(0));

            for (int i = 1; i < questionAndAnswers.size(); i++) {
                System.out.println(i + ":" + questionAndAnswers.get(i));
            }

            System.out.println("Geef het antwoord door het nummer van het antwoord in te toetsen en daarna enter\n");

            do {
                try {
                    answer = userInput.nextInt();
                    if (answer > 0 && answer < (questionAndAnswers.size())) {
                        answerIsCorrect = true;
                    } else {
                        System.out.println("U heeft geen getal ingevoerd tussen de 0 en " + questionAndAnswers.size() + ". Probeer het opnieuw");
                        answerIsCorrect = false;
                    }
                } catch (Exception InputMismatchException) {
                    System.out.println("U heeft geen getal ingevoerd tussen de 0 en " + questionAndAnswers.size() + ". Probeer het opnieuw");
                    answerIsCorrect = false;
                    userInput.next();

                }

            }
            while (!answerIsCorrect);

            return answer;


        }
    }







