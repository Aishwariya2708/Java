class Demo 
{

    public int i;
    //public final int j;   not allowed Error
    //public final int j=21; allowed

    public final int j;  // final characteristics 
    Demo()    // Demo();j(20) ->C++  
      {
        i=10;
        j=20;
    }
 }
    





class FinalDemo2
{
    public static void main(String A[]) 
    {
       Demo dobj= new Demo();
       dobj.i++;
       // dobj.j++;    Error
        
    }
}