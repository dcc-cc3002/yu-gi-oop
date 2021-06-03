/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop.summon;

import cl.uchile.dcc.cc3002.yugioop.Player;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MonsterCard;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class NormalSummon extends AbstractSummon {

  @Override
  public void applyConditions(MonsterCard card, Player player) { }

  @Override
  public boolean checkConditions(MonsterCard card, Player player) {
    return true;
  }
}
