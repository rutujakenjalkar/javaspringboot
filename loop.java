public class loop 
{
    public static void main(String a[])
    {
        //while loop
        int i = 1;
        while(i<=5){
            System.out.println(i);

            i++;
        }


    

    //DO while 
    // TO EXECUTE THE BLOCK EVEN IF THE CONDITION IS FALSE ONCE
    
    int j = 1;
    do{
        System.out.println(j);
        j++;    
    }while(j<4);

    //FOR LOOP
    //write everything in one line
    for(int r = 0;r<=3;r++){
        System.out.println("Suprise");
    }

    for(int p = 1;p<=5;p++)
    {
        System.out.println("DAY"+" "+p);
        for (int q = 9;q<=18;q++){
            System.out.println("HOUR"+" "+q);
        }

    }




}
}
