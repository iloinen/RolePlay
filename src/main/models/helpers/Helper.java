package main.models.helpers;

import main.models.Player;

@Deprecated
public class Helper {

    private HelperType type;
    private int power;

    public Helper(HelperType type, int power) {
        this.type = type;
        this.power = power;
    }

    public void help(Player player) {
        switch (type) {
            case BARD -> player.setSpellPower( player.getSpellPower() + power );
            case HEALER, DEFENDER -> player.setStamina( player.getStamina() + power );
            case FIGHTER -> player.setStrength( player.getStrength() + power );
            case POSTMAN -> {
                player.setStamina( player.getStamina() - power * 2 );
                player.setSpellPower( player.getSpellPower() + power );
                player.setStrength( player.getStrength() + power );
            }
            case LAZY_TROLL -> player.setName("Lazy Trooooll");
        }
    }

    public HelperType getType() {
        return type;
    }

    public void setType(HelperType type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
