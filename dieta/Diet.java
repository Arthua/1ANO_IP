public class Diet {
    private int incal,outcal,ref,exer;
    public Diet() {
        incal = 0;
        outcal = 0;
        ref = 0;
        exer = 0;
    }    
    public void eat (int c) {
        incal = incal + c;
        ref++;
    }    
    /* pre: c>0*/
    public void burn (int c) {
        outcal = outcal + c;
        exer++;
    }    
    public int eatTimes() { return ref; }
    public int butnTimes() { return exer; }
    public int balance() {
        return incal - outcal;
    }
    public boolean isBalanceNegative() { 
        return (incal - outcal) < 0;
    }    
    public float avaregeEatenCallories() {
        return (incal*1.0f)/ref;
    }
    public float avaregeButnCallories() {
        return (outcal*1.0f)/exer;
    }
}
