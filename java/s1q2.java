class s1q2
{
    public static void main(String args[])
    {
        int i;
        for(i=0;i<args.length;i++)
        {
            System.out.println("Argument "+ (i+1) + "=" + args[i]);
        }
        System.out.println("Total number of arguments: "+(i+1));
    }
}