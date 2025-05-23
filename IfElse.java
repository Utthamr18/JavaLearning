public class IfElse {
    public static void main(String[] args) {
        int x = 8;
        int y = 17;
        int z = 6;
        /*if(x > 10 && x <= 20){ 
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }*/
        if(x > y && x > z){
            System.out.println(x);
        }
        else if(y > z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }

        
        
    }
     
}
