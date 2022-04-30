package main.models.helpers;

import main.models.Player;

public class LazyTroll implements HelperInterface {

    @Override
    public int getPower() {
        return Integer.MIN_VALUE;
    }

    @Override
    public void help(Player player) {
        player.setName("You have been trolled!");
    }

}
