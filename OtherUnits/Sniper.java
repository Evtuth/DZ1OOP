package OtherUnits;
import java.util.*;

public class Sniper extends Crossbowman {
    
    public Sniper(ArrayList <Unit> team, String name, int hp, int luck, int inic, int level, 
    int force, int maxHp, int accuracy, int currentBullets, int maxBullets ){
        super(team, name, hp, luck, inic, level, force, maxHp, accuracy, currentBullets, maxBullets);
        
    }

    @Override
    public String toString(){
        return "Sniper";
    }

    
    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(){
        
    }
}
