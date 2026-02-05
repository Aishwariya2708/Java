import javax.swing.*;
import java. awt.event.*;

class Calculator implements ActionListener
{
    public JFrame fobj;
    public JButton bobj;
    public JTextField tobj;
    
    public JLabel  Userlable,Resultlabel;
    public Calculator( String Title,int Width,int Height)
    {
      fobj= new JFrame();

      Userlable =new JLabel("NO1");
      Userlable.setBounds(10,10,30,30);

      tobj= new JTextField();
      tobj.setBounds(150,50,150,30);

      

      bobj =  new JButton("PLUS");
      bobj.setBounds(70,100,12,30);

      Resultlabel = new JLabel("");
      Resultlabel.setBounds(150,200,250,30);

      fobj.add(bobj);
       fobj.add(tobj);
       
         fobj.add(Userlable); 
        
          fobj.add(Resultlabel);
          
          bobj.addActionListener(this);
          fobj.setLayout(null);



      fobj.setTitle (Title);
        fobj.setSize(Width,Height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent aobj)
    {
       String uname = tobj.getText();
       

        Resultlabel.setText("Addition is 21");
       
       }
    }
    

    


class CalculatorX
{
    public static void main(String A[])
    {
         Calculator mobj = new Calculator("Calculator",400,300);

    }
}