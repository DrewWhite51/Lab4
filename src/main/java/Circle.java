/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class Circle {
    
        
    private double radius;
    private final double pi = 3.14159;
    
    
    public Circle (){
        radius = 0.0;
    }
    
    public Circle(double r){
        radius = r;
    }
    
    public void setRadius(double r){
        radius = r;
    }
    
    
    public double returnArea() {
        return pi * radius * radius;
        
    }
    
    public double returnDiameter(){
        return radius * 2;
    }
    
    public double returnCircumference(){
        return 2 * pi * radius;
    }
    
}
