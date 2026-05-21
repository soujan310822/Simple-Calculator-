import javax.swing.*;
import java.awt.*;

public class Frame {
    public JFrame frame = new JFrame();
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();

    // constructor of my window pane
    public Frame() {
       this.frame.setSize(400, 510);
       this.frame.setLayout(null);
       this.frame.setTitle("simple calculator");
       this.panel1.setLayout(null);
       this.panel2.setLayout(null);
       this.panel1.setBounds(0, 0, 386, 150);
       this.panel2.setBounds(0, 150, 400, 360);
       this.panel1.setBackground(new Color(169, 169, 169));
       this.panel2.setBackground(Color.BLACK);
       this.panel1.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(218, 165, 3)));


       this.frame.add(panel1);
       this.frame.add(panel2);
       this.frame.setResizable(false);
       this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public void setvisible(boolean b) {
        frame.setVisible(b);
    }
}
