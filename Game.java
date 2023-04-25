
import java.util.*;

import OtherUnits.*;

public class Game {
    
    public static void main(String[] args) {

        Peasant peasant = new Peasant("Ivan",100,1,10,1,5);
        Robber robber = new Robber("Valira",120,3,15,1,7);
        Crossbowman crossbowman = new Crossbowman("Garosh",150,3,12,1,10,1,5,15);
        Monk monk = new Monk("Po",130,10,8,1,8,100,1);
        Sniper sniper = new Sniper("Reksar",140,10,14,1,9,1,10,15);
        Spearman spearman = new Spearman("Sergey",180,10,13,1,6);
        Wizard wizard = new Wizard("Kadgar",110,10,5,1,3,100,6);

                
        ArrayList <Unit> team1 = new ArrayList<>();
        ArrayList <Unit> team2 = new ArrayList<>();

        for(int i = 0; i < 10; i ++){
            switch(new Random().nextInt(7)){
                case 0:
                    team1.add(peasant);
                    break;
                case 1:
                    team1.add(robber);
                    break;
                case 2:
                    team1.add(crossbowman);
                    break;
                case 3:
                    team1.add(monk);
                    break;
                case 4:
                    team1.add(sniper);
                    break;
                case 5:
                    team1.add(spearman);
                    break;
                case 6:
                    team1.add(wizard);
                    break;
            }
        }
        
        for(int i = 0; i < 10; i ++){
            switch(new Random().nextInt(7)){
                case 0:
                    team2.add(peasant);
                    break;
                case 1:
                    team2.add(robber);
                    break;
                case 2:
                    team2.add(crossbowman);
                    break;
                case 3:
                    team2.add(monk);
                    break;
                case 4:
                    team2.add(sniper);
                    break;
                case 5:
                    team2.add(spearman);
                    break;
                case 6:
                    team2.add(wizard);
                    break;
            }
        }

        System.out.println(team1);
        System.out.println(team2);

        System.out.println("Team1:");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Team2:");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
}
