import java.util.ArrayList;
 
public class Menu {
 
    private ArrayList<String> meals;
 
    public Menu() {
        this.meals = new ArrayList<String>();
    }
 
    // add the methods here
    public void addMeal(String meal) {
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        this.meals.clear();
    }
}

public class Main {
    public static void main(String[] args) {
        Menu exactum = new Menu();
 
        // When you have created addMeal(String meal) method,
        // you may remove the comments below
        exactum.addMeal("Fish fingers with sour cream sauce");
        exactum.addMeal("Vegetable casserole with salad cheese");
        exactum.addMeal("Chicken and nacho salad");
        exactum.addMeal("Bacon and bleu cheese burger");
        exactum.addMeal("Alaskan cod sandwich");
        exactum.addMeal("Chicken and nacho salad");
 
        // When you have created printMeals() method,
        // you may remove the comments below
        exactum.printMeals();
 
        // When you have created clearMenu() method,
        // You may remove the comments below
        exactum.clearMenu();
        exactum.printMeals();
    }
}
