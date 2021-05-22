package cl.uchile.dcc.cc3002.yugioop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class PlayerTest extends AbstractNamedElementTest<Player> {
  private Player player;

  @BeforeEach
  void setUp() {
    initParams();
    player = new Player(name);
  }

  @RepeatedTest(20)
  void constructorTest() {
    var expectedPlayer = new Player(name);
    checkEquality(expectedPlayer, player);
    var differentNamePlayer = new Player(getDifferentName());
    checkDifferentName(differentNamePlayer, player);
  }

  @RepeatedTest(20)
  void lifePointsTest() {
    assertEquals(8000, player.getLifePoints(), "Life points don't match. Seed: " + seed);
    int newLifePoints = rng.nextInt(10_000);
    player.setLifePoints(newLifePoints);
    assertEquals(newLifePoints, player.getLifePoints(), "Life points don't match. Seed: " + seed);
  }
}
