package P2;
public class Seafood extends Food {
  public Seafood()
  {
    super();
  }
  public Seafood(String name)
  {
    super(name);
  }
  public void prepare()
  {
    System.out.println("Peel the " + name);
  }
}
