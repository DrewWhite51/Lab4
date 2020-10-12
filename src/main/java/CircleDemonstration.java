
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
public class CircleDemonstration {
    

    

    
 
    
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        
        System.out.println("Enter the radius of the circle");
        double r = keyboard.nextInt();
        
        Circle circle = new Circle(r);
        
        System.out.println("The radius is " + r + ".");
        System.out.println("The area is " + circle.returnArea() + ".");
        System.out.println("The diameter is " + circle.returnDiameter() + ".");
        System.out.println("The circumference is " + circle.returnCircumference() + ".");
        

        

        
    }


    
    
}
