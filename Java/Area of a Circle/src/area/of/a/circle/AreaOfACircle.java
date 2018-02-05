/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.a.circle;

/**
 *
 * @author emad
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // يثمل المتغير هنا نصف قطر الدائرة
        double r = 22, P = 3.14159, A; // present half dimentina of circle 

        A = P * r * r;

        System.out.println("A=" + A);

        /**
         * ************* Another solution *****
         */
        double r2 = 22, A2;

        final double P2 = 3.14159;

        A2 = P2 * Math.pow(r2,2);

        System.out.println("A=" + A2);

        /**
         * ************* Another solution [ the best solution for the problem] *****
         */
        double r3 = 22, A3;

        A3 = Math.PI * Math.pow(r3, 2);

        System.out.println("A=" + A3);

    }

}
