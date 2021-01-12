package main;
import classes.TestInterface;
import classes.Dog;
import classes.BabyDog;
import classes.Cat;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.BasicConfigurator;



public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        BasicConfigurator.configure();
        logger.info("inheritance example");
        logger.info("single inheritance example Dog is inheriting the animal in below example");
        Dog d=new Dog();//single inheritance(
        d.bark();


        logger.info("hierarchy  inheritance example Dog ,cat are  inheriting the animal in below example");
        Cat c=new Cat();//hierarchy inheritance
        c.meow();
        c.eat();

        logger.info("multilevel  inheritance example BabyDog is  inheriting Dog and Dog is inheriting animal in below example");
        BabyDog bd=new BabyDog();//multi level inheritance
        bd.weep();
        bd.bark();
        bd.eat();

        logger.info("  Multiple inheritance example Testinterface  inheriting the Pintable and showable class in below example");
        TestInterface obj = new TestInterface();//Multiple inheritance
        obj.print();
    }
}
