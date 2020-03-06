/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import java.util.Scanner;
/**
 *
 * @author shphu0697
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare variables and stats for cars
        Scanner input = new Scanner (System.in);
        Car car1 = new Car ("Nissan", "Sentra", 2014, 9999.98, 78, 65);
        Car car2 = new Car ("Honda", "Civic", 2012);
        Car car3 = new Car ();
       
      
        //Print out info for each car
        System.out.println(car1.toString());
        System.out.println("-----------------------------------");
        
        System.out.println(car2.toString());
        System.out.println("-----------------------------------");
        
        System.out.println(car3.toString());
        System.out.println("-----------------------------------");
        
        //car1 has a cool horn, and car2 has a boring horn
        car1.coolHonk();
        car2.boringHonk();
}
}