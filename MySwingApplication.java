import javax.swing.*;
import java.awt.event.*;

public class MySwingApplication implements Runnable
{
    GridComponent grid = new GridComponent(100, 100);
    public void run()
    {
        JFrame jframe = new JFrame("Window");
        jframe.setSize(4000, 4000);       
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    public static void main(String[] args)
    {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
}