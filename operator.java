public class operator{
    public static void main(String[] args){
        System.out.println("checking various operators");

        int num1 = 20;
        int num2 = 27;

        int addition = num1+num2;
        int subtraction = num2-num1;
        int multiplication = num1*num2;
        float division =num2%num1;
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        num1-=2; //increment the value by 2
        num1+=1; //decrement the value by 1
        System.out.println(num1);

        //INCREMENT
        int a = 10;
        a++;//post increment
        a--; //decrement  the value by 1
        System.out.println(a);
        int result1 = a++;
        int result2 = ++a;//pre increment
        System.out.println(result1);
        System.out.println(result2);


        //COMPARISON OPERATORS
        int x=34;
        int y=35;
        int r=5;
        int b=9;
        boolean outcome= x!=y;
        System.out.println(outcome);

        //LOGICAL OPERATORS 
        //&& AND OPERATOR
        // || OR OPERATOR
        // ! NOT OPERATOR

        boolean rutuja = x>y  || (r<b);
        System.out.println(rutuja);
        System.out.println(!rutuja);
    }
}