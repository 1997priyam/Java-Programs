import java.util.Scanner;

class prime
{
int n,a,flag=0;
void check()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
n=s.nextInt();
for(int i=2; i<=(n/2+1); i++)
{
a=n%i;
if(a==0)
break;
else
flag++;
}

if(flag==0)
System.out.println("Not Prime");
else
System.out.println("Prime Number");	
}

public static void main(String []aa)
{
prime obj = new prime();
obj.check();
}

}