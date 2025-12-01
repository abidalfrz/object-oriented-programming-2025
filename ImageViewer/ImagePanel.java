package ImageViewer;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image image;
    private double zoomFactor = 1.0;

    public void setImage(Image image) {
        this.image = image;
        zoomFactor = 1.0; // reset zoom when new image is set
        repaint();
    }

    public void zoomIn() {
        zoomFactor += 0.1;
        repaint();
    }

    public void zoomOut() {
        zoomFactor = Math.max(0.1, zoomFactor - 0.1);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            int newWidth = (int) (image.getWidth(this) * zoomFactor);
            int newHeight = (int) (image.getHeight(this) * zoomFactor);
           
            int x = (getWidth() - newWidth) / 2;
            int y = (getHeight() - newHeight) / 2;

            g.drawImage(image, x, y, newWidth, newHeight, this);
        }
    }
}
