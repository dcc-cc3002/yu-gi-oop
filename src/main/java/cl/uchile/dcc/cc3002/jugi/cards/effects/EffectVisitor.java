
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
public interface EffectVisitor {

  void visitPlayer(Player player);

  void visitMat(GameMat gameMat);

  void visitMagicCard(MagicCard magicCard);
}