package OtherUnits;
import java.util.*;

public class Sniper extends Crossbowman {
    
    public Sniper(ArrayList <Unit> team, String state, String name, int hp, int luck, int inic, int level, 
    int force, int maxHp, int x, int y, int accuracy, int currentBullets, int maxBullets ){
        super(team, state, name, hp, luck, inic, level, force, maxHp, x, y, accuracy, currentBullets, maxBullets);
        
    }

    @Override
    public String toString(){
        return "Sniper";
    }

    
    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(ArrayList <Unit> ownTeam, ArrayList <Unit> opposingTeam){
        if(hp > 0 && currentBullets > 0 && state == "free"){
            float minDistance = Float.MAX_VALUE;
            Unit target = null;
            for (Unit n : opposingTeam) {
                float tmp = n.coordinates.getDistance(this.coordinates);
                if(tmp < minDistance){
                    minDistance = tmp;
                    target = n;
                }
            }
            System.out.println(name + " from own team" + " shoots at " + target.name + " from opposing team!!!"); 
            for (Unit k : ownTeam) {
                if(k.toString() == "Peasant" && k.getState() == "free"){
                    System.out.println("The peasant restored the number of your bullets!!!");
                    System.out.println("Current Bullets = " + currentBullets);
                    break;
                }
                else{
                    this.currentBullets = currentBullets - 1;
                    System.out.println("Current Bullets = " + currentBullets);
                    break;
                }
            }
        }
    }
}
