package OtherUnits;


public class Coordinates {
    
    public int x, y;

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public float getDistance(Coordinates coordinatesEnemy){
        float dx = coordinatesEnemy.x - this.x;
        float dy = coordinatesEnemy.y - this.y;
        return (float) Math.sqrt(dx*dx+dy*dy);
    }
}
