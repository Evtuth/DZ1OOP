package OtherUnits;

public class Crossbowman extends Unit{

    int accuracy, currentBullets, maxBullets;

    public Crossbowman(String name, int hp, int luck, int speed, int level, 
    int force, int accuracy, int currentBullets, int maxBullets ){
        super(name, hp, luck, speed, level, force);
        this.accuracy = accuracy;
        this.currentBullets = currentBullets;
        this.maxBullets = maxBullets;
    }

    @Override
    public String toString(){
        return "Class = Crossbowman" + ", " + "name = " + name;
    }

    public void shot(){
        
    }
}
