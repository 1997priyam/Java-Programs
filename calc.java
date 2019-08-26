import java.util.Scanner;
class calc
{
 float a,b;
 void get_number()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter two numbers : ");
  a=s.nextFloat();
  b=s.nextFloat();
  sum(a,b);
  sub(a,b);
  mul(a,b);
  div(a,b);
  mod(a,b);
 }
 void sum(float x, float y)
 {
  float sum=x+y;
  System.out.println("Sum= "+sum);
 }
 
 void sub(float x, float y)
 {
  float sub=x-y;
  System.out.println("Subtraction= "+sub);
 }
 void mul(float x, float y)
 { 
  float mul=x*y;
  System.out.println("Multipliaction= "+mul);
 }
 void div(float x, float y)
 {
  float div=x/y;
  System.out.println("Division= "+div);
 }
 void mod(float x, float y)
 {
  float mod=x%y;
  System.out.println("Modulus= "+mod);
 }

 public static void main(String []aa)
 {
  calc obj=new calc();
  obj.get_number();
 }

}