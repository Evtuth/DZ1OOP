package OtherUnits;
import java.util.*;

public abstract class Unit implements GameInterface, Comparable<Unit>{
    String name, state;
    int hp, luck, inic, level, force, maxHp;
    ArrayList <Unit> team;
    protected Coordinates coordinates;
    

    public Unit(ArrayList <Unit> team, String state, String name, int hp, int luck, 
    int inic, int level, int force, int maxHp, int x, int y){
        this.team = team;
        this.state = state;
        this.hp = hp;
        this.luck = luck;
        this.inic = inic;
        this.level = level;
        this.force = force;
        this.name = name;
        this.maxHp = maxHp;
        this.coordinates = new Coordinates(x, y);
    }

    public void attack(){

    }

    public void defence(){

    }

    public void expectation(){
        
    }

    public void move(){
        
    }

    public int getHp(){
        return hp;
    }

    public String getState(){
        return state;
    }

    public int getMaxHp(){
        return maxHp;
    }

        public int getInic() {
        return inic;
    }

    @Override
    public int compareTo(Unit o) {
        return  o.getInic() - this.inic;
    }


    @Override
    public String getInfo(){
        return "name = " + name + ", " +
        "hp = " + hp + ", "+
        "Luck = " + luck + ", "+
        "inic = " + inic + ", "+
        "level = " + level + ", "+
        "force = " + force;
    }

    @Override
    public void step(ArrayList <Unit> ownTeam, ArrayList <Unit> opposingTeam){
        
    }
        
}