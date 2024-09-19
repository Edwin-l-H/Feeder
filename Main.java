public class Main
{
  public static void main(String[] args)
    {
        Feeder f = new Feeder();
        Feeder g = new Feeder(500);
        Feeder h = new Feeder(1000);
        Feeder i = new Feeder(100);
        i.simulateOneDay(1);

        System.out.println(f);
        

        
        
    }
    
}
