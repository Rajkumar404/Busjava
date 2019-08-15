/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author DELL
 */
public class Bus{

    
    int noOFWindows;
    int noOfSeat;
    int noOfpassenger;

    public Bus(int noOFWindows, int noOfSeat,int noOfpassenger) {
        this.noOFWindows = noOFWindows;
        this.noOfSeat = noOfSeat;
        this.noOfpassenger = noOfpassenger;
    }
    
    public int getNoOFWindows() {
        return noOFWindows;
    }
    public int getNoOfSeat() {
        return noOfSeat;
    }
    public int getNoOfpassenger() {
        return noOfpassenger;
    }
    public void Speed(int maxspeed) {
        System.out.println("maxspeed is: " + maxspeed);
        
    }
    public void brake() {
        System.out.println("its fully damaged");
    }
    public void steering() {
        System.out.println("its stucked");
    }
    public static void main(String[] args) {
        Bus myBus = new Bus(4,10,55);
        System.out.println(myBus.getNoOFWindows());
        System.out.println(myBus.getNoOfSeat());
        System.out.println(myBus.getNoOfpassenger());
        
        myBus.brake();
        myBus.steering();
        myBus.Speed(152);
        
        // TODO code application logic here
    }
    
}
