import javax.swing.*;

/**
 * Created by Leong on 2015/5/24.
 */
public class Hello1 {
    public static void main(String arg[]) {
        JFrame frame = new JFrame("Hello Java");
        frame.add(new HelloComponent("Hello Java!!!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
