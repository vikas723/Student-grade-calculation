import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0, avg;
        char grade;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/5;
	
        if(avg>=80)
        {
            grade = 'A';
        }
        else if(avg>60 && avg<=80)
        {
            grade = 'B';
        }
        else if(avg>40 && avg<=60)
        {
            grade = 'C';
        }
        else
        {
            grade = 'D';
        }
        switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
             System.out.println("very good");
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
         System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
    