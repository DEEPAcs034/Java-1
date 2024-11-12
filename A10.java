
package pkg1;
 class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}
class Duck extends Animal implements Flyable, Swimmable {
 
    public void fly() {
        System.out.println("Duck is flying.");
    }
    
   
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class A10 {
     public static void main(String[] args) {
      
        Duck myDuck = new Duck();
        
        myDuck.eat();      
        myDuck.fly();     
        myDuck.swim();     
    }
}
