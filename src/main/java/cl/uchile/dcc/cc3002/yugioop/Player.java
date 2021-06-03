package cl.uchile.dcc.cc3002.yugioop;

import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MonsterCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Player {
  private final String name;
  private int lifePoints = 8000;
  private GameMat mat;
  private final List<MonsterCard> selectedTributes = new ArrayList<>();

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

  public GameMat getMat() {
    return mat;
  }

  public List<MonsterCard> getSelectedTributes() {
    return selectedTributes;
  }
}
