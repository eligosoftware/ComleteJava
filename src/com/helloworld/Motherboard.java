/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

/**
 *
 * @author ilgarrasulov
 */
public class Motherboard {
    private String model,manufacturer,bios;
    private int ramSlots,cardSlots;

    public Motherboard(String model, String manufacturer, String bios, int ramSlots, int cardSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }
    
    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is loading ...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
    
    
}
