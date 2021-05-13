// "Yu-Gi-OOP!" (c) by Ignacio Slater M.
// "Yu-Gi-OOP!" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
package cl.uchile.dcc.cc3002.yugioop.cards.monsters;

import cl.uchile.dcc.cc3002.yugioop.cards.AbstractCard;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public abstract class AbstractMonsterCard extends AbstractCard implements MonsterCard {
  protected int level;
  protected int attack;
  protected int defense;

  protected AbstractMonsterCard(String name, int level, int attack, int defense) {
    super(name);
    this.level = level;
    this.attack = attack;
    this.defense = defense;
  }
}
