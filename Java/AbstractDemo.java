import java.util.Scanner;

abstract class RBI
{
   public String Country ="India";

   public void DisplayKYC()
   {
    System.out.println("Please submit your Address proof and photo id");
   }

   abstract public void DisplayROI(); 
}

class SBI extends RBI
{
    public void DisplayROI()
        {
            System.out.println("Our ROI for FD is 7.5%");
        }
    
  
}

class BOM extends RBI
{
    public void DisplayROI()
        {
            System.out.println("Our ROI for FD is 8.5%");
        }
    
  
}

class AbstractDemo
{
  public static void main(String A[])
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Please select your bank:");
    System.out.println("Please select your India:");
    System.out.println("Please select your Maharashtra:");
      int Option = sobj.nextInt();
      RBI robj = null;
      if(Option ==1)
      {
          robj = new SBI();  //Upcasting 
      }
      else if(Option ==2)
      {
        robj = new BOM();

      }

      System.out.println("Country is : "+ robj.Country);

      robj.DisplayKYC();
      robj.DisplayROI();


   
  }
}