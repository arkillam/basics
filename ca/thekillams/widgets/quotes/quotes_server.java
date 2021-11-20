package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server.</P>
 * 
 * <P>This object provides random quotes.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_server
{
	
//////////////////////////////////////////////////////////////////////////////////////////////////
// private objects
//////////////////////////////////////////////////////////////////////////////////////////////////

/** the array of quotes */
private ArrayList						quotes = null;

//////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  The default constructor.
 * 
 * @since	2.0
 */

public quotes_server ()
{
	// create the array
	quotes = new ArrayList (1000);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds quotes to the array
 * 
 * @param	array		an array of quotes to add to the existing supply
 * 
 * @return	the number of quotes now stored in the array
 * 
 * @since	2.0
 */

public int add (ArrayList array)
{
	// can't add a null object
	if (array == null) return -1;
	
	// can't add an empty array
	if (array.size () < 1) return -1;

	// add the quotes
	for (int i = 0; i < array.size (); i++)
	{
		quotes.add (array.get (i));
	}
	
	// return the size of the array	
	return quotes.size ();
}

/**  Retrieves a quote, to be used elsewhere.
 * 
 * @return	returns a quote
 * 
 * @since	1.0
 */
public String getQuote ()
{	
	// make sure the quote array exists
	if (quotes == null) return ("Error:  the quotes array has not been initialized!");
	
	// make sure it is not empty
	if (quotes.size () < 1) return ("Error:  the quotes array is empty!");
	
	// decide which quote to display
	int choice = ((int)(Math.random () * 10000)) % quotes.size ();
	
	// get the quote
	String quote = (String) (quotes.get (choice));
		
	// remove the quote from the array
	quotes.remove (choice);
	
	// return a quote, chosen at random
	return quote;
}

/**  Returns the number of quotes in the server.
 * 
 * @since	1.0
 */
public int size ()
{	
	// make sure the quote array exists
	if (quotes == null) return -1;
	
	// return a quote, chosen at random
	return quotes.size ();
}

}