
class tech{
   public void seen(){
    System.out.println("i am in tech");
   }
}

class girl extends tech{

}

//final class <name>{} to create a class which cannot beinhertited

class rutuja {

    public static void main(String a[]){

        girl student= new girl();
        student.seen();

        tech student2= new girl();
        student2.seen();

        //DYNAMIC DISPATCHING WHILE DECLARING THE VARIABLE YOU CAN USE 
        //PARENT CLASS AS  THE REFERENCE TYPE AND THE DECALRE A CHILD VARIABLE 
        //BACUSE A CHILD WILL ALWAYS BE A TYPE OF A PARENT RIGHT

        // FOR THE SAME VAIRBLE NEW OBJECT CAN ALSO BE ASSIGNED
        //only possible in inheritance

        //FINAL KEY WORD
        final int num=4;
        tech student1= new tech();
        System.out.println(student1.toString());
        
        System.out.println(num);
        //if u dont change the object method it will be coming automatically
        tech student3= new tech();
        System.out.println(student1==student3);
        boolean result = student1.equals(student3);
        System.out.println(result);


    }
    
}

