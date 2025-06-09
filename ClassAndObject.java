class Calculator
{
    int a;

    public int add(int num1, int num2)
    {
        int r = num1 + num2;
        return r;
    }
}

    public class ClassAndObject {
    public static void main(String[] args) {
        int num1 = 10101;
        int num2 = 5786;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);

    }
}

//Object Oriented Programming
// Object - Properties(Knows something/data/variables) and Behavior(Does something/action/methods)
