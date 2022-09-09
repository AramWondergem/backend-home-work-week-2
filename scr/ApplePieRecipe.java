//package scr;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class ApplePieRecipe {
//    //variables
//    private String name;
//    private int numberOfPies;
//    private ArrayList<Ingredient> applePieIngredients = new ArrayList<>();
//    private HashMap<Integer, String> recipeSteps = new HashMap<>();
//    private Scanner userInput = new Scanner(System.in);
//
//    //constructor
//    public ApplePieRecipe(int numberOfPies) {
//        this.numberOfPies=numberOfPies;
//        this.name="Appeltaartrecept voor " + numberOfPies + " taart(en)";
//        addIngredientsToList();
//        addStepsToList();
//    }
//
//    public void addIngredientsToList (){
//        Ingredient butter = new Ingredient(200,"gram", "ongezouten roomboter");
//        this.applePieIngredients.add(butter);
//        Ingredient sugar1 = new Ingredient(200,"gram", "bastard suiker");
//        this.applePieIngredients.add(sugar);
//        Ingredient selfRaisingFlour = new Ingredient(400,"gram", "zelfrijzend bakmeel");
//        this.applePieIngredients.add(selfRaisingFlour);
//        Ingredient egg = new Ingredient(1,"stuk", "eieren");
//        this.applePieIngredients.add(egg);
//        Ingredient vanillaSugar = new Ingredient(8,"gram", "vanille suiker");
//        this.applePieIngredients.add(vanillaSugar);
//        Ingredient salt = new Ingredient(1,"snuf", "zout");
//        this.applePieIngredients.add(salt);
//        Ingredient apples = new Ingredient(1.5,"kilo", "zoutzure appels");
//        this.applePieIngredients.add(apples);
//        Ingredient sugar2 = new Ingredient(75,"gram", "kristal suiker");
//        this.applePieIngredients.add(sugar2);
//        Ingredient cinnamon = new Ingredient(3,"theelepels", "kaneel");
//        this.applePieIngredients.add(cinnamon);
//        Ingredient breadCrumbs = new Ingredient(15,"gram", "paneermeel");
//        this.applePieIngredients.add(breadCrumbs);
//    }
//
//    public void addStepsToList() {
//        recipeSteps.put(1,"Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
//        recipeSteps.put(2,"Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
//        recipeSteps.put(3,"Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
//        recipeSteps.put(4,"Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
//        recipeSteps.put(5,"Vet de springvorm in en bestrooi deze met bloem");
//        recipeSteps.put(6,"Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
//        recipeSteps.put(7,"Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
//        recipeSteps.put(8,"Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
//        recipeSteps.put(9,"Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
//        recipeSteps.put(10,"Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
//    }
//
//    public void printIngredients(){
//
//        for(Ingredient ingredient:applePieIngredients){
//            System.out.println("----Boodschappenlijst----");
//            System.out.println(ingredient.toString());//misschien aanpassen
//        }
//    }
//
//    public void printSteps() {
//
//        System.out.println();
//    }
//
//
//
//}
