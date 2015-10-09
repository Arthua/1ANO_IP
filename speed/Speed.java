public class Speed {
    private double speed;
    public Speed (double speed){
        this.speed = speed;
    }    
    public Speed() { speed = 0; }
    private static final double MS_KMH = 3.6;
    private static final double MS_MPH = 2.236936;
    public double getInMS() { return speed; }
    public void setInMS(double speed) { this.speed = speed; }
    public double getInKmH() {
        return (speed * MS_KMH); 

    }
    public void setInKmH(double speed) {
       this.speed = speed / MS_KMH;
    }
    public double getInMpH() {
        return (speed * MS_MPH);
    }
    public void setInMpH(double speed) {
        this.speed = speed / MS_MPH;
    }
    

}

