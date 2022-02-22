import java.util.Scanner;

class New {
  public static void main(String[] args) {

    // int number = 44;
    // String value;

    // switch (number) {
    // case 29:
    // value = "small";
    // break;

    // case 42:
    // value = "medium";
    // break;

    // case 44:
    // value = "large";
    // break;

    // case 52:
    // value = "extra large";
    // break;

    // }

    // int[] numbers = { 3, 4, 5, -5, 0, 12 };
    // int sum = 0;
    // for (int number : numbers) {
    // sum += number;
    // }
    // System.out.println("Sum =" + sum);

    int sum = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = input.nextInt();
    while (number >= 0) {
      sum += number;
      System.out.println("Enter a  number");
      number = input.nextInt();
    }
    System.out.println("Sum =" + sum);
    input.close();
  }
}
