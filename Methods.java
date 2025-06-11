class Computer{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10){
            return "pen";
        }
        
        return "Give me more money" ;
    }

}

public class Methods {
    public static void main(String[] args) 
    {
        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMeAPen(12));

         
    }
}

