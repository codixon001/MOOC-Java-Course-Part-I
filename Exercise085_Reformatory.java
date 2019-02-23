/*
 *  DO TOT TOUCH THIS CLASS!
 */

// The Person class is a course-provided class.
public class Person {
 
    private String name;
    private int age;
    private int height;
    private int weight;
 
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
 
    public void becomeOlder() {
        this.age++;
    }
 
    public boolean adult() {
        if (this.age < 18) {
            return false;
        }
 
        return true;
    }
 
    public double weightIndex() {
        double heightInMeters = this.height / 100.0;
 
        return this.weight / (heightInMeters * heightInMeters);
    }
 
    public void setHeight(int height) {
        this.height = height;
    }
 
    public int getHeight() {
        return this.height;
    }
 
    public int getWeight() {
        return this.weight;
    }
 
    public void setWeight(int weight) {
        this.weight = weight;
    }
 
    public String getName() {
        return this.name;
    }
 
    public String toString() {
        return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
    }
}

public class Reformatory {
    private int counter = 0;
    
    public int weight(Person person) {
        // return the weight of the person
        counter++;
        return person.getWeight();    
    }
    
    public void feed(Person person) {
       int extraWeight = weight(person);
       extraWeight++;
       person.setWeight(extraWeight);
    }
    
    public int totalWeightsMeasured() {
        return counter;    
    }
}

public class Main {
 
    public static void main(String[] args) {
        // write here test code 
        Reformatory repository = new Reformatory();
        
        Person bob = new Person("Bob", 7, 15, 68);
        Person kate = new Person("Kate", 5, 16, 74);
        
        System.out.println("Total weights measured: " + repository.totalWeightsMeasured());
        
        repository.weight(bob);
        repository.weight(kate);
        
        System.out.println("Total weights measured: " + repository.totalWeightsMeasured());
        
        repository.weight(bob);
        repository.weight(kate);
        
        System.out.println("Total weights measured: " + repository.totalWeightsMeasured());
    }
}
