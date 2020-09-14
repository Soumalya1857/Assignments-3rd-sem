import java.util.*;
import java.io.*;

class ThreadCheck
{
    public static void main(String args[]) throws Exception
    {
        int x = 5;
        t1 t1obj = new t1(x);
        t2 t2obj = new t2(x);
        Thread thread1,thread2;
        thread1 = new Thread(t1obj);
        thread2 = new Thread(t2obj);
        thread1.start();
        thread2.start();

        try
        {
            thread1.join();
            thread2.join();
        }
        catch(Exception e)
        {
            System.out.println("Error occured due to ")
        }
        
        
    }
}

class t1 implements Runnable
{
    int x;
    t1(int p){x=p;}
    public void run()
    {
        x = x+5;
        System.out.println("Increment x by 5: "+ x);
    }
}

class t2 implements Runnable
{
    int x;
    t2(int p){x=p;}
    public void run()
    {
        x = x-5;
        System.out.println("Decrement x by 5: "+x);
    }
}

