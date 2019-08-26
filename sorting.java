import java.util.Scanner;

class sorting
{
int arr[] = new int[5];
int c;
Scanner s = new Scanner(System.in);

void input()
{
System.out.println("Enter 5 numbers");
for(int i=0; i<5; i++)
{
arr[i]=s.nextInt();
}
}

void sort()
{
for(int i=4; i>0; i--)
{
for(int j=0; j<i; j++)
{
if(arr[j]>arr[j+1])
{
c=arr[j];
arr[j]=arr[j+1];
arr[j+1]=c;
}
}
}
}

void display()
{
System.out.println("numbers in ascending order are : ");
for(int i=0; i<5; i++)
{
System.out.println(arr[i]);
}
}

public static void main(String []aa)
{
sorting obj = new sorting();
obj.input();
obj.sort();
obj.display();
}
}