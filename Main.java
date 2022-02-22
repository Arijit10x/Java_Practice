class Main {
  public static void main(String[] args) {

    // double myDouble = 3.4;
    // float myFloat = 3.4F;
    // double myDoubleScientific = 3.445e2;

    // System.out.println(myDouble);
    // System.out.println(myFloat);
    // System.out.println(myDoubleScientific);

    byte range = 124;
    System.out.println(range);

    short temparature;
    temparature = -200;
    System.out.println(temparature);

    int value = 25451;
    System.out.println(value);

    long value1 = 6545656651566555456l;
    System.out.println(value1);

    double number = -42.335;
    System.out.println(number);

    float number1 = -42.3f;
    System.out.println(number1);

    char letter = '4';
    System.out.println(letter);

    String mystring = "Java Programming";
    System.out.println(mystring);

    // Arithmetic Operators

    int a = 15, b = 10;
    System.out.println("value = " + (a + b));
    System.out.println("value = " + (a - b));
    System.out.println("value = " + (a * b));
    System.out.println("value = " + (a / b));
    System.out.println("value = " + (a % b));

    int c = 20;
    float d = 15f;
    System.out.println("value = " + (c / d));
    System.out.println("value = " + (c % d));

    // Assignment Operators
    int e = 4;
    int var;
    var = e;
    System.out.println("value = " + var);
    var += e;
    System.out.println("value = " + var);
    var *= e;
    System.out.println("value = " + var);

    // Relational Operators

    int f = 7, g = 11;
    System.out.println(f == g);
    System.out.println(f != g);
    System.out.println(f < g);
    System.out.println(f > g);
    System.out.println(f >= g);
    System.out.println(f <= g);
    // Logical operators
    // &&
    // ||
    // !

    // Unary Operators
    // +
    // -
    // ++
    // --
    // !

    // Bitwise Operaotrs

    // Instanceof
    String str = "Programming";
    boolean result;
    result = str instanceof String;
    System.out.println("Value " + result);

    // Ternary Opeartor
    int februaryDays = 29;
    String solution;
    solution = (februaryDays == 28) ? "Not a leap year" : "Leap Year";
    System.out.println(solution);
  }

}