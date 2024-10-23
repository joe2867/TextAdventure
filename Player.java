import java.util.*;

public class Player
{
  String name;
  int health;
  double gold;
  int monstersDefeated;

  public Player(String playerName, int startingHealth, double startingGold)
  {
    // ADD CODE HERE
  }

  public String getName()
  {
    return name;
  }

  public void changeName(String newName)
  {
    // ADD CODE HERE
    name = newName;
  }

  public int getHealth()
  {
    return health;
  }

  public void setHealth(int newHealth)
  {
    health = newHealth;
  }

  public double getGold()
  {
    return gold;
  }

  public void setGold(double newAmount)
  {
    // ADD CODE HERE
    gold += newAmount;
  }

  public int getMonstersDefeated()
  {
    return monstersDefeated;
  }

  public void defeatMonster()
  {
    // ADD CODE HERE
    monstersDefeated++;
  }
}