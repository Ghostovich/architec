package hw2;

public class GoldGenerator extends ItemFabric{
  @Override
  public iFactoryItem createFactory() {
      System.out.println("Выпустили авто");
      return new Car();
  }
}