package OtherUnits;
import java.util.*;

public class Monk extends Unit {

    int mana, accuracy;

    public Monk(ArrayList <Unit> team, String name, int hp, int luck, int inic, int level, int force, int maxHp, int mana, int accuracy){
        super(team, name, hp, luck, inic, level, force, maxHp);
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
    public void step(){
        
    }
}
