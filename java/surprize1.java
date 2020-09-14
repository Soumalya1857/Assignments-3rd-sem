import java.util.Scanner;

class DataSet
{
    final static int number = 5; 
    double value[][]  = new double[number][5];
    double avg[] = new double[5];
    double std[] = new double[5];

    void getData()
    {
        Scanner ip = new Scanner(System.in);
        for(int i =0;i<number;i++)
        {
            System.out.println("Input 5 numbers!");
            for(int j=0;j<5;j++)
            {
                System.out.print(""+j +": ");
                value[i][j] = ip.nextDouble();
            }
            System.out.print("\n");
        }
    }

    void defaultGetData()
    {
        System.out.println("Setting default set of data!!!!");
        //double x = Math.random() * 10;
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<5;j++)
            {
                value[i][j] = Math.random()*10;
            }
        }
    }

    void printAvg()
    {
        if(this instanceof Average)
        {
            //calculate avg for each features
            double sum = 0;
            for(int i =0;i< 5;i++)
            {
                for(int j=0;j<number;j++)
                {
                    sum = sum + value[j][i];
                }
                avg[i] = sum/number;
            }
            for(int i= 0;i<5;i++)
            {
                System.out.println("AVG "+ i +": "+avg[i]);
            }
        }
        else{
            System.out.println("Not accessible!!Access denied!!");
        }

    }

    void standardDev()
    {
        if(this instanceof Std)
        {
            //calculate avg
            for(int i= 0;i<5;i++)
            {
                double sum = 0;
                for(int j=0;j<number;j++)
                {
                    sum += value[j][i];
                }
                double avg = sum/number;

                int sum1 = 0;
                for(int j=0;j<number;j++)
                {
                    sum1 += (value[j][i] - avg)*(value[j][i] - avg);
                }
                double dev = sum1/number;
                dev = Math.sqrt(dev);
                std[i] = dev;
            }

            for(int i=0;i<5;i++)
            {
                System.out.println("Standard deviation for attribute "+ (i+1) +": "+ std[i]);
            }
        }
        else
        {
            System.out.println("Error occured! Access denied!!");
        }
    }
}

class Average extends DataSet
{
    Average(){};
}

class Std extends DataSet
{
    Std(){};
}

class test
{
    public static void main(String args[])
    {
        //Dataset d = new DataSet();
        Std s = new Std();
        s.getData();
        s.standardDev();

    }
}