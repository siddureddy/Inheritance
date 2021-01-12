package classes;
import interfaces.Showable;
import interfaces.Printable;





public class TestInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");

    }
}