package OtherUnits;
import java.util.*;

public class Robber extends Peasant {

    public Robber(ArrayList <Unit> team, String state, String name, int hp, int luck, 
    int inic, int level, int force, int maxHp, int x, int y){
        super(team, state, name, hp, luck, inic, level, force, maxHp, x, y);
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
    public void step(ArrayList <Unit> ownTeam, ArrayList <Unit> opposingTeam){
        if(hp > 0 && state == "free"){
            float minDistance = 2;
            Unit target = null;
            for (Unit n : opposingTeam) {
                float tmp = n.coordinates.getDistance(this.coordinates);
                if(tmp < minDistance && n.state != "die"){
                    minDistance = tmp;
                    target = n;
                }
            }
            if(target != null){
                System.out.println(name + " from own team" + " attaks at " + target.name + " from opposing team!!!");
            }
            else{
                if(this.coordinates.x > 5 ){
                    this.coordinates.x--;
                }
                if(this.coordinates.x < 5){
                    this.coordinates.x++;
                }
                System.out.println(name + " from own team moved!!!");
            }
        }
    }
}
