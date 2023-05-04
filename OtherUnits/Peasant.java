package OtherUnits;
import java.util.*;

public class Peasant extends Unit {
    
    public Peasant(ArrayList <Unit> team, String state, String name, int hp, int luck, 
    int inic, int level, int force, int maxHp, int x, int y){
        super(team, state, name, hp, luck, inic, level, force, maxHp, x, y);
    }

    @Override
    public String toString(){
        return "Peasant";
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(ArrayList <Unit> ownTeam, ArrayList <Unit> opposingTeam){
        if(hp > 0 && state == "free") {
            System.out.println("Peasant carries bullets!!!");
        } else {
            System.out.println("Peasant is busy!!!");
        }
    }

    
}
