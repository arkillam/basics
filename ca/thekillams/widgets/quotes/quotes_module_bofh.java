package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Bastard Operator From Hell (BOFH) Module.
 * 
 * <P>This object provides an array of quotes from BOFH columns.
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_bofh
{
	
//////////////////////////////////////////////////////////////////////////////////////////////////
// private objects
//////////////////////////////////////////////////////////////////////////////////////////////////

private			ArrayList<String>				entries = null;					// the array of laws

//////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  The default constructor.
 * 
 * @since		1.0
 */

public quotes_module_bofh ()
{
	// create the array of entries
	entries = new ArrayList<String> (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds BOFH Quotes
 * 
 * @param	array		the array list to add the quotes too
 * 
 * @return	the array, with the new quotes added
 * 
 * @since	1.0
 */
public static ArrayList<String> add (ArrayList<String> array)
{
	// avoid errors 
	if (array == null) array = new ArrayList<String> ();
	
	array.add ("\"Managers are stack-based,\" I explain. \"Rule one is that they have, at most, a two-item stack limit. Mention a technical term and they'll push it onto their mental stack. Mention another, they push that up there as well. Mention yet another and they stack overload and reboot. That is, they think about what they're going to do after work, how sore their bum is, whether the marketing assistant knows her blouse is almost see-through, and so forth.\"\n- BOFH, 1998 Columns");
	
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