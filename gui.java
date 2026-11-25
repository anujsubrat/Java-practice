import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args){
        JFrame frame=new JFrame("First");
        JLabel l=new JLabel("hello");
        JButton button=new JButton("Click me");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(l);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
