public class TrafficLight {
    private static final int RED = 0;
    private static final int GREEN = 1;
    private static final int YELLOW = 2;
    private int corAtual;
    public TrafficLight() { corAtual = RED; }
    public boolean isRed() { return corAtual == RED;} 
    public boolean isYellow() { return corAtual == YELLOW; }
    public boolean isGreen() { return corAtual == GREEN; }
    public boolean pass() { return corAtual == GREEN || corAtual == YELLOW;}
    public boolean stop() { return corAtual == RED;}
    public void changeColor() {
        corAtual = (corAtual+1) % 3;
    }    
        
}    
