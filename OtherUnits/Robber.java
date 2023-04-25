package OtherUnits;

public class Robber extends Peasant {

    public Robber(String name, int hp, int luck, int speed, int level, int force){
        super(name, hp, luck, speed, level, force);
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
