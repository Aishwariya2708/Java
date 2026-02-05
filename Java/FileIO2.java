import java.io.*;

class FileIO2
{
    public static void main(String A [] ) 
    {
        try
        {
       
            FileWriter fwobj =  new FileWriter("Marvellous.txt");
            fwobj.write("Pre-placement Activity  bacth 53");
            fwobj.write("Logic Building with Industrial prohect develoment");
            fwobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured :"+obj);
        }
            
        
    }
}