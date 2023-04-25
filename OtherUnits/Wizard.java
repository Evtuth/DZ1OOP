package OtherUnits;

public class Wizard extends Monk {
    
    public Wizard(String name, int hp, int luck, int speed, int level, int force, int mana, int accuracy){
        super(name, hp, luck, speed, level, force, mana, accuracy);
    }

    @Override
    public String toString(){
        return "Wizard";
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(){
        
    }
}
