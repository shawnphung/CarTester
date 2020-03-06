/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author shphu0697
 */
public class Car {
    //Variables for characteristics
     private String make, model;
     private int brake, speed, year;
     private double price;
     

    //Randomize price, speed, and brake stats for second car
    //Keeps make, model and year
    public Car(String cMake, String cModel, int cYear){
        model = cModel;
        make = cMake;
        year = cYear;
        price = (double)Math.random() * 20000;
        speed = (int)Math.round(Math.random() * 100);
        brake = (int)Math.round(Math.random() * 100);  
    }
    //Randomizes everythings about car3
    public Car () {
        int i = (int)Math.round(Math.random() *3);
        if (i == 1){
            make = "Zentorno";
        }else if (i == 2){
            make = "Elegy";
        }else{
            make = "Issi";
        }
        //Declare another randomized int to determine model name
        int u = (int)Math.round(Math.random() * 3 );
        if(u == 1){
            model = "RH8";
        }else if (u == 2){
            model = "PR4";
        }else{
            model = "Classic";
        }
        //Randomizes numeric variables
        year = (int)Math.round(Math.random() * 20 + 2000);
        speed = (int)Math.round(Math.random() * 100 );
        brake = (int)Math.round(Math.random() * 100 );
        price = (double)Math.random() * 20000;
     }   
    public Car (String cMake, String cModel, int cYear, double cPrice, int cSpeed, int cBrake){
        make = cMake;
        model = cModel;
        year = cYear;
        speed = cSpeed;
        brake = cBrake;
        price = cPrice;
}
   
    //Create Honks
    public void coolHonk(){
        System.out.println("Honk Honk \n This is a cool car");
    }
    public void boringHonk(){
        System.out.println("Honk Hink \n This is a boring car");
    }
    
    //Method to display all info of cars
    public String toString(){
        String output = "Name: " + make + " " + model + " " + year + "\n";
        output += "Braking: " + brake + "\n";
        output += "Speed: " + speed + "\n";
        output += "Price: " + price;
        return output;
    }
}
