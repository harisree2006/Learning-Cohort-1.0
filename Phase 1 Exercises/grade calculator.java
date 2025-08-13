// grade calculator

import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner number = new Scanner(System.in);
    System.out.println("Enter number of subjects : ");
    int num = number.nextInt();
    int[] marks = new int[num];
    System.out.println("Enter total marks per subject: ");
    int totalMarks = number.nextInt();
    int sum=0;
    for(int i=0;i<num;i++)
      {
        System.out.println("Enter the marks for subject "+i+" : ");
        marks[i] =number.nextInt();
        sum+=marks[i];
      }
    double percent=(sum/(num*(double)totalMarks))*100;
    String grade;
    if (percent>=90)
        grade = "A+";
    else if (percent>=80&&percent<90)
        grade = "A";
    else if (percent>=70&&percent<80)
        grade = "B";
    else if (percent>=60&&percent<70)
        grade = "C";
    else if (percent>=50&&percent<60)
        grade = "D";
    else
          grade ="F";
    System.out.println("Percentage is  "+percent+ "%");
    System.out.println("Grade is  "+grade);
  }
}
