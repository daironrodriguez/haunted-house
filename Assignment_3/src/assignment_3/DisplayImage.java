/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * <h1>Image format </h1>
 * This class has image values and all the format for the output
 * 
 * <p>
 * ge@exception IOException On input error.
 * @author daironrodriguez
 */
public class DisplayImage {

    String[] files = new String[15];

    public DisplayImage(int image) throws IOException {
        //images 
        files[0] = "floors/frontDoor.png";
        files[1] = "floors/livingRoom.png";
        files[2] = "floors/diningRoom.png";
        files[3] = "floors/Elevator2.png";
        files[4] = "floors/bathroom.png";
        files[5] = "floors/kitchen.png";
        files[6] = "floors/pantry.png";
        files[7] = "floors/bedroom1.png";
        files[8] = "floors/bedroom2.png";
        files[9] = "floors/masterBedroom.png";
        files[10] = "floors/masterBathroom.png";
        files[11] = "floors/bathroom2.png";
        files[12] = "floors/rooftop.png";
        files[13] = "floors/basement.png";
        
        //extras 
        
        BufferedImage img = ImageIO.read(new File(files[image]));
        ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(800, 650);
        JLabel lbl = new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
