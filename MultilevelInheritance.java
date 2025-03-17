
class Animal {  
    void sound() {  
        System.out.println("Animals make sounds");  
    }  
}  
class Mammal extends Animal {  
    void type() {  
        System.out.println("Mammals give birth to young ones");  
    }  
}  
class Dog extends Mammal {  
    void bark() {  
        System.out.println("Dog barks");  
    }  
}  
public class MultilevelInheritance {  
    public static void main(String[] args) {  
        Dog myDog = new Dog();  
        myDog.sound();  
        myDog.type();    
        myDog.bark();   
    }  
}
