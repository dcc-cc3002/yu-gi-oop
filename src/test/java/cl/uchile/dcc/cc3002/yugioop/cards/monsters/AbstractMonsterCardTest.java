/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop.cards.monsters;

import cl.uchile.dcc.cc3002.yugioop.AbstractNamedElementTest;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public abstract class AbstractMonsterCardTest<T extends MonsterCard>
    extends AbstractNamedElementTest<T> {
  protected int level;
  protected int attack;
  protected int defense;

  @Override
  protected void initParams() {
    super.initParams();
    level = rng.nextInt(12) + 1;
    attack = rng.nextInt(5000);
    defense = rng.nextInt(5000);
  }

  protected int getDifferentInt(int original, int lo, int hi) {
    int differentInt;
    do {
      differentInt = rng.nextInt(hi - lo) + lo;
    } while (differentInt == original);
    return differentInt;
  }
}
