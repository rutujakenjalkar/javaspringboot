class Calculator{
    int a;
    public int addition(int x,int y) //int is the return type
    {
        System.out.println("add");
        return x+y;
    }
}

class Computer{

    //void is used when u dont want method to return anything 
    public void playmusic(){
        System.out.print("playin smh dope shit ...");
        
    }
    public String getmeapen(int x){
        if (x>=10)
            return "This is your Pen"+x;
        else
            return "Amount is less";
    }

}

 class Rutuja{

    public int wins(int n1,int n2)
    {
        return n1+n2;
    }
    public String wins(String d)
    {
        return "Rutuja always win";
    }

}

public class oop1 {
    
    public static void main(String a[]){
        int num1 = 1;
        int num2 = 2;

        //int result = num1+ num2;
        //System.out.println(result);
        //INSTANCE CREATION
        //Calculator Calc=new Calculator();
        //int result = Calc.addition(num1,num2);
        //System.out.print(result);

        Computer obj1= new Computer();
        obj1.playmusic();
        String here = obj1.getmeapen(3);
        System.out.println(here);

        Rutuja obj2=new Rutuja();
        //  METHOD OVERLOADING SAME OBJECTS DIFFERNET METHODS WITH PARAMETERS
        int result1 = obj2.wins(3,4);
        String result2 = obj2.wins("Rutuja");
        System.out.print(result1);
        System.out.print(result2);

    }
}
