class IncrDecrOperator{
public static void main(String args[])
{
int x=100;
int y=200;
int a,b,c,d;
a=++x;
b=y++;
//increment operators
System.out.println("a= " +a);
System.out.println("b= " +b);
System.out.println("x= " +x);
System.out.println("y= " +y);
System.out.println();
c=--a;
d=b--;
System.out.println("a= " +a);
System.out.println("c= " +c);
System.out.println("b= " +b);
System.out.println("d= " +d);
}
}