import java.io.*;
import java.util.Scanner;
class FileIO
{
    //File f = new File("copy.java");
    //Scanner s = new Scanner(f)0;
    public static void main(String args[])
    {
        File f = new File("s1q1.java");
        try{Scanner s = new Scanner(f);}
        catch(Exception e){System.out.println("mmamamamamammamam");}
    boolean fuck = false;
    while(!fuck)
    {
        try{
            int i = s.nextInt();
            System.out.print((char)i);
        }
        catch(Exception e)
        {
            fuck = true;
        }
    }
    //f.close();
    }
}