/**
 * 
 */
package sandbox;

/**
 * Used to Demonstrate how to serialize and recover an object into XML code.
 * 
 * <UL>
 * <LI>Version 1.0 - 03/20/2008 - the original class
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.0 - 03/20/2008
 */


public class XMLSerializeExample
{

private String name;

public XMLSerializeExample ()
{
	name = "Andrew Killam";
}

public String getName ()
{
	return name;
}

public void setName (String name)
{
	this.name = name;
}

public String toString ()
{
	return this.getClass ().getName () + ":  " + name; 
}

}
