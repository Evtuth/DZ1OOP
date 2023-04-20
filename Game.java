// Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах". 
// Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд). 
// Создать абстрактный класс и иерархию наследников. 
// Расположить классы в пакет так, чтобы в основной программе не было видно их полей. 
// В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя. 
// Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.

import java.util.*;

import OtherUnits.*;

public class Game {
    
    public static void main(String[] args) {

        Peasant peasant = new Peasant("Ivan",1,1,1,1,1);
        Robber robber = new Robber("Valira",1,1,1,1,1);
        Crossbowman crossbowman = new Crossbowman("Garosh",1,1,1,1,1,1,1,1);
        Monk monk = new Monk("Po",1,1,1,1,1,1,1);
        Sniper sniper = new Sniper("Reksar",1,1,1,1,1,1,1,1);
        Spearman spearman = new Spearman("Sergey",1,1,1,1,1);
        Wizard wizard = new Wizard("Kadgar",1,1,1,1,1,1,1);

        System.out.println(peasant);
        System.out.println(robber);
        System.out.println(crossbowman);
        System.out.println(monk);
        System.out.println(sniper);
        System.out.println(spearman);
        System.out.println(wizard);
    }
}
