public class BankAccount {
    private int saldo;
    public BankAccount() { saldo = 0; }
    public BankAccount( int valor_inicial ) { saldo = valor_inicial; }
    /*pre:value > 0*/
    public void deposit( int value )  { saldo = saldo + value; } 
    /*pre:value > 0*/
    public void withdraw ( int value ) { saldo = saldo - value; }
    public int getSaldo() { return saldo; }
    public boolean redZone() { return( saldo < 0); }
}
