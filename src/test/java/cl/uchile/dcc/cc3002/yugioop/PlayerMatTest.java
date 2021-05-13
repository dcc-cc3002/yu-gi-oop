/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class PlayerMatTest {
  private GameMat mat;

  @BeforeEach
  void setUp() {
    mat = new GameMat();
  }

  @Test
  void constructorTest() {
    var expectedMat = new GameMat();
    assertEquals(expectedMat, mat);
    assertEquals(expectedMat.hashCode(), mat.hashCode(), "Hashes don't match");
  }
}
