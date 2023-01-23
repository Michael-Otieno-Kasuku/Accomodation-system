package MmustNonResident.Landlords;

import MmustNonResident.FontOPerations.FontColors;
import MmustNonResident.FontOPerations.FontEffects;
import MmustNonResident.MainMenu;
import MmustNonResident.Tenants.RecieptGenerator;

import java.util.Scanner;

public class AccomodationType {
    public void PrivateHostel(){
        int amount_paid;
        int rent = 16000;
        int balance_due = 0;
        System.out.print(FontColors.BLUE+"\nEnter the amount you want to pay: "+FontColors.RESET);
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>=rent){
            amount_paid = amount;
            balance_due = amount_paid - rent;
            System.out.print("\n"+FontColors.BLUE+ FontEffects.SET_BOLD_TEXT +RecieptGenerator.generate()+FontEffects.SET_PLAIN_TEXT+FontColors.RESET +"\tConfirmed that you have booked a Private hostel\n");
            System.out.print("\n You have paid "+amount_paid+"\nBalance carried forward is "+balance_due+"\n");
            MainMenu m = new MainMenu();
            m.MainMenuChoices();
            m.choices();
        }else{
            PrivateHostel();
        }
    }

    public  void SingleRoom(){
        int amount_paid;
        int rent = 4000;
        int balance_due = 0;
        System.out.print(FontColors.BLUE+"Enter the amount you want to pay: "+FontColors.RESET);
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>=rent){
            amount_paid = amount;
            balance_due = amount_paid - rent;
            System.out.print("\n"+FontColors.BLUE+ FontEffects.SET_BOLD_TEXT +RecieptGenerator.generate() +FontEffects.SET_PLAIN_TEXT+FontColors.RESET+"\tConfirmed that you have booked a Single room\n");
            System.out.print("\n You have paid "+amount_paid+"Balance carried forward is "+balance_due);
            MainMenu m = new MainMenu();
            m.MainMenuChoices();
            m.choices();
        }else{
            SingleRoom();
        }

    }

    public void BedSitter(){
        int amount_paid;
        int rent = 5000;
        int balance_due = 0;
        System.out.print(FontColors.BLUE+"Enter the amount you want to pay: "+FontColors.RESET);
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>=rent){
            amount_paid = amount;
            balance_due = amount_paid - rent;
            System.out.print("\n"+FontColors.BLUE+ FontEffects.SET_BOLD_TEXT +RecieptGenerator.generate()+FontEffects.SET_PLAIN_TEXT+FontColors.RESET +"\tConfirmed that you have booked a Private hostel\n");
            System.out.print("\n You have paid "+amount_paid+"Balance carried forward is "+balance_due);
            MainMenu m = new MainMenu();
            m.MainMenuChoices();
            m.choices();
        }else{
            BedSitter();
        }

    }

    public void OneBedroom(){
        int amount_paid;
        int rent = 5000;
        int balance_due = 0;
        System.out.print(FontColors.BLUE+"Enter the amount you want to pay: "+FontColors.RESET);
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>=rent){
            amount_paid = amount;
            balance_due = amount_paid - rent;
            System.out.print("\n"+FontColors.BLUE+ FontEffects.SET_BOLD_TEXT +RecieptGenerator.generate()+ FontEffects.SET_PLAIN_TEXT+FontColors.RESET+"\tConfirmed that you have booked a Private hostel\n");
            System.out.print("\n You have paid "+amount_paid+"Balance carried forward is "+balance_due);
            MainMenu m = new MainMenu();
            m.MainMenuChoices();
            m.choices();
        }else{
            OneBedroom();
        }

    }
}
