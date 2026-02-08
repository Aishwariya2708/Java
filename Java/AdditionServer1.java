import java.net.*;
import java.io.*;
import java.util.*;


    class AdditionServer1
    {
    public static void main(String A[]) throws Exception
    {
         ServerSocket ssobj= new ServerSocket(2100);
         System.out.println("Server is waiting at port 2100");
         Socket sobj= ssobj.accept();
        System.out.println("Client request arrives and connected successfully");
         DataInputStream diobj = new DataInputStream(sobj.getInputStream());  
         DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream()); 
        int no = diobj.readInt();
        System.out.println("Data received client is: "+no);
        no++;
        doobj.writeInt(no);
    }

}

