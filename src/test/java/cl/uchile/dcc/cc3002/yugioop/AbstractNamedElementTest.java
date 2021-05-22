/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public abstract class AbstractNamedElementTest<T> {
  protected String name;
  protected int seed;
  protected Random rng;

  protected void initParams() {
    seed = new Random().nextInt();
    rng = new Random(seed);
    int strSize = rng.nextInt(20);
    name = RandomStringUtils.random(strSize, 0, Character.MAX_CODE_POINT, true, false, null, rng);
  }

  protected void checkEquality(T expected, T actual) {
    assertEquals(expected, actual);
    assertEquals(expected.hashCode(), actual.hashCode(),
                 "The hash of: " + expected.toString() + " doesn't match the hash of: "
                 + actual.toString());

  }

  protected void checkDifferentName(T differentName, T actual) {
    assertNotEquals(differentName, actual,
                    differentName.toString() + " should be different to " + actual.toString());
  }

  protected String getDifferentName() {
    String differentName;
    do {
      differentName =
          RandomStringUtils.random(rng.nextInt(20), 0, Character.MAX_CODE_POINT, true, false, null,
                                   rng);
    } while (differentName.equals(name));
    return differentName;
  }
}
