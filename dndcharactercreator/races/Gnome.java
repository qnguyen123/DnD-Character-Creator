/**
 * @author Brandon Campbell
 * @version 1.0
 */
package dndcharactercreator.races;

/** Extends from superclass NoRace. */
public class Gnome extends NoRace
{
	/** Class variables. */
	private int speed = 25;
	private String size = "Small";
	private String[] languages = {"Common", "Gnomish"};
	private String[] racialBonus = {"Darkvision", "Gnome Cunning"};
	
	public Gnome(String name, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		/** +2 intelligence bonus from racial modifier. */
		super(name, strength, dexterity, constitution, intelligence + 2, wisdom, charisma);
	}
	
	/**
	 * Returns the speed of a dwarf.
	 * @return speed
	 */
	public int getSpeed()
	{
		return speed;
	}
	
	/**
	 * Returns an array of each racial bonus.
	 * @return racialBonus
	 */
	public String[] getRacialBonus()
	{
		return racialBonus;
	}
	
	/**
	 * Returns naturally known languages.
	 * @return languages
	 */
	public String[] getLanguages()
	{
		return languages;
	}
	
	/**
	 * Returns the size of a gnome.
	 * @return size
	 */
	public String getSize()
	{
		return size;
	}
}