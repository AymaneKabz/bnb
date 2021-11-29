package bcoin;

public enum Legends {
COMMON(10000),RARE(1714),SUPER_RARE(678),EPIC(160), LEGEND(56),SUPER_LEGEND(4);

    int chance;

    Legends(int chance){
        this.chance = chance;
    }

    public int getChance() {
        return chance;
    }
}
