package scr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    private ApplePieRecipe userRecipe;


    public FileManager(ApplePieRecipe userRecipe){
        this.userRecipe=userRecipe;
    }

    public void saveToFile () {
        ArrayList<String> question1 = new ArrayList<>();
        question1.add("Wil je het recept/boodschappenlijst opslaan? Zo ja, wat wil je opslaan?");
        question1.add("Nee");
        question1.add("Ja, alleen de boodschappenlijst");
        question1.add("Ja, alleen het recept");
        question1.add("Ja, beide");

        switch (Main.askingQuestion(question1)){
            case 1:
                break;
            case 2:
                try {
                    File groceriesList = new File("C:\\Users\\aramw\\Documents\\novi\\backend\\les3\\groceriesList.txt");
                    FileWriter pen = new FileWriter(groceriesList);
                    BufferedWriter printer = new BufferedWriter(pen);
                    printer.write("---Boodschappenlijst----");
                    printer.newLine();

                    for(Ingredient ingredient:userRecipe.getApplePieIngredients()){
                        printer.write("- " + (userRecipe.getNumberOfPies()*ingredient.getQuantity() + " " + ingredient.toString()));
                    printer.newLine();
                    }
                    printer.close();
                    System.out.println("Het bestandje is hier opgeslagen: C:\\Users\\aramw\\Documents\\novi\\backend\\les3\\groceriesList.txt");
                }
                catch (IOException e){
                    System.out.println("het programma heeft geen toegang tot de locatie waar het bestand wordt opgeslagen");
                }
                break;
            case 3:
                try {
                    File recipe = new File("C:\\Users\\aramw\\Documents\\novi\\backend\\les3\\recipe.txt");
                    FileWriter pen = new FileWriter(recipe);
                    BufferedWriter printer = new BufferedWriter(pen);
                    printer.write("---Recept---");
                    printer.newLine();

                    for (int i=1; i<=userRecipe.getRecipeSteps().size();i++) {
                        printer.write(i + "." + userRecipe.getRecipeSteps().get(i));
                        printer.newLine();
                    }
                    printer.close();
                    System.out.println("Het bestandje is hier opgeslagen: C:\\Users\\aramw\\Documents\\novi\\backend\\les3\\recipe.txt");
                }
                catch (IOException e){
                    System.out.println("het programma heeft geen toegang tot de locatie waar het bestand wordt opgeslagen");
                }
                break;
            case 4:
                try {
                    File recipeAndGrociesList = new File("C:\\Users\\aramw\\Documents\\novi\\backend\\les3\\recipeAndGroceriesList.txt");
                    FileWriter pen = new FileWriter(recipeAndGrociesList);
                    BufferedWriter printer = new BufferedWriter(pen);

                    printer.write("---Boodschappenlijst----");
                    printer.newLine();

                    for(Ingredient ingredient:userRecipe.getApplePieIngredients()){
                        printer.write("- " + (userRecipe.getNumberOfPies()*ingredient.getQuantity() + " " + ingredient.toString()));
                        printer.newLine();
                    }
                    printer.newLine();
                    printer.newLine();
                    printer.write("---Recept---");
                    printer.newLine();

                    for (int i=1; i<=userRecipe.getRecipeSteps().size();i++) {
                        printer.write(i + "." + userRecipe.getRecipeSteps().get(i));
                        printer.newLine();
                    }
                    printer.close();
                    System.out.println("Het bestandje is hier opgeslagen: C:\\Users\\aramw\\Documents\\novi\\backend\\les3\\recipeAndGroceriesList.txt");
                }
                catch (IOException e){
                    System.out.println("het programma heeft geen toegang tot de locatie waar het bestand wordt opgeslagen");
                }
                break;

        }



    }

}
