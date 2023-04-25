package OtherUnits;

public class Monk extends Unit {

    int mana, accuracy;

    public Monk(String name, int hp, int luck, int speed, int level, int force, int mana, int accuracy){
        super(name, hp, luck, speed, level, force);
        this.mana = mana;
        this.accuracy = accuracy;
    }

    @Override
    public String toString(){
        return "Monk";
    }

    public void heal(){
        
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
