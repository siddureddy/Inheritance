package Class;
import Interface.Showable;
import Interface.Printable;





public class TestInterface implements Printable, Showable {
    public void print() {
        System.out.println("Hello");

    }
}