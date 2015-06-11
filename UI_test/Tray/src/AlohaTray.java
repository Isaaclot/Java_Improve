import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/**
 * Created by royleong on 10/06/15.
 */
public class AlohaTray {
    public static void main(String[] args) {
        MenuItem greetItem = new MenuItem("Greet Me");

        greetItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Aloha!!");
                System.exit(0);
            }
        });
        PopupMenu popup = new PopupMenu();
        popup.add(greetItem);

        TrayIcon trayIcon = new TrayIcon(getIconImage(),
                "A friendly greeting", popup);
    }

    public static Image getIconImage() {
        Icon icon = UIManager.getIcon("OptionPane.informationIcon");
        BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        icon.paintIcon(null, image.getGraphics(), 0, 0);
        return image;
    }
}
