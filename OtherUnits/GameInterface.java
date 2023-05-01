package OtherUnits;
import java.util.*;
public interface GameInterface {
    
    void step(ArrayList <Unit> ownTeam, ArrayList <Unit> opposingTeam);
    String getInfo();
}
