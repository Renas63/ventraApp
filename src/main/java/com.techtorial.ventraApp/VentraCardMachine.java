package com.techtorial.ventraApp;

import java.util.ArrayList;

public class VentraCardMachine {

    String location;
    ArrayList<VentraCard> allCards;
    public VentraCardMachine(String location) {
        this.location = location;
        this.allCards = new ArrayList<VentraCard>();
    }
    public boolean addCard(VentraCard card) {
        boolean isExit = false;
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber() == card.getCardNumber()) {
                isExit = true;
            }
        }
        if (isExit == false) {
            allCards.add(card);
            return true;
        }
        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */
        return false;
    }
    public void printCardNumbers(ArrayList<VentraCard> cards) {
        for (int k = 0; k < cards.size(); k++) {
            System.out.println(cards.get(k).getCardNumber());
        }
//        for (VentraCard card:cards) {
//            System.out.println( card.createCardNumber());
      //  }
        /*

         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
    }
    public void updateCard(long oldCardNumber, VentraCard newCard) {
        boolean hasAccount=false;
        for (int i = 0; i < allCards.size(); i++) {
            if (oldCardNumber == allCards.get(i).getCardNumber()) {
                hasAccount=true;
                allCards.get(i).setFullName(newCard.getFullName());
                allCards.get(i).setPhoneNumber(newCard.getPhoneNumber());
                allCards.get(i).setEmail(newCard.getEmail());
            }
        }
        if(hasAccount){
            System.out.println("Your account is updated!");
        }else{
            System.out.println("The provided card number is not matching with any numbers in our system!");
        }
        /*
        This method is taking two parameter oldCardNumber and it will replace this card with newCard.
        */
    }
    public  boolean hasAccount(long cardNumber){
        boolean hasAccount=false;
        for (int i = 0; i < allCards.size(); i++) {
            if (cardNumber == allCards.get(i).getCardNumber()) {
                hasAccount=true;
            }
        }
        if(hasAccount){
            return true;
        }else{
            System.out.println("Sorry! Your card number is not in the system!");
            return false;
        }
    }
    public  boolean hasPhoneNum(String phoneNumber) {
        boolean hasPhoneNum = false;
        for (int i = 0; i < allCards.size(); i++) {
            if (phoneNumber.equals(allCards.get(i).getPhoneNumber())) {
                hasPhoneNum = true;
            }
        }
        if (hasPhoneNum){
            return true;
        } else {
            System.out.println("Sorry! Your phone number is not registered in the system!");
            return false;
        }
    }
    public  boolean hasEmailAccount(String emailAddress ){
        boolean hasEmailAddress=false;
        for (int i = 0; i < allCards.size(); i++) {
            if ( emailAddress== allCards.get(i).getEmail()) {
                hasEmailAddress=true;
            }
        }
        if(hasEmailAddress){
            return true;
        }else{
            System.out.println("Sorry! Your email address is not in the system!");
            return false;
        }
    }
    public void holdersName(ArrayList<VentraCard> allCards) {
        for (int i = 0; i < allCards.size(); i++) {
            System.out.println(allCards.get(i).getFullName());
            System.out.println(allCards.get(i).getEmail());
            System.out.println(allCards.get(i).getCardNumber());
        }
    }
    public void updateEmailAddress(Long cardNumber, String oldEmail, String newEmail) {
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getEmail().equals(oldEmail) && allCards.get(i).getCardNumber() == cardNumber) {
                allCards.get(i).setEmail(newEmail);
                System.out.println("Your email address successfully updated.");
            }else{
                System.out.println("Please enter again old email address correctly.");
            }
            System.out.println(allCards.get(i));
        }
    }
    public void removedCard(long cardNumber){
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber()==cardNumber){
                allCards.remove(allCards.get(i));
                break;
            }
        }
    }
    public void printCardInfo(String phoneNumber){
        for (int i = 0; i < allCards.size() ; i++) {
            if (allCards.get(i).getPhoneNumber()==phoneNumber){
                System.out.println("-->"+allCards.get(i).getFullName());
                System.out.println("-->"+allCards.get(i).getCardNumber());
                System.out.println("-->"+allCards.get(i).getEmail());
            }
        }
    }
    public void updateCardNum(long oldCardNum, long newCardNum){
        for (int i = 0; i < allCards.size(); i++) {
            if (allCards.get(i).getCardNumber()==oldCardNum){
                allCards.get(i).setCardNumber(newCardNum);
                break;
            }
            System.out.println(allCards.get(i));

        }
    }
    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber, oldEmail and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the car removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */
}

