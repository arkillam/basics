package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Murphy's Laws Module.</P>
 * 
 * <P>This object provides an array of Murphy's Laws.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_murphyslaws
{
	
//////////////////////////////////////////////////////////////////////////////////////////////////
// private objects
//////////////////////////////////////////////////////////////////////////////////////////////////

private			ArrayList				entries = null;					// the array of laws

//////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  The default constructor.
 * 
 * @since		1.0
 */

public quotes_module_murphyslaws ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Murphy's Laws
 * 
 * @param	array		the array list to add the quotes too
 * 
 * @return	the array, with the new quotes added
 * 
 * @since	1.0
 */
public static ArrayList add (ArrayList array)
{
	// avoid errors 
	if (array == null) array = new ArrayList ();
	
	array.add ("Nothing is as easy as it looks.- Murphy's Laws");
	array.add ("Everything takes longer than you think.- Murphy's Laws");
	array.add ("Anything that can go wrong will go wrong.- Murphy's Laws");
	array.add ("If there is a possibility of several things going wrong, the one that will cause the most damage will be the one to go wrong.Corollary: If there is a worse time for something to go wrong, it will happen then.- Murphy's Laws");
	array.add ("If anything simply cannot go wrong, it will anyway.- Murphy's Laws");
	array.add ("If you perceive that there are four possible ways in which a procedure can go wrong, and circumvent these, then a fifth way, unprepared for, will promptly develop.- Murphy's Laws");
	array.add ("Left to themselves, things tend to go from bad to worse.- Murphy's Laws");
	array.add ("If everything seems to be going well, you have obviously overlooked something.- Murphy's Laws");
	array.add ("Nature always sides with the hidden flaw.- Murphy's Laws");
	array.add ("Mother nature is a bitch.- Murphy's Laws");
	array.add ("It is impossible to make anything foolproof because fools are so ingenious.- Murphy's Laws"); 
	array.add ("Whenever you set out to do something, something else must be done first.- Murphy's Laws");
	array.add ("Every solution breeds new problems.- Murphy's Laws");	
	array.add ("Murphy's Law of Research:  Enough research will tend to support your theory.");
	array.add ("Murphy's Law of Copiers:  The legibility of a copy is inversely proportional to its importance.");
	array.add ("Murphy's Law of the Open Road:  When there is a very long road upon which there is a one-way bridge placed at random, and there are only two cars on that road, it follows that:(1) the two cars are going in opposite directions, and(2) they will always meet at the bridge.");
	array.add ("Murphy's Law of Thermodynamics:  Things get worse under pressure.");
	array.add ("The Murphy Philosophy:  Smile . . . tomorrow will be worse.");
	array.add ("Quantization Revision of Murphy's Laws:  Everything goes wrong all at once.");
	array.add ("Murphy's Constant:  Matter will be damaged in direct proportion to its value");
	array.add ("Left to themselves, things tend to go from bad to worse. - Murphy's Corollaries");
	array.add ("It is impossible to make anything foolproof because fools are so ingenious. - Murphy's Corollaries");
	array.add ("The chance of the bread falling with the buttered side down is directly proportional to the cost of the carpet. - Murphy's Corollaries");
	
	return array;
}

/**  Retrieves an entry.  Note:  this function can return the same entry more than once, as 
 * the entry is not removed after being returned.
 * 
 * @since	1.0
 */
public String getQuote ()
{	
	// make sure the quote array exists
	if (entries == null)
	{
		return ("Error:  array has not been initialized!");
	}
	
	// return a quote, chosen at random
	return (String) (entries.get (((int)(Math.random () * 10000)) % entries.size ()));
}

/**  Returns the number of quotes in the module.
 * 
 * @since	1.0
 */
public int size ()
{	
	// make sure the quote array exists
	if (entries == null) return 0;
	
	// return a quote, chosen at random
	return entries.size ();
}

}