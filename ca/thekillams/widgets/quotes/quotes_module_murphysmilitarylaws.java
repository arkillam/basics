package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Murphy's Military Laws Module.</P>
 * 
 * <P>This object provides an array of Murphy's military Laws.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_murphysmilitarylaws
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

public quotes_module_murphysmilitarylaws ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Murphy's Military Laws
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
	
	array.add ("Never share a foxhole with anyone braver than you are.\n- Murphy's Military Laws");
	array.add ("No battle plan ever survives contact with the enemy.\n- Murphy's Military Laws");
	array.add ("Friendly fire ain't.\n- Murphy's Military Laws");
	array.add ("The most dangerous thing in the combat zone is an officer with a map.\n- Murphy's Military Laws");
	array.add ("The problem with taking the easy way out is that the enemy has already mined it.\n- Murphy's Military Laws");
	array.add ("The buddy system is essential to your survival; it gives the enemy somebody else to shoot at.\n- Murphy's Military Laws");
	array.add ("The further you are in advance of your own positions, the more likely your artillery will shoot short.\n- Murphy's Military Laws");
	array.add ("Incoming fire has the right of way.\n- Murphy's Military Laws");
	array.add ("If your advance is going well, you are walking into an ambush.\n- Murphy's Military Laws");
	array.add ("The quartermaster has only two sizes, too large and too small.\n- Murphy's Military Laws");
	array.add ("If you really need an officer in a hurry, take a nap.\n- Murphy's Military Laws");
	array.add ("The only time suppressive fire works is when it is used on abandoned positions.\n- Murphy's Military Laws");
	array.add ("The only thing more accurate than incoming enemy fire is incoming friendly fire.\n- Murphy's Military Laws");
	array.add ("There is nothing more satisfying that having someone take a shot at you, and miss.\n- Murphy's Military Laws");
	array.add ("Don't be conspicuous. In the combat zone, it draws fire. Out of the combat zone, it draws sergeants.\n- Murphy's Military Laws");
	array.add ("If your sergeant can see you, so can the enemy.\n- Murphy's Military Laws");

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