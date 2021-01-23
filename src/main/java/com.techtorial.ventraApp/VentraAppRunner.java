package com.techtorial.ventraApp;

import java.util.Scanner;

public class VentraAppRunner {

    static VentraCardMachine machine = new VentraCardMachine("Chicago");
    static VentraCard newCard;
    public static void main(String[] args){
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            System.out.println("Choose the action:  ");
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
    }
    private static void makeAChoice(String choice) {
        Scanner scanner = new Scanner(System.in);
        int exit = -1;
        switch (choice) {
            case "0":
                System.out.println("Thank you for working with us");
                break;
            case "1":
                System.out.println("Please enter full name: ");
                String fullName = scanner.next();
                System.out.println("Please enter Phone Number: ");
                String phoneNumber = scanner.next();
                System.out.println("Please enter Email:");
                String email = scanner.next();
                newCard = new VentraCard(fullName, phoneNumber, email);
                newCard.setCardNumber(newCard.createCardNumber());
                machine.addCard(newCard);
                System.out.println("Please press 0 to exit, press 8 to see options.");
                break;
                /*
                1- Using scanner get the information of User (FullName, PhoneNumber, Email)
                2- Create new card According to this information(Call createCard method)
                3- Call addCard method from ventraCard Machine and add new card
                 */
            case "2":
                machine.holdersName(machine.allCards);
                break;
            case "3":
                machine.printCardNumbers(machine.allCards);
                break;
            case "4":
                System.out.println("Please enter old card number: ");
                long oldCardNum = scanner.nextLong();
                if (machine.hasAccount(oldCardNum)) {
                    System.out.println("Please enter full name: ");
                    String fullName2 = scanner.next();
                    System.out.println("Please enter Phone Number: ");
                    String phoneNumber2 = scanner.next();
                    System.out.println("Please enter Email:");
                    String email2 = scanner.next();
                    VentraCard updatedCard = new VentraCard(fullName2, phoneNumber2, email2);
                    machine.updateCard(oldCardNum, updatedCard);
                }
                break;
            case "5":
                System.out.println("Please enter old card number:");
                long oldCardNum2 = scanner.nextLong();
                if (machine.hasAccount(oldCardNum2)) {
                    machine.updateCardNum(oldCardNum2, newCard.createCardNumber());
                }
                break;
            case "6":
                System.out.println("Please enter old email address:");
                String oldEmail = scanner.next();
                System.out.println("Please enter new email address:");
                String newEmail = scanner.next();
                machine.updateEmailAddress(newCard.getCardNumber(), oldEmail, newEmail);
                break;
            case "7":
                System.out.println("Please enter your phone number which is registered in the system:");
                String checkingPhone=scanner.next();
                if( machine.hasPhoneNum(checkingPhone)){
                    machine.printCardInfo(newCard.getPhoneNumber());
                }
                break;
            case "8":
                printOptions();
                break;
        }
    }
    public static void welcome(){
        System.out.println("Welcome to the Ventra card");
    }
    public static void printOptions(){
        System.out.println("Hello. Please choose one of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the Ventra Card  with New Card");
        System.out.println("5 - To update the card number");
        System.out.println("6 - To update existing card email address");
        System.out.println("7 - To search the card with phone number and print all card information");
        System.out.println("8 - To print available options");
        System.out.println("0 - To exit");
    }
}
