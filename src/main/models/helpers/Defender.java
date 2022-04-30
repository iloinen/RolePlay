package main.models.helpers;

import main.models.Player;

public class Defender implements HelperInterface {

    @Override
    public int getPower() {
        return 50;
    }

    @Override
    public void help(Player player) {
        player.setStamina( player.getStamina() + getPower() );
    }

}
