package sandbox;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.Serializable;

/**
 * Demonstrates how to serialize and recover an object into XML code.
 * 
 * <UL>
 * <LI>Version 1.0 - 03/20/2008 - the original class
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.0 - 03/20/2008
 */

public class XMLSerializeDemo implements Serializable
{

public static void main (String[] args)
{
	try
	{
		XMLSerializeExample sample = new XMLSerializeExample ();
		
		FileOutputStream out = new FileOutputStream ("c:\\temp\\sample.xml");
		XMLEncoder enc = new XMLEncoder (out);
		enc.writeObject (sample);
		enc.close ();
		out.close ();
	}
	catch (Exception e)
	{
		e.printStackTrace ();
	}
}

}
