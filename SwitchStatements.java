public class SwitchStatements {
    public static void main(String[] args) {

        String day = "Monday";
        String result = "";

        result = switch(day){
            case "Saturday", "Sunday": yield "6am";
            case "Monday" : yield "8am";
            default :yield "7am";
        };
        System.out.println(result);

        
        // int n = 7;

        // switch(n){
        //     case 1 : 
        //         System.out.println("Monday");
        //         break;

        //     case 2 : 
        //         System.out.println("Tuesday");
        //         break;
        //     case 3 : 
        //         System.out.println("Wednesday");
        //         break;
        //     case 4 : 
        //         System.out.println("Thursday");
        //         break;
        //     case 5 : 
        //         System.out.println("Friday");
        //         break;
        //     case 6 : 
        //         System.out.println("Saturday");
        //         break;
        //     case 7 : 
        //         System.out.println("Sunday");
        //         break;
        //     default: System.out.println("Enter a Valid Number");
        //}

    }
}
