package cl.uchile.dcc.cc3002.yugioop.cards.monsters;

import cl.uchile.dcc.cc3002.yugioop.cards.Card;

import java.util.Objects;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class ExtraDeckMonsterCard extends AbstractMonsterCard {
  public ExtraDeckMonsterCard(String name, int level, int attack, int defense) {
    super(name, level, attack, defense);
  }

  @Override
  public ExtraDeckMonsterCard copy() {
    return new ExtraDeckMonsterCard(name, level, attack, defense);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ExtraDeckMonsterCard.class, name, level, attack, defense);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ExtraDeckMonsterCard) {
      var other = (ExtraDeckMonsterCard) obj;
      return name.equals(other.getName()) && level == other.level && attack == other.attack
             && defense == other.defense;
    }
    return false;
  }
}
