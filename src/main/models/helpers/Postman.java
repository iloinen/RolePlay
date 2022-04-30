package main.models.helpers;

import main.models.Player;

public class Postman implements HelperInterface {

    @Override
    public int getPower() {
        return 42;
    }

    @Override
    public void help(Player player) {
        player.setStamina( player.getStamina() - getPower() * 2 );
        player.setSpellPower( player.getSpellPower() + getPower() );
        player.setStrength( player.getStrength() + getPower() );
    }

}
