package bcoin;

import bcoin.Legends;

public class QuotaRetriever {

    public static Legends pickLegend(){
        int randomNumber = (int) (Math.random() * 10000);
        if(randomNumber<Legends.SUPER_LEGEND.getChance())
            return Legends.SUPER_LEGEND;
        else if(randomNumber<Legends.LEGEND.getChance())
            return Legends.LEGEND;
        else if(randomNumber<Legends.EPIC.getChance())
            return Legends.EPIC;
        else if(randomNumber<Legends.SUPER_RARE.getChance())
            return Legends.SUPER_RARE;
        else if(randomNumber<Legends.RARE.getChance())
            return Legends.RARE;
        else
            return Legends.COMMON;
    }

    public static void main(String[] args) {
            Stats stats = new Stats();
            for (int j = 0; j < 10000000; j++) {
                stats.increase(pickLegend());

            }
        System.out.println(stats);

    }
}
