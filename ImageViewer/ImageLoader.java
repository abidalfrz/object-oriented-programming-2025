package ImageViewer;

import javax.swing.*;
import java.io.File;

public class ImageLoader {

    public ImageIcon loadImage(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select an Image");
        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();
            return new ImageIcon(fileToOpen.getAbsolutePath());
        }
        return null;
    }


}
