class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void show(int a) {
        System.out.println(a);
    }
}

public class Text {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(30);
    }
}

