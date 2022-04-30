package main.models.helpers;

import main.models.Player;

public class Healer implements HelperInterface {

    @Override
    public int getPower() {
        return 10;
    }

    @Override
    public void help(Player player) {
        player.setStamina( player.getStamina() + getPower() );
    }

}
