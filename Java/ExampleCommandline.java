 class ExmapleCommandline 
{
    public static void main(String A[] ) 
    {
        if (A.length == 0)
         {
            System.out.println("Please provide at least one word.");
           
            return;
        }

        for (String word :A)
         {
            System.out.println("Length is " + word.length());
            
        }
    }
}
