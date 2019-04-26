/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and/*
 * open the template in the editor.
 */
package assignment_3;

import java.awt.Component;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 ** * <h1>Display the image</h1>
 * This class has the corresponding image for each room  
 * <p>
 * @exception IOException On input error.
 * @author daironrodriguez
 */
public class goTo {

    int image;

    Component frame;

    public void goToLivingRoom(String userName) throws IOException {
        image = 1;
        DisplayImage houseImage1 = new DisplayImage(image);//display living room 

    }

    public void goToLivingRoomBathroom() throws IOException {
        image = 4;
        DisplayImage houseImage4 = new DisplayImage(image);// display bathroom 
    }

    public void goToDinningRoom(String userName) throws IOException {
        image = 2;
        DisplayImage houseImage2 = new DisplayImage(image);//display dining room 

    }

    public void goToKitchen(String userName) throws IOException {
        image = 5;
        DisplayImage houseImage5 = new DisplayImage(image);//diplay kitchen 

    }

    public void goToPantry() throws IOException {
        image = 6;
        DisplayImage houseImage10 = new DisplayImage(image);//display pantry
    }

    public void goToElevator(String userName) throws IOException {
        image = 3;
        DisplayImage houseImage3 = new DisplayImage(image);//display up stairs 

    }

    public void goToBedroom1(String userName) throws IOException {
        image = 7;
        DisplayImage houseImage7 = new DisplayImage(image);//display bedroom 1

    }

    public void goToBedroom2(String userName) throws IOException {
        image = 8;
        DisplayImage houseImage8 = new DisplayImage(image);//display bedroom 2

    }

    public void goToBathroom2() throws IOException {
        image = 11;
        DisplayImage houseImage11 = new DisplayImage(image);//display bathroom2
    }

    public void goToMasterBedroom(String userName) throws IOException {
        image = 9;
        DisplayImage houseImage9 = new DisplayImage(image);//display Master Bedroom

    }

    public void goToMasterBathroom(String userName) throws IOException {
        image = 10;
        DisplayImage houseImage10 = new DisplayImage(image);//display Master bathroom
    }

    public void goToBasement(String userName) throws IOException {
        image = 13;
        DisplayImage houseImage13 = new DisplayImage(image);//display Basement
    }
    public void goToRooftop(String userName) throws IOException {
        image = 12;
        DisplayImage houseImage12 = new DisplayImage(image);//display Rooftop
    }
   

}
