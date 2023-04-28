package OtherUnits;
import java.util.*;

public class Wizard extends Monk{
    
    
    public Wizard(ArrayList <Unit> team, String name, int hp, int luck, int inic, int level, int force, int maxHp, int mana, int accuracy){
        super(team, name, hp, luck, inic, level, force, maxHp, mana, accuracy);
        
    }

    @Override
    public String toString(){
        return "Wizard";
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }

    @Override
    public void step(){
        int indexPerson = 0;
        int min = 1000;
        int healpoint = new Random().nextInt(force+1);
        for(int i = 0; i < team.size(); i ++){
            if(team.get(i).getHp() != team.get(i).getMaxHp()){
                if((team.get(i).getMaxHp() - team.get(i).getHp()) <= min){
                    min = (team.get(i).getMaxHp() - team.get(i).getHp());
                    indexPerson = i;
                }
        if((team.get(indexPerson).getMaxHp() - team.get(indexPerson).getHp()) >= healpoint){
            team.get(indexPerson).hp = team.get(indexPerson).getHp() + healpoint;
            System.out.println("Health restored on " + healpoint + " HP!" + team.get(indexPerson).name +" "+ team.get(indexPerson) +
            " have " + team.get(indexPerson).hp + "HP!" );   
        }
        else{
            team.get(indexPerson).hp = team.get(indexPerson).maxHp;
            System.out.println(team.get(indexPerson).name + " " + team.get(indexPerson) + " have Max Value HP!!!");
                    
        }
            }
        }
    }
}
