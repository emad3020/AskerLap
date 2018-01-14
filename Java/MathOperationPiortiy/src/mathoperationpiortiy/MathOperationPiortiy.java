
package mathoperationpiortiy;


public class MathOperationPiortiy {

    
    public static void main(String[] args) {
        
        //piortiy in math operations
        /*
        1. ()
        2. *
        3. /
        4. +
        5. -
        */
        
        
        // example (4+9) * 10 - 12
        
        int step1 = 10-12;
                System.out.println(step1);

        int step2 = (4+9);
                System.out.println(step2);

        int step3 = step1 *step2;
        System.out.println(step3);
        
        int sum = (4+9) * 10 - 12;
        System.out.println("Right answer is : "+ sum);

    }
    
}
