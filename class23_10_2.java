public class class23_10_2 { //Inheritance concept Multi-level Inheritance
    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy can weep");
    }
}
