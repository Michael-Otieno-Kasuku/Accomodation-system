package MmustNonResident.Tenants;

import MmustNonResident.FontOPerations.FontColors;
import MmustNonResident.FontOPerations.FontEffects;

import java.util.Date;
import java.util.Scanner;

public class Register {
    public String First_name;
    public String Last_name;
    private int yearOfBirth;
    private long ID_number;
    public long password;
    private long Phone_number;

    //creating a default constructor
    public Register(){
        First_name = "";
        Last_name = "";
        yearOfBirth = 0000;
        ID_number = 00000000;
        password = 888888;
        Phone_number = 1234567890;
    }

    public void setFirst_name() {
        System.out.print(FontColors.PURPLE +"\nEnter your first name: ");
        Scanner sc = new Scanner(System.in);
        First_name = sc.nextLine();
    }

    public void setLast_name(){
        System.out.print("\nEnter your last name: ");
        Scanner sc = new Scanner(System.in);
        Last_name = sc.nextLine();
    }

    public void setYearOfBirth(){
        System.out.print("\nEnter your year of birth: ");
        Scanner sc = new Scanner(System.in);
        int YoB = sc.nextInt();
        if(YoB>=1900&&YoB<=2100){
            yearOfBirth = YoB;
        }else{
            System.out.print("Enter a year between 1900 and 2100\n");
            setYearOfBirth();
        }
    }

    public void setID_number(){
        System.out.print("\nEnter your ID number: ");
        Scanner sc = new Scanner(System.in);
        ID_number = sc.nextInt();
    }

    public void setPassword(){
        System.out.print("\nEnter your password: ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.print("\nReenter your password: "+FontColors.RESET);
        int p1 = sc.nextInt();
        if(p==p1){
            password = p;
        }else{
            setPassword();
        }
    }

    public void setPhone_number(){
        System.out.print("\nEnter your phone number: ");
        Scanner sc = new Scanner(System.in);
        Phone_number = sc.nextInt();
    }

    public String getFirst_name(){
        return First_name;
    }

    public String getLast_name(){
        return  Last_name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public long getID_number() {
        return ID_number;
    }

    public long getPassword() {
        return password;
    }

    public long getPhone_number() {
        return Phone_number;
    }

    public void getAge(){
        Date d = new Date();
        int year = d.getYear();
        int currentYear = year + 1900;
        int age = currentYear - yearOfBirth;
        if(age<18&&age>34){
            System.out.print(FontColors.RED+"Sorry! Your age is not within the required range\n");
            System.out.print("Thank you for using Maendeleo Youth Group System.\n"+FontColors.RESET);
            System.out.close();
        }
    }

    public void finishCreatingAccount(){
        System.out.print(FontColors.WHITE+ FontEffects.SET_BOLD_TEXT+"\n***********************************************************\n");
        System.out.print("+++++++Congratulations! Account created successfully+++++++\n");
        System.out.print("***********************************************************\n\n"+FontColors.RESET+FontEffects.SET_PLAIN_TEXT);
    }
}
