public class array {
    public static void main(String a[]){

        int num[]={5,6,7,4};//  WHEN U KNOW THE VALUES TO ADD IN THE ARRAY
        System.out.println(num[0]); //FETCHINGTHE VALUE START FROM INDEX VALUE 0
        System.out.println(num[1]);

        //Update the value i array
        num[1]=2;
        System.out.print(num[1]);

        //DYNAMIC ARRAY SETTING
        int num1[]=new int[5];
        System.out.println(num1[0]);
        //seting values for dynamic array
        num1[0]=45;
        num1[1]=5;
        num1[2]=2;
        num1[3]=3;
        num1[4]=4;
        
        System.out.println(num1[3]);
        for(int i = 0;i<5;i++)
        {
            System.out.println("Index:"+i+"Value"+num1[i]);
        }








    }
}
