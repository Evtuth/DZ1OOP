package OtherUnits;
import java.util.*;

public abstract class Unit implements GameInterface, Comparable<Unit>{
    String name;
    int hp, luck, inic, level, force, maxHp;
    ArrayList <Unit> team;
    

    public Unit(ArrayList <Unit> team, String name, int hp, int luck, int inic, int level, int force, int maxHp){
        this.team = team;
        this.hp = hp;
        this.luck = luck;
        this.inic = inic;
        this.level = level;
        this.force = force;
        this.name = name;
        this.maxHp = maxHp;
        
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
    public void step(){
        
    }
        
}