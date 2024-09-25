public class Main
{
  public static void main(String[] args)
    {
      Feeder t = new Feeder(1000);
      Feeder f = new Feeder(1000);

      f.simulateOneDay(4);
      


      Feeder k = new Feeder(0);
      System.out.println(k.simulateManyDays(10, 5));
    
      
        
    }
    
}
