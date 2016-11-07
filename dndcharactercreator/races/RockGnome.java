/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from parent class Dwarf, which extends from superclass NoClass. */
public class RockGnome extends Dwarf
{
	/** Class variables. */
	private String[] racialBonus = {"Artificer's Lore", "Tinker"};
	
	public RockGnome(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +1 constitution bonus from racial modifier. */
		super(name, strength, dexterity, constitution + 1, intelligence, wisdom, charisma);
	}
	
	/**
	 * Returns the subrace's racial bonus.
	 * @return racialBonus
	 */
	public String[] getSubRacialBonus()
	{
		return racialBonus;
	}
}