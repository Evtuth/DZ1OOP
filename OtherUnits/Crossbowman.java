package OtherUnits;
import java.util.*;

public class Crossbowman extends Unit {

    int accuracy, currentBullets, maxBullets;

    public Crossbowman(ArrayList <Unit> team, String name, int hp, int luck, int inic, int level, 
    int force, int maxHp, int accuracy, int currentBullets, int maxBullets ){
        super(team, name, hp, luck, inic, level, force, maxHp);
        this.accuracy = accuracy;
        this.currentBullets = currentBullets;
        this.maxBullets = maxBullets;
    }

    @Override
    public String toString(){
        return "Crossbowman";
    }

    public void shot(){
        
    }

    @Override
    public String getInfo(){
        return super.getInfo() + ", " +
        "accuracy = " + accuracy + ", " +
        "currentBullets = " + currentBullets + ", "+
        "maxBullets = " + maxBullets;
    }

    @Override
    public void step(){
        
    }

    
}
