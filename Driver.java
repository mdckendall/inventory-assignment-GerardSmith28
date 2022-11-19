import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Driver {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Item> inventory = new ArrayList<Item>();
    public static void main(String [] args)  throws InputMismatchException{
        int option = 0;

        boolean run = true;
        while(run){
            System.out.println("--------------------------------------");
            System.out.println("Welcome to the inventory program:");
            
            // try{
            
            System.out.println("Press 1 to add an item\nPress 2 to delete an item\n" +
             "Press 3 to update an item\nPress 4 to show all the items\n" + 
             "Press 5 to quit the program" );
             option = input.nextInt();
            
            // }catch(InputMismatchException e){
            //     System.out.println("Invalid input please try again");
            // }
             
            switch(option){
                case 1: addItem(); break;
                case 2: deleteItem(); break;
                case 3: updateItem(); break;
                case 4: print(); break;
                case 5: System.out.println("Have a good day!"); run = false; break;
                default: System.out.println("Sorry, invalid input. Please try again."); break;
                }   
        }
    }

    public static void addItem(){
        Item newItem = new Item();

        System.out.println("Enter the name:");
        String name = input.next();
        newItem.setName(name);

       

        System.out.println("Enter the value in dollars (whole number):");
        int value = input.nextInt();
        newItem.setValue(value);

        System.out.println("Enter the serial number:");
        String sNumber = input.next();
        newItem.setSNumber(sNumber);
       
        
        inventory.add(newItem);

    } 

    public static void deleteItem(){
        System.out.println("Enter the serial number:");
        String sNumber = input.next();

        for(int i = 0; i < inventory.size(); i++){
            
            if(inventory.get(i).getSNumber().equals(sNumber)){
                inventory.remove(i);
            }
        }

    }

    public static void updateItem(){
        System.out.println("Enter the serial number:");
        String sNumber = input.next();

        System.out.println("Enter the new name:");
        String name = input.next();
        
        System.out.println("Enter the new value in dollars (whole number):");
        int value = input.nextInt();

        Item updatedElement = new Item(name, sNumber, value);

        for(int i = 0; i < inventory.size(); i++){
            
            if(inventory.get(i).getSNumber().equals(sNumber)){
                inventory.set(i, updatedElement);
            }
        }

    }
    
    public static void print(){
        System.out.println("--------------------------------------");
        System.out.println("Items in Inventory:");
        for(int i = 0; i < inventory.size(); i++){
            Item temp = inventory.get(i);
            System.out.println(temp.getName() + ", " + temp.getSNumber() + ", " + temp.getValue());
        }
    }
   
}
