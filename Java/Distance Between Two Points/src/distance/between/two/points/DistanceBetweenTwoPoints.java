/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance.between.two.points;

/**
 *
 * @author emad
 */
public class DistanceBetweenTwoPoints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Input : four double point values 
         * 
         * output : distance between them : XX.XXXX
         * 
         * process : square root ( difference between x pints of p1 + 
         *                         difference between y points of p2 )
         * 
        */
        
        double p1 ,p2 , diff , distance ;
        
        double x1 , y1 , x2 , y2 ;
        
        x1 = 1.0;
        y1 = 7.0;
        
        x2 = 5.0;
        y2 = 9.0;
        
        p1 = Math.pow((x1-x2), 2);
        
        p2 = Math.pow((y1-y2), 2);
        
        distance = Math.sqrt(p1+p2);
        
        System.out.println(distance);
        
        
        
    }
    
}
