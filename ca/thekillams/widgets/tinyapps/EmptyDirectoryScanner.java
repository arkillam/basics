package ca.thekillams.widgets.tinyapps;
import java.io.*;
import java.util.*;

public class EmptyDirectoryScanner
{
	
/**		The default constructor.
 * 
 * 		@param		init_dir		the directory to start the scan from
 * 
 * 		@since		1.0
 */
	
public EmptyDirectoryScanner (String init_dir)
{
	// check that the directory is valid
	// create a file object from the passed-in directory 	
	File file = new File (init_dir);
	
	// only continue working if the string is indeed a directory
	if (file.isDirectory () == true)
	{
		// scan the directory tree
		ArrayList results = scan (init_dir);
		
		if (results != null)
		{
			// output the results
			for (int i = 0; i < results.size (); i++)
			{
				System.out.println (((File) results.get (i)).getAbsolutePath ());
			}
			
			// output the number of results
			System.out.println (results.size () + " empty directories were found.");
		}
		else
		{
			// output the number of results
			System.out.println ("0 empty directories were found.");
		}
	}
	else
	{
		// the user entered an invalid directory name
		System.out.println ("You did not enter a valid directory.");		
	}
}

/**		Scans a directory structure for empty directories and returns an
 * 		array listing them.
 * 
 * 		@param		dir		the directory to start with
 * 
 * 		@return		the list of empty directories
 * 
 * 		@since		1.0
 */

private ArrayList scan (String dir)
{
	// the array of files to return
	ArrayList<File> array = new ArrayList<File> (1000);
	
	// create a file object from the passed-in directory 	
	File file = new File (dir);
	
	// only continue working if the string is indeed a directory
	if (file.isDirectory () == true)
	{
		// stores the directories to scan 
		ArrayList<File> tree = new ArrayList<File> (200);
		tree.add (file);
		
		while (tree.size () > 0)
		{
			// get the directory at the top of the list
			file = (File) tree.get (0);
			
			//System.out.println (file.getAbsolutePath ());
			
			// remove the directory from the top of the list
			tree.remove (0);
			
			// flag for an empty directory
			boolean is_empty = true;
			
			// try to get sub-directories of this directory
			File subs[] = file.listFiles ();
			for (int i = 0; i < subs.length; i++)
			{
				// add the sub-directory to the list to scan
				if (subs[i].isDirectory () == true)
				{
					tree.add (subs[i]);	
				}
				// files have been found, so set the flag
				else
				{
					is_empty = false;
				}
			}		
			
			// if the directory is empty (no files), then add it to the list
			if (is_empty == true) array.add (file);			
		}
	}
	else
	{
		return null;
	}
	
	return array;
}

//////////////////////////////////////////////////////////////////////////////////////
//  main function
//////////////////////////////////////////////////////////////////////////////////////

/**		The main function.
 * 
 * 		@param		args		command-line parametres (which are duely ignored)
 * 
 * 		@since		1.0
 */

public static void main(String[] args)
{
	if (args.length != 1)
	{
		System.out.println ("Usage:  <initial directory>");
	}
	else
	{
		// create an instance of the application
		EmptyDirectoryScanner app = new EmptyDirectoryScanner (args[0]);
		app.toString (); // added merely to remove the "local variable is never read" warning :)
	}
}

}
