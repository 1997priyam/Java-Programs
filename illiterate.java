
class illiterate
{
Double il,men;

void calculate()
{
men=(0.52*80000);
il=men-(0.35*men);
System.out.println("The illiterate men are" +il);
}

public static void main(String []aa)
{
illiterate obj = new illiterate();
obj.calculate();
}
}