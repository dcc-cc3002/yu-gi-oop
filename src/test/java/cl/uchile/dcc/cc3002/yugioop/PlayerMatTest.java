/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop;

import cl.uchile.dcc.cc3002.yugioop.cards.monsters.ExtraDeckMonsterCard;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MainDeckMonsterCard;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MonsterCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class PlayerMatTest {
  private final static String YUGI_NAME = "Yugi";
  private final static String JUDAI_NAME = "Judai";
  private GameMat mat;
  private Player yugi;
  private Player judai;

  @BeforeEach
  void setUp() {
    yugi = new Player(YUGI_NAME);
    judai = new Player(JUDAI_NAME);
    mat = new GameMat(yugi);
  }

  @Test
  void constructorTest() {
    var expectedMat = new GameMat(yugi);
    assertEquals(expectedMat, mat);
    assertEquals(expectedMat.hashCode(), mat.hashCode(), "Hashes don't match");
    var differentPlayerMat = new GameMat(judai);
    assertNotEquals(differentPlayerMat, mat,
                    mat.toString() + " should be different to " + differentPlayerMat.toString());

    assertTrue(mat.getMonsters().isEmpty(),
               "Monster zone should be empty on creation, but was " + mat.getMonsters().toString());
    assertTrue(mat.getBackrow().isEmpty(),
               "Backrow should be empty on creation, but was " + mat.getBackrow().toString());
  }

  @Test
  void monsterZoneTest() {
    var monsters = new MonsterCard[]{
        new MainDeckMonsterCard("Armed Dragon LV3", 3, 1200, 900),
        new MainDeckMonsterCard("Armed Dragon LV5", 5, 2400, 1700),
        new MainDeckMonsterCard("Armed Dragon LV7", 7, 2800, 1000),
        new MainDeckMonsterCard("Armed Dragon LV10", 10, 3000, 2000),
        new ExtraDeckMonsterCard("Lightning Chidori", 4, 1900, 1600),
        new MainDeckMonsterCard("Armed Dragon Thunder LV3", 3, 1200, 900)};
    for (int i = 1, monstersLength = monsters.length; i <= monstersLength; i++) {
      MonsterCard monster = monsters[i - 1];
      mat.addMonster(monster);
      assertEquals(Math.min(i, 5), mat.getMonsters().size(),
                   "The number of cards in the monster zone is incorrect");
    }
  }
}
