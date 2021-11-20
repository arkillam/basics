package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Murphy's Sex Laws Module.</P>
 * 
 * <P>This object provides an array of Murphy's sex Laws.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_murphyssexlaws
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

public quotes_module_murphyssexlaws ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Murphy's Sex Laws
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
	
	array.add ("The more beautiful the woman is who loves you, the easier it is to leave her with no hard feelings.\n- Murphy's Sex Laws");
	array.add ("Nothing improves with age.\n- Murphy's Sex Laws");
	array.add ("No matter how many times you've had it, if it's offered take it, because it'll never be quite the same again.\n- Murphy's Sex Laws");
	array.add ("Sex has no calories.\n- Murphy's Sex Laws");
	array.add ("Sex takes up the least amount of time and causes the most amount of trouble.\n- Murphy's Sex Laws");
	array.add ("There is no remedy for sex but more sex.\n- Murphy's Sex Laws");
	array.add ("Sex appeal is 50% what you've got and 50% what people think you've got.\n- Murphy's Sex Laws");
	array.add ("No sex with anyone in the same office.\n- Murphy's Sex Laws");
	array.add ("Sex is like snow; you never know how many inches you are going to get or how long it is going to last.\n- Murphy's Sex Laws");
	array.add ("A man in the house is worth two in the street.\n- Murphy's Sex Laws");
	array.add ("If you get them by the balls, their hearts and minds will follow.\n- Murphy's Sex Laws");
	array.add ("Virginity can be cured.\n- Murphy's Sex Laws");
	array.add ("When a man's wife learns to understand him, she usually stops listening to him.\n- Murphy's Sex Laws");
	array.add ("Never sleep with anyone crazier than yourself.\n- Murphy's Sex Laws");
	array.add ("The qualities that most attract a woman to a man are usually the same ones she can't stand years later.\n- Murphy's Sex Laws");
	array.add ("Sex is dirty only if it's done right.\n- Murphy's Sex Laws");
	array.add ("It is always the wrong time of month.\n- Murphy's Sex Laws");
	array.add ("The best way to hold a man is in your arms.\n- Murphy's Sex Laws");
	array.add ("When the lights are out, all women are beautiful.\n- Murphy's Sex Laws");
	array.add ("Sex is hereditary. If your parents never had it, chances are you won't either.\n- Murphy's Sex Laws");
	array.add ("Sow your wild oats on Saturday night -- Then on Sunday pray for crop failure.\n- Murphy's Sex Laws");
	array.add ("The younger the better.\n- Murphy's Sex Laws");
	array.add ("The game of love is never called off on account of darkness.\n- Murphy's Sex Laws");
	array.add ("It was not the apple on the tree but the pair on the ground that caused the trouble in the garden.\n- Murphy's Sex Laws");
	array.add ("Sex discriminates against the shy and the ugly.\n- Murphy's Sex Laws");
	array.add ("Before you find your handsome prince, you've got to kiss a lot of frogs.\n- Murphy's Sex Laws");
	array.add ("There may be some things better than sex, and some things worse than sex.  But there is nothing exactly like it.\n- Murphy's Sex Laws");
	array.add ("Love your neighbor, but don't get caught.\n- Murphy's Sex Laws");
	array.add ("Love is a hole in the heart.\n- Murphy's Sex Laws");
	array.add ("If the effort that went in research on the female bosom had gone into our space program, we would now be running hot-dog stands on the moon.\n- Murphy's Sex Laws");
	array.add ("Love is a matter of chemistry, sex is a matter of physics.\n- Murphy's Sex Laws");
	array.add ("Do it only with the best.\n- Murphy's Sex Laws");
	array.add ("Sex is a three-letter word which needs some old-fashioned four-letter words to convey its full meaning.\n- Murphy's Sex Laws");
	array.add ("One good turn gets most of the blankets.\n- Murphy's Sex Laws");
	array.add ("You cannot produce a baby in one month by impregnating nine women.\n- Murphy's Sex Laws");
	array.add ("Love is the triumph of imagination over intelligence.\n- Murphy's Sex Laws");
	array.add ("It is better to have loved and lost than never to have loved at all.\n- Murphy's Sex Laws"); 
	array.add ("Thou shalt not commit adultery.....unless in the mood.\n- Murphy's Sex Laws");
	array.add ("Never lie down with a woman who's got more troubles than you.\n- Murphy's Sex Laws");
	array.add ("Abstain from wine, women, and song; mostly song.\n- Murphy's Sex Laws");
	array.add ("Never argue with a women when she's tired - or rested.\n- Murphy's Sex Laws"); 
	array.add ("A woman never forgets the men she could have had; a man, the women he couldn't.\n- Murphy's Sex Laws");
	array.add ("What matters is not the length of the wand, but the magic in the stick.\n- Murphy's Sex Laws");
	array.add ("It is better to be looked over than overlooked.\n- Murphy's Sex Laws");
	array.add ("Never say no.\n- Murphy's Sex Laws");
	array.add ("A man can be happy with any woman as long as he doesn't love her.\n- Murphy's Sex Laws");
	array.add ("Folks playing leapfrog must complete all jumps.\n- Murphy's Sex Laws");
	array.add ("Beauty is skin deep; ugly goes right to the bone.\n- Murphy's Sex Laws");
	array.add ("Never stand between a fire hydrant and a dog.\n- Murphy's Sex Laws");
	array.add ("A man is only a man, but a good bicycle is a ride.\n- Murphy's Sex Laws");
	array.add ("Love comes in spurts.\n- Murphy's Sex Laws");
	array.add ("The world does not revolve on an axis.\n- Murphy's Sex Laws"); 
	array.add ("Sex is one of the nine reasons for reincarnation; the other eight are unimportant.\n- Murphy's Sex Laws"); 
	array.add ("Smile, it makes people wonder what you are thinking.\n- Murphy's Sex Laws");
	array.add ("Don't do it if you can't keep it up.\n- Murphy's Sex Laws");
	array.add ("There is no difference between a wise man and a fool when they fall in love.\n- Murphy's Sex Laws");
	array.add ("Never go to bed mad, stay up and fight.\n- Murphy's Sex Laws");
	array.add ("Love is the delusion that one woman differs from another.\n- Murphy's Sex Laws");
	array.add ("\"This won't hurt, I promise.\"\n- Murphy's Sex Laws");	

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