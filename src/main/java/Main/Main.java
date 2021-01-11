package Main;
import Class.TestInterface;
import Class.Dog;
import Class.BabyDog;
import Class.Cat;



public class Main {

    public static void main(String[] args) {
        Dog d=new Dog();//single inheritance(
        d.bark();
        d.eat();
        Cat c=new Cat();//heirarchy inheritance
        c.meow();
        c.eat();
        BabyDog bd=new BabyDog();//multi level inheritance
        bd.weep();
        bd.bark();
        bd.eat();
        TestInterface obj = new TestInterface();//Multiple inheritance
        obj.print();
    }
}
