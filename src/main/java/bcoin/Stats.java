package bcoin;

import bcoin.Legends;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    Map<Legends,Integer> stats = new HashMap<>();
    int total = 0;

    public Stats(){
        for (Legends legend: Legends.values()) {
            stats.put(legend,0);
        }
    }

    public void increase(Legends legend){
        Integer a =stats.get(legend);
        a = a+1;
        stats.replace(legend,a);
        total++;
    }

    @Override
    public String toString() {
        String string="";
        for (Legends legend: Legends.values()) {
            string += legend.name() +" "+((float)stats.get(legend)/total)*100+"\n";
        }
        return string;
    }
}
