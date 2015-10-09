public class Cylinder {
    private double radius,xCenter,yCenterBottom,height;
    public Cylinder() {
        xCenter = 0;
        yCenterBottom = 0;
        radius = 1;
        height = 2;
    }    
    public Cylinder(double radius, double height)  {
        yCenterBottom = 0;
        xCenter = 0;
        this.radius = radius;
        this.height = height;
    }   
    /*Pre: radius > 0 && height > 0 */    
    public Cylinder(double radius, double xCenter, double yCenterBottom, double yCenterTop) {
        this.xCenter = xCenter;
        this.yCenterBottom = yCenterBottom;
        this.radius = radius;
        height = yCenterTop - yCenterBottom;
    }    
    
    /*Pre: radius > 0 && yCenterBottom < yCenterTop */
    public double getRadius() {
       return radius;
    }    
    
    public double getXCenter() {
        return xCenter;
    }
    
    public double getYCenterBottom() {
        return yCenterBottom;
    }    
    
    public double getHeight() {
        return height;
    }    
    
    public double getVolume() {
        double areaDaBase;
        double volume;
        areaDaBase = Math.PI *( Math.pow(radius,2));
        volume = areaDaBase * height;
        return volume;
    }
    
    public void translate(double dx, double dy) {
        xCenter = xCenter + dx;
        yCenterBottom = yCenterBottom + dy;
    }    
    
    public boolean higherCapacity (Cylinder c) {
        return (this.getVolume() > c.getVolume());
    }
    
    public boolean ptInCircleBottom(double x, double y) {
        double dxbase = Math.pow( x - xCenter,2);
        double dybase = Math.pow( y - yCenterBottom,2);
        double dist = Math.sqrt( dxbase - dybase);
        return radius >= dist;
    }
        
}


