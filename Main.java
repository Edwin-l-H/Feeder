public class Main
{
  public static void main(String[] args)
    {
      Feeder f = new Feeder();

      System.out.println(f);
      System.out.println(f.getCurrentFood());
      


      Feeder g = new Feeder(500);
      
      g.simulateOneDay(12);
      System.out.println(g.getCurrentFood());



      Feeder i = new Feeder(500);
      i.simulateOneDay(5);
      System.out.println(i);



      Feeder j = new Feeder(2500);
      j.simulateManyDays(10, 5);
      System.out.println(j);


      //Print new line
      System.out.println();


      Feeder k = new Feeder(500);
      System.out.println(k.simulateManyDays(5,10));

    

      Feeder t = new Feeder(0);
      System.out.println(t.simulateManyDays(100, 10));
    }
    
}
