// "Yu-Gi-OOP!" (c) by Ignacio Slater M.
// "Yu-Gi-OOP!" is licensed under a
// Creative Commons Attribution 4.0 International License.
// You should have received a copy of the license along with this
// work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
package cl.uchile.dcc.cc3002.yugioop.cards;

import java.util.Objects;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public class MagicCard extends Card {

  public MagicCard(String name) {
    super(name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MagicCard)) {
      return false;
    }
    MagicCard magicCard = (MagicCard) o;
    return getName().equals(magicCard.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }

  @Override
  public MagicCard copy() {
    return new MagicCard(getName());
  }
}
