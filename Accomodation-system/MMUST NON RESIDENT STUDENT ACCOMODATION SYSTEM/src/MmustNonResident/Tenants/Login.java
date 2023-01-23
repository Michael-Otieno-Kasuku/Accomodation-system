package MmustNonResident.Tenants;

import MmustNonResident.FontOPerations.BackgroundColors;
import MmustNonResident.FontOPerations.FontColors;
import MmustNonResident.FontOPerations.FontEffects;

import java.util.Scanner;

public class Login extends Register{
    public void verify(){
        String Fname;
        long Password;
        Scanner sc = new Scanner(System.in);
        System.out.print(FontColors.PURPLE +"Enter your password: ");
        Password = sc.nextInt();
        System.out.print("\nEnter your First name: "+FontColors.RESET);
        Fname = sc.next();
        System.out.print(FontColors.PURPLE+ FontEffects.SET_BOLD_TEXT+ BackgroundColors.BLUE_BACKGROUND+"\n\nWelcome "+Fname+"\t"+Last_name+FontEffects.SET_PLAIN_TEXT+FontColors.RESET+BackgroundColors.RESET_BACKGROUND);
        /*if(Fname.equals(First_name)&&password==Password){
            System.out.print("\nWelcome "+Fname);
        }else {
            verify();
        } Shall be updated later*/
    }

    public void close(){
        System.out.print(FontColors.YELLOW+"\nThank you for being part of us."+FontColors.RESET);
        System.out.close();
    }
}
