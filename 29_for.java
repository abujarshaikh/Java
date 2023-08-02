class For {
    public static void main(String arg[])
    {
        int i,sum=0;
        double avg=0;
        for(i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        avg=(double)sum/10;
        System.out.println("The Sum Of the numbers 1 to 10 is "+sum);
        System.out.println("The Average of Sum of number 1 to 10 is "+avg);
    }
}