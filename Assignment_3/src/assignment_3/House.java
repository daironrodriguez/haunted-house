/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_3;

import java.awt.Component;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * <h1>House</h1>
 * This is the class where are all the conditions, and all the rooms
 * the class is going to check in which location the user is to display 
 * the correct information  
 * <p>
 * @exception IOException On input error.
 * @author daironrodriguez
 */
public class House {

//Declarations 
    Component frame = null;
    goTo room = new goTo();
    Object myObject = new Object();
    String currentLocation = "Elevator";
    String backpack = "";
    int search = 1;

    public void huntedHouse(String userName) throws IOException { //hunted house 

        do {
            System.out.println("You are in: " + currentLocation);

            if ((currentLocation.equals("Front Door") || currentLocation.equals("1")) && backpack.contains("keyFront")) {//Front Door 
                DisplayImage houseImage = new DisplayImage(0); //display the image 
                JOptionPane.showMessageDialog(frame, "You reach the end of the game "
                        + userName + "\nThe items in your backpack are the followin: "
                        + backpack);
                currentLocation = "Exit";

            } else if (currentLocation.equals("Living Room") || currentLocation.equals("2A")) {//living Room 
                room.goToLivingRoom(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object

                if (search == 0) {
                    backpack = myObject.livingRoom(backpack, userName);
                    if (backpack.contains(".")) {
                        JOptionPane.showMessageDialog(frame, "You  could not reach the end of the game "
                                + userName + " the items in your backpack are the followin: "
                                + backpack);
                        currentLocation = "Exit";
                    }

                } else {
                    currentLocation = "Elevator";
                }

            } else if (currentLocation.equals("Bathroom") || currentLocation.equals("4B")) { //bathroom
                room.goToLivingRoomBathroom();//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.bathroom(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Dining Room") || currentLocation.equals("5A")) { //dining room 
                room.goToDinningRoom(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.diningRoom(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Kitchen") || currentLocation.equals("3A")) {//Kitchen 
                room.goToKitchen(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.kitchen(backpack, userName);
                    if (backpack.contains(".")) {
                        JOptionPane.showMessageDialog(frame, "You  could not reach the end of the game "
                                + userName + " the items in your backpack are the followin: "
                                + backpack);
                        currentLocation = "Exit";
                    }
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Pantry") || currentLocation.equals("4A")) {//pantry 
                room.goToPantry();//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.pantry(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Elevator")) { //elevator 
                room.goToElevator(userName);//display the image 
                currentLocation = (String) JOptionPane.showInputDialog(
                        frame,
                        "Where do you want to go\n"
                        + "Select a Floor number"
                        + "\n        7\n 6A 6B\n 5A 5B\n 4A 4B\n 3A 3B\n 2A 2B \n 0    1",
                        "Elevator",
                        JOptionPane.PLAIN_MESSAGE);

            } else if (currentLocation.equals("Bedroom 1") || currentLocation.equals("2B")) {//bedroom 1
                room.goToBedroom1(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.bedroom1(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Bedroom 2") || currentLocation.equals("3B")) {//bedroom 2
                room.goToBedroom2(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.bedroom2(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Bathroom 2") || currentLocation.equals("6A")) {//bathroom 2
                room.goToBathroom2();//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.bathroom2(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Master Bedroom") || currentLocation.equals("6B")) {//master bedroom 
                room.goToMasterBedroom(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.masterBedroom(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Master Bathroom") || currentLocation.equals("5B")) {//master bathroom
                room.goToMasterBathroom(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.masterBathroom(backpack, userName);
                } else {
                    currentLocation = "Elevator";
                }
            } else if (currentLocation.equals("Basement") || currentLocation.equals("0")) {//basement 
                room.goToBasement(userName);//display the image 
                search = myObject.search(search);//ask if you want to search for an object
                if (search == 0) {
                    backpack = myObject.basement(backpack, userName);
                    currentLocation = "Elevator";
                } else {
                    currentLocation = "Elevator";
                }
            } else if ((currentLocation.equals("roofTop") || currentLocation.equals("7")) && backpack.contains("key")) {//roof top 
                room.goToRooftop(userName);//display the image 
                backpack = myObject.roofTop(backpack, userName);
                currentLocation = "Elevator";

            } else if (currentLocation.equals("roofTop") || currentLocation.equals("7")) {
                JOptionPane.showMessageDialog(frame, "You dont have the key yet!");
                System.out.println("You dont have the key yet!");
                currentLocation = "Elevator";
            } else if (currentLocation.equals("Front Door") || currentLocation.equals("1")) {
                JOptionPane.showMessageDialog(frame, "You dont have the key yet!");
                System.out.println("You dont have the key yet!");
                currentLocation = "Elevator";
            } else {
                JOptionPane.showMessageDialog(frame, "Not a chice");
                System.out.println("not a choice");
                currentLocation = "Elevator";
            }

        } while (currentLocation.equals("Exit") != true);

    }
}
