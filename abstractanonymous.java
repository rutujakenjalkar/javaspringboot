
abstract class A{

    abstract public void show();
}



public class abstractanonymous {
    
    public static void main(String s[]){


        A obj= new A()
        {
            public void show(){
                System.out.println("rutuja");
            }

        };
        obj.show();

    }
}
