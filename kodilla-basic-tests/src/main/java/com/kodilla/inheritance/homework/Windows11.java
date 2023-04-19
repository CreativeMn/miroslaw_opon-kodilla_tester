package com.kodilla.inheritance.homework;

    public class Windows11 extends Windows7 {

        public Windows11(int year) {
            super(year);
        }

        public void theNewestOn() {
            System.out.println("Najnowszy system włączony");
        }

        public void theNewestOff() {
            System.out.println("Najnowszy system wyłączony");
        }

    }



