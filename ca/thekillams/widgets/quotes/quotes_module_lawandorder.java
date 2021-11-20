package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Law & Order Module.</P>
 * 
 * <P>This object provides an array of Law & Order quotes, mostly humourous in nature.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_lawandorder
{
	
//////////////////////////////////////////////////////////////////////////////////////////////////
// private objects
//////////////////////////////////////////////////////////////////////////////////////////////////

private			ArrayList<String>			entries = null;					// the array of laws

//////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  The default constructor.
 * 
 * @since		1.0
 */

public quotes_module_lawandorder ()
{
	// create the array of entries
	entries = new ArrayList<String> (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Law & Order Quotes
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
	
	// the character with the punchline gets credit (if you're looking for a quote in a section,
	// that's how to find it)
	
	// Claire Kincaid
	array.add ("Principal: \"We teach our girls to say no.\"\nClaire: \"What are you teaching the boys?\"\n- Law and Order");
	array.add ("\"What are you going to threaten me with? I'm a censured lawyer and you're barely a judge.\"\n- Claire Kincaid, Law and Order");
	array.add ("Jack: \"I don't think this is the time or the place for a full-blown debate about your latent feminism.\"\nClaire: \"It's not latent.\"\n- Law and Order");
	array.add ("Jack: \"There's no law against lying to a suspect.\"\nClaire: \"You probably miss the good old days before Miranda.\"\n- Law and Order");
	array.add ("\"There's a law - you pass the bar, gotta quit telling lawyer jokes.\"\n- Claire Kincaid, Law and Order");
	array.add ("\"Unfortunately, stupid's not against the law.\"\n- Claire Kincaid, Law and Order");
	array.add ("Jack: \"Men have a way of deluding themselves.\"\nClaire: \"I hope we're not talking from personal experience.\"\n- Law and Order");
	array.add ("\"It's a juggling act - pragmatism, idealism, cynicism.\"\n- Claire Kincaid, Law and Order");	
	
	// Don Cragen
	array.add ("\"What's less than square one?! Minus zippo? Negative bupkes?!\"\n- Don Cragen, Law and Order");
	array.add ("\"So we've got two stiffs with no murder weapon, and a bloody knife with no victim. Great.\"\n- Don Cragen, Law and Order");
	array.add ("\"Why don't we ask for the Russian army? They're not busy.\"\n- Don Cragen, Law and Order");
	array.add ("\"So he killed the girl, killed himself, and then threw the gun out the window.\"\n- Don Cragen, Law and Order");
	array.add ("\"The editor's on a high horse called the First Amendment.\"\n- Don Cragen, Law and Order");
	array.add ("\"Maybe by this time tomorrow you can come up with something better than ethnic slurs.\"\n- Don Cragen, Law and Order");	
	
	// Lennie Briscoe
	array.add ("Russian bride broker: \"You guys single?\"\nBriscoe: \"Yeah, three times.\"\n- Law and Order");
	array.add ("(leaving the room after interrogating a suspect):\n\"I'll pass your sentiments on up the food chain.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Briscoe [to homeless man]: \"You hear anything?\"\nMan: \"Yeah. St. Francis of Assisi told me to keep up the good work.\"\nBriscoe pats the man on the shoulder: \"Been there, pal.\"\n- Law and Order");
	array.add ("Logan: \"One of these days I'm going to pack up a Winnebago.\"\nBriscoe: \"And go where?\"\nLogan: \"Upstate,...New Hampshire.\"\nBriscoe: \"Right--I spent a year there one weekend.\"\n- Law and Order");	
	array.add ("Talent agent: \"The man has - had - a lot of energy. I, on the other hand, have a wife.\"\nBriscoe: \"My condolences.\"\n- Law and Order");
	array.add ("\"Great. if we knew who it was, we'd know who it was.\"\n- Lennie Briscoe, Law and Order");
	array.add ("(to Logan): \"You know, Mike, if I didn't already know you don't have kids, I'd know you don't have kids.\"\n- Lennie Briscoe, Law and Order");
	array.add ("School secretary: \"I'm sorry, I can't release the Harrigans' address. You'll have to see the headmaster.\"\nBrisoce: \"Miss, we're not asking for the questions to next week's algebra exam.\"\nSecretary: \"LCC protects the privacy of its students and their parents. It has done so for one hundred and thirty years. It's not up to me to change school policy.\"\nBriscoe: \"Well, our organization goes back even farther than that, and our policy includes such things as search warrants.\"\n- Law and Order");
	array.add ("Logan: \"Have you been studying explosives in your spare time?\"\nBriscoe: \"I worked on a similar case about the time you were born; a guy tried to kill his wife and blew up his cat.\"\n- Law and Order");
	array.add ("\"Some alibi--'I'm an extortionist, not an arsonist.'\"\n- Lennie Briscoe, Law and Order");
	array.add ("Logan: \"Now I know why I stayed single.\"\nBriscoe: \"I thought it was the quality time you spent with yourself.\"\n- Law and Order");
	array.add ("Crime scene technician: \"Last time we sifted a dumpster, the Investigating Officer got in here himself.\"\nBriscoe: \"That's facinating. I think you missed a spot over there.\"\n- Law and Order");
	array.add ("Van Buren: \"What about Dr. Hampton? Any man in her life?\"\nBriscoe: \"Yes, but his name is Fluffy and he's been neutered. Other than that, her social calendar is pretty light.\"\n- Law and Order");
	array.add ("Van Buren: \"What have you got?\"\nBriscoe: \"New evidence that May-December romances don't work.\"\n- Law and Order");
	array.add ("\"A bar where white guys make racist remarks? Can't be too many of those around.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Logan: \"Your kid's about 18, right? Well, you don't hear from her for a few days, what do you do?\"\nLennie: \"I hear from her, that's an occassion.\"\n- Law and Order");
	array.add ("\"Hey, guys, want to work off some donuts here?\"\n- Lennie Briscoe, Law and Order");
	array.add ("Shaw: \"What do you think you're doing?\"\nLennie: \"Our favorite thing. Steven Shaw, you're under arrest. . .\"\n- Law and Order");
	array.add ("Pool player: \"This is not a game of chance.\"\nLennie: \"Oh, you mean you didn't make anything on the break on purpose?\"\n- Law and Order");
	array.add ("\"Okay, everybody who's innocent can leave the room.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"My first marriage, our cleaning lady knew about the divorce before I did.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Officer: \"No sign of a struggle here.\"\nBriscoe: \"Except for the bullet hole in his head.\"\n- Law and Order");
	array.add ("\"Well, the state of New York commands us not to kill. I think that's also mentioned in the Bible somewhere.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Mike: \"He does all the work. Holbrook makes twice the money.\"\nLennie: \"That's called capitalism.\"\n- Law and Order");
	array.add ("\"That concludes the entertainment portion of our program.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"They pay me plenty to look like an idiot.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"My second wife always wanted a walk-in closet. Now I finally got one. Trouble is, I live in it.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Male prostitute: \"You married, Lennie?\"\nLennie: \"On and off.\"\n- Law and Order");
	array.add ("\"I've always said drinking alone is underrated.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"I'm too young to get married - and I'm a grandfather.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"I'm so glad we're finally done with O.J.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"Here's to wearing a badge, carrying a high-powered sidearm, and hopefully being right more often than we're wrong.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Curtis: \"What about motive?\"\nBriscoe: \"Hey, they were married, weren't they?\"\n- Law and Order");
	array.add ("\"Rey, I got news for you. All your advice is optional after the day they buy their first bra.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Briscoe: \"He's a white boy, early teens...\"\nHomeless Man: \"This him?\"\nBriscoe: \"No, that's my partner.\"\n- Law and Order");
	array.add ("Officer: \"We got six unmatched shoes, dozen panties, condoms by the bucketfull. . .\"\nBriscoe: \"Sounds like the back of my first car.\"	\n- Law and Order");
	array.add ("\"With friends like her to cover for me, I'd still be playing around on my first wife.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"If you were a married lawyer hanging out with strippers, would you use your real name? Well, maybe you would.\" (to Curtis)\n- Lennie Briscoe, Law and Order");
	array.add ("\"We're conducting a lawful investigation. You live with a rapist and murderer, you have to put up with a few minor inconvieneces.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"One of these days, you're going to have to show me how to play solitaire on this thing.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Rey: \"You ever pay for it, Lennie?\"\nLennie: \"I was married, wasn't I?\"\n- Law and Order");
	array.add ("\"That's right, keep on lying. You're going to be somebody's girlfriend in Attica.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"You're going to be doing your squatting and thrusting in Rikers.\" (ahem; those are weight-lifting exercises)\n- Lennie Briscoe, Law and Order");
	array.add ("Mike: \"The future Mrs. Briscoe?\"\nLennie: \"The future ex-Mrs. Briscoe.\"\n- Law and Order");
	array.add ("High-priced call girl: \"I'm a massage specialist.\"\nLennie: \"What part of the body do you, ah, specialize in?\"\n- Law and Order");
	array.add ("\"This is a great gift idea.\" (holds up knife)\n- Lennie Briscoe, Law and Order");
	array.add ("Barnett: \"You mean you fellas didn't stop to see the Falls?\"\nBriscoe: \"Nah, too painful. They remind me of my honeymoons.\"\n- Law and Order");
	array.add ("\"He confessed so fast, I thought I'd have him do the paperwork.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Rey (to Munch): \"John, John. . . perseverance - that's what makes a great detective.\"\nLennie: \"What makes a great detective is a great snitch.\"\n- Law and Order");
	array.add ("\"A straightforward divorce matter? That's a new one on me.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Lennie: \"I took about 5 minutes of calculus my freshman year. Then I dropped the class.\"\nGrad student: \"Too analytical?\"\nLennie: \"Too early - 8 a.m.\"\n- Law and Order");
	array.add ("Ricci: \"Roughly translated, 'when you skin your customer, leave some skin to grow so you can skin him again.'\"\nLennie: \"Motto of the plumber's union?\"\n- Law and Order");
	array.add ("Malone: \"You have a pain in the back, Detective, we can help you.\"\nLennie: \"Yeah, well, the pain I'm getting isn't in my back.\"\n- Law and Order");
	array.add ("Krasner: \"I sell used cars.\"\nLennie: \"Yeah, the trouble is the people who are using them aren't finished with them yet.\"\n- Law and Order");
	array.add ("\"I love it when they're stupid.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Perp (to Det. Ed Green): \"Bite me.\"\nLennie: \"Go ahead... bite 'im.\"\n- Law and Order");
	array.add ("Ed: \"The guy's a lawyer.\"\nLennie: \"I'll be in mourning for the next five minutes.\"\n- Law and Order");
	array.add ("Lawyer: \"You don't like my client very much, do you, Detective?\"\nLennie: \"I don't usually get along with murderers, no.\"\n- Law and Order");
	array.add ("\"Homework, huh? 'Biker Sluts Rock Vegas.' Must be the new math.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"All this evidence kind of takes the fun out of it.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Man: \"In the greater scheme of things, $30,000 really isn't a lot of money, Detective.\"\nLennie: \"Yeah, I know. That's what I'm going to have to live on when I retire.\"\n- Law and Order");
	array.add ("Elias Grace: \"Doesn't it feel great when you say what you feel?\"\nLennie: \"I tried that with my first wife.\"\n- Law and Order");
	array.add ("Lennie: \"You a Mets fan?\"\nMan: \"Is that a crime?\"\nLennie: \"Depends on the season.\"\n- Law and Order");
	array.add ("\"Clean head shot and he wasn't even an organ donor. Selfish bastard.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"It's the Sopranos. Makes 'em think they can get away with anything.\"\n- Lennie Briscoe, Law and Order");
	array.add ("Green: \"He's in the clear for both murders.\"\nBriscoe: \"Perfectly good suspect. I hate when that happens.\"\n- Law and Order");
	array.add ("\"We don't like it when people run, Angel. Kind of gets things off on the wrong foot.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"I love it when they don't have an alibi.\"\n- Lennie Briscoe, Law and Order");
	array.add ("\"Just once I'd like to make one of you bastards break the news to the parents.\"\n- Lennie Briscoe, Law and Order");
	
	// Mike Logan
	array.add ("\"Hey, FAX you!\"\n- Mike Logan, Law and Order");
	array.add ("\"So let me get this straight - you almost go home with this guy who photographs people in sadistic poses with chains - and you're *tempted* - but there's something about him you don't trust?\"\n- Mike Logan, Law and Order");
	array.add ("Greevey: \"You still dragging things home?\"\nLogan [gesturing hands as if breasts]: \"Hey, this one's REALLY smart.\"\n- Law and Order");
	array.add ("Pilefsky: \"You're bluffing!\"\nLogan: \"Yeah, we'd be real upset if something happened to a piece of crap like you.\"\n- Law and Order");
	array.add ("(Scene: police digging up NJ mob cemetery)\nStone: \"What have we got?\"\nLogan: \"Masucci's greatest hits.\"\n- Law and Order");
	array.add ("Olivet: \"Is it just me, or do you have a problem with all women who have triple digit IQs?\"\nLogan (with irresistible grin): \"You're the only one I know, Doc.\"\n- Law and Order");
	array.add ("\"Come on, who cares about the religion of the guy your wife is boffing?\"\n- Mike Logan, Law and Order");
	array.add ("Woman: \"You pray, you know the enemy of God.\"\nBriscoe: \"Oh...Satan...El Diablo?\"\nLogan: \"Great. Let's book 'im.\"\n- Law and Order");
	array.add ("Logan: \" .... and then he fills their minds with a bunch of crap.\"\nBriscoe: \"You sure it's crap?\"\nLogan: \"Hey, my mother used to hold a rosary in one hand while she beat the crap out me with the other. The next time I'm in a church, six of my closest buddies will be carrying me.\"\n- Law and Order");
	array.add ("\"Let's give this one to Profaci and give him something to do besides the donut run.\"\n- Mike Logan, Law and Order");
	array.add ("Briscoe: \"Hey, if I open an account over there, I get free checking and a toaster.\"\nLogan: \"A two slice or a four slice?\"\nBriscoe: \"Four slice. And if I deposit 50 grand, I get a vcr.\"\nLogan: \"Hey, if you deposit 50 grand, I'm calling Internal Affairs.\"\n- Law and Order");
	array.add ("Logan to Gastin after Gastin said he took Chappel's promises to finish the project at face value:\n\"You'd be very popular at our weekly poker games.\"\n- Law and Order");
	array.add ("Greevey: \"Do you think a lot of cops are gay?\"\nLogan: \"No way, man. The Department's got a special test. They look you in the eye, and if your left eye blinks before your right eye, they know you're gay.\" [winks with left eye]\n\n- Law and Order");
	array.add ("Greevey: \"How many times would you go out with her before you went to bed with her?\"\nLogan: \"Once.\"\n- Law and Order");
	array.add ("\"Max, that really frosts my cookies.\"\n- Mike Logan, Law and Order");
	array.add ("Greevey: \"You still dragging things home?\"\nLogan [gesturing hands as if breasts]: \"Hey, this one's REALLY smart.\"\n- Law and Order");
	array.add ("Greevey: \"I don't want to see this guy without backup.\"\nLogan: \"I don't want to see him without nuclear weapons!\"\n- Law and Order");
	array.add ("Phil: \"The DMV says there are 24,000 Mercedes in the city. Did we miss something in the go-go 80s?\"\nLogan: \"Speak for yourself, big daddy. *I* had a *great* time.\"\n- Law and Order");
	array.add ("Kaufer: \"Hey, I'm a lover, not a killer.\"\nLogan: \"I'm happy for you, Romeo. You know, I bet there's a couple guys up in Attica who'd love your company.\"\n- Law and Order");
	array.add ("Logan: \"Maybe they just ought to legalize it.\"\nBriscoe: \"Oh yeah, another half a million crackheads.\"\nLogan: \"You don't know that. Would you take it? Would I? Listen, a junkie's gonna be a junkie whether it's legal or not.\"\nBriscoe: \"So we should sell it in the drug stores?\"\nLogan: \"Damn straight. No one puts a knife in your gut to feed their habit.\"\nBriscoe: \"Any junkies in your family?\"\nLogan: \"Booze. And if you made it illegal, they'd cook it up on the stove.\"\n- Law and Order");
	array.add ("Church member: \"You're a skeptic.\"\nLogan: \"Ten years of Our Lady of Mercy'll do that to you.\"\n- Law and Order");
	array.add ("\"Hey, my mother used to hold a rosary in one hand while she beat the crap out me with the other. The next time I go to church, six of my closest buddies'll be carrying me.\"\n- Mike Logan, Law and Order");
	array.add ("\"Seems like he fell down the twelve steps.\"\n- Mike Logan, Law and Order");
	array.add ("Van Buren: \"One of you guys have a girlfriend in a nursing home?\"\nMike: \"Oh, that would be Lennie.\"\n- Law and Order");
	array.add ("Mike: \"What, are you looking for a date?\"\nLennie: \"'Open-minded MBBF seeks mature man.'\"\nMike: \"What's that, male bisexual bondage freak?\"\n- Law and Order");
	array.add ("(To Gastin after Gastin said he took Chappel's promises to finish the project at face value):\n\"You'd be very popular at our weekly poker games.\"\n- Mike Logan, Law and Order");
	array.add ("\"When I was 12, Billy tried to recruit me for a matinee with Father Joe.\"\n- Mike Logan, Law and Order");	
	
	// Paul Robinette
	array.add ("Logan: \"Are we winning?\"\nRobinette: \"Like we won Pearl Harbor.\"\n- Law and Order");
	array.add ("Stone: \"Man's creativity expands proportionately to his greed.\"\nRobinette: \"Stone's law?\"Robinette: (later) \"An attorney's creativity expands geometrically to the heinousness of his client's crime.\"\n- Law and Order");
	array.add ("\"One small step for privacy, a giant leap for conspiracy.\"\n- Paul Robinette, Law and Order");
	array.add ("\"Everything's about race, Claire, and all the love and good will is not gonna make a damn bit of difference.\"\n- Paul Robinette, Law and Order");
	array.add ("\"Ben Stone once said I'd have to decide if I was a lawyer who was black or a black man who was a lawyer. All these years I thought I was the former. All these years I was wrong.\"\n- Paul Robinette, Law and Order");
	array.add ("\"Nothing like starting in your own end zone.\"\n- Paul Robinette, Law and Order");
	array.add ("Stone: \"What's she up to?\"\nRobinette: \"Rehearsing for the parole board.\"	\n- Law and Order");
	array.add ("Lowe: \"Is this jealousy I hear?\"\nRobinette: \"It's nausea. Ambulance chasing always brings that out in me.\"\n- Law and Order");
	array.add ("\"Life's tough, Otis. It's even tougher when you're stupid.\"\n- Paul Robinette, Law and Order");		
	
	// Phil Cerreta
	array.add ("Store owner complaining about kids renting porn: \"There ought to be a law.\"\nPhil: \"There is a law.\"\n- Law and Order");
	array.add ("Cragen: \"Let's start knocking on doors....\"\nCerreta: \"No, first we get fettuccine, then we start knocking on doors....\"\n- Law and Order");
	array.add ("Union Representative: \"Local 8157 official business. Get lost.\"\nPhil: \"Shield 9125. Ditto.\"\n- Law and Order");
	array.add ("Cerreta: \"Look on the bright side--if we do this all week, you'll never have to buy Playboy again.\"\nLogan: (mock indignantly) \"What are you saying? That I treat all women like objects?\"\nCerreta: \"More specific--like furniture.\"\n- Law and Order");	
	array.add ("Logan: \"Maybe she got cured.\"\nCerreta: \"Of being a woman?\"\n- Law and Order");	
	
	// Serena Southerlyn
	array.add ("\"The dismissal hurt Collins more than the indictment. When his fans found out he wasn't the killer, his CD dropped ten places on the charts.\"\n- Serena Southerlyn, Law and Order");	
	
	/////////////////////////////////////////
	// done above, incomplete below
	/////////////////////////////////////////
	
	// Adam Schiff
	array.add ("\"Look at us - three men talking about what rights women should have over their own bodies. Doesn't that strike you as a little one-sided?\"\n- Adam Schiff, Law and Order");
	array.add ("Adam: \"Who's available to send in?\"\nBen: \"An armed robber and a rent-gouging landlord.\"\nAdam: \"Go with the armed robber. Ends up in front of a jury, get more sympathy than a landlord.\"\n- Law and Order");
	array.add ("Ben Stone: \"She pulled the trigger...\"\nAdam Schiff: [stares]\nBen Stone: \"...not *physically*...\"\nAdam Schiff: \"Ahhhh...[nods head] *meta*physically.\"\n- Law and Order");
	array.add ("Stone: \"He's not your typical killer.\"\nAdam: \"Sure he is. He killed someone.\"\n- Law and Order");
	array.add ("\"Oh, The Constitution - that pesky thing.\"\n- Adam Schiff, Law and Order");
	array.add ("\"In the future when we go to trial, we should know what we are doing first.\"\n- Adam Schiff, Law and Order");
	array.add ("\"What have you been inhaling? You want to name the Catholic Church as a co-conspirator?\"\n- Adam Schiff, Law and Order");
	array.add ("\"Quick! Shut the door before someone brings in a case we can win!\"\n- Adam Schiff, Law and Order");
	array.add ("\"First day of law school: 'Perjurers do not make good witnesses!'\"\n- Adam Schiff, Law and Order");
	
	// Ben Stone
	array.add ("(When the defendant is testifying and trying to justify her actions by saying it was right in the eyes of God, Ben objects)\n\"This case is being judged on the temporal plane, your honor!\"\n- Ben Stone, Law and Order");
	array.add ("\"I'm a Catholic, sir; I can feel guilty about anything.\"\n- Ben Stone, Law and Order");
	array.add ("\"The commandment says 'Thou shalt not kill,' not 'Thou shalt not kill nice people!'\"\n- Ben Stone, Law and Order");
	array.add ("\"The last time conspiracy was easy to prove was the Jews and the Romans.\"\n- Ben Stone, Law and Order");
	array.add ("\"Your psychiatrist tells me that you have moments of clarity. Now, you are going to going to get up on that witness stand and you are going to have one of those moments.\"\n- Ben Stone, Law and Order");
	array.add ("\"Praise the Lord and pass the amunition.\"\n- Ben Stone, Law and Order");
	array.add ("Captain Bunker: \"Do not sit there and judge me.\"\nBen: \"I am not judging you, sir. That is up to your conscience and 12 taxpayers. And I assure you that the latter will not be as tolerant as the former.\"\n- Law and Order");
	
	// Jack McCoy
	array.add ("\"It's a tits and ass world.\"\n- Jack McCoy, Law and Order");
	array.add ("\"Can we go get a drink now?\"\n- Jack McCoy, Law and Order");
	array.add ("\"Men are pigs and we should all rot in hell. Unfortunately, that's not my jurisdiction.\"\n- Jack McCoy, Law and Order");
	array.add ("\"What's her audition piece, '.22 Ways to Leave Your Lover'?\"\n- Jack McCoy, Law and Order");
	array.add ("\"Justice is a byproduct of winning.\"\n- Jack McCoy, Law and Order");
	array.add ("McCoy: \"Bailiff, arrest this woman--she just confsessed to murder!\"\nJudge: \"May I remind you, Mr. McCoy, abortion is still legal in this country!\"\nMcCoy: \"Thank you your honour!\"\n- Law and Order");
	array.add ("(to suspect, flanked by attorney and ex-priest): \"You're getting bad advice from both Heaven and Earth.\"\n- Jack McCoy, Law and Order");
	array.add ("Rule No. 1 : Never drink at work.\nRule No. 2: Never discuss work while drinking.\nRule No. 3: When Rule No. 2 is broken, never drink alone.\n- Jack McCoy, Law and Order");
	array.add ("(to kid involved in a points-for-sex ring): \"How many points do you think you'll be worth in prison, son?\"\n- Jack McCoy, Law and Order");
	array.add ("McCoy: \"There's no law against lying to a suspect.\"\nKincaid: \"And you probably miss the good old days before Miranda.\"\nBriscoe: \"Hey, if anybody wants to hear some of this, I could 'accidentally' hit the intercom button.\"\nMcCoy: \"That's what my old man would have done...[pointedly looking at Claire]...in the 'good old days before Miranda'.\"\n- Law and Order");	
	
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
