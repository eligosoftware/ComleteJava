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
public class Case {
    private String model,manufacturer,powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powersupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }
    
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
