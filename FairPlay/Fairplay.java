public class Fairplay{
    private boolean happy;
    private int win,drew,lost;
    private Team benfas;
    public Fairplay() { happy = true;win=0;drew=0;lost=0; benfas = new Team();}
    public void wewon() { happy = true;win++;benfas.vit(); }
    public void wedrew() { happy = false;drew++;benfas.emp(); }
    public void welost() { happy = false;lost++; }
    public void theywon() { happy = false; }
    public void theydrew() { happy = true; }
    public void theylost() { happy = true; }
    public boolean ishappy() { return happy; }
    public int ganhos() { return win; }
    public int empatados() { return drew; }
    public int perdidos() { return lost; }
    public int pontos() { return benfas.getscore(); }
}