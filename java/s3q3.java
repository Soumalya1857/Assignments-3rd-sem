
import java.io.*;
import java.util.*;

class CheckFile
{
    public static void main(String args[])
    {
        System.out.print("Enter a file name: ");
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        File file = new File(name);
        try
        {
            if(file.isDirectory() && file.exists())
            {
                System.out.println("It is a Directory!!!");
            }
            else{
                System.out.println("It is NOT a Directory!! Or file doesn't exits!!");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error occured!!");
        }
        
        System.out.println("The file names are as under: ");
        String[] fileNames;
        fileNames = file.list();
        for(String a : fileNames)
        {
            System.out.println(a);
        }
    }
}