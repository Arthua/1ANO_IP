public class Map {
    private int Px,Py,Tx,Ty,direc;
    public Map (int Tx , int Ty) {
        this.Tx = Tx;
        this.Ty = Ty;
        Px = 0;
        Py = 0;
    }
    private static final int NORTH = 0;
    private static final int EAST = 1;
    private static final int SOUTH = 2;
    private static final int WEST = 3;
    public void walkNorth (int steps) { 
        Px = Py + steps;
        direc = NORTH;
    }
    public void walkSouth (int steps) { 
        Px = Py - steps;
        direc = SOUTH;
    }
    public void walkEast (int steps) { 
        Px = Px + steps;
        direc = EAST;
    }
    public void walkWest (int steps) {
        Px = Px - steps;
        direc = WEST;
    }
    public boolean dig() { 
        return Px == Tx && Py == Ty;
    }
    public int getXPos() { return Px;}
    public int getYPos() { return Py;}
    public int getCurrentDirection() { return direc;}

        
    
        
}
