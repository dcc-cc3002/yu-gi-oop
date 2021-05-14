package cl.uchile.dcc.cc3002.yugioop;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class PlayerTest {
  private Player player;
  private String name;
  private int seed;
  private Random rng;

  @BeforeEach
  void setUp() {
    seed = new Random().nextInt();
    rng = new Random(seed);
    int strSize = rng.nextInt(20);
    name = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
    player = new Player(name);
  }

  @RepeatedTest(20)
  void constructorTest() {
    var expectedPlayer = new Player(name);
    assertEquals(expectedPlayer, player);
    assertEquals(expectedPlayer.hashCode(), player.hashCode());
    String differentName;
    do {
      differentName =
          RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, false, null,
                                   rng);
    } while (differentName.equals(name));
    var differentNamePlayer = new Player(differentName);
    assertNotEquals(differentNamePlayer, player);
  }

  @RepeatedTest(20)
  void lifePointsTest() {
    assertEquals(8000, player.getLifePoints(), "Life points don't match. Seed: " + seed);
    int newLifePoints = rng.nextInt(10_000);
    player.setLifePoints(newLifePoints);
    assertEquals(newLifePoints, player.getLifePoints(), "Life points don't match. Seed: " + seed);
  }
}
