package main.models;

import main.models.helpers.Helper;
import main.models.helpers.HelperInterface;

public class Player {
    
    private String name;

    private int stamina;
    private int spellPower;
    private int strength;

    private HelperInterface helper;

    public Player(String name, HelperInterface helper) {
        this.name = name;
        this.helper = helper;
        stamina = 100;
        spellPower = 100;
        strength = 100;
    }

    public void askForHelp() {
        helper.help(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public HelperInterface getHelper() {
        return helper;
    }

    public void setHelper(HelperInterface helper) {
        this.helper = helper;
    }

}
