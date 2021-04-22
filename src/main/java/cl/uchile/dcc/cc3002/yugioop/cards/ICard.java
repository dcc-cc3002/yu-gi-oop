package cl.uchile.dcc.cc3002.yugioop.cards;

/**
 * @author <a href=mailto:ignacio.slater@ug.uchile.cl>Ignacio Slater Muñoz</a>
 */
public interface ICard {

  String getName();

  AbstractCard copy();
}
