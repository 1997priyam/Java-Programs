import java.util.Scanner;

class prime 
{
public static void main(String args[])
{
int n,count=0,div;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=2;j<i;j++)
{
div=i%j;
if(div==0)
{
count=0;
break;
}
else
{
count++;
}
}
if(count>0 || i==2)
{

System.out.println(i);
}
}
}
}