class BankAccount
{
  private int Balance=1000;
  public  synchronized void withdraw(int Amount)
  {
   if(Amount<=Balance)
   {
       System.out.println(Thread.currentThread().getName()+"Succesfully withdraw the Balance");
       Balance=Balance-Amount;
       System.out.println("Balance Amount is :"+Balance);
   }
   else
   {
       System.out.println(Thread.currentThread().getName()+"unable to withdraw");
   }
  }
}
   
class Customer extends Thread 
{
   public BankAccount bobj;
   public Customer(BankAccount obj,String Name)
   {
       super(Name);
       this.bobj=obj;
   }
   public void  run()
   {
       bobj.withdraw(800);
   }
}


class ThreadDemo10
{
   public static void  main(String A[]) throws Exception
   {
         BankAccount bobj = new BankAccount();
         
    Customer cobj1 = new Customer(bobj,"Sagar");
    Customer cobj2 = new Customer(bobj,"Sumit");

    cobj1.start();
    cobj2.start();

    cobj1.join();
    cobj2.join();

    System.out.println("End of Banking Application");
   }
}