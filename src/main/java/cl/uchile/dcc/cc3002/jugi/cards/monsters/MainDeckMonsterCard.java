package cl.uchile.dcc.cc3002.jugi.cards.monsters;

import java.util.Objects;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class MainDeckMonsterCard extends AbstractMonsterCard {
  public MainDeckMonsterCard(String name, int level, int attack, int defense) {
    super(name, level, attack, defense);
  }

  @Override
  public MainDeckMonsterCard copy() {
    return new MainDeckMonsterCard(name, level, attack, defense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ExtraDeckMonsterCard.class, name, level, attack, defense);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof MainDeckMonsterCard) {
      var other = (MainDeckMonsterCard) obj;
      return name.equals(other.getName()) && level == other.level && attack == other.attack
             && defense == other.defense;
    }
    return false;
  }
}
