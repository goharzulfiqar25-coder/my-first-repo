class Animal { //Zulfiqar Gauhar Sap id 76579
    void eat() {
        System.out.println("Animal is eating");
    }
    void Sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {  //Zulfiqar Gauhar Sap id 76579
    void bark() {
        System.out.println("Dog is Barking");
    }
}
class Puppy extends Dog { //Zulfiqar Gauhar Sap id 76579
    void Weep() {
        System.out.println("Puppy is weeping");
    }
}
public class LabTask6 {  //Zulfiqar Gauhar Sap id 76579
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.Sleep();
        
        Dog d = new Dog();
        d.bark(); //Zulfiqar Gauhar Sap id 76579

        Puppy p = new Puppy();
        p.Weep();
    }
}
