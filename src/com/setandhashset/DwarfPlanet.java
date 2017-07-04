package com.setandhashset;

/**
 * Created by mragl on 02.07.2017.
 */
public class DwarfPlanet extends HeavenlyBody
{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
