public class Rect {
    private double left, top, right, bottom;
    public static final double DEFAULT_VALUE = 0.5;
    public Rect() { 
        left = - DEFAULT_VALUE;
        top = DEFAULT_VALUE;
        right = DEFAULT_VALUE;
        bottom = - DEFAULT_VALUE;
    }    
    public Rect(double left, double top, double right, double bottom){
        this.left=left;
        this.top=top;
        this.right=right;
        this.bottom=bottom;
    }    
    public Rect(double left, double top, double lenght){
        this.left=left;
        this.top=top;
        this.right=left+lenght;
        this.bottom=top-lenght;
    }
    public double getLeft() {
        return this.left;
    }    
    public double getTop() {
        return this.top;
    }  
    public double getRight() {
        return this.right;
    }  
    public double getBottom() {
        return this.bottom;
    }  
    public double getXCenter() {
        return (this.left+this.right)/2;
    }
    public double getYCenter() {
        return (this.top+this.bottom)/2;
    }    
    public double getWidth() {
        return this.right - this.left;
    }
    public double getHeight() {
        return this.top - this.bottom;
    }    
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }
    public double getPerimeter() {
        return 2 * this.getHeight() + 2 * this.getWidth();

    }
    public boolean ptInRect (double x, double y) {
        return this.left<= x && right >= x && top >= y && bottom <= y;
    }    
    public boolean rectInRect (Rect r) {
        return r.getLeft() >= this.left && r.getRight() <= this.right
        && r.getBottom() >= this.bottom && r.getTop() <= this.top;
    }    
    public void translate( double dx, double dy) {
        this.left = this.left + dx;
        this.top = this.top + dy;
        this.right = this.right + dx;
        this.bottom = this.bottom + dy;
    }    
    public void turn() {
        double cx = this.getXCenter();
        double cy = this.getYCenter();
        double halfHeight = (this.getHeight())/2;
        double halfWidth = (this.getWidth())/2;
        left = cx + halfHeight;
        top = cy + halfWidth;
        right = cx + halfHeight;
        bottom = cy - halfWidth;
    }     
    
    
    
}    