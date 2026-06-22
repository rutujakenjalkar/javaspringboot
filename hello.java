public class hello {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 7;
        double num4 = 6.4;
        int result = num1+num2;
        char grade = 'A';
        String name = "rutuja";
        boolean isJavaFun = true; //literals
        System.out.println("Hello, World!");
        System.out.println("This is a simple Java program.");
        System.out.println(result);
        System.out.print("GOOD AFTERNOON"+name+"MAM");
        System.out.println("The grade is: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);

        int num6 = 0x7E;
        System.out.println("The value of num6 is: " + num6);
        int num7 = 1_000_000;
        System.out.println("The value of num7 is: " + num7);
        char c = 'r';
        c++;
        System.out.println("The value of c is: " + c);

        float x = 2.5f;
        int b= (int) x;
        System.out.println("The value of x is: " + b);
    }
}
