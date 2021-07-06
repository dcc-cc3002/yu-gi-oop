package cl.uchile.dcc.cc3002.jugi;

import cl.uchile.dcc.cc3002.jugi.cards.effects.EffectVisitor;

import java.util.Objects;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Player implements GameEntity {
  private final GameMat mat = new GameMat(this);
  private final String name;
  private int lifePoints = 8000;

  public Player(String name) {
    this.name = name;
  }

  // region : -- VISITOR PATTERN --
  public void accept(EffectVisitor visitor) {
    visitor.visitPlayer(this);
  }
  // endregion

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
    return this.asString(0);
  }

  public int getLifePoints() {
    return lifePoints;
  }

  public void setLifePoints(int lp) {
    this.lifePoints = lp;
  }

  @Override
  public String asString(int indent) {
    return " ".repeat(indent) + "Player{\n"
           + " ".repeat(indent + 2) + "Name: " + name + "\n"
           + " ".repeat(indent + 2) + "Life points: " + lifePoints + "\n"
           + mat.asString(indent + 2) + "\n"
           + "}";
  }

  public void draw(int cards) {

  }
}
