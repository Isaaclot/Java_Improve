import com.sun.corba.se.spi.activation.ActivatorOperations;

import javax.swing.*;
import java.awt.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by royleong on 01/06/15.
 */
public class FileChooseFliter extends JFrame
        implements ActionListener {
    private JLabel j1;
    private JFileChooser jfc1;

    FileChooseFliter() {
        j1 = new JLabel();
        jfc1 = new JFileChooser();
        myFileFilter myf1 = new myFileFilter();
        jfc1.addChoosableFileFilter(myf1);
        JButton jb = new JButton("OPen a File");
        jb.addActionListener(this);
        this.getContentPane().add(j1, BorderLayout.CENTER);
        this.getContentPane().add(jb, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        FileChooseFliter jfc = new FileChooseFliter();
        jfc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jfc.setSize(300, 300);
        jfc.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int result = jfc1.showOpenDialog(this);
        if (result == jfc1.APPROVE_OPTION) {
            String s = jfc1.getSelectedFile().getAbsolutePath();  //Get the Path of the file you chose
            j1.setText(s);  //add a moment on a label about your path
        }
    }

}


