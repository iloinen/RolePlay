package main.models.helpers;

import main.models.Player;

public class Bard implements HelperInterface {

    @Override
    public int getPower() {
        return 20;
    }

    @Override
    public void help(Player player) {
        player.setSpellPower( player.getSpellPower() + getPower() );
    }

}
