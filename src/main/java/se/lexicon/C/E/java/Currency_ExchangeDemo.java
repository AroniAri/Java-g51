package se.lexicon.C.E.java;

import java.util.Random;
import java.util.Scanner;

import static java.awt.SystemColor.menu;


public class Currency_ExchangeDemo {

        public static void main(String[] args) {
            System.out.println("Currency Converter App:");
            System.out.println("1. Sek");
            System.out.println("2. Dollar");
            System.out.println("3. Euro");
            System.out.println("0. Exit");



            // take input
            Scanner sc = new Scanner(System.in);
            System. out.println("Choose the currency");
            int choice = sc.nextInt();
            System.out.println("Enter the amount");
            double amount = sc.nextDouble();



            // convert the amount
            switch (choice) {
                case 1:
                    Sek_to_other(amount);
                    break;
                case 2:
                    Dollar_to_other(amount);
                    break;
                case 3:
                    Euro_to_other(amount);
                    break;
                 default:
                case 0:

                    break;

            }

        }

        public static void Sek_to_other(double amt) {
            System.out.println("1 SEk = " + 0.095 + " Dollar");
            System.out.println();

            System.out.println(amt+" Sek = " + (amt*0.095) + " Dollar");
            System.out.println();

            System.out.println("1 Sek = " + 0.089 + " Euro");
            System.out.println();
            System.out.println(amt+" SEk = " + (amt*0.089) + " Euro");
            System.out.println();

        }


        public static void Dollar_to_other(double amt) {
            System.out.println("1 Dollar = " + 10.49 + " Sek");
            System.out.println();
            System.out.println(amt+" Dollar = " + (amt*10.49) + " SEk");
            System.out.println();

            System.out.println("1 Dollar= " + 0.93 + " Euro");
            System.out.println();

            System.out.println(amt+" Dollar = " + (amt*0.93) + " Euro");
        }



        public static void Euro_to_other(double amt){
            System.out.println("1 Euro = " + 11.28 + " Sek");
            System.out.println();
            System.out.println(amt+" Euro = " + (amt*11.28) + " SEk");
            System.out.println();

            System.out.println("1 Euro = " + 1.08 + " Dollar");
            System.out.println();

            System.out.println(amt+" Euro = " + (amt*1.08) + " Dollar");
        }
    }






