package cl.uchile.dcc.cc3002.yugioop;

import java.util.Objects;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Player {
  private final String name;
  private int lifePoints = 8000;

  public Player(String name) {
    this.name = name;
  }

  @Override
  public int hashCode() {
    return Objects.hash(Player.class);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Player) {
      var o = (Player) obj;
      return o.name.equals(this.name);
    }
    return false;
  }

  @Override
  public String toString() {
    return "Player{name=" + name + '}';
  }

  public int getLifePoints() {
    return lifePoints;
  }

  public void setLifePoints(int lp) {
    this.lifePoints = lp;
  }
}
