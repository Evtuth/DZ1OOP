
import java.util.*;

import OtherUnits.*;

public class Game {
    
    public static void main(String[] args) {

        ArrayList <Unit> team1 = new ArrayList<>();
        ArrayList <Unit> team2 = new ArrayList<>();
        

        Peasant peasant = new Peasant(team1, "free", "Ivan",100,1,9,1,5, 120,1, 1);
        Robber robber = new Robber(team1, "free","Valira",120,3,12,1,7, 120,1, 2);
        Crossbowman crossbowman = new Crossbowman(team1, "free","Garosh",150,3,14,1,10, 150,1, 3, 1,5,15);
        Monk monk = new Monk(team1, "free","Po",130,10,11,1,8, 130,1, 4, 100,1);
        Sniper sniper = new Sniper(team1, "free","Reksar",140,10,15,1,9, 140,1, 5, 1,10,15);
        Spearman spearman = new Spearman(team1, "free","Sergey",180,10,13,1,6, 190,1, 6);
        Wizard wizard = new Wizard(team1, "free","Kadgar",120,10,10,1,7, 120, 100,1, 7, 6);

        Peasant peasant2 = new Peasant(team2, "free","Ivan",100,1,9,1,5, 120,10, 1);
        Robber robber2 = new Robber(team2, "free","Valira",120,3,12,1,7, 120,10, 2);
        Crossbowman crossbowman2 = new Crossbowman(team1, "free","Garosh",150,3,14,1,10, 150,10, 3, 1,5,15);
        Monk monk2 = new Monk(team2, "free","Po",130,10,11,1,8, 130, 10, 4, 100,1);
        Sniper sniper2 = new Sniper(team2, "free","Reksar",140,10,15,1,9, 140,10, 5, 1,10,15);
        Spearman spearman2 = new Spearman(team2, "free","Sergey",180, 10, 13, 1, 6, 190,10, 6);
        Wizard wizard2 = new Wizard(team2, "free","Kadgar", 120, 10, 10, 1, 7, 120, 100,10, 7, 6);

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
                    team2.add(peasant2);
                    break;
                case 1:
                    team2.add(robber2);
                    break;
                case 2:
                    team2.add(crossbowman2);
                    break;
                case 3:
                    team2.add(monk2);
                    break;
                case 4:
                    team2.add(sniper2);
                    break;
                case 5:
                    team2.add(spearman2);
                    break;
                case 6:
                    team2.add(wizard2);
                    break;
            }
        }

        System.out.println(team1);
        System.out.println(team2);

        System.out.println("Team1:");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("Team2:");
        team2.forEach(n -> System.out.println(n.getInfo()));
        
        wizard.step(team1, team2);
        wizard2.step(team1, team2);

        ArrayList <Unit> teamInic = new ArrayList<>(team1);
        teamInic.addAll(team2);        
        Collections.sort(teamInic);
        System.out.println("TeamInic:");
        teamInic.forEach(n -> System.out.println(n.getInfo()));

        crossbowman.step(team1, team2);
        crossbowman2.step(team2, team1);
        sniper.step(team1, team2);
        sniper2.step(team2, team1);
    }
}
