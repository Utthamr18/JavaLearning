class Calculator
{
    public int add(int n1,int n2, int n3){
        return n1 + n2+n3;
    }

    public int add(int n1, int n2){
        return n1 + n2;
    }
}

    public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj  = new Calculator();
        int result = obj.add(45,18,1183);
        System.out.println(result);
        int result2 = obj.add(45,18);
        System.out.println(result2);
    }
}
