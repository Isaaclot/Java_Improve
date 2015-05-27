import javax.swing.*;

/**
 * Created by Leong on 2015/5/25.
 */
public class HelloJava4 {
    public static void main(String arg[]) {
        JFrame frame =new JFrame("Hello Java");
        frame.add(new HelloComponent4("Hello Java"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
