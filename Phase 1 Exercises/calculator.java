//oop calculaator

import java.util.Scanner;
class calculator
{
   double add (double x,double y)
   {
    return x + y;
   }
    double sub(double x,double y)
   {
    return x - y ;
   }
    double pro(double x,double y)
   {
      return x * y ;
    }
    double div(double x,double y)
    {
      if (y==0)
      {
        System.out.println("Cannot divide by Zero!");
        return 0;
      }
      return x / y;
    }
 }
class Main
 {
  public static void main(String[] args)
  {
    
    Scanner number = new Scanner(System.in);
    calculator cal = new calculator();
    System.out.println("Enter first number : ");
    double x = number.nextDouble();
    System.out.println("Enter the second number : ");
    double y = number.nextDouble();
   
    System.out.println("Addition : "+cal.add(x,y));
    System.out.println("Substration : "+cal.sub(x,y));
    System.out.println("Multiplication : "+cal.pro(x,y));
    System.out.println("Division : "+cal.div(x,y));
  }
}



    
