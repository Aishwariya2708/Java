import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener 
{
    public JFrame fobj;
    public JButton bobj1,bobj2,bobj3,bobj4;
    public JTextField tobj1, tobj2;
    public JLabel Userlable1, Userlable2, Resultlabel;

    public Calculator(String Title, int Width, int Height) 
    {
        fobj = new JFrame();

        
        Userlable1 = new JLabel("NO1:");
        Userlable1.setBounds(30, 30, 50, 30);

        Userlable2 = new JLabel("NO2:");
        Userlable2.setBounds(30, 80, 50, 30);

        
        tobj1 = new JTextField();
        tobj1.setBounds(100, 30, 150, 30);

        tobj2 = new JTextField();
        tobj2.setBounds(100, 80, 150, 30);

        
        bobj1 = new JButton("+");
        bobj1.setBounds(30, 120, 50, 30);
        bobj1.addActionListener(this);

         bobj2= new JButton("-");
        bobj2.setBounds(90, 120, 50, 30);
        bobj2.addActionListener(this);

        bobj3 = new JButton("*");
        bobj3.setBounds(150, 120, 50, 30);
        bobj3.addActionListener(this);

        bobj4 = new JButton("/");
        bobj4.setBounds(210, 120, 50, 30);
        bobj4.addActionListener(this);

        
        Resultlabel = new JLabel("");
        Resultlabel.setBounds(30, 180, 250, 30);

        
        fobj.add(Userlable1);
        fobj.add(tobj1);
        fobj.add(Userlable2);
        fobj.add(tobj2);
        fobj.add(bobj1);
         fobj.add(bobj2);
         fobj.add(bobj3);
         fobj.add(bobj4);
        fobj.add(Resultlabel);

        
        fobj.setTitle(Title);
        fobj.setSize(350, 300);
        fobj.setLayout(null);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj) 
    {
        try 
        {
            int no1 = Integer.parseInt(tobj1.getText());
            int no2 = Integer.parseInt(tobj2.getText());
            int sum = no1 + no2;
            Resultlabel.setText("Addition is: " + sum);
        } 
        catch (NumberFormatException e) 
        {
            Resultlabel.setText("Please enter valid integers!");
        }
        


    }

}

public class Calculator2
{
    public static void main(String[] args) 
    {
        new Calculator(" Calculator", 350, 300);
    }
}

