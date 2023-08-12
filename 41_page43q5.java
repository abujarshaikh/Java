class X7{
public static void main(String arg[])
{
 int x=4;
int y=3;
int z=-4;
int result;
result=x&y;
System.out.println("x  &  y: " +result);
result=x|y;
System.out.println("x  |  y: " +result);
result=~x;
System.out.println("~x : " +result);
result=x^y;
System.out.println("x  ^  y: " +result);
result=x<<3;
System.out.println("x << 2: " +result);
result=x>>3;
System.out.println("2 >> x: " +result);
result=z>>3;
System.out.println("z >> 2: " +result);
result=z>>>3;
System.out.println("z >>> 2: " +result);
}
}