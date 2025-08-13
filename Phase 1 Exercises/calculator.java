//oop calculaator

import java.util.Scanner;
public class calculator
{
  public static void main(String[] args)
  {
    Scanner number = new Scanner(System.in);
    System.out.println("Enter first number : ");
    double x = number.nextDouble();
    System.out.println("Enter the second number : ");
    double y = number.nextDouble();
    double add = x + y;
    double sub = x - y ;
    double pro = x * y ;
    double div = x / y;
    System.out.println("Addition : "+add);
    System.out.println("Substration : "+sub);
    System.out.println("Multiplication : "+pro);
    System.out.println("Division : "+div);
  }
}

    
