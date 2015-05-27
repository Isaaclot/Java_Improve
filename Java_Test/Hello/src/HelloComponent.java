import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by Leong on 2015/5/24.
 */
public class HelloComponent extends JComponent
        implements MouseMotionListener, ActionListener {
    String theMessage;
    int messageX = 125, messageY = 95;
    JButton theButton;
    int colorIndex;
    static Color[] somecolor = {Color.red, Color.black, Color.magenta, Color.blue, Color.CYAN};

    public HelloComponent(String message) {
        theMessage = message;
        theButton = new JButton("Chang Color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theButton)
            ChangeColor();
    }

    synchronized private void ChangeColor() {
        if (++colorIndex == somecolor.length) {
            colorIndex = 0;
        }
        setForeground(CurrentColor());
        repaint();
    }

    synchronized private Color CurrentColor() {
        return somecolor[colorIndex];
    }


}
