/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop.cards.monsters;

import cl.uchile.dcc.cc3002.yugioop.AbstractNamedElementTest;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.AbstractMonsterCardTest;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MainDeckMonsterCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class MainDeckMonsterCardTest extends AbstractMonsterCardTest<MainDeckMonsterCard> {
  private MainDeckMonsterCard card;

  @BeforeEach
  void setUp() {
    initParams();
    card = new MainDeckMonsterCard(name, level, attack, defense);
  }

  @RepeatedTest(16)
  void constructorTest() {
    var expectedCard = new MainDeckMonsterCard(name, level, attack, defense);
    checkEquality(expectedCard, card);
    var differentCardName = new MainDeckMonsterCard(getDifferentName(), level, attack, defense);
    checkDifferentName(differentCardName, card);
    var differentLevelCard =
        new MainDeckMonsterCard(name, getDifferentInt(level, 1, 12), attack, defense);
    assertNotEquals(differentLevelCard, card);
    var differentAttackCard =
        new MainDeckMonsterCard(name, level, getDifferentInt(attack, 0, 5000), defense);
    assertNotEquals(differentAttackCard, card);
    var differentDefenseCard =
        new MainDeckMonsterCard(name, level, attack, getDifferentInt(defense, 0, 5000));
    assertNotEquals(differentDefenseCard, card);
  }

}
