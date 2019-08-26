import java.util.Scanner;

class identify
{
String ch;

void check()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter a letter in lowercase");
ch=s.next();
if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u"))
System.out.println("Vowel");
else
System.out.println("Consonant");
}

public static void main(String []aa)
{
identify obj = new identify();
obj.check();

}

}
