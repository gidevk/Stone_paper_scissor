
import java.util.*;

public class StonePaperScissor {
    public static void main(String[] args) {
     
        int x,y,ct=0,u=0,c=0;
        System.out.print("Enter You/r choice: \t1.For ROKE\t2.For PAPER\t3.For Scissor\t4.Show Result:-");
        Random rand = new Random();
        try{
            Scanner sc =new Scanner(System.in);
        do{
            x= sc.nextInt();
            ct =x;
            y = rand.nextInt(3) + 1;

            if(x==y) System.out.println("Match Draw!");
            else if(x==1){
                if(y==2)c++;
                else if(y==3)u++;
                else System.out.println("This is not valid input!");
            }
            else if(x==2){
                if(y==1)u++;
                else if(y==3)c++;
                else System.out.println("This is not valid input!");
            }
            else if(x==3){
                if(y==2) u++;
                else if(y==1)c++;
                else System.out.println("This is not valid input!");
            }
        }while(ct != 4);
       
        sc.close();
        System.out.println("Result:\nYou Score "+u+
        "\nComputer Score "+c+
        "\n"+ ((u!=c) ? ((u>c) ? "***************************Congratulations You Win!***************************" 
                               :"***************************Computer Win!***************************") 
                    :
         "Match Draw"));
        }
        catch(Exception ex){
            System.out.println("Something happend Wrong!! Try again...");
        }
        finally{
            System.out.println("..............Thank You For Play This Game............");
        }
}

}
