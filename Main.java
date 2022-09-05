// user inputs
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner i= new Scanner (System.in);

    System.out.println("ENTER YOUR NAME:");
    String name=i.nextLine();

    System.out.println("ENTER YOUR AGE:");
    int age=i.nextInt();

    System.out.println("ENTER YOUR CITY:");
    String city=i.next();

    System.out.println("My Name is " +name+" i'm " +age+"years old.and i live in " +city+".");
  }
}