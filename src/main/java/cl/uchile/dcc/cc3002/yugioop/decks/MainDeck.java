// "Yu-Gi-OOP!" (c) by Ignacio Slater M.
// "Yu-Gi-OOP!" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
package cl.uchile.dcc.cc3002.yugioop.decks;

import cl.uchile.dcc.cc3002.yugioop.cards.Card;
import cl.uchile.dcc.cc3002.yugioop.cards.MagicCard;
import cl.uchile.dcc.cc3002.yugioop.cards.MonsterCard;

/**
 * Simple implementation of the <i>Main deck</i> from the <i>Yu-Gi-Oh!</i> game.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class MainDeck extends Deck {

  /**
   * Constructor of the <i>Main deck</i>.
   */
  public MainDeck() {
    // Here we call the constructor of the superclass and impose that the `model.cards` array
    // will be of size 60 (and won't change)
    super(new Card[60]);
    System.out.println("Called 'MainDeck' class' constructor");
    // The array is allocated but empty, so we need to fill it with values
    for (int i = 0; i < 60; i++) {
      if (i % 2 == 0) {
        setCardAt(i, new MagicCard(
            "Magic card " + i));
      } else {
        setCardAt(i, new MonsterCard(
            "Monster card " + i, 4, 1200, 1600));
      }
    }
  }
}
