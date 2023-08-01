class BitwiseLogicalOperator{
public static void main(String arg[])
{
 int x=9;
int y=8;
int z=-9;
int result;
System.out.println("x="+x+ " y="+y+ " z="+z);
result=x&y;
System.out.println("x  &  y: " +result);
result=x|y;
System.out.println("x  |  y: " +result);
result=~x;
System.out.println("~x : " +result);
result=x^y;
System.out.println("x  ^  y: " +result);
result=x<<2;
System.out.println("x << 2: " +result);
result=x>>2;
System.out.println("2 >> x: " +result);
result=z>>2;
System.out.println("z >> 2: " +result);
result=z>>>2;
System.out.println("z >>> 2: " +result);
}
}