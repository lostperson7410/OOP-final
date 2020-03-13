
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
class Swing extends JFrame{

    protected int count = 0;
    
    // private JFrame f = new JFrame("Swing counter");
    // private JLabel l = new JLabel("count");
    private JButton b = new JButton("count");
    private JTextField t = new JTextField("0 ",30);
    // Container cp = f.getContentPane();
    Swing(){
        setSize(600,300);
        setLayout(new FlowLayout());
        add(new JLabel("Count"));
        add(t);        
        add(b);
        //b.addActionListener(this); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    // public void actionPerformed(ActionEvent e)
    // {
    //     System.out.println(" " + count);
    //     count++;        
    // }
    public static void main(String[] args) {
        new Swing();
    }
}
/*
class ext jfram
    constru(){
        add(
        setv
        setT
    }


*/