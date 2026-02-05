import javax.swing.*;
import java. awt.event.*;


class Calculator extends JFrame
{

    public  Calculator()
    {
        setTitle("Calculator");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String A[])
    {
        new Calculator();

    }
}