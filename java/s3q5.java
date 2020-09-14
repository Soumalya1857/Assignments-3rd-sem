import java.io.*;
import java.util.*;

//import jdk.jfr.events.FileWriteEvent;

 class Student
 {
     String roll;
     String name;
     String score;

     void getData()
     {
         System.out.println(".............................................................");
         Scanner ip = new Scanner(System.in);
         System.out.print("Enter Student roll: ");
         roll = ip.nextLine();
         System.out.print("Enter Student name: ");
         name = ip.nextLine();
         System.out.print("Enter Student score: ");
         score = ip.nextLine();
         System.out.println(".............................................................");
     }
 }

 class Files
 {  public static void main(String args[])
    {
        File f = new File("StudentFile.txt");
        try
        {
            if(f.createNewFile()) 
            {
                System.out.println("File created: " + f.getName());
            }
            else
            {
                System.out.println("File already exists...!!! no problem!!");
            }
        }
        catch(IOException e)
        {
            System.out.println("An error occured!!");
        }

        try
        {
            FileWriter w = new FileWriter("StudentFIle.txt",true);
            System.out.print("Enter the number of students: ");;
            int x;
            Scanner ip = new Scanner(System.in);
            x = ip.nextInt();
            Student arr[] = new Student[x];
            for(int i=0;i<x;i++)
            {
                arr[i] = new Student();
                arr[i].getData();
                w.write("Name: "+ arr[i].name + "\nRoll no: "+ arr[i].roll+"\nScore: "+ arr[i].score +"\n");
            }

            System.out.println("File write successfully!!!!");
            w.close();
        }
        catch(IOException e)
        {
            System.out.println("Error occured while writing!!!");
        }
    }
 }