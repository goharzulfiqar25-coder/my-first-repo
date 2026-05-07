class Animal {  //Zulfiqar Gauhar 76579

    // Method Overloading
    void sound() {
        System.out.println("Animal Sound");
    }

    void sound(String name) {
        System.out.println(name + " makes sound");
    }
}

class Dog extends Animal {  //Zulfiqar Gauhar 76579


    // Method Overriding
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Animal1 {  //zulfiqar Gauhar 76579
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();

        obj.sound("Cat");
    }
}