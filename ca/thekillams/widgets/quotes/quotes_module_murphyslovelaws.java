package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Murphy's Love Laws Module.</P>
 * 
 * <P>This object provides an array of Murphy's Love Laws.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_murphyslovelaws
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

public quotes_module_murphyslovelaws ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Murphy's Love Laws
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

	array.add ("All the good ones are taken.\nCorollary:  If the person isn't taken, there's a reason.\n- Murphy's Love Laws");
	array.add ("The nicer someone is, the farther away (s)he is from you.\n- Murphy's Love Laws");
	array.add ("Brains x Beauty x Availability = Constant.\n- Murphy's Love Laws");
	array.add ("The amount of love someone feels for you is inversely proportional to how much you love them.\n- Murphy's Love Laws");
	array.add ("Money can't buy love, but it sure gets you a great bargaining position.\n- Murphy's Love Laws");
	array.add ("The best things in the world are free --- and worth every penny of it.\n- Murphy's Love Laws");
	array.add ("Every kind action has a not-so-kind reaction.\n- Murphy's Love Laws");
	array.add ("Nice guys(girls) finish last.\n- Murphy's Love Laws");
	array.add ("If it seems too good to be true, it probably is.\n- Murphy's Love Laws");
	array.add ("Availability is a function of time. The minute you get interested is the minute they find someone else.\n- Murphy's Love Laws");
	
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