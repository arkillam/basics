package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, George Carlin Module.</P>
 * 
 * <P>This object provides an array of quotes of George Carlin.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_georgecarlin
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

public quotes_module_georgecarlin ()
{
	// create the array of entries
	entries = new ArrayList<String> (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds George Carlin Quotes
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
	
	array.add ("George Carlin:  One tequila, two tequila, three tequila, floor.");
	array.add ("George Carlin:  Atheism is a non-prophet organization.");
	array.add ("George Carlin:  If man evolved from monkeys and apes, why do we still have monkeys and apes?");
	array.add ("George Carlin:  The main reason Santa is so jolly is because he knows where all the bad girls live.");
	array.add ("George Carlin:  I went to a bookstore and asked the saleswoman, \"Where's the self-help section?\" She said if she told me, it would defeat the purpose.");
	array.add ("George Carlin:  Could it be that all those trick-or-treaters wearing sheets aren't going as ghosts but as mattresses?");
	array.add ("George Carlin:  If a mute swears, does his mother wash his hands with soap?");
	array.add ("George Carlin:  If a man is standing in the middle of the forest speaking and there is no woman around to hear him...is he still wrong?");
	array.add ("George Carlin:  If someone with multiple personalities threatens to kill himself, is it considered a hostage situation?");
	array.add ("George Carlin:  Is there another word for synonym?");
	array.add ("George Carlin:  Isn't it a bit unnerving that doctors call what they do \"practice?\"");
	array.add ("George Carlin:  Where do forest rangers go to \"get away from it all?\"");
	array.add ("George Carlin:  What do you do when you see an endangered animal eating an endangered plant?");
	array.add ("George Carlin:  If a parsley farmer is sued, can they garnish his wages?");
	array.add ("George Carlin:  Would a fly without wings be called a walk?");
	array.add ("George Carlin:  Why do they lock gas station bathrooms? Are they afraid someone will clean them?");
	array.add ("George Carlin:  If a turtle doesn't have a shell, is he homeless or naked?");
	array.add ("George Carlin:  Why don't sheep shrink when it rains?");
	array.add ("George Carlin:  Can vegetarians eat animal crackers?");
	array.add ("George Carlin:  If the police arrest a mime, do they tell him he has the right to remain silent?");
	array.add ("George Carlin:  Why do they put Braille on the drive-through bank machines?");
	array.add ("George Carlin:  How do they get the deer to cross at that yellow road sign?");
	array.add ("George Carlin:  What was the best thing before sliced bread?");
	array.add ("George Carlin:  One nice thing about egotists: they don't talk about other people.");
	array.add ("George Carlin:  To be intoxicated is to feel sophisticated, but not be able to say it.");
	array.add ("George Carlin:  Never underestimate the power of stupid people in large groups.");
	array.add ("George Carlin:  The older you get, the better you realize you were.");
	array.add ("George Carlin:  Age is a very high price to pay for maturity.");
	array.add ("George Carlin:  Procrastination is the art of keeping up with yesterday.");
	array.add ("George Carlin:  Women like silent men, they think they're listening.");
	array.add ("George Carlin:  Men are from Earth, women are from Earth. Deal with it.");
	array.add ("George Carlin:  Give a man a fish and he will eat for a day. Teach him how to fish, and he will sit in a boat and drink beer all day.");
	array.add ("George Carlin:  Do pediatricians play miniature golf on Wednesdays?");
	array.add ("George Carlin:  Before they invented drawing boards, what did they go back to?");
	array.add ("George Carlin:  Do infants enjoy infancy as much as adults enjoy adultery?");
	array.add ("George Carlin:  If all the world is a stage, where is the audience sitting?");
	array.add ("George Carlin:  If one synchronized swimmer drowns, do the rest have to drown too?");
	array.add ("George Carlin:  If the #2 pencil is the most popular, why is it still #2?");
	array.add ("George Carlin:  If work is so terrific, how come they have to pay you to do it?");
	array.add ("George Carlin:  If you try to fail, and succeed, which have you done?");
	array.add ("George Carlin:  Why is it called tourist season if we can't shoot at them?");	
	
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