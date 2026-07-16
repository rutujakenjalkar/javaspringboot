package Project1;

import java.util.Scanner;

public class QuestionService
{
    Question[] Questions= new Question[3];
    String[]   Answers= new String[3];

    public QuestionService(){
        Questions[0]= new Question(1,"What language was founded in 1985?","Python","Java","Golang","mysql","java");
        Questions[1]= new Question(2,"What language was founded in 1985?","Python","Java","Golang","mysql","java");
        Questions[2]= new Question(3,"What language was founded in 1985?","Python","Java","Golang","mysql","java");
    }
    public void displayQuestions(){

        //always compile from the parent direcoty for the safer side 
        System.out.println("rutu");
        int i=0;
        for (Question q: Questions){
            System.out.println(q.getId());
            System.out.println(q.getQuestions());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner variable= new Scanner(System.in);
            Answers[i] = variable.nextLine();
            i++;
        }
       
        for (String a: Answers){
            System.out.print(a);
        }


    }


    public int returnScore(){
        int score =0;
        
        return score;
    }
}
