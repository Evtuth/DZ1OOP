package OtherUnits;

public abstract class Unit implements GameInterface{
    String name;
    int hp, luck, speed, level, force;

    public Unit(String name, int hp, int luck, int speed, int level, int force){
        this.hp = hp;
        this.luck = luck;
        this.speed = speed;
        this.level = level;
        this.force = force;
        this.name = name;
    }

    public void attack(){

    }

    public void defence(){

    }

    public void expectation(){
        
    }

    public void move(){
        
    }

    @Override
    public String getInfo(){
        return "name = " + name + ", " +
        "hp = " + hp + ", "+
        "Luck = " + luck + ", "+
        "speed = " + speed + ", "+
        "level = " + level + ", "+
        "force = " + force;
    }

    @Override
    public void step(){
        
    }
        
}