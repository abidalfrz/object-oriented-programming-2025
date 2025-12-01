package ImageViewer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewerFrame {
    private JFrame frame;
    private ImagePanel imagePanel;
    private JButton loadButton, zoomInButton, zoomOutButton;
    private ImageLoader imageLoader;

    public ViewerFrame() {
        imageLoader = new ImageLoader();
        frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        imagePanel = new ImagePanel();
        frame.add(imagePanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        loadButton = new JButton("Load Image");
        zoomInButton = new JButton("Zoom In");
        zoomOutButton = new JButton("Zoom Out");

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon imageIcon = imageLoader.loadImage();
                if (imageIcon != null) {
                    imagePanel.setImage(imageIcon.getImage());
                }
            }
        });

        zoomInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagePanel.zoomIn();
            }
        });

        zoomOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagePanel.zoomOut();
            }
        });

        buttonPanel.add(loadButton);
        buttonPanel.add(zoomInButton);
        buttonPanel.add(zoomOutButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ViewerFrame();
    }

}
