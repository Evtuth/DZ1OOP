package OtherUnits;
import java.util.*;

public class Monk extends Unit {

    int mana, accuracy;

    public Monk(ArrayList <Unit> team, String state, String name, int hp, int luck, 
    int inic, int level, int force, int maxHp, int x, int y, int mana, int accuracy){
        super(team, state, name, hp, luck, inic, level, force, maxHp, x, y);
        this.mana = mana;
        this.accuracy = accuracy;
    }

    @Override
    public String toString(){
        return "Monk";
    }

    
    @Override
    public String getInfo(){
        return super.getInfo() + ", "+
        "accuracy = " + accuracy + ", "+
        "mana = " + mana;
    }

    @Override
    public void step(ArrayList <Unit> ownTeam, ArrayList <Unit> opposingTeam){
        
    }
}
