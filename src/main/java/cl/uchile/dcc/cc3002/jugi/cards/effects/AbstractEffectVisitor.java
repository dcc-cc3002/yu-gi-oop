/*
 * "Ju-Gi-Oh" (c) by Ignacio Slater M.
 * "Ju-Gi-Oh" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.jugi.cards.effects;

import cl.uchile.dcc.cc3002.jugi.GameMat;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public abstract class AbstractEffectVisitor implements EffectVisitor {

  @Override
  public void visitMat(GameMat gameMat) {
    gameMat.getBackrow().forEach(card -> card.accept(this));
    gameMat.getMonsters().forEach(card -> card.accept(this));
  }
}
