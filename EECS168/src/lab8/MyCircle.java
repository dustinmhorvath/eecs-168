/*
 * Dustin Horvath
 * EECS_168 lab8
 * MyCircle.java: Contains methods for get/set, and tools for working with circle-related stuff.
 * 3/31/14
 */

package lab8;

public class MyCircle
{
    
    private final double PI = 3.141592;
    private double radius;
            
    public void setRadius(double input){
    	radius = input;
    }
    
    public double getRadius(){
    	return radius;
    }
    
    public double diameter(){
    	return radius * 2;
    }

    public double area(){
    	return PI*radius*radius;
    }

    public double circumference(){
    	return radius*PI*2;
    }

        
    
}