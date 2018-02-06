/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary.with.bonus;

/**
 *
 * @author emad
 */
public class SalaryWithBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Input : two double values 
         *    Solid salary 
         *    main salary 
         * 
         *    bonus : 15%
         * 
         * output: total salary (TOTAL = R$ XX.XX)
         * 
         * process:  salary + ( solid * 15%) 
         */
        
        double solid_salary , main_salary , TOTAL;
        
        solid_salary = 0.00;
        
        main_salary = 700.00;
        
        TOTAL = main_salary + ( solid_salary * 0.15);
        
        System.out.println("TOTAL = R$ "+TOTAL);
        
    }
    
}
