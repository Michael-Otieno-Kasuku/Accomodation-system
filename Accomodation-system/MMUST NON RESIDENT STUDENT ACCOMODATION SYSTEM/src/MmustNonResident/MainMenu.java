package MmustNonResident;

import MmustNonResident.FontOPerations.BackgroundColors;
import MmustNonResident.FontOPerations.FontColors;
import MmustNonResident.FontOPerations.FontEffects;
import MmustNonResident.Landlords.AccomodationLocation;
import MmustNonResident.Tenants.Apply;
import MmustNonResident.Tenants.Login;
import MmustNonResident.Tenants.Register;

import java.awt.*;
import java.util.Scanner;

public class MainMenu {
    public void MainMenuChoices(){
        System.out.print(FontColors.CYAN+"**************************************************************************************\n");
        System.out.print(FontColors.CYAN+"******************"+FontColors.RESET+FontColors.RED+ FontEffects.SET_BOLD_TEXT+"WELCOME TO MMUST NON RESIDENT STUDENT ACCOMODATION SYSTEM"+FontColors.CYAN+"***********\n"+FontColors.RESET+FontEffects.SET_PLAIN_TEXT);
        System.out.print(FontColors.CYAN+"***************************************************************************************\n\n"+FontColors.RESET);
        System.out.print(FontColors.GREEN+"=========================="+FontEffects.SET_BOLD_TEXT+FontColors.BLUE+"DEVELOPER: MICHAEL OTIENO KASUKU"+FontColors.GREEN+"=============================\n\n"+FontEffects.SET_PLAIN_TEXT+FontColors.RESET);
        System.out.print(FontColors.PURPLE+"-----------------------------------------------------------------------------------------\n"+FontColors.RESET);
        System.out.print(FontColors.PURPLE+"--------------------------------------"+FontColors.YELLOW+FontEffects.SET_BOLD_TEXT+ BackgroundColors.CYAN_BACKGROUND+"MAIN MENU"+BackgroundColors.RESET_BACKGROUND+FontColors.RESET+FontEffects.SET_PLAIN_TEXT+ FontColors.PURPLE+"------------------------------------------\n");
        System.out.print("-----------------------------------------------------------------------------------------\n\n"+FontColors.RESET);
        System.out.print(FontColors.BLUE+"1. REGISTER\n");
        System.out.print("2. LOG IN\n");
        System.out.print("3. EXIT\n\n"+FontColors.RESET);
    }
    public void choices(){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                //create a Registration object
                Register r = new Register();
                r.setFirst_name();
                r.setLast_name();
                r.setID_number();
                r.setPhone_number();
                r.setYearOfBirth();
                r.setPassword();
                r.getAge();
                r.finishCreatingAccount();
                MainMenuChoices();
                choices();
                break;
            case 2:
                //create a log in object
                Login l = new Login();
                l.verify();
                AccomodationLocation a = new AccomodationLocation();
                a.chooseLocation();//helps you to choose where you want to live in
                l.close();
                break;
            case 3:
                System.out.print(FontColors.RED+"Thank you for using our services"+FontColors.RESET);
                System.out.close();
                break;
            default:
                choices();
                break;
        }
    }
}
