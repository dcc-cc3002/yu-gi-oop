/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop.cards.factories;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public abstract class AbstractMonsterCardFactory implements MonsterCardFactory {
  protected String name;
  private int level;
  private int attack;
  private int defense;

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setLevel(int level) {
    this.level = level;
  }

  @Override
  public void setAttack(int attack) {
    this.attack = attack;
  }

  @Override
  public void setDefense(int defense) {
    this.defense = defense;
  }
}
