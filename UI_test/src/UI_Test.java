import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 * Created by Leong on 2015/5/31.
 */
public class UI_Test extends JFrame
        implements ItemListener {
    String name[] = {"Java", "C++", "Markdown", "JS"};
    String num[] = {"00", "01", "10", "11"};
    String credit[] = {"4", "3", "8", "5"};
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(5);
    JLabel courLabel = new JLabel("Select Course:");
    JLabel nameLabel = new JLabel("Course");
    JLabel creditLabel = new JLabel("Credit");
    JComboBox jc = new JComboBox();

    UI_Test() {
        this.setLayout(new GridLayout(3, 2, 10, 10));
        for (int i = 0; i < num.length; i++) {
            jc.addItem(num[i]);
        }
        jc.addItemListener(this);
        this.add(courLabel);
        this.add(jc);
        this.add(nameLabel);
        this.add(tf1);
        this.add(creditLabel);
        this.add(tf2);
        this.setSize(300, 200);
    }

    public void itemStateChanged(ItemEvent e) {
        int x = 0, y = 0;
        String s = (String) e.getItem();
        for (; y < num.length; y++) {
            if (s == num[y]) {
                x = jc.getSelectedIndex();
                tf1.setText(name[x]);
                tf2.setText(credit[x]);
            }
        }
    }

    public static void main(String arg[]) {
        UI_Test u = new UI_Test();
        u.setVisible(true);
        u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit ,while close
    }
}

