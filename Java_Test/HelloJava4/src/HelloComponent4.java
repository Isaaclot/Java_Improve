import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by Leong on 2015/5/25.
 */
class HelloComponent4 extends JComponent
        implements MouseMotionListener ,ActionListener, Runnable {
    String theMessage;
    int messageX = 125, messageY = 95;
    JButton theButton;

    int colorIndex;
    static Color[] somecolors = {Color.CYAN, Color.black, Color.blue, Color.magenta, Color.red};

    boolean blinkState;

    public HelloComponent4(String message) {
        theMessage = message;
        theButton = new JButton("Change Color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
        Thread th = new Thread(this);
        th.start();
    }

    public void paintComponent(Graphics g) {
        g.setColor(blinkState ? getBackground() : currentColor());
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(java.awt.event.MouseEvent e){
        messageX=e.getX();
        messageY=e.getY();
    }

    public void mouseMoved ( java.awt.event.MouseEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == theButton) {
            changeColor();
        }
    }

    synchronized private void changeColor() {
        if (++colorIndex == somecolors.length) {
            colorIndex = 0;
        }
        setForeground(currentColor());
        repaint();
    }

    synchronized private Color currentColor() {
        return somecolors[colorIndex];
    }

    public void run() {
        try {
            while (true) {
                blinkState = !blinkState;
                repaint();
                Thread.sleep(300);
            }
        } catch (InterruptedException ie) {
        }
    }


}
