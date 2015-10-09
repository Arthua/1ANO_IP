public class counter{
   private int num;
   public counter () { num = 0; }
   public void inc() { num = num + 1; }
   public void dec() { num = num - 1; }
   public void reset() { num = 0; }
   public int status() { return num; }
}
