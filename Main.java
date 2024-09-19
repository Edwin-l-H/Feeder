public class Main
{
  public static void main(String[] args)
    {
        Feeder f = new Feeder();
        Feeder g = new Feeder(500);
        System.out.println(f);
        
        System.out.println(f.getCurrentFood());
        System.out.println(g.getCurrentFood());
    }
    
}
