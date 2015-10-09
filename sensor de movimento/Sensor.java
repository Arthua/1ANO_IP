
public class Sensor{
    private boolean detetor;
    public Sensor () { detetor = true; }
    public void move () { detetor = true; }
    public void stop () { detetor  = false; }
    public boolean ismoving () { return detetor; }
}
