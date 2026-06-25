

class Human{
    private int age  ; //private data cab only be accessed inside the class
    private String name ;
    static String city;
    //STATIC VARIABLES ARE SHARED  BY ALL OBJECT IF THE SAME CLASS

    //Static block is used to initiliaze static varibales and can onle be called once 
    static{
        city = "Mumbai";
        System.out.println("inside the static block");
    }

    //static block is called before the constrcutor only once when teh class is loaded when the object is beign created.
    //class loaded only once and also the static varibale set only once






    //Constructor - dont metione return type, same name as class name
    // called when object created 
    //default non paramaterized constructor
    public Human() {
    }

    // paramaterzied constrcutor
     
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
   

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 

    //STATIC Method
    public static void show()
    {
        // A NON STATIC VARIBALE CANNOT BE USED INSIDE A STATIC FUNCTION
        System.out.println("this is the static method");
    }
    
    public static void show1(Human obj)
    {
        //using a non static variable inside a static method 
        System.out.println(obj.name);
    }
}
//variables from the outside workd cannot be used dirreclty hence binded toghether

//this refer the object on which the method is called 




public class encap {
    public static void main(String a[])
    {
        Human person1= new Human(22,"rutuja");
        Human person2= new Human();
        //person1.setAge(22);
        //person1.setName("rutuja");
        //person1.name="RUTUJA";
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());

        //ACCESSING STATIC VAIRABLE
        System.out.println(person1.city);
        System.out.println(person2.city);

        //Calling a static method
        Human.show(); //u can call direclty with object
        Human.show1(person1);





    }
}

// Naming conventions
//class -Start with captial letter
//varaibles and methods - start woth small letters
//constants - PIE all capitals
//when two letter word put first in captial eg my=> My
//age,DATA,Human()