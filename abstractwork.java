abstract class Car
{

    //in abstract class only the declaration takes place not the implemenation of the abstract method
    abstract public void drive();

    public void playMusic(){
        System.out.println("PLaying Music");
    }
}

class BMW extends Car{

    public void drive(){
        System.out.println("Driving the car ");
    }
}





public class abstractwork {

    //YOU CANNOT CREATE OBJECT OF ABSTRACT CLASS

    public static void main(String a[]){
        BMW obj1= new BMW();
        obj1.drive();
        obj1.playMusic();
        
    }
    
}
