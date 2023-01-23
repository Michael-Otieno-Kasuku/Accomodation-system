package MmustNonResident.Landlords;

import MmustNonResident.FontOPerations.BackgroundColors;
import MmustNonResident.FontOPerations.FontColors;
import MmustNonResident.FontOPerations.FontEffects;
import MmustNonResident.Locations.*;

import java.util.Scanner;

public class AccomodationLocation {
    public void locations(){
        System.out.print(BackgroundColors.CYAN_BACKGROUND+FontEffects.SET_BOLD_TEXT+ FontColors.GREEN +"\nPLACES AVAILABLE IN KAKAMEGA\n\n"+FontEffects.SET_PLAIN_TEXT+FontColors.RESET+ BackgroundColors.RESET_BACKGROUND);
        System.out.print(FontColors.PURPLE+"1. LURAMBI\n");
        System.out.print("2. STAGE MANDAZI\n");
        System.out.print("3. KEFINCO\n");
        System.out.print("4. SICHIRAI\n");
        System.out.print("5. MUHYALA\n");
        System.out.print("6. JOYLAND\n");
        System.out.print("7. JUA KALI\n");
        System.out.print("8. KAKAMEGA CBD\n");
        System.out.print("9. TEA ZONE\n");
        System.out.print("10. MILIMANI\n"+FontColors.RESET);
    }
    public void chooseLocation(){
        locations();
        int location;
        Scanner sc = new Scanner(System.in);
        System.out.print(FontColors.BLUE+"\nWhere do you want to stay? "+FontColors.RESET);
        location = sc.nextInt();

        switch (location){
            case 1:
                Lurambi l = new Lurambi();
                l.chooseLandlord();
                l.chooseAccommodationType();
                break;
            case 2:
                StageMandazi sm = new StageMandazi();
                sm.chooseLandlord();
                sm.chooseAccommodationType();
                break;
            case 3:
                Kefinco k = new Kefinco();
                k.chooseLandlord();
                k.chooseAccommodationType();
                break;
            case 4:
                Sichirai s = new Sichirai();
                s.chooseLandlord();
                s.AccomodationType();
                break;
            case 5:
                Muhyala m = new Muhyala();
                m.chooseLandlord();
                m.chooseAccommodationType();
                break;
            case 6:
                Joyland j = new Joyland();
                j.chooseLandlord();
                j.chooseAccommodationType();
                break;
            case 7:
                JuaKali jk = new JuaKali();
                jk.chooseLandlord();
                jk.chooseAccommodationType();
                break;
            case 8:
                KakamegaCBD kb = new KakamegaCBD();
                kb.chooseLandlord();
                kb.chooseAccommodationType();
                break;
            case 9:
                TeaZone t = new TeaZone();
                t.chooseLandlord();
                t.chooseAccommodationType();
                break;
            case 10:
                Milimani ml = new Milimani();
                ml.chooseLandlord();
                ml.chooseAccommodationType();
                break;
            default:
                chooseLocation();
                break;
        }
    }
}
