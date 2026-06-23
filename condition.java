public class condition {
    public static void main(String[] args){

        int x = 12;
        int y=15;
        int r = 21;

        if (x>y && x>r) {
            System.out.println("x is the maximum");
        } 
        else if (y>x && y>r) {
            System.out.println("y is the maximum");
        }
        else{
            System.out.println("z is the maximum");
        }


        //TERNARY 
        int n = 12;
        String result = " ";
        result = n%7==0 ? "Even": n==0?"Zero ": "Odd";
        //? Anything before this ask as if condtion 
        //Anything after ? is the code to excute 
        //: anything after is code to exceute for else
        System.out.println(result);

        //SWITCH 
        int d = 12;
        switch(d){
            case 1:
                System.out.println("THIS IS ONE");//always add break in the end else entire block woth all condtions get executed
                break;
            case 2:
                System.out.println("this is two");
                break;
            case 3:
                System.out.println("this is three");
                break;
            default: //if none of the values work
                System.out.println("None of the values");
        }

        
    }
}
