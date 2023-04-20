package OtherUnits;

public class Sniper extends Crossbowman {
    
    public Sniper(String name, int hp, int luck, int speed, int level, 
    int force, int accuracy, int currentBullets, int maxBullets ){
        super(name, hp, luck, speed, level, force, accuracy, currentBullets, maxBullets);
        
    }

    @Override
    public String toString(){
        return "Class = Sniper" + ", " + "name = " + name;
    }
}
