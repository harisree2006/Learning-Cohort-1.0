//factorial using recursion

import java.util.Scanner;
public class Factorial 
{
  public static int fact(int num)
  {
    if (num<=1)
    {
      return 1;
    }
    return num*fact(num-1);
  }
  punlic static void main(String[] args)
  {
    Scanner number = new Scanner(System.in);
    System.out.println("Eter the number to find the factorial: ");
    int num = input.nextInt();
    System.out.println("Factorial of "+num+" is : "+fact(num);
  }
}
