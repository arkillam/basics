package ca.thekillams.widgets.quotes;

import java.util.*;

/**
 * <P>Andrew's Quote Server, Misc Module.</P>
 * 
 * <P>This object provides an array of misc quotes, mostly humourous in nature.</P>
 * 
 * <UL>
 * <LI>Version 1.0 - 02/27/2003 - the original, moved from the organizer project
 * </UL>
 * 
 * @author		Andrew Killam
 * @version	1.0 - 02/27/2003
 */

public class quotes_module_misc
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

public quotes_module_misc ()
{
	// create the array of entries
	entries = new ArrayList<String> (300);
	
	// add the entries
	entries = add (entries);
}

//////////////////////////////////////////////////////////////////////////////////////////////////
// main functions
//////////////////////////////////////////////////////////////////////////////////////////////////

/**  Adds Misc Quotes
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
	
	array.add ("All extremists should be shot.");
	array.add ("You can only drink 30 or 40 glasses of beer a day, no matter how rich you are. - Colonel Adolphus Busch");
	array.add ("You'd be surprised how many good things you can say about Windows, when Bill Gates shoves a gun up you ass.");
	array.add ("If at first they don't agree, use a bigger hammer.");
	array.add ("Alcohol and Calculus don't mix. Never drink and derive!");
	array.add ("Friends don't let friends buy software. - Slashdot poster");
	array.add ("\"Now remember, boys - flies spread disease.  So keep yours closed!\" - Band of Brothers  (HBO WWII series)");
	array.add ("In Seattle, Washington, it is illegal to carry a concealed weapon that is more than six feet in length.");
	array.add ("This will be a memorable month, no matter how hard you try to forget it.");
	array.add ("'Criminal Lawyer' is a redundancy.");
	array.add ("Only adults have trouble with child-proof caps.");
	array.add ("High heels are a device invented by a woman tired of being kissed on the forehead.");
	array.add ("Everybody repeat after me... \"We are all individuals.\"");
	array.add ("Never underestimate the power of very stupid people in large groups.");
	array.add ("The only substitute for good manners is fast reflexes.");
	array.add ("Grow your own Dope - Plant a Politician.");
	array.add ("An unbreakable toy is useful for breaking other toys.");
	array.add ("Have you ever imagined a world with no hypothetical situations?");
	array.add ("Corduroy pillows: They're making headlines!");
	array.add ("Drink 'til she's cute, but stop before the wedding");
	array.add ("Eagles may soar, but weasels don't get sucked into jet engines");
	array.add ("When everything's coming your way, you're in the wrong lane.");
	array.add ("Black holes are where God divided by zero.");
	array.add ("All those who believe in psychokinesis raise my hand.");
	array.add ("A conclusion is the place where you got tired of thinking.");
	array.add ("Never do card tricks for the group you play poker with.");
	array.add ("To steal ideas from one person is plagiarism; to steal from many is research.");
	array.add ("To succeed in politics, it is often necessary to rise above your principles.");
	array.add ("The sooner you fall behind, the more time you'll have to catch up.");
	array.add ("Money can't buy love. But it CAN rent a very close imitation.");
	array.add ("Death to all fanatics!");
	array.add ("Bills travel through the mail at twice the speed of checks.");
	array.add ("99 percent of lawyers give the rest a bad name.");
	array.add ("The trouble with political jokes is that they get elected.");
	array.add ("Doing it right is no excuse for not meeting the schedule.");
	array.add ("Some Days, It Just Doesn't Pay to Gnaw Through the Straps");
	array.add ("The only function of economic forecasting is to make astrology look respectable.");
	array.add ("Lottery: A tax on people who are bad at math.");
	array.add ("Warning: Dates in Calendar are closer than they appear.");
	array.add ("I didn't fight my way to the top of the food chain to be a vegetarian.");
	array.add ("Never miss a good chance to shut up.");
	array.add ("There's two theories to arguin' with a woman.  Neither one works.");
	array.add ("The difference between tax avoiding and evasion is 10 Years.");
	array.add ("A.A.A.A.A. - An organization for drunks who drive.");
	array.add ("War never decides who is right, only who is left.");
	array.add ("Old Japenese Proverb:  There are two kinds of fools:  those who never climb Mt. Fuji, and those who climb it twice.");
	array.add ("heavy (adjective):  seduced by the chocolate side of the force.");
	array.add ("knowledge (noun):  Things you believe.");
	array.add ("People who fight fire with fire usually wind up with ashes. - Abigail Van Buren");
	array.add ("The last time somebody said \"I can write much better with a word processor.\", I replied, \"They used to say the same thing about drugs.\" - Roy Blount Jr.");
	array.add ("Let me assure you that at First National, you are not just a number.  You are two numbers, a dash, three more numbers, another dash and another number. - James Estes");
	array.add ("If you steal from one author, it's plagiarism; if you steel from many, it's research.");
	array.add ("Drinking coffee for instant relaxation?  That's like drinking alcohol for instant motor skills! - Marc Price");
	array.add ("Give your child mental blocks for Christmas.");
	array.add ("Only a fool has no doubts.");
	array.add ("Until Eve arrived, this was a man's world. - Richard Armour");
	array.add ("I can resist anything but temptation.");
	array.add ("\"If you lived today as if it were you're last, you'd buy a box of rockets and fire them all off, wouldn't you?\" - Garrison Keillor");
	array.add ("I want either less decadence or more chances to particiapte in it.");
	array.add ("\"What the deuce is it to me? You say we go around the sun.  If we went around the moon it would not make a pennyworth of difference to me or my work.\" - Sherlock Holmes, A Study in Scarlet");
	array.add ("Of course it's the murder weapon - who would frame someone with a fake?");
	array.add ("Two is company ... three is an orgy.");
	array.add ("It's hard to tell if he has an ace up his sleeve, or if the ace is missing from his deck altogether.");
	array.add ("I don't have an eating problem.  I eat.  I get fat.  I buy new clothes.  No problem.");
	array.add ("Vegetarians beware - you are what you eat!");
	array.add ("Pushing 30 is exercise enough.");
	array.add ("The truth of a man is first and foremost in what he hides.");
	array.add ("Confucious says:  Is stuffy inside fortune cookie.");
	array.add ("There are only two things in life I am sure of, death and taxes, and I think we might do something about death one of these days.");
	array.add ("A mouse is an elephant built by the Japenese.");
	array.add ("Don't be sucked in by the comments; they can be terribly misleading.  Debug only code.");
	array.add ("Silence is the only virtue you have left.");
	array.add ("\"If I had any humility, I would be perfect.\" - Ted Turner");
	array.add ("\"Indomitable in retreat; invincible in advance; insufferable in victory.\" - Winston Churchill, on General Montgomery");
	array.add ("\"Democracy is the name we give the people whenever we need them.\" - Arman de Caillavet, 1913");
	array.add ("Every path has it's puddle.");
	array.add ("A job is nice but it interferes with my life.");
	array.add ("Don't worry: the answer's at the back of the book.");
	array.add ("A crowded elevator smells different to a midget.");
	array.add ("We do precision guesswork.");
	array.add ("My life has a superb cast, but I can't figure out the plot.");
	array.add ("Don't let school interfere with your education.");
	array.add ("'Oh what a tangled web we weave' - Hair Club for Men.");
	array.add ("Where there's a will, there's a lawsuit.");
	array.add ("A penny saved is a Congressional oversight.");
	array.add ("Smash forehead on keyboard to continue...");
	array.add ("Shin - Device for finding furniture in the dark.");
	array.add ("How does AVON find so many women willing to take orders ?");
	array.add ("When I'm not in my right mind, my left mind gets pretty crowded.");
	array.add ("Laughing stock:  cattle with a sense of humour.");
	array.add ("A pat on the back is only a few centimeters from a kick in the butt.");
	array.add ("I have a rock garden. Last week three of them died.");
	array.add ("One good thing about Alzheimer's is you get to meet new people every day.");
	array.add ("FAILURE IS NOT AN OPTION!  It comes bundled with the software.");
	array.add ("I married Miss Right.  I just didn't know her name was, \"Always\".");
	array.add ("It's hard to make a comeback when you haven't been anywhere.");
	array.add ("If ignorance is bliss, why aren't more people happy?");
	array.add ("Hard work will pay off later.  Laziness pays off now!");
	array.add ("To vacillate or not to vacillate, that is the question........or is it?");
	array.add ("I didn't fight my way to the top of the food chain to be a vegetarian.");
	array.add ("When you do a good deed, get a receipt, in case heaven is like the IRS.");
	array.add ("Be nice to your kids.  They'll choose your nursing home.");
	array.add ("I still miss my ex-husband.  But my aim is getting better!");
	array.add ("I haven't spoken to my wife in 18 months.  I don't like to interrupt her.");
	array.add ("A closed mouth gathers no foot.");
	array.add ("The trouble with life is there's no background music.");
	array.add ("The latest survey shows that three out of four people make up 75% of the population.");
	array.add ("First draw the curve, then plot the data.");
	array.add ("A fool and his money can throw one heck of a party.");
	array.add ("If there is no God, who pops up the next Kleenex?");
	array.add ("Remember, half the people in the world are below average.");
	array.add ("What happens if you get scared half to death twice?");
	array.add ("Where there's smoke, there's dinner.");
	array.add ("Last night I played a blank tape at full blast. The mime next door went nuts.");
	array.add ("If you're sending someone some Styrofoam, what do you pack it in?");
	array.add ("Why do they sterilize needles for lethal injections?");
	array.add ("Since light travels faster than sound, isn't that why some people appear bright until you hear them speak?");
	array.add ("War doesn't determine who's right, just who's left.");
	array.add ("If all the experts in the world were laid end to end they still wouldn't reach a conclusion.");
	array.add ("Eagles may soar, but weasels don't get sucked into jet engines.");
	array.add ("We put the \"k\" in \"kwality.\"");
	array.add ("Artificial Intelligence is no match for Natural Stupidity");
	array.add ("Plagiarism saves time.");
	array.add ("If at first you don't succeed, try management.");
	array.add ("Never put off until tomorrow what you can avoid altogether.");
	array.add ("TEAMWORK...means never having to take all the blame yourself.");
	array.add ("The beatings will continue until morale improves.");
	array.add ("We waste time, so you don't have to.");
	array.add ("Hang in there, retirement is only thirty years away!");
	array.add ("A snooze button is a poor substitute for no alarm clock at all.");
	array.add ("When the going gets tough, the tough take a coffee break.");
	array.add ("INDECISION is the key to FLEXIBILITY.");
	array.add ("Aim Low, Reach Your Goals, Avoid Disappointment.");
	array.add ("We waste more time by 8:00 in the morning than other companies do all day.");
	array.add ("You pretend to work, and we'll pretend to pay you.");
	array.add ("Work: It isn't just for sleeping anymore.");
	array.add ("Too bad the only people who know how to run the country are busy driving cabs and cutting hair.");
	array.add ("Two wrongs don't make a right, but two Wrights made an airplane.");
	array.add ("Kids in the back seat cause accidents; accidents in the back seat cause kids.");
	array.add ("It's not the pace of life that concerns me, it's the sudden stop at the end.");
	array.add ("The problem with the gene pool is that there is no lifeguard.");
	array.add ("It's hard to make a comeback when you haven't been anywhere.");
	array.add ("Living on Earth is expensive, but it does include a free trip around the sun.");
	array.add ("The only time the world beats a path to your door is if you're in the bathroom.");
	array.add ("If God wanted me to touch my toes, he would have put them on my knees.");
	array.add ("Lead me not into temptation (I can find the way myself).");
	array.add ("When you're finally holding all the cards, why does everyone else decide to play chess?");
	array.add ("If you're living on the edge, make sure you're wearing your seat belt.");
	array.add ("The mind is like a parachute; it works much better when it's open.");
	array.add ("Never take life seriously.  Nobody gets out alive, anyway.");
	array.add ("There are two kinds of pedestrians... the quick and the dead.");
	array.add ("Life is sexually transmitted.");
	array.add ("A closed mouth gathers no feet.");
	array.add ("Health is merely the slowest possible rate at which one can die.");
	array.add ("It's not hard to meet expenses...  they're everywhere.");
	array.add ("Jury: Twelve people who determine which client has the better attorney.");
	array.add ("The only difference between a rut and a grave is the depth.");
	array.add ("Some days you're the statue.  Some days you're the pigeon.");
	array.add ("I Have The Body Of A God ... Buddha");
	array.add ("Where Are We Going And Why Am I In This Handbasket?");
	array.add ("Cleverly Disguised As A Responsible Adult");
	array.add ("If you remember the sixties ... you weren't there.");
	array.add ("I don't suffer from stress, but I am a carrier.");
	array.add ("\"Dear IRS: I would like to cancel my subscription.  Please remove my name from your mailing list.\"");
	array.add ("If the security of shelter, food, and medical care is freedom, then the animals in the zoos are the freest animals of all.");
	array.add ("Impotence: Nature's way of saying \"No Hard Feelings.");
	array.add ("\"If you want to make an apple pie from scratch, you must first create the universe.\" --Carl Sagan");
	array.add ("Get back on your feet - miss a car payment.");
	array.add ("A committee: A group of the unwilling, picked from the unfit, to do the unnecessary.");
	array.add ("I feel sorry for people who don't drink.  When they wake up in the morning, that's as good as they're going to feel all day.");
	array.add ("Abstainer: a weak person who yields to the temptation of denying himself a pleasure.");
	array.add ("Why are there flotation devices under plane seats instead of parachutes?");
	array.add ("Why are cigarettes sold in gas stations when smoking is prohibited there?");
	array.add ("Do you need a silencer if you are going to shoot a mime?");
	array.add ("How does the guy who drives the snowplow get to work in the mornings?");
	array.add ("If 7-11 is open 24 hours a day, 365 days a year, why are there locks on the doors?");
	array.add ("If nothing ever sticks to TEFLON, how do they make TEFLON stick to the pan?");
	array.add ("If you tied buttered toast to the back of a cat and dropped it from a height, what would happen?");
	array.add ("If you're in a vehicle going the speed of light, what happens when you turn on the headlights?");
	array.add ("You know how most packages say Open here. What is the protocol if the package says, \"Open somewhere else?");
	array.add ("Why do they put Braille dots on the keypad of the drive-up ATM?");
	array.add ("Why do we drive on parkways and park on driveways?");
	array.add ("Why is it that when you transport something by car, it's called a shipment, but when you transport something by ship,its called Cargo?");
	array.add ("If a cow laughed, would milk come out her nose?");
	array.add ("Why do they search airline pilots for weapons before they go fly? Are they worried about them hijacking their own airplanes?");
	array.add ("Why are airline crews drug and alcohol tested after they fly?");
	array.add ("If Barbie is so popular, why do you have to buy friends for her?");
	array.add ("For Sale: Parachute. Only used once, never opened, small stain.");
	array.add ("Why do psychics have to ask you for your name?");
	array.add ("Depression is merely anger without enthusiasm");
	array.add ("Boycott shampoo! Demand the REAL poo!");
	array.add ("I'm not cheap, but I am on special this week");
	array.add ("I almost had a psychic girlfriend but she left me before we met");
	array.add ("I intend to live forever - so far, so good");
	array.add ("If you ain't makin' waves, you ain't kickin' hard enough!");
	array.add ("Mental backup in progress - Do Not Disturb!");
	array.add ("Mind Like A Steel Trap - Rusty And Illegal In 37 States");
	array.add ("Quantum Mechanics: The dreams stuff is made of.");
	array.add ("Support bacteria - they're the only culture some people have");
	array.add ("Televangelists: The Pro Wrestlers of religion.");
	array.add ("Ambition is a poor excuse for not having enough sense to be lazy.");
	array.add ("If I worked as much as others, I would do as little as they.");
	array.add ("24 hours in a day ... 24 beers in a case ... coincidence?");
	array.add ("If everything seems to be going well, you have obviously overlooked something.");
	array.add ("Many people quit looking for work when they find a job.");
	array.add ("When I'm not in my right mind, my left mind gets pretty crowded.");
	array.add ("Everyone has a photographic memory. Some just don't have film.");
	array.add ("What happens if you get scared half to death twice?");
	array.add ("Energizer Bunny arrested, charged with battery.");
	array.add ("I poured Spot remover on my dog. Now he's gone.");
	array.add ("I used to have an open mind but my brains kept falling out.");
	array.add ("How do you tell when you run out of invisible ink?");
	array.add ("Join the Army, meet interesting people, kill them.");
	array.add ("Laughing stock: cattle with a sense of humor.");
	array.add ("Wear short sleeves! Support your right to bare arms!");
	array.add ("OK, so what's the speed of dark?");
	array.add ("I tried sniffing Coke once, but the ice cubes got stuck in my nose.");
	array.add ("Experience is something you don't get until just after you need it.");
	array.add ("A conscience is what hurts when all your other parts feel so good.");
	array.add ("For every action, there is an equal and opposite criticism.");
	array.add ("He who hesitates is probably right.");
	array.add ("No one is listening until you make a mistake.");
	array.add ("Success always occurs in private and failure in full view.");
	array.add ("The colder the X-ray table, the more of your body is required on it.");
	array.add ("The hardness of the butter is proportional to the softness of the bread.");
	array.add ("The severity of the itch is proportional to the reach.");
	array.add ("Two wrongs are only the beginning.");
	array.add ("You never really learn to swear until you learn to drive.");
	array.add ("The problem with the gene pool is that there is no lifeguard.");
	array.add ("If you must choose between two evils, pick the one you've never tried before.");
	array.add ("Change is inevitable... except from vending machines.");
	array.add ("Don't sweat petty things... or pet sweaty things.");
	array.add ("Plan to be spontaneous tomorrow.");
	array.add ("Always try to be modest. And be damn proud of it!");
	array.add ("If you think nobody cares about you, try missing a couple of payments.");
	array.add ("How many of you believe in telekinesis? Raise my hands...");
	array.add ("Attempt to get a new car for your spouse -- it'll be a great trade!");
	array.add ("I'd kill for a Nobel Peace Prize.");
	array.add ("Chastity is curable, if detected early.");
	array.add ("Don't be sexist; broads hate that!");
	array.add ("Love may be blind, but marriage is a real eye-opener.");
	array.add ("Hell hath no fury like the lawyer of a woman scorned.");
	array.add ("Hard work pays off in the future. Laziness pays off now.");
	array.add ("Borrow money from pessimists -- they don't expect it back.");
	array.add ("Half the people you know are below average.");
	array.add ("42.7 percent of all statistics are made up on the spot.");
	array.add ("If at first you don't succeed, then skydiving definitely isn't for you.");
	array.add ("Dying is the last thing I want to do.");
	array.add ("Two guys walk into a bar ... you'd think the second guy would've ducked!");
	array.add ("It's lonely at the top, but you eat better.");
	array.add ("Last week, I went to a furniture store to look for a decaffeinated coffee table.");
	array.add ("Imagine a corporate world with no politics.....some dream huh?");
	array.add ("Toe: A part of the foot used to find furniture in the dark.");
	array.add ("Landing: a controlled mid-air collision with a planet.");
	array.add ("Ever stop to think, and forget to start again?");
	array.add ("We have enough youth, how about a fountain of Smart?");
	array.add ("Life is a terminal disease!");
	array.add ("It's been Monday all week.");
	array.add ("Follow your dream!  Unless it's the one where you're at work in your underwear during a fire drill.");
	array.add ("Never kick a fresh cow chip on a hot day.");
	array.add ("\"Sumpter ubi sub ubi!\" (\"Always wear underwear!\")");
	array.add ("Never lick a gift horse in the mouth."); 
	array.add ("It's always darkest before dawn. (So if you're going to steal the neighbor's newspaper, that's the time to do it.)");
	array.add ("Two wrongs are only the beginning.");
	array.add ("The sooner you fall behind, the more time you'll have to catch up.");
	array.add ("Remember: it's pillage first, burn second!");
	array.add ("Eat horse dung, 50 zillion flies can't be all wrong!");
	array.add ("Incontinence Hotline...Can you hold, please?");
	array.add ("Lysdexia: a peech imspediment we live to learn with...");
	array.add ("If only women came with pull-down menus and on-line help.");
	array.add ("Would the Standing Committee please sit down?");
	array.add ("43.3% of statistics are meaningless!");
	array.add ("Circular Definition: see Definition, Circular.");
	array.add ("Madness takes its toll; please have exact change...");
	array.add ("It said 'Insert disk #3', but only two will fit.");
	array.add ("For a REAL sponge cake, BORROW all the ingredients.");
	array.add ("Why experiment on animals with so many lawyers out there?");
	array.add ("Bacon & eggs - Hens are involved but pigs are committed.");
	array.add ("Which is the non-smoking lifeboat?");
	array.add ("|||||||//////__ __ __ __ __    The domino effect at work.");
	array.add ("Originality is the art of concealing your sources.");
	array.add ("Just fill out one simple form to win an IRS Audit!");
	array.add ("Paper clips are the larval stage of coat hangers.");
	array.add ("Contents may have settled out of court.");
	array.add ("If idiots could fly, then this would be an airport.");
	array.add ("A day without sunshine is like night.");
	array.add ("A seminar on Time Travel will be held two weeks ago....");
	array.add ("Democracy: Four wolves and a lamb voting on lunch.");
	array.add ("Would you trust a POLITICIAN to run the country?");
	array.add ("Improve mail delivery... mail the posties their pay!!");
	array.add ("Thank you for holding your breath while I smoke.");
	array.add ("Treat each day as your last, one day you will be right.");
	array.add ("5 out of 4 people have trouble with fractions.");
	array.add ("I am the root of some evil... send some money.");
	array.add ("The buck doesn't even slow down here!");
	array.add ("If you think talk is cheap, try hiring a lawyer.");
	array.add ("Don't be sexist. Broads hate that.");
	array.add ("Oh, no! Not ANOTHER learning experience!");
	array.add ("The only cure for insomnia is to get more sleep.");
	array.add ("Don't question authority..... It hasn't got a clue!!!!!");
	array.add ("Advice is free: The right answer will cost plenty.");
	array.add ("Stupidity does not qualify as a handicap, park elsewhere!");
	array.add ("Multitasking = screwing up several things at once.");
	array.add ("Looking for a helping hand? There's one on your arm.");
	array.add ("Don't take life too seriously, it's not permanent.");
	array.add ("Don't Insult the Alligator till after you cross the river.");
	array.add ("A conclusion is where you got tired of thinking.");
	array.add ("Nothing's impossible for those who don't have to do it.");
	array.add ("History is a set of lies agreed upon by the Victor.");
	array.add ("After four decimal places, nobody cares.");
	array.add ("Almost all loan officers have artificial hearts.");
	array.add ("Two can live as cheaply as one, for half as long.");
	array.add ("I couldn't repair your brakes, so I made your horn louder.");
	array.add ("Never knock on Death's door: ring the doorbell and run (he hates that).");
	array.add ("I love defenseless animals, especially in a good gravy.");
	array.add ("Who is General Failure and why is he reading my hard disk?");
	array.add ("If you find yourself in a hole the first thing to do is stop digging!");
	array.add ("Beauty is in the eye of the beer holder ...");
	array.add ("Bills piling up?  Get back on your feet - miss a car payment.");
	array.add ("Monday is an awful way to spend 1/7th of your life.");
	array.add ("Guests who kill talk show hosts... On the last Geraldo.");
	array.add ("wok (noun):  something to thwow at a wabbit");
	array.add ("For children with short attention spans:  boomerangs that don't come back.");
	array.add ("Shin: a device for finding furniture in the dark.");
	array.add ("A clear conscience is usually the sign of a bad memory.");
	array.add ("Friends help you move.  Real friends help you move bodies.");
	array.add ("laser (noun):  Failed death ray.");
	array.add ("I drive way too fast to worry about cholesterol.");
	array.add ("A fool and his money are soon partying.");
	array.add ("The early bird gets the worm, but the second mouse gets the cheese");
	array.add ("\"I'd love to go out with you, but I have to floss my cat.\"");
	array.add ("If you choke a smurf, what color does it turn?");
	array.add ("If at first you don't succeed, destroy all evidence that you tried.");
	array.add ("As long as there are tests, there will be prayer in public schools.");
	array.add ("James Tiberius Kirk: \"Spock, the women on your planet are logical. No other planet in the galaxy can make that claim.\"");
	array.add ("\"We've been doubling sales every 18 months. However, when you start from zero, it takes a long while.\" - Stephen Yeo");
	array.add ("\"I get to go to lots of overseas places, like Canada.\" - Louisiana native Britney Spears");
	array.add ("\"It's a double-edged sword, but there's always tomorrow.\" - Great Big Sea");
	array.add ("Nothing says 'I Hate You' like a 20 megaton nuke! - Dar");
	array.add ("Residual Radiation - The gift that keeps on giving! - Dar");
	array.add ("Urban Renewal - Military term for an Impact Crater - Dar");
	array.add ("\"There are no atheists in fox holes.\" - team priest in Any Given Sunday");
	array.add ("\"The only secure Microsoft software is what's still shrink-wrapped in the warehouse.\" - Richard Forno");
	array.add ("Everyone gets an office with a window.  Unfortunately there's an oar coming through the window. A drummer drums, you grab the oar and row as if your life depends on it. Because (heh heh) IT DOES!");
	array.add ("\"Linus Torvalds is a lot like Bill Gates. Both are about the same height.\" - USA Today");
	array.add ("\"Might dlopen() be improved? Possibly. It won't get improved by him whining about it though. And there are tons of obvious ways to handle it, which makes him a stupid whiner too.\" - Linus Torvalds");
	array.add ("Power corrupts, and absolute power is actually pretty neat.");
	array.add ("People who make peaceful change impossible make violent change inevitable.");
	array.add ("A pessimist is always pleasantly surprised.");
	array.add ("A Freudian slip is where you say one thing, but meant your mother.");
	array.add ("Bills move through the mail at twice the speed of cheques.");
	array.add ("It's a shame that the only people who know who to run this country are busy driving cabs and cutting hair.");
	array.add ("Whose cruel idea was it to put an \"s\" in \"lisp\"?");
	array.add ("Life's not fair, but the root password helps.");
	array.add ("Ever notice what golf spells backwards?");
	array.add ("All CPU's wait at the same speed.");
	array.add ("Locate the offending units and reprogram them repeatedly with a claw hammer ...");
	array.add ("There are three kinds of people in the world:  those who can count, and those who can't.");
	array.add ("If you build a system that even a fool can use, only a fool will want to.");
	array.add ("Unix is user friendly, it's just selective about who it's friends are.");
	array.add ("Minds are like parachutes... they work best when open.");
	array.add ("\"To have a right to do a thing is not at all the same as to be right in doing it.\" - G.K. Chesterton");
	array.add ("Give a man some gum and he'll chew for a day. Teach him how to scrape gum off things and he'll chew for a lifetime."); 
	array.add ("\"This foreign policy stuff is a little frustrating.\" - George W. Bush as quoted by the New York Daily News, April 23, 2002");
	array.add ("\"format c:\" - Kills bugs dead!");
	array.add ("\"He who hesitates is bossed.\" - Chris Black");
	array.add ("\"The private thoughts of anyone would disturb just about anyone.\" - J.C. Fields");
	array.add ("Given one hour to live, the student replied: \"I'd spend it with professor FP who can make an hour seem like a lifetime.\"");
	array.add ("Integrity is doing the right thing when nobody is watching you.");
	array.add ("People think Microsoft is the answer. Microsoft is just the question, \"No\" is the answer.");
	array.add ("\"To err is human, to forgive is simply not my policy.\" - root");
	array.add ("FATAL ERROR: x86 Architecture Found.");
	array.add ("Think nothing is impossible? Try slamming a revolving door.");
	array.add ("Just once, I'd like someone to call me \"sir\" without adding \"you're making a scene.\"");
	array.add ("\"You shouldn't believe anything until it's been officially denied.\" - Claud Cockburn");
	array.add ("\"I'd rather be vaguely right than precisely wrong.\" - John Maynard Keynes");	
	array.add ("\"For three days after death hair and fingernails continue to grow but phone calls taper off.\" - Johnny Carson");
	array.add ("\"Sorry for the inconvenience.\" -God");
	array.add ("Here is the test to find whether your mission on Earth is finished:  if you're alive, it isn't.");
	array.add ("Life is like a beautiful melody, only the lyrics are messed up.");
	array.add ("Shyness has a strange element of narcissism, a belief that how we look, how we perform, is truly important to other people.");
	array.add ("Never attribute to malice that which can be adequately explained by stupidity.");
	array.add ("A good listener tries to understand thoroughly what the other person is saying.  In the end he may disagree sharply, but before he disagrees, he wants to know exactly what it is he is disagreeing with.");
	array.add ("Don’t worry about people stealing an idea.  If it’s original, you will have to ram it down their throats.");
	array.add ("The society which scorns excellence in plumbing as a humble activity, and tolerates shoddiness in philosophy because it is an exalted activity will have neither good plumbing nor good philosophy: neither its pipes nor its theories will hold water.");
	array.add ("A loving person lives in a loving world.  A hostile person lives in a hostile world.  Everyone you meet is your mirror.");
	array.add ("He who dies with the most toys is, nonetheless, still dead.");
	array.add ("I want to move to Theory.  Everything works in Theory.");
	array.add ("Never, under any circumstances, take a sleeping pill and a laxative at the same time.");
	array.add ("No matter how trivial an event, someone will always take it too seriously.");
	array.add ("PC's are like air conditioners:  they stop working properly if you open windows.");
	array.add ("Deja Moo:  The feeling you have heard the same bull before.");
	array.add ("The mothers of teenagers know why some animals eat their young.");
	array.add ("I like long walks, especially if they are taken by annoying people.");
	array.add ("There are two kinds of secrets:  those not worth knowing, and those too good to keep.");
	array.add ("The key ingredient to a good speech is a little shortening.");
	array.add ("The only function of economic forecasting is to mkae astrology appear credible.");
	array.add ("Seven words every woman wants to hear:\"I love you.  There, I said it\"\n(Everyody Loves Raymond)");
	array.add ("Hardware Management Console:  the non-Nimda method for remotely powering off a machine.");
	array.add ("So what if I have a short attention span?  That doesn't mean ...");
	array.add ("A minor surgery is one performed on someone else.");
	array.add ("Depend on the rabbit foot if you will, but remember:  it didn't work for the rabbit.");
	array.add ("If at first you do succeed, try not to look astonished.");
	array.add ("A day without sunshine is like a day in Vancouver.");
	array.add ("Bucket seats are wonderful.  The problem is that not everyone has the same-sized bucket.");
	array.add ("Family trees grow all kinds of strange nuts.");
	array.add ("I put the \"mental\" in \"departmental\". - Jerome Chinn");
	array.add ("I put the \"mental\" in \"developmental\". - Jerome Chinn");
	array.add ("The height of embarrassment is meeting someone else’s eye through a keyhole.");
	array.add ("I have given two cousins to war and I stand ready to sacrifice my wife's brother. - Artemus Ward (1834 - 1867)");
	array.add ("Some people bring happiness wherever they go; others bring happiness whenever they go.");
	array.add ("If computers get too powerful, we can organize them into a committee - that will do them in.");
	array.add ("I didn't attend the funeral, but I sent a nice letter saying that I approved of it. - Mark Twain");
	array.add ("Who is your parental unit? - Jerome Chinn");
	array.add ("Budget:  The process for methodically going bankrupt.");
	array.add ("\"Iraq will not be defeated. Iraq has now already achieved victory - apart from some technicalities.\" - Mohsen Khalil, Iraq's Ambassador to the Arab League");
	array.add ("We are all young once.  That is all society can stand.");
	array.add ("When you go into court you are putting your fate into the hands of twelve people who weren't smart enough to get out of jury duty. - Norm Crosby");
	array.add ("All television is children's television. - Richard P. Adler");
	array.add ("What's the difference between a boyfriend and a husband? About 30 pounds. - Cindy Gardner");
	array.add ("The prime purpose of eloquence is to keep other people from talking. - Louis Vermeil");
	array.add ("Exit, pursued by a bear. - William Shakespeare (1564 - 1616), Stage direction in \"The Winter's Tale\"");
	array.add ("Education is the ability to listen to almost anything without losing your temper. - Robert Frost (1874 - 1963)");
	array.add ("A child of five would understand this. Send someone to fetch a child of five. - Groucho Marx (1890 - 1977)");
	array.add ("There are only two kinds of scholars; those who love ideas and those who hate them. - Emile Chartier");
	array.add ("Mississipi is as dry as a martini, and we have the alcoholics to prove it. - Mississipi Burning (unnamed character)");
	array.add ("Nobody believes the official spokesman... but everybody trusts an unidentified source. - Ron Nesen");
	array.add ("Tact is the ability to describe others as they see themselves. - Abraham Lincoln (1809 - 1865)");
	array.add ("The best way to keep one's word is not to give it. - Napoleon Bonaparte (1769 - 1821)");
	array.add ("The absence of alternatives clears the mind marvelously. - Henry Kissinger");
	array.add ("If the only tool you have is a hammer, you tend to see every problem as a nail. - Abraham Maslow");
	array.add ("I'm not a real movie star. I've still got the same wife I started out with twenty-eight years ago. - Will Rogers (1879 - 1935)");
	array.add ("All great truths begin as blasphemies. - George Bernard Shaw (1856 - 1950), Annajanska (1919)");
	array.add ("Sure there are dishonest men in local government. But there are dishonest men in national government too. - Richard M. Nixon (1913 - 1994)");
	array.add ("Only the mediocre are always at their best. - Jean Giraudoux (1882 - 1944)");
	array.add ("Everything is in a state of flux, including the status quo. - Robert Byrne");
	array.add ("I once said cynically of a politician, \"He'll doublecross that bridge when he comes to it.\" - Oscar Levant (1906 - 1972)");
	array.add ("Success usually comes to those who are too busy to be looking for it. - Henry David Thoreau (1817 - 1862)");
	array.add ("I do not want people to be agreeable, as it saves me the trouble of liking them. - Jane Austen (1775 - 1817)");
	array.add ("The trouble with America is that there are far too many wide-open spaces surrounded by teeth. - Charles Luckman");
	array.add ("Editor: a person employed by a newspaper, whose business it is to separate the wheat from the chaff, and to see that the chaff is printed. - Elbert Hubbard (1856 - 1915)");
	array.add ("Anybody can win unless there happens to be a second entry. -  George Ade (1866 - 1944)");
	array.add ("I can't understand why people are frightened of new ideas. I'm frightened of the old ones. - John Cage (1912 - 1992)");
	array.add ("The average Ph.D. thesis is nothing but a transference of bones from one graveyard to another. - J. Frank Dobie (1888 - 1964), \"A Texan in England\", 1945");
	array.add ("If all the girls who attended the Yale prom were laid end to end, I wouldn't be a bit surprised. - Dorothy Parker (1893 - 1967)");
	array.add ("A good listener is usually thinking about something else. - Kin Hubbard (1868 - 1930)");
	array.add ("The squeaking wheel doesn't always get the grease. Sometimes it gets replaced. - Vic Gold");
	array.add ("Diplomacy is the art of saying \"Nice doggie\" until you can find a rock. - Will Rogers (1879 - 1935)");
	array.add ("Don't just do something, stand there! - Andy Barrie, commenting on the lack-luster approach of Toronto, provincial and federal proliticians to dealing with the SARS outbreak in Toronto (April 21st, 2003)");
	array.add ("He who hesitates is not only lost, but miles from the next exit.");
	array.add ("A cynic is a man who, when he smells flowers, looks around for a coffin. - H. L. Mencken (1880 - 1956)");
	array.add ("Often it does seem a pity that Noah and his party did not miss the boat. - Mark Twain (1835 - 1910)");
	array.add ("Nostalgia isn't what it used to be. - Peter De Vries");
	array.add ("A lot of people mistake a short memory for a clear conscience. - Doug Larson");
	array.add ("Accomplishing the impossible means only that the boss will add it to your regular duties. - Doug Larson");
	array.add ("Few things are more satisfying than seeing your own children have teenagers of their own. - Doug Larson");
	array.add ("If all the cars in the United States were placed end to end, it would probably be Labor Day Weekend. - Doug Larson");
	array.add ("Instead of giving a politician the keys to the city, it might be better to change the locks. - Doug Larson");
	array.add ("The cat could very well be man's best friend but would never stoop to admitting it. - Doug Larson");
	array.add ("The surprising thing about young fools is how many survive to become old fools. - Doug Larson");
	array.add ("What some people mistake for the high cost of living is really the cost of high living. - Doug Larson");
	array.add ("Advice is what we ask for when we already know the answer but wish we didn't. - Erica Jong");
	array.add ("The real art of conversation is not only to say the right thing at the right place but to leave unsaid the wrong thing at the tempting moment. - Dorothy Nevill");
	array.add ("When we ask for advice, we are usually looking for an accomplice. - Marquis de la Grange (1639 - 1692)");
	array.add ("I have the heart of a child. I keep it in a jar on my shelf. - Robert Bloch (1917 - 1994)");
	array.add ("I generally avoid temptation unless I can't resist it. - Mae West (1892 - 1980)");
	array.add ("There ought to be one day - just one - when there is open season on senators. - Will Rogers (1879 - 1935)");
	array.add ("Trying to be a first-rate reporter on the average American newspaper is like trying to play Bach's 'St. Matthew's Passion' on a ukelele. - Bagdikian's Observation");
	array.add ("People can have the Model T in any colour - so long as it's black. - Henry Ford (1863 - 1947)");
	array.add ("I feel about airplaines the way I feel about diets. It seems to me they are wonderful things for other people to go on. - Jean Kerr");
	array.add ("Every generation imagines itself to be more intelligent than the one that went before it, and wiser than the one that comes after it. - George Orwell (1903 - 1950)");
	array.add ("\"We're Americans.  Do you know what that means?  It means our forefeathers were kicked out of every decent country in the world.\" - Bill Murray, Stripes");
	array.add ("Fall is my favorite season in Los Angeles, watching the birds change color and fall from the trees. - David Letterman");
	array.add ("It's time for the human race to enter the solar system. - Dan Quayle");
	array.add ("Human beings are the only creatures that allow their children to come back home. - Bill Cosby");
	array.add ("It's not whether you win or lose, it's how you place the blame.");
	array.add ("Whenever I hear anyone arguing for slavery, I feel a strong impulse to see it tried on him personally. - Abraham Lincoln (1809 - 1865)");
	array.add ("The United States is a nation of laws: badly written and randomly enforced. - Frank Zappa (1940 - 1993)");
	array.add ("Stoop and you'll be stepped on; stand tall and you'll be shot at. - Carlos A. Urbizo");
	array.add ("When we got into office, the thing that surprised me the most was that things were as bad as we'd been saying they were. - John F. Kennedy (1917 - 1963)");
	array.add ("Forgive your enemies, but never forget their names. - John F. Kennedy (1917 - 1963)");
	array.add ("The chief obstacle to the progress of the human race is the human race. - Don Marquis (1878 - 1937)");
	array.add ("Happiness is having a large, loving, caring, close-knit family in another city. - George Burns (1896 - 1996)");
	array.add ("If fifty million people say a foolish thing, it is still a foolish thing. - Anatole France (1844 - 1924)");
	array.add ("Politicians are the same all over. They promise to build a bridge even where there is no river. - Nikita Khrushchev (1894 - 1971)");
	array.add ("A positive attitude may not solve all your problems, but it will annoy enough people to make it worth the effort. - Herm Albright (1876 - 1944)");
	array.add ("Skiing combines outdoor fun with knocking down trees with your face. - Dave Barry");
	array.add ("Power corrupts. Absolute power is kind of neat. - John Lehman, Secretary of the Navy, 1981-1987");
	array.add ("I believe in equality for everyone, except reporters and photographers. - Mahatma Gandhi (1869 - 1948)");
	array.add ("An idealist is a person who helps other people to be prosperous. - Henry Ford (1863 - 1947)");
	array.add ("The illegal we do immediately. The unconstitutional takes a little longer. - Henry Kissinger, New York Times, Oct. 28, 1973");
	array.add ("After twelve years of therapy my psychiatrist said something that brought tears to my eyes. He said, 'No hablo ingles.' - Ronnie Shakes");
	array.add ("When someone tells you something defies description, you can be pretty sure he's going to have a go at it anyway. - Clyde B. Aster");
	array.add ("In heaven all the interesting people are missing. - Friedrich Nietzsche (1844 - 1900)");
	array.add ("The human race is faced with a cruel choice:  work or daytime television.");
	array.add ("The whole world is in revolt. Soon there will be only five Kings left:  the King of England, the King of Spades, The King of Clubs, the King of Hearts, and the King of Diamonds. - King Farouk of Egypt (1920 - 1965), 1948");
	array.add ("Good-bye. I am leaving because I am bored. - George Saunders, last words");
	array.add ("To know all is not to forgive all. It is to despise everybody. - Quentin Crisp");
	array.add ("We live in an age when pizza gets to your home before the police. - Jeff Marder");
	array.add ("By all means marry; if you get a good wife, you'll be happy. If you get a bad one, you'll become a philosopher. - Socrates (469 BC - 399 BC)");
	array.add ("He's the kind of a guy who lights up a room just by flicking a switch.");
	array.add ("There is no doubt that the first requirement for a composer is to be dead. - Arthur Honegger (1892 - 1955)");
	array.add ("Reality is merely an illusion, albeit a very persistent one. - Albert Einstein (1879 - 1955)");
	array.add ("Every man serves a useful purpose: A miser, for example, makes a wonderful ancestor. - Laurence J. Peter (1919 - 1988)");
	array.add ("What this country needs is more free speech worth listening to. - Hansell B. Duckett");
	array.add ("Prediction is very difficult, especially about the future. - Niels Bohr (1885 - 1962)");
	array.add ("I have never let my schooling interfere with my education. - Mark Twain (1835 - 1910)");
	array.add ("Under certain circumstances, profanity provides a relief denied even to prayer. - Mark Twain (1835 - 1910)");
	array.add ("No one travelling on a business trip would be missed if he failed to arrive. - Thorstein Veblen (1857 - 1929)");
	array.add ("If all economists were laid end to end, they would not reach a conclusion. - George Bernard Shaw (1856 - 1950)");	
	array.add ("\"For as long as I can remember I've had memories.\" - Colin Mockery, Whose Line Is It Anyways?");
	array.add ("\"That’s an awful lot of monkeys with guns.\", Metamorpho (Outsiders #1, August, 2003)");
	array.add ("\"How can we be number two and doing so badly?\" - Larry Ellison, Orace CEO, Oracle Apps World conference 2003");
	array.add ("Q:  What's 65 feet long and has three teeth?\nA:  The front row at a Willie Nelson concert.");
	array.add ("\"What is the capital of Canada?\"\n\"Mostly American.\"");
	array.add ("Dell puts the \"no\" in \"innovation\". - Blue Monday");
	array.add ("It is always the best policy to speak the truth - unless, of course, you are an exceptionally good liar. - Jerome K. Jerome (1859 - 1927)");
	array.add ("Work is the curse of the drinking classes. - Oscar Wilde (1854 - 1900)");
	array.add ("When I am abroad, I always make it a rule never to criticize or attack the government of my own country. I make up for lost time when I come home. - Sir Winston Churchill (1874 - 1965)");
	array.add ("\"The Irish have an old saying:  don't listen to old Italian sayings.\" - Bruce Willis, Striking Distance");
	array.add ("Opportunity is missed by most people because it is dressed in overalls and looks like work. - Thomas Edison (1847 - 1931)");
	array.add ("Every generation imagines itself to be more intelligent than the one that went before it, and wiser than the one that comes after it. - George Orwell (1903 - 1950)");
	array.add ("Friends come and go but enemies accumulate.");
	array.add ("If you drink, don't drive. Don't even putt. - Dean Martin");
	array.add ("The worst moment for the atheist is when he is really thankful and has nobody to thank. - Dante Gabriel Rossetti (1828 - 1882)");
	array.add ("Some people are like slinkies:  they aren’t good for much, but it’s fun to watch them tumble down the stairs.");
	array.add ("\"I may have invented control-alt-delete, but Bill Gates made it really famous,\" David Bradley told a gathering at the twentieth anniversary of the PC.  This comment brought boundless laughter from the PC loving crowd.  Bill Gates did not even crack a smile.");
	array.add ("\"Treat the customers with the respect they are paying for.\" - Steve Langridge");
	array.add ("\"My fault; your problem.\" - Steve Langridge");
	array.add ("\"This is the sort of English up with which I shall not put.\" - Winston Churchill");
	array.add ("If the facts are on your side, pound the facts. If the law is on your side, pound the law. If neither the law nor the facts are with you, pound the table.");
	array.add ("Yogi Berra is reputed to have said, \"In theory, there is no difference between theory and practice. In practice, there is.\"");
	array.add ("\"A career with NASA isn't in his future.\" - Peter Robertson");
	array.add ("\"He's an excellent argument for birth control.\" - Mel Lastman, Mayor of Toronto");
	array.add ("Computer Science: for programmers who want to know what they're doing.");
	array.add ("What do Vegan Zombies Crave? GRAAAAAIIIINNNSSS.....");
	array.add ("This is not a book to set aside lightly, it should be thrown aside with great force.");
	array.add ("\"Magnetism, as you recall from physics class, is a powerful force that causes certain items to be attracted to refrigerators.\" - Dave Barry");
	
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