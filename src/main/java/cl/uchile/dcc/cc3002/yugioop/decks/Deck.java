// "Yu-Gi-OOP!" (c) by Ignacio Slater M.
// "Yu-Gi-OOP!" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.

package cl.uchile.dcc.cc3002.yugioop.decks;

import cl.uchile.dcc.cc3002.yugioop.cards.AbstractCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Simple implementation of a generic deck.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Deck {

  private final ArrayList<AbstractCard> cards = new ArrayList<>();
  private final Random rng = new Random();

  public List<AbstractCard> getCards() {
    return List.copyOf(cards);
  }

  public void addCard(AbstractCard card) {
    cards.add(card);
  }

  public void shuffle() {
    Collections.shuffle(cards, rng);
  }
}

