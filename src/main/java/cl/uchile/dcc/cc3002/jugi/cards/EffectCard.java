
/*
 * "Ju-Gi-Oh" (c) by Ignacio Slater M.
 * "Ju-Gi-Oh" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.jugi.cards;

import cl.uchile.dcc.cc3002.jugi.GameEntity;
import org.jetbrains.annotations.NotNull;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public interface EffectCard extends Card {
  void useEffectOn(@NotNull GameEntity target);
}