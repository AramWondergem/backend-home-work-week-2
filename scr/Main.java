package scr;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> testArray = new ArrayList<>();

        testArray.add("Dit is de vraag");
        testArray.add("Dit is het eerste antwoord");
        testArray.add("Dit is het tweede antwoord");
        testArray.add("Dit is het derde antwoord");
        testArray.add("Dit is het vierde antwoord");
        testArray.add("Dit is het vijfde antwoord");

        System.out.println(rightAnswer(testArray));





    }

    public static int rightAnswer(ArrayList<String> questionAndAnswers) {
        Scanner userInput = new Scanner(System.in);
        boolean answerIsCorrect;
        int answer=-1;
        System.out.println("Vraag:"+questionAndAnswers.get(0));

        for (int i=1;i<questionAndAnswers.size();i++) {
            System.out.println(i + ":" + questionAndAnswers.get(i));
        }



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







