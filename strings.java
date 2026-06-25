public class strings {
    public static void main(String a[])
    {
        //DOUBLE QOUTES FOR STORING COLLECTION OF CHARACTERS
        String name="RUTUJA";
        //another way to initialize 
        String word = new String("navin");
        System.out.print("hello"+" "+word); //concatenation
        //Character index in string
        //  also starts from zero 
        //to get character at particular space
        System.out.println(name.charAt(0));
         System.out.println(name.charAt(4));

         //concat method
         System.out.print(name.concat("well done !"));
         name = name + "is the best";
         System.out.print(name);
         String s1="abcd";
         String s2="abcd";
         System.out.println(s1 == s2);

         //IMMUTABLE STRING CANNOT BE CAHNGES NORMAL ABIVE STRING METHODS
         //MUTABLE STRING CAN BE CHANGED STRING BUILDER

            StringBuffer sb= new StringBuffer("RUTUJA");
            System.out.println(sb.capacity());
            System.out.println(sb.length());
            System.out.println(sb.append(" kenjalkar"));
            System.out.println(sb);
            sb.deleteCharAt(2);
            sb.insert(2,"Ttiyur");
            System.out.println(sb);
            String sb1= sb.toString();
            System.out.println(sb.substring(2,8));
            sb.setLength(60);
            System.out.println(sb);

























        }
}
