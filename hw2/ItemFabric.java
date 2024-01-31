package hw2;

public abstract class ItemFabric {
  public void openRewgard(){
      iFactoryItem gameItem = createFactory();

      gameItem.open();
  }

  public abstract iFactoryItem createFactory();
}