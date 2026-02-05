class Demo 
{
   public void Fun()
   {System.out.println("Inside Demo Fun");}

   public void gun()
   {System.out.println("Inside Demo Gun");}


}
   
 

 class Hello extends Demo
 {
    public void fun()    //Overriding allowed
   {System.out.println("Inside Hello Fun");}

  /*  public void gun()   not allowed 
   {System.out.println("Inside Hello Gun");} */
 }

   class FinalDemo3
   {
    public static void main(String A[]) 
    {
       Hello hobj= new Hello();
       hobj.fun();  //Hello fun
       hobj.gun();  //Demo gun
      
        
    }
}