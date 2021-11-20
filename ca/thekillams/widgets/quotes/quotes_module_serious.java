package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Serious Quotes Module.</P>
 * 
 * <P>This object provides an array of "serious" quotes.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_serious
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

public quotes_module_serious ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds "serious" quotes
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
	
	array.add ("The paths of glory lead but to the grave.\nThomas Gray, Elegy Written in a Country Churchyard");
	array.add ("The people who are regarded as moral luminaries are those who forego ordinary pleasures themselves and find compensation in interfering with the pleasures of others. - Bertrand Russell (1872 - 1970)");
	array.add ("The more I study religions the more I am convinced that man never worshipped anything but himself. - Sir Richard Francis Burton (1821 - 1890)");
	array.add ("It is the mark of an educated mind to be able to entertain a thought without accepting it. - Aristotle (384 BC - 322 BC)");
	array.add ("It has long been an axiom of mine that the little things are infinitely the most important. - Sir Arthur Conan Doyle (1859 - 1930), (Sherlock Holmes) A Case of Identity, 1892");
	array.add ("You can't have a military solution to a political problem.");
	array.add ("If I have seen further it is by standing on the shoulders of giants. - Sir Isaac Newton (1642 - 1727), Letter to Robert Hooke, February 5, 1675");
	array.add ("In matters of style, swim with the current; in matters of principle, stand like a rock. - Thomas Jefferson (1743 - 1826)");
	array.add ("All truths are easy to understand once they are discovered; the point is to discover them. - Galileo Galilei (1564 - 1642)");
	array.add ("My religion consists of a humble admiration of the illimitable superior spirit who reveals himself in the slight details we are able to perceive with our frail and feeble mind. - Albert Einstein (1879 - 1955)");
	array.add ("The time to repair the roof is when the sun is shining. - John F. Kennedy (1917 - 1963)");
	array.add ("Those who make peaceful revolution impossible will make violent revolution inevitable. - John F. Kennedy (1917 - 1963)");
	array.add ("\"If my future were black, it was better surely to face it like a man than attempt to brighten it by mere will-o'-the-wisps of the imagination.\" - Sir Arthur Conan Doyal (Dr. Watson, The Sign Of Four)");
	array.add ("\"It has long been an axiom of mine that the little things are infinitely the most important.\" - Sir Arthur Conan Doyle, (Sherlock Holmes) A Case of Identity, 1892");
	array.add ("\"Not everything that counts can be counted; not everything that can be counted, counts.\" - Albert Einstein");
	
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