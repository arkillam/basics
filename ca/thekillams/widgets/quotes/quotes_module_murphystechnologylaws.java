package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Murphy's Technology Laws Module.</P>
 * 
 * <P>This object provides an array of Murphy's technology Laws.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_murphystechnologylaws
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

public quotes_module_murphystechnologylaws ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Murphy's Technology Laws
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
	
	array.add ("You can never tell which way the train went by looking at the track. - Murphy's Technology Laws");
	array.add ("Logic is a systematic method of coming to the wrong conclusion with confidence. - Murphy's Technology Laws");
	array.add ("Whenever a system becomes completely defined, some damn fool discovers something which either abolishes the system or expands it beyond recognition. - Murphy's Technology Laws");
	array.add ("Technology is dominated by those who manage what they do not understand. - Murphy's Technology Laws");
	array.add ("If builders built buildings the way programmers wrote programs, then the first woodpecker that came along would destroy civilization. - Murphy's Technology Laws");
	array.add ("The opulence of the front office decor varies inversely with the fundamental solvency of the firm. - Murphy's Technology Laws");
	array.add ("The attention span of a computer is only as long as it electrical cord. - Murphy's Technology Laws");
	array.add ("An expert is one who knows more and more about less and less until he knows absolutely everything about nothing. - Murphy's Technology Laws");
	array.add ("Tell a man there are 300 billion stars in the universe and he'll believe you. Tell him a bench has wet paint on it and he'll have to touch to be sure. - Murphy's Technology Laws");
	array.add ("All great discoveries are made by mistake. - Murphy's Technology Laws");
	array.add ("Always draw your curves, then plot your reading. - Murphy's Technology Laws");
	array.add ("Nothing ever gets built on schedule or within budget. - Murphy's Technology Laws");
	array.add ("All's well that ends. - Murphy's Technology Laws");
	array.add ("A meeting is an event at which the minutes are kept and the hours are lost. - Murphy's Technology Laws");
	array.add ("The first myth of management is that it exists. - Murphy's Technology Laws");
	array.add ("A failure will not appear till a unit has passed final inspection. - Murphy's Technology Laws"); 
	array.add ("New systems generate new problems. - Murphy's Technology Laws");
	array.add ("To err is human, but to really foul things up requires a computer. - Murphy's Technology Laws");
	array.add ("We don't know one millionth of one percent about anything. - Murphy's Technology Laws");
	array.add ("Any given program, when running, is obsolete. - Murphy's Technology Laws");
	array.add ("Any sufficiently advanced technology is indistinguishable from magic. - Murphy's Technology Laws"); 
	array.add ("A computer makes as many mistakes in two seconds as 20 men working 20 years make. - Murphy's Technology Laws");
	array.add ("The faster a computer is, the faster it will reach a crashed state. - Murphy's Technology Laws");
	array.add ("Nothing motivates a man more than to see his boss putting in an honest day's work. - Murphy's Technology Laws");
	array.add ("Some people manage by the book, even though they don't know who wrote the book or even what book. - Murphy's Technology Laws");
	array.add ("The primary function of the design engineer is to make things difficult for the fabricator and impossible for the serviceman. - Murphy's Technology Laws");
	array.add ("To spot the expert, pick the one who predicts the job will take the longest and cost the most. - Murphy's Technology Laws");
	array.add ("After all is said and done, a hell of a lot more is said than done. - Murphy's Technology Laws");
	array.add ("Any circuit design must contain at least one part which is obsolete, two parts which are unobtainable and three parts which are still under development. - Murphy's Technology Laws");
	array.add ("A complex system that works is invariably found to have evolved from a simple system that works. - Murphy's Technology Laws");
	array.add ("If mathematically you end up with the incorrect answer, try multiplying by the page number. - Murphy's Technology Laws");
	array.add ("Computers are unreliable, but humans are even more unreliable. Any system which depends on human reliability is unreliable. - Murphy's Technology Laws");
	array.add ("Give all orders verbally. Never write anything down that might go into a \"Pearl Harbor File.\" - Murphy's Technology Laws");
	array.add ("Under the most rigorously controlled conditions of pressure, temperature, volume, humidity, and other variables the organism will do as it damn well pleases. - Murphy's Technology Laws");
	array.add ("If you can't understand it, it is intuitively obvious. - Murphy's Technology Laws");
	array.add ("The more cordial the buyer's secretary, the greater the odds that the competition already has the order. - Murphy's Technology Laws");
	array.add ("In designing any type of construction, no overall dimension can be totalled correctly after 4:30 p.m. on Friday. The correct total will become self-evident at 8:15 a.m. on Monday. - Murphy's Technology Laws");
	array.add ("Fill what's empty. Empty what's full. And scratch where it itches. - Murphy's Technology Laws");
	array.add ("All things are possible except skiing through a revolving door. - Murphy's Technology Laws");
	array.add ("The only perfect science is hind-sight. - Murphy's Technology Laws");
	array.add ("Work smarder and not harder and be careful of yor speling. - Murphy's Technology Laws");
	array.add ("If it's not in the computer, it doesn't exist. - Murphy's Technology Laws");
	array.add ("If an experiment works, something has gone wrong. - Murphy's Technology Laws");
	array.add ("When all else fails, read the instructions. - Murphy's Technology Laws");
	array.add ("If there is a possibility of several things going wrong the one that will cause the most damage will be the one to go wrong. - Murphy's Technology Laws");
	array.add ("Everything that goes up must come down. - Murphy's Technology Laws");
	array.add ("Any instrument when dropped will roll into the least accessible corner. - Murphy's Technology Laws");
	array.add ("Any simple theory will be worded in the most complicated way. - Murphy's Technology Laws");
	array.add ("Build a system that even a fool can use and only a fool will want to use it. - Murphy's Technology Laws");
	array.add ("The degree of technical competence is inversely proportional to the level of management. - Murphy's Technology Laws");
	array.add ("Any attempt to print Murphy's laws will jam the printer. - Murphy's Technology Laws");

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