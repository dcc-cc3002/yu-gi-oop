/*
 * "yu-gi-oop" (c) by Ignacio Slater M.
 * "yu-gi-oop" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.cc3002.yugioop;

import cl.uchile.dcc.cc3002.yugioop.cards.backrow.BackrowCard;
import cl.uchile.dcc.cc3002.yugioop.cards.monsters.MonsterCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * The mat in which the cards are played.
 * <p>
 * In the game, each player will have 1 mat.
 *
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class GameMat implements GameEntity {
  private final Player player;
  private final List<MonsterCard> monsters = new ArrayList<>();
  private final List<BackrowCard> backrow = new ArrayList<>();

  public GameMat(Player player) {
    this.player = player;
  }

  @Override
  public int hashCode() {
    return Objects.hash(GameMat.class, player);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof GameMat) {
      // Since we know ``obj`` is an instance of ``GameMat`` we can apply casting without problems;
      // this is know as _safe casting_.
      var other = (GameMat) obj;
      return player.equals(other.player);
    }
    // We are not testing this line since ``GameMat`` has no parent (beside object) so there's no
    // ambiguity in its type (see: cards.MagicCard#equals).
    return false;
  }

  @Override
  public String toString() {
    return "PlayerMat{\n\t" + player.toString() + ",\n\t" + monsters.toString() + ",\n\t"
           + backrow.toString() + "\n}";
  }

  /**
   * Returns a copy of the cards on the monster zone.
   */
  public List<MonsterCard> getMonsters() {
    // We create a new list containing a copy of each card in the monster zone
    return monsters.stream()  // We create a stream of all cards in the monster zone
                   .map(MonsterCard::copy)  // We apply the copy function to each card on the stream
                   // We collect the results into a new ArrayList
                   .collect(Collectors.toCollection(ArrayList::new));
  }

  /**
   * Returns a copy of the cards on the spell/trap zone (backrow).
   */
  public List<BackrowCard> getBackrow() {
    // We create a new list containing a copy of each card in the backrow
    return backrow.stream()
                  .map(BackrowCard::copy)
                  .collect(Collectors.toCollection(ArrayList::new));
  }

  /**
   * Adds a monster card to the monster zone.
   *
   * @param monster the card to be added
   */
  public void addMonster(MonsterCard monster) {
    if (monsters.size() < 5) {
      monsters.add(monster);
    }
  }

  /**
   * Adds a card to the spell/trap zone.
   *
   * @param card
   *    the card to be added.
   */
  public void addBackrow(BackrowCard card) {
    if (backrow.size() < 5) {
      backrow.add(card);
    }
  }

  public String asString(int indent) {
    return "GameMat{\n"
           + " ".repeat(indent + 2) + "monsters: []\n"
           + " ".repeat(indent + 2) + "spells: []\n"
           + " ".repeat(indent) + "}";
  }
}
