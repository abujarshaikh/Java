class ScopeDemo{
 public static void main(String args[])
{
double pi=3.14;
double radius=10;
double area=pi*radius*radius;
System.out.println("Within Outer Block");
System.out.println("Variables Area,pi,and radius are in Outer Block");
System.out.println("Area is::"+area);
{
double circumference=2*pi*radius;
System.out.println("Within Inner Block");
System.out.println("Variables Circumference defined within Inner Block");
System.out.println("Circumfernce is::"+circumference);
}
System.out.println("Within Outer Block Again!!");
System.out.println("The Variable Cicumference is Not Available in Outer Block");
}}