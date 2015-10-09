 public class Triangle {
    private double Px,Py,Sx,Sy,Tx,Ty,sideComp;
    public Triangle( double px, double py, double sx, double sy, double tx, double ty) {
         this.Px = px;
         this.Py = py;
         this.Sx = sx;
         this.Sy = sy;
         this.Tx = tx;
         this.Ty = ty;
    } 
    public Triangle() {
         this.Px = 1;
         this.Py = 1;
         this.Sx = 4;
         this.Sy = 4;
         this.Tx = 5;
         this.Ty = 1;
    }     
    public double getPx() { return Px;}
    public double getPY() { return Py;}
    public double getSx() { return Sx;}
    public double getSy() { return Sy;}
    public double getTx() { return Tx;}
    public double getTy() { return Tx;}
    public double sidecalc( double hx, double hy, double kx, double ky ) {
        double x = Math.pow ((hx-kx),2);
        double y = Math.pow ((hy-ky),2);
        sideComp = Math.sqrt( x + y );
        return sideComp;
    }
 
}