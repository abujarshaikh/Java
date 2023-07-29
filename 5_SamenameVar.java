class SamenameVar{
public static void main(String args[])
{
double a=10;
System.out.println("Inside the Outermost Block");
System.out.println("The Value Of Varible a is::" +a);
{
System.out.println("Inside the First inner block");
System.out.println("Cannot Create  A variable with type int");
//int a=10;
{
System.out.println("Inside the second inner block");
System.out.println("Cannot create A variable with type string");
//String a="Hi Buddy!!";
}}}}