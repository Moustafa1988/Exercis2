package Round;

import Player.Player;

public  class RoundTester {
    public Player match(Player p1, Player p2) {
        if (p1.getLevel().equals(p2.getLevel())) {
            double s1 = Math.random();
            double s2 = Math.random();
            if (s1 > s2) {
                return p1;
            } else {
                return p2;
            }
        }

        return null;
    }
}
