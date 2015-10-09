public class Account {
    private int saldo;
    private static final int FINE = 2;
    public Account(int saldo) { this.saldo = saldo; } 
    public Account() { saldo = 0;}
    public double getBalance() { return saldo; }
    public void deposit (int amount) { saldo = saldo + amount; }
    public void withDraw (int amount) {
        if ( amount >= saldo)
            saldo = saldo - amount;
        else
            saldo = saldo - FINE;
    }
    public boolean redZone() { return saldo < 0; }
    public int computeInterest() {
        float taxa;
        if ( saldo <= 2000 )
            taxa = 0.01f;
        else if ( saldo <= 1000 )
            taxa = 0.02f;
        else
            taxa  = 0.03f;
        return (Math.round( saldo * taxa ));
    }        
    public void applyIntesert() {
        saldo = saldo + this.computeInterest();
    }    
}    
