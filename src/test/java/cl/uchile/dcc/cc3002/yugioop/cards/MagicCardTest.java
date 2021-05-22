package cl.uchile.dcc.cc3002.yugioop.cards;

import cl.uchile.dcc.cc3002.yugioop.AbstractNamedElementTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
class MagicCardTest extends AbstractNamedElementTest<MagicCard> {
  private MagicCard card;

  @BeforeEach
  void setUp() {
    initParams();
    card = new MagicCard(name);
  }

  @Test
  void constructorTest() {
    var expectedCard = new MagicCard(name);
    checkEquality(expectedCard, card);
    var differentCardName = new MagicCard(getDifferentName());
    checkDifferentName(differentCardName, card);
  }
}