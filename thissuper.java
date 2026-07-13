
class A{
    public A(){
        super();
        System.out.println("A: non param");
    }

    public A(int n1){
        super();
        System.out.println("A: params");
    }
    
}

class B extends A{
    public B(){
        super();
        System.out.println("B: non param");
    }

    public B(int n1){
        this(); //exectues the constructor of this class
        //super(n1);
        System.out.println("B:params");
    }
}





public class thissuper {

    public static void main(String a[])
    {
        B obj1= new B(3);
        System.out.println(obj1); //gives storage value

        //each constrcutor has a super fucntion hence the value is not beign proeprly printed 

        //above statement gives A: non paprams and b:params

        //to get a: params and b: params we pass in super of b(int n)>super(n)
        B obj2= new B(3);
        System.out.println(obj2);

        //every class in java extends the object class
        //each super class extends the object class 
        // and super calls the constrcutor of the object class
    }
    
}
