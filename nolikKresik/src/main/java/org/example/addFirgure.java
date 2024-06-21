package org.example;

import java.util.Scanner;

import static java.lang.Thread.sleep;
import static org.example.Data.*;

public class addFirgure {
    public static void main(String[] args) throws InterruptedException {
        field();
        while (win) {
            addX();
            checkoutWin();
            addO();
            checkoutWin();
        }
    }
   static boolean win = true;
    public static void field() {
        System.out.println("| " + a + " | " + b + " | " + c + " |");
        System.out.println("| " + d + " | " + e + " | " + f + " |");
        System.out.println("| " + g + " | " + h + " | " + j + " |");
    }
    public static void checkoutWin(){
     if (a1 && b1 && c1){
         System.out.println("Победа");
         win = false;
     }
        if (d1 && e1 && f1){
            System.out.println("Победа");
            win = false;
        }
        if (g1 && h1 && j1){
            System.out.println("Победа");
            win = false;
        }
        if (a1 && e1 && j1){
            System.out.println("Победа");
            win = false;
        }
        if (g1 && e1 && c1){
            System.out.println("Победа");
            win = false;
        }
        if (a1 && d1 && g1){
            System.out.println("Победа");
            win = false;
        }
        if (b1 && e1 && h1){
            System.out.println("Победа");
            win = false;
        }
        if (c1 && f1 && j1){
            System.out.println("Победа");
            win = false;
        }
    }

    public static void addO() throws InterruptedException {
        System.out.println("Выберете ноль");
        Scanner console = new Scanner(System.in);
        String choice = console.nextLine();
        if (choice.equals("a")) {
            a = O;
            a1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("b")) {
            b = O;
            b1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("c")) {
            c = O;
            c1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("d")) {
            d = O;
            d1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("e")) {
            e = O;
            e1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("f")) {
            f = O;
            f1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("g")) {
            g = O;
            g1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("h")) {
            h = O;
            h1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("j")) {
            j = O;
            j1= true;
            sleep(1000);
            field();
        }
    }

    public static void addX() throws InterruptedException {
        System.out.println("Выберете икс");
        Scanner console = new Scanner(System.in);
        String choice = console.nextLine();
        if (choice.equals("a")) {
            a = X;
            a1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("b")) {
            b = X;
            b1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("c")) {
            c = X;
            c1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("d")) {
            d = X;
            d1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("e")) {
            e = X;
            e1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("f")) {
            f = X;
            f1 =true;
            sleep(1000);
            field();
        }
        if (choice.equals("g")) {
            g = X;
            g1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("h")) {
            h = X;
            h1 = true;
            sleep(1000);
            field();
        }
        if (choice.equals("j")) {
            j = X;
            j1 = true;
            sleep(1000);
            field();
        }
    }
}


