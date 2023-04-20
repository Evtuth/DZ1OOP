package OtherUnits;

public class Robber extends Peasant{

    public Robber(String name, int hp, int luck, int speed, int level, int force){
        super(name, hp, luck, speed, level, force);
    }

    @Override
    public String toString(){
        return "Class = Robber" + ", " + "name = " + name;
    }

    public void counterattack(){
        
    }
}
