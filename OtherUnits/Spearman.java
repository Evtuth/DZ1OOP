package OtherUnits;

public class Spearman extends Peasant {

    public Spearman(String name, int hp, int luck, int speed, int level, int force){
        super(name, hp, luck, speed, level, force);
    }

    @Override
    public String toString(){
        return "Spearman";
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(){
        
    }
}
