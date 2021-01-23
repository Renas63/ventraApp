package com.techtorial.ventraApp;

import java.util.Random;



    public class VentraCard {
        private String fullName;
        private String phoneNumber;
        private String email;
        private long cardNumber;

        public VentraCard() {
        }

        public String getFullName() {
            return fullName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        public long getCardNumber() {
            return cardNumber;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setCardNumber(long cardNumber) {
            this.cardNumber = cardNumber;
        }

        public VentraCard(String fullName, String phoneNumber, String email, int cardNumber) {
            this.fullName = fullName;
            this.phoneNumber = phoneNumber;
            this.email = email;
            this.cardNumber = cardNumber;
        }

        /*
        1- Create instance variables for passenger fullName, phoneNumber, email, cardNumber
        2- Create getter and setter for instance variables
        3- Create the constructor to set the value to the instance variables
        4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
         */
        public VentraCard(String fullName, String phoneNumber, String email) {
            this.fullName = fullName;
            this.phoneNumber = phoneNumber;
            this.email = email;
//        this.cardNumber = createCardNumber();
        }

        public VentraCard createCard(String fullName, String phoneNumber, String email) {
            VentraCard ventraCard = new VentraCard(fullName, phoneNumber, email);
            return ventraCard;
        }

        /*
        this method needs to return VentraCard according to the parameter
         */
//    private Random random = new Random();
        public long createCardNumber() {
            Random randomNum = new Random();
            String str = "";
            for (int i = 1; i <= 16; i++) {
                str += randomNum.nextInt(10);
            }
            Long s = Long.parseLong(str);
        /*
        this method needs to return the 16 digit card number
         */
            return s;
        }
    }

