package mainclass;
import classes.TestInterface;
import classes.Dog;
import classes.BabyDog;
import classes.Cat;
import classes.Adder;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.BasicConfigurator;
import java.util.*;




public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();
        logger.info("inheritance example");
        logger.info("single inheritance example Dog is inheriting the animal in below example");
        Dog d = new Dog();//single inheritance(
        d.bark();


        logger.info("hierarchy  inheritance example Dog ,cat are  inheriting the animal in below example");
        Cat c = new Cat();//hierarchy inheritance
        c.meow();
        c.eat();

        logger.info("multilevel  inheritance example BabyDog is  inheriting Dog and Dog is inheriting animal in below example");
        BabyDog bd = new BabyDog();//multi level inheritance
        bd.weep();
        bd.bark();
        bd.eat();

        logger.info("  Multiple inheritance example Testinterface  inheriting the Pintable and showable class in below example");
        TestInterface obj = new TestInterface();//Multiple inheritance
        obj.print();


        System.out.println(Adder.add(11, 11));//overloading
        System.out.println(Adder.add(11, 11, 11));//overloading

//collections
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
//linked list
        System.out.println("linked list collection");
        list.remove(0);//removing the element in array list

        System.out.println(list);//display after removing the element

        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("vijay");
        Iterator<String> itr1 = al.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());


        }
//stack
        System.out.println("stackcollection");
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr3 = stack.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
//queue
        System.out.println("Queue collection");
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("JaiShankar");
        queue.add("Raj");
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr4 = queue.iterator();
        while (itr4.hasNext()) {
            System.out.println(itr4.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr5 = queue.iterator();
        while (itr5.hasNext()) {
            System.out.println(itr5.next());
        }

        //Hashset

        System.out.println("Hash set collection");
        HashSet<String> set = new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itr6 = set.iterator();
        while (itr6.hasNext()) {
            System.out.println(itr6.next());
        }

        //treeset
        System.out.println("Tree set collection");

        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Ravi");
        set1.add("Ajay");
//traversing elements
        Iterator<String> itr7 = set.iterator();
        while (itr7.hasNext()) {
            System.out.println(itr7.next());
        }
    }

}


