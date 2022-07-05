package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class Controller {
    Characters abigail = new StardewValleyCharacters("abigail", 1, 1, 2);
    Characters elliot = new StardewValleyCharacters("elliot", 2, 3, 3);
    Characters sebastian = new StardewValleyCharacters("sebastian", 2, 2, 4);
    Characters maru = new StardewValleyCharacters("maru", 1, 4, 1);

    // UserCharacter[] user = new UserCharacter[1];
    @FXML
    private ChoiceBox genderPrompt;
    @FXML
    private ChoiceBox seasonPrompt;
    @FXML
    private ChoiceBox hobbyPrompt;
    @FXML
    private Label finalLabel;
    @FXML
    private TextField namePrompt;
    @FXML
    public void initialize(){
        genderPrompt.getItems().add("female"); // 1
        genderPrompt.getItems().add("male"); // 2

        seasonPrompt.getItems().add("Spring"); // 1
        seasonPrompt.getItems().add("Winter"); // 2
        seasonPrompt.getItems().add("Fall"); // 3
        seasonPrompt.getItems().add("Summer"); // 4

        hobbyPrompt.getItems().add("Farming"); // 1
        hobbyPrompt.getItems().add("Mining"); // 2
        hobbyPrompt.getItems().add("Fishing"); // 3
        hobbyPrompt.getItems().add("Sleeping"); // 4
    }

    public void nameAction()
    {

    }

    public void genderAction()
    {

    }

    public void seasonAction()
    {

    }

    public void hobbyAction()
    {

    }

    public void calculateAction()
    {
        try
        {
            String name = (String)namePrompt.getText();
            // System.out.println(name.toLowerCase().charAt(0));
            for (int i = 0; i < name.length(); i++)
            {
                int nameChar = name.toLowerCase().charAt(i);
                // System.out.println((int)name.toLowerCase().charAt(i));
                // between 97-122
                if (nameChar < 97 || nameChar > 122)
                {
                    throw new InvalidEntryExceptions();
                }
            }
            //String name = (String)namePrompt.getText();
            // translate int values
            String gender = (String)genderPrompt.getValue();
            int genderInt = 0;
            if (gender.equals("female")) {
                genderInt = 1;
            }
            else {
                genderInt = 2;
            }

            String season = (String)seasonPrompt.getValue();
            int seasonInt = 0;
            if (season.equals("Spring")) {
                seasonInt = 1;
            }
            else if (season.equals("Winter")) {
                seasonInt = 2;
            }
            else if (season.equals("Fall")) {
                seasonInt = 3;
            }
            else {
                seasonInt = 4;
            }

            String hobby = (String)hobbyPrompt.getValue();
            int hobbyInt = 0;
            if (hobby.equals("Farming")) {
                hobbyInt = 1;
            }
            else if (hobby.equals("Mining")) {
                hobbyInt = 2;
            }
            else if (hobby.equals("Fishing")) {
                hobbyInt = 3;
            }
            else {
                hobbyInt = 4;
            }

            UserCharacter user = new UserCharacter(namePrompt.getText(), genderInt, seasonInt, hobbyInt);

            int sebaComp = 0;
            int abbyComp = 0;
            int elliotComp = 0;
            int maruComp = 0;
            // hard code logic for compatability level


            if(abigail.getHobby() == user.getHobby() && abigail.getSeason() == user.getSeason() && abigail.getGender() == user.getGender())
                abbyComp=100;
            else if(abigail.getHobby() == user.getHobby() && abigail.getSeason() == user.getSeason() && abigail.getGender() != user.getGender())
                abbyComp=77;
            else if(abigail.getHobby() == user.getHobby() && abigail.getSeason() != user.getSeason() && abigail.getGender() == user.getGender())
                abbyComp=62;
            else if(abigail.getHobby() != user.getHobby() && abigail.getSeason() == user.getSeason() && abigail.getGender() == user.getGender())
                abbyComp=51;
            else if(abigail.getHobby() == user.getHobby() && abigail.getSeason() != user.getSeason() && abigail.getGender() != user.getGender())
                abbyComp=39;
            else if(abigail.getHobby() != user.getHobby() && abigail.getSeason() == user.getSeason() && abigail.getGender() != user.getGender())
                abbyComp=22;
            else if(abigail.getHobby() != user.getHobby() && abigail.getSeason() != user.getSeason() && abigail.getGender() == user.getGender())
                abbyComp=7;
            else
                abbyComp=0;


            if(elliot.getHobby() == user.getHobby() && elliot.getSeason() == user.getSeason() && elliot.getGender() == user.getGender())
                elliotComp=100;
            else if(elliot.getHobby() == user.getHobby() && elliot.getSeason() == user.getSeason() && elliot.getGender() != user.getGender())
                elliotComp=75;
            else if(elliot.getHobby() == user.getHobby() && elliot.getSeason() != user.getSeason() && elliot.getGender() == user.getGender())
                elliotComp=65;
            else if(elliot.getHobby() != user.getHobby() && elliot.getSeason() == user.getSeason() && elliot.getGender() == user.getGender())
                elliotComp=50;
            else if(elliot.getHobby() == user.getHobby() && elliot.getSeason() != user.getSeason() && elliot.getGender() != user.getGender())
                elliotComp=35;
            else if(elliot.getHobby() != user.getHobby() && elliot.getSeason() == user.getSeason() && elliot.getGender() != user.getGender())
                elliotComp=20;
            else if(elliot.getHobby() != user.getHobby() && elliot.getSeason() != user.getSeason() && elliot.getGender() == user.getGender())
                elliotComp=10;
            else
                elliotComp=0;


            if(sebastian.getHobby() == user.getHobby() && sebastian.getSeason() == user.getSeason() && sebastian.getGender() == user.getGender())
                sebaComp=100;
            else if(sebastian.getHobby() == user.getHobby() && sebastian.getSeason() == user.getSeason() && sebastian.getGender() != user.getGender())
                sebaComp=72;
            else if(sebastian.getHobby() == user.getHobby() && sebastian.getSeason() != user.getSeason() && sebastian.getGender() == user.getGender())
                sebaComp=66;
            else if(sebastian.getHobby() != user.getHobby() && sebastian.getSeason() == user.getSeason() && sebastian.getGender() == user.getGender())
                sebaComp=59;
            else if(sebastian.getHobby() == user.getHobby() && sebastian.getSeason() != user.getSeason() && sebastian.getGender() != user.getGender())
                sebaComp=34;
            else if(sebastian.getHobby() != user.getHobby() && sebastian.getSeason() == user.getSeason() && sebastian.getGender() != user.getGender())
                sebaComp=21;
            else if(sebastian.getHobby() != user.getHobby() && sebastian.getSeason() != user.getSeason() && sebastian.getGender() == user.getGender())
                sebaComp=11;
            else
                sebaComp=0;

            if(maru.getHobby() == user.getHobby() && maru.getSeason() == user.getSeason() && maru.getGender() == user.getGender())
                maruComp=100;
            else if(maru.getHobby() == user.getHobby() && maru.getSeason() == user.getSeason() && maru.getGender() != user.getGender())
                maruComp=79;
            else if(maru.getHobby() == user.getHobby() && maru.getSeason() != user.getSeason() && maru.getGender() == user.getGender())
                maruComp=64;
            else if(maru.getHobby() != user.getHobby() && maru.getSeason() == user.getSeason() && maru.getGender() == user.getGender())
                maruComp=57;
            else if(maru.getHobby() == user.getHobby() && maru.getSeason() != user.getSeason() && maru.getGender() != user.getGender())
                maruComp=38;
            else if(maru.getHobby() != user.getHobby() && maru.getSeason() == user.getSeason() && maru.getGender() != user.getGender())
                maruComp=26;
            else if(maru.getHobby() != user.getHobby() && maru.getSeason() != user.getSeason() && maru.getGender() == user.getGender())
                maruComp=9;
            else
                maruComp=0;

            // Print compatibility level
            int mostCompat=0;
            String mostComp = "";
            if (abbyComp > elliotComp && abbyComp > sebaComp && abbyComp > maruComp)
            {
                mostCompat = abbyComp;
                mostComp = user.getName() + ",You are most compatible with Abigail at " + abbyComp + "%";
            }
            else if (elliotComp > abbyComp && elliotComp > sebaComp && elliotComp > maruComp)
            {
                mostCompat = elliotComp; // number used for the next most recent compat
                mostComp = user.getName() + ",You are most compatible with Elliot at " + elliotComp + "%";
            }
            else if (sebaComp > abbyComp && sebaComp > elliotComp && sebaComp > maruComp)
            {
                mostCompat = sebaComp; // number used for the next most recent compat
                mostComp = user.getName() + ",You are most compatible with Sebastian at " + sebaComp + "%";
            }
            else
            {
                mostComp = user.getName() + ",You are most compatible with Maru at " + maruComp + "%";
            }

            // print to the game
            finalLabel.setText(mostComp);

        }
        catch (InvalidEntryExceptions e)
        {
            System.out.println(e);
            finalLabel.setText(e.getMessage()); // prints error message
        }


    }
}