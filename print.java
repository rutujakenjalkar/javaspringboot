public class print {

    class A{
        public  A()
        {
            System.out.println("A const");
        }
    }
    public static void main(String a[])
    {
        System.out.println("rutu");

        //creatinf a refernce vaibles in the stack
      int a3;
      // creating an object in the stack
      a3=3;
      new A();  //anonymous object assigned in heap but no refernce vaiable of stack poitn sot it

    }
    
}
