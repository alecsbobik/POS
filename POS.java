import BasicCal.*;
import java.util.Scanner;

abstract class menu{
    public Scanner quantity = new Scanner(System.in);
    public int price;
    public String product;
    abstract void glue();
    abstract void tape();
    abstract void pencil();
    abstract void eraser();
    abstract void folder();
    abstract void paper();
    abstract void marker();
    abstract void ballpen();
    abstract void envelope();
    abstract void scissor();
}

class menuname extends menu{
    public void glue() {
        product = "Glue";
        System.out.print("Enter Quantity:");
        price = 7;
    }
        
    public void tape() {
        product = "Tape";
        System.out.print("Enter Quantity:");
        price = 5;
    }
    
    public void pencil() {
        product = "Pencil";
        price = 6;
        System.out.print("Enter Quantity:");
    }
    
    public void eraser() {
        product = "Eraser";
        price = 5;
        System.out.print("Enter Quantity:");
    }
    
    public void folder() {
        product = "Folder";
        price = 8;
        System.out.print("Enter Quantity:");
    }
    
    public void paper() {
        product = "Paper";
        price = 25;
        System.out.print("Enter Quantity:");
    }
    
    public void marker() {
        product = "Marker";
        price = 15;
        System.out.print("Enter Quantity:");
    }
    public void ballpen() {
        product = "Ballpen";
        price = 7;
        System.out.print("Enter Quantity:");
    }
    public void envelope() {
        product = "Envelope";
        price = 8;
        System.out.print("Enter Quantity:");
    }
    public void scissor() {
        product = "Scissor";
        price = 15;
        System.out.print("Enter Quantity:");
    }
}


public class POS
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner quantity = new Scanner(System.in);
        TotalVat myTotal = new TotalVat();
        menu myMenu = new menuname();
        
        while(myTotal.m == 0) {
            System.out.println("\n\n****Product List****");
            System.out.println("1 . Glue P7.00");
            System.out.println("2 . Tape P5.00");
            System.out.println("3 . Pencil P6.00");
            System.out.println("4 . Eraser P5.00");
            System.out.println("5 . Folder P8.00");
            System.out.println("6 . Paper P25.00");
            System.out.println("7 . Marker P15.00");
            System.out.println("8 . Ballpen P7.00");
            System.out.println("9 . Envelope P7.00");
            System.out.println("10 . Scissor P15.00");
            System.out.println("11 . Total\n");
            System.out.println("Item#    Quantity    Price");
            myTotal.listitem();
            int menus = input.nextInt();
        
            switch (menus) {
                case 1:
                    myMenu.glue();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 2:
                    myMenu.tape();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;    
                case 3:
                    myMenu.pencil();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 4:
                    myMenu.eraser();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 5:
                    myMenu.folder();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 6:
                    myMenu.paper();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 7:
                    myMenu.marker();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 8:
                    myMenu.ballpen();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 9:
                    myMenu.envelope();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 10:
                    myMenu.scissor();
                    myTotal.items(myMenu.product, quantity.nextInt(),myMenu.price);
                    System.out.print('\u000c');
                    break;
                case 11:
                    myTotal.itemLists();
                    break;
                default:
                    System.out.print("You entered wrong item number.");
                    break;
            }
            
        }
    }
}
