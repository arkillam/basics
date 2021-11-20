package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Message Boards Module.</P>
 * 
 * <P>This object provides an array of quotes from various message boards.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_messageboards
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

public quotes_module_messageboards ()
{
	// create the array of entries
	entries = new ArrayList<String> (300);
	
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
public static ArrayList<String> add (ArrayList<String> array)
{
	// avoid errors 
	if (array == null) array = new ArrayList<String> ();

	array.add ("\"....dramatically shortened to suit the attention span of internet users\"\n- Caelis");
	array.add ("\"There, its fixed.....is everyone happy now? That is a rhetorical question becasue I don't really want to know.\"\n- Gary");
	array.add ("\"Just what IS an ass monkey?\"\n- Crimson Knight");
	array.add ("\"Always a bridesmaid, but never a bride. Boohoohoo.\"\n- Rodan");
	array.add ("\"Now that's a novel idea, paying to receive spam newsletters.\"\n- Grojlach");
	array.add ("\"Not when you think about it.  We were all monkeys once.  Dunii is just getting back to his roots.\"\n- Dante");
	array.add ("Gary:  \"I'm so excited I can barely keep it in my pants!\"\nCrimson Knight:  \"Please try harder to keep it there....\"");
	array.add ("\"Lets make a new title: Scapegoat of the month...and every month Dante is the winner.\"\n- Blorpo");
	array.add ("\"This is perhaps the most frightening thread I have ever been witness to.\"\n-Rasion Imajit");
	array.add ("\"AH! CUTE! KILL IT! DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE DIE!\"\n- Crimson Knight");
	array.add ("\"Ok Ranger and Slain you are on ban notice,  start saying good things about NWN or else.\"\n- Smoothbrain");
	array.add ("\"Hmm... I need to get laid.\"\n- Dunii, Ninja of the west");
	array.add ("Yeah, if you have random people entering your building unsupervised and plugging things into the network, you just *might* have a security problem, Dreamcast or no Dreamcast.  I would think much in the same way, a Dreamcast running linux can be used to seriously injure a person, but sneaking up on them and hitting them over the head with it, repeatedly. Of course that's not newsworthy, unless it's a Dreamcast running linux.\n- glwtta (a Slashdot poster)");	

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