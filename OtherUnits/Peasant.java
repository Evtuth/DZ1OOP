package OtherUnits;

public class Peasant extends Unit{
    
    public Peasant(String name, int hp, int luck, int speed, int level, int force){
        super(name, hp, luck, speed, level, force);
    }

    @Override
    public String toString(){
        return "Class = Peasant" + ", " + "name = " + name;
    }
}
