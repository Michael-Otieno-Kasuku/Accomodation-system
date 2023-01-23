package MmustNonResident.Locations;

import MmustNonResident.FontOPerations.BackgroundColors;
import MmustNonResident.FontOPerations.FontColors;
import MmustNonResident.FontOPerations.FontEffects;
import MmustNonResident.Landlords.AccomodationType;

import java.util.Scanner;

public class TeaZone implements Locations{
    @Override
public void AccomodationType() {
    System.out.print(BackgroundColors.YELLOW_BACKGROUND+ FontColors.BLUE+ FontEffects.SET_BOLD_TEXT+"ACCOMMODATION TYPES AVAILABLE IN TEA ZONE\n"+FontEffects.SET_PLAIN_TEXT+FontColors.RESET+ BackgroundColors.RESET_BACKGROUND);
    System.out.print(FontColors.CYAN+"1. PRIVATE HOSTEL - Ksh. 16000 per Semester\n");
    System.out.print("2. SINGLE ROOM - Ksh. 3500 per month\n");
    System.out.print("3. BED SITTER - Ksh. 4000 per month\n");
    System.out.print("4. ONE BEDROOM - Ksh. 5000 per month\n"+FontColors.RESET);
}

    @Override
    public void Landlords() {
        System.out.print(FontColors.PURPLE+FontEffects.SET_BOLD_TEXT+BackgroundColors.GREEN_BACKGROUND+"\n LANDLORDS IN TEA ZONE\n"+BackgroundColors.RESET_BACKGROUND+FontEffects.SET_PLAIN_TEXT+FontColors.RESET);
        System.out.print(FontColors.RED+"1. JOHN HARIZON  - 0712645678\n");
        System.out.print("2. LUKE GENERAL - 0723456389\n");
        System.out.print("3. MARK JOBS - 0734067890\n");
        System.out.print("4. SAMUEL SMART - 0756789023\n");
        System.out.print("5. GABRIEL JOSEPH - 0756889065\n");
        System.out.print("6. JAMES MURGOR - 075675907645\n"+FontColors.RESET);
    }

    @Override
    public void chooseLandlord() {
        Landlords();//displays the list of landlords available
        int choice;
        System.out.print("Choose the landlord you want to book from: ");
        int landlord;
        Scanner sc = new Scanner(System.in);
        landlord = sc.nextInt();
    }

    @Override
    public void chooseAccommodationType() {
        AccomodationType();//prints the list of accommodation types available
        int choice;
        System.out.print(FontColors.RED+"\nChoose the accomodation  you want: "+FontColors.RESET);
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        AccomodationType a = new AccomodationType();
        switch (choice){
            case 1:
                a.PrivateHostel();
                break;
            case 2:
                a.SingleRoom();
                break;
            case 3:
                a.BedSitter();
                break;
            case 4:
                a.OneBedroom();
                break;
            default:
                chooseAccommodationType();
                break;

        }

    }
}
