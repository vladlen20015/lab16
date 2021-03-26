import java.awt.*;
import javax.swing.*;

public class Labar16 extends JComponent {
    @Override
    public void paintComponent(Graphics g) {
        g.drawRect(50,150,150,150);
        g.drawRect(75,200,50,50);
        g.drawLine(25,175,125,75);
        g.drawLine(125,75,225,175);
        g.drawLine(150,100,150,75);
        g.drawLine(150,75,175,75);
        g.drawLine(175,75,175,125);
        g.drawLine(25,300,425,300);
        g.drawLine(335,300,335,250);
        g.drawLine(365,250,365,300);
        g.drawArc(275,50,150,200,-79,337);
    }
    public static void main(String[] args){
        JFrame frame= new JFrame("Zadanie16");
        Labar16 draw = new Labar16();
        draw.setSize(450,300);
        frame.add(draw);
        frame.pack();
        frame.setVisible(true);
    }
}

