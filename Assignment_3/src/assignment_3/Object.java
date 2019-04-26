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
 * * <h1>Objects</h1>
 * This class has all the objects related to every room, each room will 
 * call her corresponding method  
 * @return search 
 * @return inventory
 * <p>
 * @exception IOException On input error.
 * @author daironrodriguez
 */
public class Object {

    Component frame = null;

    public int search(int search) { //ask to search for an object
        //default icon, custom title
        search = JOptionPane.showConfirmDialog(
                frame,
                "Would you like to Search for an Object?",
                "Search for an Object",
                JOptionPane.YES_NO_OPTION);
        System.out.println("search value: " + search);

        return search;
    }

    public String livingRoom(String backpack, String userName) {//living room objects
        String inventory = "";
        //object
        java.lang.Object[] option = {"Open the Chest"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a chest",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                option,
                option[0]);

        if (step == 0) {
            JOptionPane.showMessageDialog(frame,
                    "Ghost escapes and scares you to death",
                    userName + " die",
                    JOptionPane.ERROR_MESSAGE);
            inventory = backpack.concat(". ");
            System.out.println("die");
            System.out.println("Backpack: " + inventory);

        }

        return inventory;
    }

    public String bathroom(String backpack, String userName) {//bathroom objects 
        String inventory = "";
        java.lang.Object[] options = {"Wacht closely the mirror", "Get in the shower"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a mirror and a shower",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if (step == 0) {//mirror
            inventory = backpack.concat("mirror, ");
            System.out.println("Mirror in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "You see a bloody face looking back at you\n"
                    + "You put the mirror in your backpack",
                    userName + " left the house",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("mirror in the backpack");
        } else { //shower
            inventory = backpack.concat("shower, ");
            System.out.println("Shower in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "Room suddenly steams up and you feel fingers touching "
                    + "the back of your neck\n"
                    + "You put the shower in your backpack",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String diningRoom(String backpack, String userName) throws IOException {//dining room objects
        String inventory = "";
        java.lang.Object[] options2 = {"Take the Candelabra"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a Candelabra",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[0]);
        if (step == 0) {
            inventory = backpack.concat("candelabra, ");
            System.out.println("Candelabra in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "The Candelabra light up by themselves and see a death shadow\n"
                    + "You put the candelabra in your backpack ",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String kitchen(String backpack, String userName) throws IOException {//kitchen objecs
        String inventory = "";

        java.lang.Object[] options2 = {"Open the refrigerator", "Open the cabinet"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a refrigerator and a cabinet",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[1]);
        if (step == 0) { //refrigerator 
            inventory = backpack.concat("delicious soul food, ");
            System.out.println("delicious soul food in the backpack");

            JOptionPane.showMessageDialog(frame,
                    userName + " find some delicious soul food\n"
                    + "You put the delicious soul food in your "
                    + "backpack and ran away",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            //custom title, warning icon
            JOptionPane.showMessageDialog(frame,
                    " The dishes and glasses start flying at you as "
                    + "soon as you open the door.\n"
                    + " You get hit in the head and feel yourself "
                    + "start moving towards a light",
                    "Die",
                    JOptionPane.WARNING_MESSAGE);
            inventory = backpack.concat(". ");
            System.out.println("die");
        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String pantry(String backpack, String userName) throws IOException {//pantry objects 
        String inventory = "";
        java.lang.Object[] options2 = {"Open the dusty recipe box", "Grab the broom"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " There is a dusty recipe box and a broom",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[1]);

        if (step == 0) { //dusty recipe box
            inventory = backpack.concat("recipe for chocolate, ");
            System.out.println("Recipe for chocolate in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "A recipe for chocolate devils food cake appears our of no where \n"
                    + "You put the recipe in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        } else {// broom
            inventory = backpack.concat("broom, ");
            System.out.println("Broom in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "The broom flies up in the air as soon as you touch it\n"
                    + "You grab the broom and put it in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String bedroom1(String backpack, String userName) throws IOException {//bedroom 1 objects 
        String inventory = "";
        java.lang.Object[] options2 = {"Move the rocking chair", "Look thougth the window"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a rocking chair and a window",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[1]);

        if (step == 0) { //rocking chair
            inventory = backpack.concat("rocking chair, ");
            System.out.println("rocking chair in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "Chair starts rocking by itself with no one in it \n"
                    + "You put the chair in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        } else {// window 
            inventory = backpack.concat("window, ");
            System.out.println("Window in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "See a child outside on a swing who suddenly disappears\n"
                    + "You grab the window and put it in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String bedroom2(String backpack, String userName) throws IOException {//bedroom 2 objects 
        String inventory = "";
        java.lang.Object[] options2 = {"Take the doll house", "Open the dresser"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a doll house and a dresser",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[1]);

        if (step == 0) { //dolle house 
            inventory = backpack.concat("doll house, ");
            System.out.println("Doll house in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "The dolls start dancing on their own \n"
                    + "You put the doll house in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        } else {// broom
            inventory = backpack.concat("dresser, ");
            System.out.println("Dresser in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "A ghost flies out of the dresser as soon as you open "
                    + "it and goes right though your body\n"
                    + "You grab the dresser and put it in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String bathroom2(String backpack, String userName) throws IOException {//bathroom 2 objects 
        String inventory = "";
        java.lang.Object[] options2 = {"Wacht closely the mirror", "Get in the shower"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a mirror and a shower",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[1]);

        if (step == 0) {//mirror
            inventory = backpack.concat("mirror, ");
            System.out.println("Mirror in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "You see a bloody face looking back at you\n"
                    + "You put the mirror in your backpack ",
                    userName + " left the house",
                    JOptionPane.ERROR_MESSAGE);

        } else { //shower
            inventory = backpack.concat("shower, ");
            System.out.println("Shower in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "Room suddenly steams up and you feel fingers touching "
                    + "the back of your neck\n"
                    + "You put the shower in your backpack",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String masterBedroom(String backpack, String userName) throws IOException {//master bedroom objects 
        String inventory = "";
        java.lang.Object[] options2 = {"Open the jewelry box"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a jewelry box ",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[0]);

        if (step == 0) { //jewelry box
            inventory = backpack.concat("Cursed Hope Diamond, ");
            System.out.println("Cursed Hope Diamond in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "You find the cursed Hope Diamond and feel your doom \n"
                    + "You put the cursed Hope Diamond in your backpack",
                    "OK",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String masterBathroom(String backpack, String userName) throws IOException {//master bathroom objects
        String inventory = "";
        java.lang.Object[] options2 = {"Rub the lamp", "Get in the shower"};
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a intricate oil lamp and the shower",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[1]);

        if (step == 0) {//lamp
            inventory = backpack.concat("lamp, ");
            System.out.println("Lamp in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "A genie pops out who says he’ll grant you 3 wishes\n"
                    + "You put the lamp in your backpack",
                    userName + " left the house",
                    JOptionPane.ERROR_MESSAGE);

        } else { //shower
            inventory = backpack.concat("shower, ");
            System.out.println("Shower in the backpack");

            JOptionPane.showMessageDialog(frame,
                    "Suddenly hear singing in the shower, but no one is there\n"
                    + "You put theshower in your backpack",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);

        }
        System.out.println("Backpack: " + inventory);
        return inventory;

    }

    public String basement(String backpack, String userName) {//basement objects 
        String inventory = "";

        java.lang.Object[] option = {"Open the Chest"};//ches with the key
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a chest",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                option,
                option[0]);

        if (step == 0) {
            JOptionPane.showMessageDialog(frame,
                    "You found the key for the Rooftop",
                    " KEY",
                    JOptionPane.ERROR_MESSAGE);
            inventory = backpack.concat("key, ");
            System.out.println("KEY");
        }
        System.out.println("Backpack: " + inventory);
        return inventory;
    }

    public String roofTop(String backpack, String userName) { //roof top objects
        String inventory = "";

        java.lang.Object[] option = {"Open the Chest"};//ches with the key
        int step = JOptionPane.showOptionDialog(frame,
                userName + " there is a chest",
                "Hunted House",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                option,
                option[0]);

        if (step == 0) {
            JOptionPane.showMessageDialog(frame,
                    "You found the key for the of the front door\n"
                            + "run out of the house",
                    " KEY",
                    JOptionPane.ERROR_MESSAGE);
            inventory = backpack.concat("keyFront, ");
            System.out.println("KEY");
        }
        System.out.println("Backpack: " + inventory);
        return inventory;
    }
}
