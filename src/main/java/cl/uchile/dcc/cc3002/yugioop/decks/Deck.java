// "Yu-Gi-OOP!" (c) by Ignacio Slater M.
// "Yu-Gi-OOP!" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.

package cl.uchile.dcc.cc3002.yugioop.decks;

import cl.uchile.dcc.cc3002.yugioop.cards.Card;

import java.util.Random;

/**
 * Simple implementation of a generic deck.
 * <p>
 * This code is meant to be used as an example of basic <i>Java</i> syntax.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class Deck {

  private final Card[] cards; // For simplicity, cards are represented as a String array
  private final Random rng = new Random();

  /**
   * Creates a new deck using an array of cards.
   */
  public Deck(Card[] cards) {
    System.out.println("Called 'Deck' class' constructor");
    this.cards = cards;
  }

  public Card[] getCards() {
    Card[] cardsCopy =
        new Card[cards.length];
    System.arraycopy(cards, 0,
                     cardsCopy, 0, cards.length);
    return cardsCopy;
  }

  protected void setCardAt(int index, Card card) {
    cards[index] = card;
  }

  public void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      int swapIdx = rng.nextInt(cards.length);
      Card tmp = cards[swapIdx];
      cards[swapIdx] = cards[i];
      cards[i] = tmp;
    }
  }
}

