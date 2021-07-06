/*
 * "Ju-Gi-Oh" (c) by Ignacio Slater M.
 * "Ju-Gi-Oh" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.jugi.cards.effects;

import cl.uchile.dcc.cc3002.jugi.GameMat;
import cl.uchile.dcc.cc3002.jugi.Player;
import cl.uchile.dcc.cc3002.jugi.cards.backrow.MagicCard;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class IncreaseLPVisitor implements EffectVisitor {

  private int amount;

  @Override
  public void visitPlayer(Player player) {
    player.setLifePoints(player.getLifePoints() + amount);
  }

  @Override
  public void visitMat(GameMat gameMat) {

  }

  @Override
  public void visitMagicCard(MagicCard magicCard) {

  }

  public void setAmount(int amount) {
    this.amount = amount;
  }
}
