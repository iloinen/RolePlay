package main.models.helpers;

import main.models.Player;

public class Fighter implements HelperInterface {

    @Override
    public int getPower() {
        return 30;
    }

    @Override
    public void help(Player player) {
        player.setStrength( player.getStrength() + getPower() );
    }

}
