
/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop.cards.monsters;

import cl.uchile.dcc.cc3002.yugioop.cards.Card;

/**
 * Interface comprising all types of monster cards on the game.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public interface MonsterCard extends Card {
  @Override
  MonsterCard copy();
}
