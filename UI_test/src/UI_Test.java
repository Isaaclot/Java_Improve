import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 * Created by Leong on 2015/5/31.
 */
public class UI_Test extends JFrame {


    public static void main(String arg[]) {
        System.out.println("Please Input £º");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Vector vt=new Vector();
        try{
            for(int i=0;i<5;i++) {
                System.out.print("Please Input:");
                String s= br.readLine();
                vt.addElement(s);
            }
        }catch (IOException e){}
        JComboBox cb=new JComboBox(vt);
        cb.setSize(20,5);
        JFrame jf=new JFrame();
        jf.add(cb);
        jf.setVisible(true);
    }
}

