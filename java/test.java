import java.util.Scanner;

interface mama
{
    void compute();
}

class Hoka implements mama
{
    private double a, b;
    void getData()
    {
        System.out.print("Input two doubles: ");
        Scanner ip = new Scanner(System.in);
        a = ip.nextDouble();
        b = ip.nextDouble();
        //ip.close();
        System.out.println("Scanner: " + ip);
    }
    public void compute()
    {
        double ma = 3.14*a*b;
        System.out.println("the circular number is: " + ma);
    }
}

class Poka implements mama
{
    private int a,b;
    void getData()
    {
        System.out.print("Input two int: ");
        Scanner ip1 = new Scanner(System.in);
        //System.out.println("kdkdkdkdkddkdkdkdkdkdkdkdk");
        a = ip1.nextInt();
        System.out.println("kdkdkdkdkddkdkdkdkdkdkdkdk");
        b = ip1.nextInt();
        //ip1.close();
    }
    public void compute()
    {
        int japa = a+b;
        System.out.println("the tbtbtb number is: "+a +b + japa);
    }
}

class test
{
    public static void main(String args[])
    {
        Hoka h; //p.getData();
        h = new Hoka();
        h.getData(); //p.getData();
        h.compute();
        //h.close();

        Poka p;
        p = new Poka();
        p.getData();
        p.compute();
    }
}
