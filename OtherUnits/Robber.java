package OtherUnits;
import java.util.*;

public class Robber extends Peasant {

    public Robber(ArrayList <Unit> team, String name, int hp, int luck, int inic, int level, int force, int maxHp){
        super(team, name, hp, luck, inic, level, force, maxHp);
    }

    @Override
    public String toString(){
        return "Robber";
    }

    public void counterattack(){
        
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(){
        
    }
}
