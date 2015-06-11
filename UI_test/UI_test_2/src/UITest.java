import javax.swing.*;
import javax.swing.text.StringContent;
import java.awt.*;
import java.util.Vector;

/**
 * Created by royleong on 01/06/15.
 */
public class UITest extends JFrame {
    JComboBox jc = new JComboBox();
    JList jl1;
    JLabel jl11 = new JLabel("Please Select Hanberge:");
    JLabel jl12 = new JLabel("Please Select Dranks");

    UITest() {
        Vector<String> vt = new Vector<String>();
        vt.add("Checken Ham");
        vt.add("muil Ham");
        vt.add("Colo Ham");
        jl1 = new JList(vt);
        //jc.addItem("Colo");
        // jc.addItem("Origin");
        //jc.addItem("muil");
        //jc.addItem("cafe");
        this.setLayout(new FlowLayout());
        //this.add(jl11);
        JScrollPane sp = new JScrollPane(jl1);
        this.add(sp);
        //this.add(jl12);
        //this.add(jc);
        this.setSize(250, 300);
        this.setVisible(true);
    }

    public static void main(String arg[]) {
        new UITest();
    }
}
