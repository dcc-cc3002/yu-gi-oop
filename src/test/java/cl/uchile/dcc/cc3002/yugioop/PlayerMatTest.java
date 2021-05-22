/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop;

import cl.uchile.dcc.cc3002.yugioop.cards.Card;
import cl.uchile.dcc.cc3002.yugioop.cards.MagicCard;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.ExtraDeckMonsterCard;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MainDeckMonsterCard;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MonsterCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class PlayerMatTest {
  // The use of ``final static String`` means that the variable ``YUGI_NAME`` will not be changed,
  // we can think of it as a constant.
  private final static String YUGI_NAME = "Yugi";
  private final static String JUDAI_NAME = "Judai";
  private GameMat mat;
  private Player yugi;
  private Player judai;

  @BeforeEach
  void setUp() {
    // Note that we do not use a random generator for the names since here we are testing the
    // ``PlayerMat`` class, not the ``Player`` class.
    yugi = new Player(YUGI_NAME);
    judai = new Player(JUDAI_NAME);
    mat = new GameMat(yugi);
  }

  @Test
  void constructorTest() {
    // Basic construction of two equal objects
    var expectedMat = new GameMat(yugi);
    assertEquals(expectedMat, mat);
    assertEquals(expectedMat.hashCode(), mat.hashCode(), "Hashes don't match");
    var differentPlayerMat = new GameMat(judai);
    assertNotEquals(differentPlayerMat, mat,
                    mat.toString() + " should be different to " + differentPlayerMat.toString());
    // Check for initial conditions
    assertTrue(mat.getMonsters().isEmpty(),
               "Monster zone should be empty on creation, but was " + mat.getMonsters().toString());
    assertTrue(mat.getBackrow().isEmpty(),
               "Backrow should be empty on creation, but was " + mat.getBackrow().toString());
  }

  @Test
  void monsterZoneTest() {
    // We create an array of 6 cards; the monster zone should have __at most__ 5 cards.
    var monsters = new MonsterCard[]{
        new MainDeckMonsterCard("Armed Dragon LV3", 3, 1200, 900),
        new MainDeckMonsterCard("Armed Dragon LV5", 5, 2400, 1700),
        new MainDeckMonsterCard("Armed Dragon LV7", 7, 2800, 1000),
        new MainDeckMonsterCard("Armed Dragon LV10", 10, 3000, 2000),
        new ExtraDeckMonsterCard("Lightning Chidori", 4, 1900, 1600),
        new MainDeckMonsterCard("Armed Dragon Thunder LV3", 3, 1200, 900)};
    // We can safely cast the card parameter to `MonsterCard` since we know its type for sure
    addToZoneCheck(monsters, (card) -> mat.addMonster((MonsterCard) card), mat::getMonsters,
                   "monster zone");
  }

  @Test
  void backrowTest() {
    // We create an array of 6 cards; the monster zone should have __at most__ 5 cards.
    var backrow = new MagicCard[]{
        new MagicCard("After the Storm"), new MagicCard("Armed Dragon Blitz"),
        new MagicCard("Armed Dragon Lightning"), new MagicCard("Armed Dragon Flash"),
        new MagicCard("Cost Down"), new MagicCard("Creature Swap")};
    // We can safely cast the card parameter to `MagicCard` since we know its type for sure
    addToZoneCheck(backrow, (card) -> mat.addBackrow((MagicCard) card), mat::getBackrow, "backrow");
  }

  void addToZoneCheck(
      Card[] zone,
      // A consumer is a reference to a method that receives an argument and returns nothing.
      // In this case, it's a reference to a method that adds cards to the corresponding zone.
      Consumer<Card> adder,
      // A supplier is a reference to a method that receives no parameters and returns a value.
      // In this case, it's a reference to a method that retrieves the cards from the appropriate
      // zone.
      // The syntax `? extends Card` means that the supplier will return a value of a type that
      // inherits from `Card`.
      Supplier<List<? extends Card>> getter,
      String zoneName) {
    for (int i = 1, zoneLength = zone.length; i <= zoneLength; i++) {
      Card card = zone[i - 1];
      adder.accept(card);
      assertEquals(Math.min(i, 5), getter.get().size(),
                   "The number of cards in the " + zoneName + " is incorrect");
    }
  }
}
