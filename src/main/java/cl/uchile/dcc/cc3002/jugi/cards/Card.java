package cl.uchile.dcc.cc3002.jugi.cards;

import cl.uchile.dcc.cc3002.jugi.cards.effects.AbstractEffectVisitor;
import cl.uchile.dcc.cc3002.jugi.cards.effects.EffectVisitor;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public interface Card {

  String getName();

  Card copy();

  void accept(EffectVisitor visitor);
}
