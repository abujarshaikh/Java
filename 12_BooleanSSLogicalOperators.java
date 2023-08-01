class BooleanSSLogicalOperators{
public static void main(String args[])
{
int x=50, y=1;
if((x+y<100)|| (y<10))
System.out.println("Only The First Operand is Evaluated");
if(!((x+y<5)&&(y>0)))
System.out.println("Again,Only The First Operand is Evaluated");
}
}