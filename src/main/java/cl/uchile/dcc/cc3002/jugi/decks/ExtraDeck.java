// "Yu-Gi-OOP!" (c) by Ignacio Slater M.
// "Yu-Gi-OOP!" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
package cl.uchile.dcc.cc3002.jugi.decks;

/**
 * Simple implementation of the <i>Extra deck</i> from the <i>Yu-Gi-Oh!</i> game.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class ExtraDeck extends Deck {

  /**
   * Prints the model.cards of the deck to stdout.
   * <p>
   * This method is specific to the class {@link ExtraDeck}.
   * Neither {@link Deck} nor {@link MainDeck} can be {@code show}ed.
   */
  public void show() {
    System.out.println(getCards());
  }
}