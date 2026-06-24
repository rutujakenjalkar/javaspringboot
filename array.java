class Student{

    int rollno;
    String name;
    int marks;
}

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

        //CREATING MULTI DIMNESIONAL ARRAY
        int nums[][]=new int[3][4];
        //nums[0][0]=5;
        //nums[0][1]=3;
        //System.out.println(nums[0][0]);
        //System.out.println(nums[0][1]);

        for(int i=0;i<3;i++) //OUTER LOPP FOR ROW 
        {
            for ( int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*100); //Math rnadom give 2 decimal random values which are mulitplied by 100
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        //TO FIND THE LENGTH OF THE ARRAY 
        System.out.println(num.length);

        Student s1=new Student();
        s1.rollno=1;
        s1.name="rutuja";
        s1.marks=100;

        Student s2= new Student();
        s2.rollno=2;
        s2.name="kd";
        s2.marks=99;

        Student s3= new Student();
        s3.rollno=3;
        s3.name="sangeeta";
        s3.marks=89;

        Student students[]= new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0;i<students.length;i++)
        {
            System.out.println("Rollno:"+students[i].rollno+" "+"Name:"+students[i].name+"Marks:"+students[i].marks);
        }

        int array1[]={2,45,67,23,78,819};
        //FOR EACH LOOP //enhanced for loop
        for(int n:array1)
        {
            System.out.print(n);
        }


    }
}
