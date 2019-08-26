import java.util.Scanner;

class diagonal
{
int arr[][] = new int [3][3];
Scanner s = new Scanner(System.in);
void input()
{
for(int i=0; i<3; i++)
{
for(int j=0; j<3; j++)
{
System.out.print("Enter row "+ (i+1));
System.out.println(" column " + (j+1));
arr[i][j]=s.nextInt();
}
}
}

void display2()
{
System.out.println("Diagonal elements are : ");
for(int i=0; i<3; i++)
{
for(int j=i; j<i+1; j++)
{    
System.out.println(arr[i][j]);
}
System.out.print("   ");
}
}

void display1()
{
System.out.println("Diagonal elements are : ");
for(int i=0; i<3; i++)
{
for(int j=0; j<3; j++)
{   
if(i==j)
{ 
System.out.println(arr[i][j]);
break;
}
else
System.out.print("  ");
}
}
}

public static void main(String []aa)
{
diagonal obj = new diagonal();
obj.input();
obj.display1();
}
}