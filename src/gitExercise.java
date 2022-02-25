import java.util.Scanner;

public class gitExercise {
  Scanner in;
  String name;
  int age;

  public gitExercise() {
    this.in = new Scanner(System.in);
  }

  public static void main(String[] args) {
    (new gitExercise()).go();
    System.out.println("\nIt works!");
  }

  public void go() {
    this.greet();
    this.askAboutAge();
  }

  public void greet() {
    System.out.print("Hello please enter your name: ");
    this.name = this.in.nextLine();
    System.out.println("Hello " + this.name);
  }

  public void askAboutAge() {
    System.out.println("How old are you?: ");
    this.age = this.in.nextInt();
    System.out.println("You are " + this.age + " years old");
  }
}
