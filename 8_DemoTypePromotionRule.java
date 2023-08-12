class DemoTypePromotionRule
{
public static void main(String args[])
{
byte b=8;
short s=20000;
int i1=b*s;
System.out.println("b*s::"+i1);
long l1=751722587526l;
long l2=l1+b+s+i1;
System.out.println("l1+b+s+i1::"+l2);
float f1=2.5f,f2;
f2=f1+b+s+l2;
System.out.println("f1+b+s+l2::"+f2);
double d1=2.56789, d2;
d2=d1*f1+b+s+l2;
System.out.println("d1*f1+b+s+l2::" +d2);
}
}