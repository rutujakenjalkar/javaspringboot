 class Calc
{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class Advanced extends Calc // adding feature of the parent super class to sub or child class
{
    public int multiply(int n1,int n2){
        return n1*n2;
    }


    public int divide(int n1,int n2){
        return n1/n2;
    }
}

class VeryAdvanced extends Advanced{
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }

}



public class inheritance {
    public static void main(String a[]){
       
     //class is only comiled when you are using the class

        Calc obj=new Calc();
        int r1=obj.add(2,3);
        int r2=obj.sub(5,4);

        System.out.println(r1);
        System.out.println(r2);

        Advanced obj1= new Advanced();
        int r3 = obj1.add(1,2);
        //if the class file of the super class is there but not the compiled file still the code works 

        VeryAdvanced obj2= new VeryAdvanced();
        int rutuja_1=obj2.add(2,4);
        double rutuja_2=obj2.power(2,4);
        System.out.println(rutuja_1);
        System.out.println(rutuja_2);

        //when one subclass extends super class- single inheritance
        // when the subclass extending super class extends another subclass -multilevel inheritance 
        // in java mulitple inheritance does not work





    }


}
