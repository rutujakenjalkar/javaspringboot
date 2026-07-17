
class A{

    public void show(){
        System.out.println("this is the implementation");
    }
}





public class anonymousclass {
    public static void main(String s[]){

        A obj = new A()
        {
            public void show(){
                System.out.println("THIS IS ME ");
            }
        };
        obj.show();
    }
    
}
