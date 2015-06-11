import javax.swing.*;
import java.awt.*;

/**
 * Created by royleong on 01/06/15.
 */
public class UI_Notebook extends JFrame {
    UI_Notebook() {
        Container context = this.getContentPane();
        JPanel p = new JPanel();
        context.add(p);
        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        JMenu file = new JMenu("File");
        JMenuItem fjm1 = new JMenuItem("New");
        JMenuItem fjm2 = new JMenuItem("Open");
        JMenuItem fjm3 = new JMenuItem("Save");
        JMenuItem fjm4 = new JMenuItem("Save as");
        file.add(fjm1);
        file.add(fjm2);
        file.add(fjm3);
        file.add(fjm4);
        file.addSeparator();    // Add sperator line...
        JMenuItem fjm5 = new JMenuItem("Font Setting");
        JMenuItem fjm6 = new JMenuItem("Print");
        JMenuItem fjm7 = new JMenuItem("Exit");
        file.add(fjm5);
        file.add(fjm6);
        file.addSeparator();
        file.add(fjm7);
        JMenu Edit = new JMenu("Edit");
        JMenuItem ejm1 = new JMenuItem("Concel");
        JMenuItem ejm2 = new JMenuItem("Cut");
        JMenuItem ejm3 = new JMenuItem("copy");
        JMenuItem ejm4 = new JMenuItem("Plaste");
        JMenuItem ejm5 = new JMenuItem("Delete");
        JMenuItem ejm6 = new JMenuItem("Fine");
        JMenuItem ejm7 = new JMenuItem("Replace");
        Edit.add(ejm1);
        Edit.add(ejm2);
        Edit.add(ejm3);
        Edit.add(ejm4);
        Edit.add(ejm5);
        Edit.addSeparator();
        Edit.add(ejm6);
        Edit.add(ejm7);
        menubar.add(file);
        menubar.add(Edit);
        this.setSize(300, 300);
        this.setVisible(true);

    }

    public static void main(String arg[]) {
        UI_Notebook notebook = new UI_Notebook();
        notebook.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
