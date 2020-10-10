
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class Driving {
    
    public static void main(String[] args) {
        int yearModel = 0;
        String make = " ";
        int speed;
        
        Scanner keyboard = new Scanner(System.in);
        
        Car car = new Car(yearModel, make);
        
        System.out.println("What is the year of your car?");
        yearModel = keyboard.nextInt();
        
        System.out.println("What is the make of your car?");
        make = keyboard.nextLine();
        
        System.out.println("What is the beginning speed of the car?");
        speed = keyboard.nextInt();
        
        car.setSpeed(speed);
    }
    
}
