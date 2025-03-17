
class Animal {  
    void makeSound() {  
        System.out.println("Animals make different sounds");  
    }  
}  
class Dog extends Animal {  
    void makeSound() {  
        System.out.println("Dog barks");  
    }  
}  
class Cat extends Animal {  
    void makeSound() {  
        System.out.println("Cat meows");  
    }  
}  

public class MethodOverriding {  
    public static void main(String[] args) {  
        Animal myAnimal;  

        myAnimal = new Dog();  
        myAnimal.makeSound();  

        myAnimal = new Cat();  
        myAnimal.makeSound(); 
    }  
}
