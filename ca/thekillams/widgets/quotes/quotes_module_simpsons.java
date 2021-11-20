package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Simpsons Module.</P>
 * 
 * <P>This object provides an array of Simpsons quotes.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_simpsons
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

public quotes_module_simpsons ()
{
	// create the array of entries
	entries = new ArrayList (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Simpsons Quotes
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
	
	array.add ("Homer Simpson:  I'm going to the backseat of my car with the woman I love, and I won't be back for TEN MINUTES.\" ");
	array.add ("Homer Simpson:  \"Bart, with $10,000, we'd be millionaires! We could buy all kinds of useful things like...love!\"");
	array.add ("Homer Simpson:  \"Unfortunately, son, we Simpsons sometimes have to bend the rules a little in order to hold our own.\"");
	array.add ("Homer Simpson:  \"The strong must protect the sweet\"");
	array.add ("Homer Simpson:  \"Ah, sweet pity. Where would my love life have been without it?\"");
	array.add ("Homer Simpson:  \"Son, a woman is like a beer. They smell good, they look good, you'd step over your own mother just to get one! But you can't stop at one. You wanna drink another woman!\"");
	array.add ("Homer Simpson:  \"Marge, it takes two to lie. One to lie and one to listen.\"");
	array.add ("Homer Simpson:  \"Remember as far as anyone knows, we're a nice normal family.\""); 
	array.add ("Homer Simpson:  \"I know what you're saying, Bart. When I was young, I wanted an electric football machine more than anything else in the world, and my parents bought it for me, and it was the happiest day of my life. Well, goodnight.\"");
	array.add ("Homer Simpson:  \"Your lives are in the hands of men no smarter than you or I, many of them incompetent boobs. I know this because I worked alongside them, gone bowling with them, watched them pass me over for promotions time and again. And I say... This stinks!\"");
	array.add ("Homer Simpson:  \"That's it! You people have stood in my way long enough. I'm going to clown college!\"");
	array.add ("Homer Simpson:  \"You tried your best and you failed miserably. The lesson is 'never try'.\"");
	array.add ("Homer Simpson:  \"God bless those pagans.\"");
	array.add ("Homer Simpson:  \"I'm in a place where I don't know where I am!\""); 
	array.add ("Homer Simpson:  \"I am so smart, I am so smart, s-m-r-t....I mean s-m-A-r-t.\"");
	array.add ("Homer Simpson:  \"Oh, everything's too damned expensive these days. This Bible cost 15 bucks! And talk about a preachy book! Everybody's a sinner! Except this guy.\""); 
	array.add ("Homer Simpson:  \"Mmmm, free goo.\""); 
	array.add ("Homer Simpson:  \"It's not easy to juggle a pregnant wife and a troubled child, but somehow I managed to fit in eight hours of TV a day.\""); 
	array.add ("Homer Simpson:  \"I can't believe it! Reading and writing actually paid off!\"");
	array.add ("Homer Simpson:  \"Don't let Krusty's death get you down, boy. People die all the time, just like that. Why, you could wake up dead tomorrow! Well, good night.\""); 
	array.add ("Homer Simpson:  \"Yeah Moe that team sure did suck last night. They just plain sucked! I've seen teams suck before, but they were the suckiest bunch of sucks that ever sucked!\"");
	array.add ("Homer Simpson:  \"Ha ha! Look at this country! ? U R Gay!? Ha ha!\" (looking at Uruguay on the globe).");
	array.add ("Homer Simpson:  \"Don't mess with the dead, boy, they have eerie powers.\"");
	array.add ("Homer Simpson:  \"Donuts. Is there anything they can't do?\"");
	array.add ("Homer Simpson:  \"If you really want something in this life, you have to work for it - Now quiet, they're about to announce the lottery numbers!\"");
	array.add ("Homer Simpson:  \"Relax. What is mind? No matter. What is matter? Never mind!\"");
	array.add ("Homer Simpson:  \"Good drink... good meat... good God, let's eat!\"");
	array.add ("Homer Simpson:  \"Lord help me, I'm just not that bright.\"");              
	array.add ("Homer Simpson:  \"What do we need a psychiatrist for? We know our kid is nuts.\"");
	array.add ("Homer Simpson:  \"Now go on, boy, and pay attention. Because if you do, someday, you may achieve something that we Simpsons have dreamed about for generations: You may outsmart someone!\"");
	array.add ("Homer Simpson:  \"I bet Einstein turned himself all sorts of colors before he invented the light bulb.\"");
	array.add ("Homer Simpson:  \"Beer. Now there's a temporary solution.\"");
	array.add ("Homer Simpson:  \"Oh no! What have I done? I smashed open my little boy's piggy bank, and for what? A few measly cents, not even enough to buy one beer. Wait a minute, lemme count and make sure...not even close.\"");
	array.add ("Homer Simpson:  \"Kill myself? Killing myself is the last thing I'd ever do. Now I have a purpose, a reason to live. I don't care who I have to face, I don't care who I have to fight, I will not rest until this street gets a stop sign!\"");
	array.add ("Homer Simpson:  \"If they think I'm going to stop at that stop sign, they're sadly mistaken!\"");
	array.add ("Homer Simpson:  \"Unlike most of you, I am not a nut.\"");
	array.add ("Homer Simpson:  \"Safety? But sir! If truth be known, I actually caused more accidents around here than any other employee, including a few doozies no one every found out about.\"");
	array.add ("Homer Simpson:  \"No, no, no, Lisa. If adults don't like their jobs, they don't go on strike. They just go in every day and do it really half-assed.\"");
	array.add ("Homer Simpson:  \"Ignore the boy, Lord.\"");
	array.add ("Homer Simpson:  \"Dear Lord, thank You for this microwave bounty, even though we don't deserve it. I mean... our kids are uncontrollable hellions! Pardon my French... but they act like savages! Did You see them at the picnic? Oh, of course You did... You're everywhere, You're omnivorous. Oh Lord! Why did You spite me with this family?\"");
	array.add ("Homer Simpson:  \"You know Moe, my mom once said something that really stuck with me. She said, `Homer, you're a big disappointment', and God bless her soul, she was really onto something.\"");
	array.add ("Homer Simpson:  \"When will I learn? The answer to life's problems aren't at the bottom of a bottle, they're on TV!\"");
	array.add ("Homer Simpson:  \"Trying is the first step towards failure.\"");
	array.add ("Homer Simpson:  \"America's health care system is second only to Japan... Canada, Sweden, Great Britain, ... well all of Europe. But you can thank your lucky stars we don't live in Paraguay!\"");
	array.add ("Homer Simpson:  \"What's the point of going out, we're just going to end up back here anyway?\"");
	array.add ("Homer Simpson:  \"I like my beer cold…my TV loud…and my homosexuals flaming.\"");
	array.add ("Homer Simpson:  \"The code of the schoolyard, Marge! The rules that teach a boy to be a man. Let's see. Don't tattle. Always make fun of those different from you. Never say anything, unless you're sure everyone feels exactly the same way you do.\"");
	array.add ("Homer Simpson:  \"I think the saddest day of my life was when I realised I could beat my Dad at most things, and Bart experienced that at the age of four.\"");
	array.add ("Homer Simpson:  \"And there's nothing wrong with hitting someone when his back is turned.\"");
	array.add ("Homer Simpson:  \"Being popular is the most important thing in the world!\"");
	array.add ("Homer Simpson:  \"Old people don't need companionship. They need to be isolated and studied so that it can be determined what nutrients they have that might be extracted for our personal use.\"");
	array.add ("Homer Simpson:  \"Remember that postcard Grandpa sent us from Florida of that alligator biting that woman's bottom? That's right, we all thought it was hilarious. But it turns out we were wrong. That alligator was sexually harrassing that woman.\""); 
	array.add ("Homer Simpson:  \"The lesson is: Our God is vengeful! O spiteful one, show me who to smite and they shall be smoten!!!\"");
	array.add ("Homer Simpson:  \"Oh, people can come up with statistics to prove anything, Kent. 14% of people know that.\"");
	array.add ("Homer Simpson:  \"Don't worry, son. I'm sure he's up in heaven right now laughing it up with all the other celebrities: John Dilinger, Ty Cobb, Joseph Stalin.\"");
	array.add ("Homer Simpson:  \"And how is education supposed to make me feel smarter? Besides, every time I learn something new, it pushes some old stuff out of my brain. Remember when I took that home winemaking course, and I forgot how to drive?\"");
	array.add ("Homer Simpson:  \"I won't sleep in the same bed with a woman who thinks I'm lazy! I'm going right downstairs, unfold the couch, unroll the sleeping ba- uh, goodnight.\"");
	array.add ("Homer Simpson:  \"It's like something out of that twilighty show about that zone.\"");
	array.add ("Homer Simpson:  \"Yes, honey...Just squeeze your rage up into a bitter little ball and release it at an appropriate time, like that day I hit the referee with the whiskey bottle.\"");
	array.add ("Homer Simpson:  \"OK, son. Just remember to have fun out there today, and if you lose, I'LL KILL YOU!\"");
	array.add ("Homer Simpson:  \"Me lose brain? Uh, oh! Ha ha ha! Why I laugh?\"");
	array.add ("Homer Simpson:  \"Kids, kids. As far as Daddy's concerned, you're both potential murderers.\"");
	array.add ("Homer Simpson:  \"No! No no no no no no! Well, yes.\"");
	array.add ("Homer Simpson:  \"Ah, beer, my one weakness. My achilles heel, if you will.\"");
	array.add ("Homer Simpson:  \"They have the Internet on computers, now?\"");
	array.add ("Homer Simpson:  \"Facts are meaningless. You could use facts to prove anything that's even remotely true!\"");
	array.add ("Homer Simpson:  \"When I look at the smiles on all the children's faces,,...I just know they're about to jab me with something.\"");
	array.add ("Homer Simpson:  \"Son, this is the only time I'm ever gonna say this. It is not okay to lose.\"");
	array.add ("Homer Simpson:  \"Well you know boys, a nuclear reactor is a lot like women. You just have to read the manual and press the right button.\"");
	array.add ("Homer Simpson:  \"If something is to hard to do, then it's not worth doing.\"");
	array.add ("Homer Simpson:  \"Dear Baby, Welcome to Dumpsville. Population: You\"");
	array.add ("Homer Simpson:  \"All right, let's not panic. I'll make the money by selling one of my livers. I can get by with one.\"");
	array.add ("Homer Simpson:  \"Marge, you being a cop makes you the man! Which makes me the woman - and I have no interest in that, besides occasionally wearing the underwear, which as we discussed, is strictly a comfort thing.\"");
	array.add ("Homer Simpson:  \"Operator! Give me the number for 911!\"");
	array.add ("Homer Simpson:  \"Kill my boss? Do I dare live out the American dream?\"");
	array.add ("Homer Simpson:  \"Lisa, if the Bible has taught us nothing else, and it hasn't, it's that girls should stick to girls sports, such as hot oil wrestling and foxy boxing and such and such.\"");
	array.add ("Homer Simpson:  \"Aw, Dad, you've done a lot of great things, but you're a very old man, and old people are useless.\"");
	array.add ("Homer Simpson:  \"It's not easy to juggle a pregnant wife and a troubled child, but somehow I managed to squeeze in 8 hours of TV a day.\"");
	array.add ("Homer Simpson:  \"Getting out of jury duty is easy. The trick is to say you're prejudiced against all races.\"");
	array.add ("Homer Simpson:  \"Here's to alcohol: the source of, and answer to, all of life's problems.\"");
	array.add ("Homer Simpson:  \"I'm having the best day of my life, and I owe it all to not going to Church!\"");
	array.add ("Homer Simpson:  \"If this were really a nuclear war we'd all be dead meat by now.\""); 
	array.add ("Homer Simpson:  \"Now Bart, since you broke Grandpa's teeth, he gets to break yours.\"");
	array.add ("Homer Simpson:  \"Let us all bask in television's warm glowing warming glow.\"");
	array.add ("Homer Simpson:  \"And Lord, we are especially thankful for nuclear power, the cleanest, safest energy source there is. Except for solar, which is just a pipe dream.\"");
	array.add ("Homer Simpson:  \"I'm tired of making other people feel good about themselves!\"");
	array.add ("Homer Simpson:  \"Ah, good ol' trustworthy beer. My love for you will never die.\"");
	array.add ("Homer Simpson:  \"I want to share something with you: The three little sentences that will get you through life. Number 1: Cover for me. Number 2: Oh, good idea, Boss! Number 3: It was like that when I got here.\"");
	array.add ("Homer Simpson:  \"Quiet you kids. If I hear one more word, Bart doesn't get to watch cartoons, and Lisa doesn't get to go to college.\"");
	array.add ("Homer Simpson:  \"Don't you ever, EVER talk that way about television.\"");
	array.add ("Homer Simpson:  \"Your mother has this crazy idea that gambling is wrong. Even though they say it's okay in the bible.\"");
	array.add ("Homer Simpson:  \"No matter how good you are at something, there's always about a million people better than you.\"");
	array.add ("Homer Simpson:  \"Marge, there's an empty spot I've always had inside me. I tried to fill it with family, religion, community service, but those were dead ends! I think this chair is the answer.\"");
	array.add ("Homer Simpson:  \"I'm not a bad guy! I work hard, and I love my kids. So why should I spend half my Sunday hearing about how I'm going to Hell?\"");
	array.add ("Homer Simpson:  \"When it comes to compliments, women are ravenous blood-sucking monsters always want'n more... more... MORE! And if you give it to them, you'll get plenty back in return.\"");
	array.add ("Homer Simpson:  \"If something goes wrong at the plant, blame the guy who can't speak English.\"");
	array.add ("Homer Simpson:  \"Kids, kids. I'm not going to die. That only happens to bad people.\"");
	array.add ("Homer Simpson:  \"Marge, I'm going to miss you so much. And it's not just the sex. It's also the food preparation.\"");
	array.add ("Homer Simpson:  \"Ah, TV respects me. It laughs with me, not at me!\"");
	array.add ("Homer Simpson:  \"Marge, I agree with you -- in theory. In theory, communism works. In theory.\"");
	array.add ("Homer Simpson:  \"You think I don't want to? It's those TV networks, Marge: they won't let me. One quality show after another, each one fresher and more brilliant than the last. If they only stumbled once, just gave us thirty minutes to ourselves, but they won't! They won't let me live!\"");
	array.add ("Homer Simpson:  \"Television! Teacher, mother, secret lover.\"");
	array.add ("Homer Simpson:  \"I want to shake off the dust of this one-horse town. I want to explore the world. I want to watch TV in a different time zone. I want to visit strange, exotic malls...I want to live, Marge! Won't you let me live_?\"");
	array.add ("Homer Simpson:  \"I've always wondered if there was a god. And now I know there is -- and it's me.\"");
	array.add ("Homer Simpson:  \"Lisa honey, are you saying you're never going to eat any animal again? What about bacon?\"");
	array.add ("Homer Simpson:  \"All normal people love meat. If I went to a barbeque and there was no meat, I would say 'Yo Goober! Where's the meat!?'. I'm trying to impress people here Lisa. You don't win friends with salad.\"");
	array.add ("Homer Simpson:  \"'To Start Press Any Key'. Where's the ANY key?\"");
	array.add ("Homer Simpson:  \"You can't keep blaming yourself. Just blame yourself once, and move on.\"");
	array.add ("Homer Simpson:  \"Now, son, you don't want to drink beer. That's for daddies and kids with fake IDs.\"");
	array.add ("Homer Simpson:  \"English - Who needs that? I'm never going to England!\"");
	array.add ("Homer Simpson:  \"I think Mr. Smithers picked me for my motivational skills. Everyone always says they have to work twice as hard when I'm around!\"");
	array.add ("Homer Simpson:  \"Go ahead and play the blues if it'll make you happy.\"");
	array.add ("Homer Simpson:  \"I have feelings too - like ''My stomach hurts'' or ''I'm going crazy!'\""); 
	array.add ("Bart Simpson:  \"I'm Bart Simpson, who the Hell are you?\"");
	array.add ("Bart Simpson:  \"I didn't do it, nobody saw me do it, there's no way you can prove anything!\"");
	array.add ("Bart Simpson:  \"Kiss you? But Dad, I'm your kid!\"");
	array.add ("Bart Simpson:  \"All he does is lie there like an unemployed whale.\"");
	array.add ("Bart Simpson:  \"No, he's pretty dumb. He's in all the same special classes I am.\"");
	array.add ("Bart Simpson:  \"I can't stand to see you so upset, Lis, unless it's from a rubber spider down your dress - Hmm, that gives me an idea note for later: put rubber spider down Lisa's dress.\"");
	array.add ("Bart Simpson:  \"Christmas is a time when people of all religions come together to worship Jesus Christ.\"");
	array.add ("Bart Simpson:  \"There's no such thing as a soul. It's just something they made up to scare kids, like the boogeyman or Michael Jackson.\"");
	array.add ("Bart Simpson:  \"Dad, thanks to TV, I can't remember what happened 8 minutes ago. No, really, it's a serious problem. Ha, ha, ha! What're we laughing about?\"");
	array.add ("Bart Simpson:  \"It's just hard not to listen to TV: it's spent so much more time raising us than you have.\"");
	array.add ("Marge Simpson:  \"Do you want your son to be Chief Justice of the Supreme Court, or a sleazy male stripper?\"");
	array.add ("Marge Simpson:  \"Bart, stop pestering Satan!\"");
	array.add ("Lisa Simpson:  \"Oh no, the dead have risen and their voting Republican.\"");
	array.add ("Lisa Simpson:  \"Mom, romance is dead. It was acquired in a hostile takeover by Hallmark and Disney, homogenized, and sold off piece by piece.\"");
	array.add ("Lisa Simpson:  \"It's naive to think you can change a person--except maybe that boy who works in the library.\"");
	array.add ("Lisa Simpson:  \"Science has already proven the dangers of smoking, alcohol, and Chinese food, but I can still ruin soft drinks for everyone!\"");
	array.add ("Simpson's Blackboard Writing:  I will not waste chalk");
	array.add ("Simpson's Blackboard Writing:  I will not instigate revolution");
	array.add ("Simpson's Blackboard Writing:  I will not draw naked ladies in class");
	array.add ("Simpson's Blackboard Writing:  I did not see Elvis");
	array.add ("Simpson's Blackboard Writing:  I will not call my teacher \"Hot Cakes\"");
	array.add ("Simpson's Blackboard Writing:  Garlic Gum is not funny");
	array.add ("Simpson's Blackboard Writing:  They are laughing at me, not with me");
	array.add ("Simpson's Blackboard Writing:  I will not yell \"Fire!\" in a crowded classroom");
	array.add ("Simpson's Blackboard Writing:  I will not encourage others to fly");
	array.add ("Simpson's Blackboard Writing:  Tar is not a plaything");
	array.add ("Simpson's Blackboard Writing:  I will not xerox my butt");
	array.add ("Simpson's Blackboard Writing:  I will not drive the principals car");
	array.add ("Simpson's Blackboard Writing:  I will not pledge allegiance to Bart");
	array.add ("Simpson's Blackboard Writing:  I will not sell School Property");
	array.add ("Simpson's Blackboard Writing:  I will not sell land in Florida");
	array.add ("Simpson's Blackboard Writing:  I will not grease the monkey bars");
	array.add ("Simpson's Blackboard Writing:  Nobody likes sunburn slappers");
	array.add ("Simpson's Blackboard Writing:  High explosives and school don't mix");
	array.add ("Simpson's Blackboard Writing:  I will finish what I sta");
	array.add ("Simpson's Blackboard Writing:  \"Bart bucks\" are not legal tender"); 
	array.add ("Simpson's Blackboard Writing:  Underwear should be worn on the inside");
	array.add ("Simpson's Blackboard Writing:  I will not torment the emotionally frail");
	array.add ("Simpson's Blackboard Writing:  I will not carve gods");
	array.add ("Simpson's Blackboard Writing:  I will not spank others");
	array.add ("Simpson's Blackboard Writing:  I will not aim for the head");
	array.add ("Simpson's Blackboard Writing:  I will not barf unless I'm sick");
	array.add ("Simpson's Blackboard Writing:  I saw nothing unusual in the teachers lounge");
	array.add ("Simpson's Blackboard Writing:  I will not conduct my own firedrills");
	array.add ("Simpson's Blackboard Writing:  I will not fake seizures");
	array.add ("Simpson's Blackboard Writing:  This punishment is not boring and pointless");
	array.add ("Simpson's Blackboard Writing:  My name is not Dr. Death");
	array.add ("Simpson's Blackboard Writing:  I will not bury the new kid");
	array.add ("Simpson's Blackboard Writing:  I will not bring sheep to class");
	array.add ("Simpson's Blackboard Writing:  I will not call \"She's dead!\" during roll call");
	array.add ("Simpson's Blackboard Writing:  I will return the seeing eye dog");
	array.add ("Simpson's Blackboard Writing:  I do not have diplomatic immunity");
	array.add ("Simpson's Blackboard Writing:  I will not charge admission to the bathroom");
	array.add ("Simpson's Blackboard Writing:  The cafeteria deep fryer is not a toy");
	array.add ("Simpson's Blackboard Writing:  I am not authorised to fire substitute teachers");
	array.add ("Simpson's Blackboard Writing:  Organ transplants are best left to the professionals");
	array.add ("Simpson's Blackboard Writing:  The pledge of Allegiance does not end with \"Hail Satan!\"");
	array.add ("Simpson's Blackboard Writing:  I will not celebrate meaningless milestones");
	array.add ("Simpson's Blackboard Writing:  I will not retransmit without the express written permission of Major League Baseball");
	array.add ("Simpson's Blackboard Writing:  Five days is not to long to wait for a gun");
	array.add ("Simpson's Blackboard Writing:  Beans are neither fruit nor musical");
	array.add ("Simpson's Blackboard Writing:  I will not abbrev.");
	array.add ("Simpson's Blackboard Writing:  I am not the reincarnation of Sammy Davis, Jr");
	array.add ("Simpson's Blackboard Writing:  I will not send lard through the Mail");
	array.add ("Simpson's Blackboard Writing:  I will not dissect things unless instructed");
	array.add ("Simpson's Blackboard Writing:  I will not whittle hall passes out of soap");
	array.add ("Simpson's Blackboard Writing:  Ralph won't \"morph\" if you squeeze him hard enough");
	array.add ("Simpson's Blackboard Writing:  \"Bagman\" is not a legitimate career choice");
	array.add ("Simpson's Blackboard Writing:  Cursive writing does not mean what I think it does");
	array.add ("Simpson's Blackboard Writing:  Next time it could be me on the Scaffolding");
	array.add ("Simpson's Blackboard Writing:  I will remember to take my medication");
	array.add ("Simpson's Blackboard Writing:  I do not have power of attorney over first graders");
	array.add ("Simpson's Blackboard Writing:  Nerve gas is not a toy");
	array.add ("Simpson's Blackboard Writing:  I will not mock Mrs. Dumbface");
	array.add ("Simpson's Blackboard Writing:  This is not a clue...or is it?");
	array.add ("Simpson's Blackboard Writing:  I will not complain about the solution when I hear it");
	array.add ("Simpson's Blackboard Writing:  Wedgies are unhealthy for children and other living things");
	array.add ("Simpson's Blackboard Writing:  I will stop talking about the twelve inch pianist");
	array.add ("Simpson's Blackboard Writing:  The truth is not out there");
	array.add ("Simpson's Blackboard Writing:  I am not licensed to do anything");
	array.add ("Simpson's Blackboard Writing:  I will not hide the teachers prozac");
	array.add ("Simpson's Blackboard Writing:  A fire drill does not demand a fire");
	array.add ("Simpson's Blackboard Writing:  I will not tease fatty");
	array.add ("Simpson's Blackboard Writing:  There was no Roman God named \"Fartacus\"");
	array.add ("Simpson's Blackboard Writing:  Rudolph's red nose is not alcohol related");
	array.add ("Simpson's Blackboard Writing:  \"The president did it\" is not an excuse");
	array.add ("Simpson's Blackboard Writing:  It does not suck to be you");
	array.add ("Simpson's Blackboard Writing:  I cannot absolve sins");
	array.add ("Simpson's Blackboard Writing:  A trained ape could not teach gym");
	array.add ("Simpson's Blackboard Writing:  Loose teeth don't need my help");
	array.add ("Simpson's Blackboard Writing:  I have neither been there nor done that");

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