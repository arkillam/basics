package ca.thekillams.widgets.panels;

import java.awt.*;
import javax.swing.*;

/**
 * This simple class create a panel with two labels, one on the left side, the other on the right.
 * 
 * <UL>
 * <LI>Version 1.0 - 04/09/2002 - the original class, part of the organizer.panels package
 * <LI>Version 1.1 - 05/18/2003 - moved to the widgets.panels package
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.0 - 04/09/2002
 */

public class panel_twolabels extends JPanel
{
	
////////////////////////////////////////////////////////////////////////////////////////////////
// private variables
////////////////////////////////////////////////////////////////////////////////////////////////

private		JLabel			l_left;							// the left label (duh! :)
private		JLabel			l_right;						// the right label (duh! :)

////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
////////////////////////////////////////////////////////////////////////////////////////////////

/**  A simple constructor which specifies the text for the two labels.
 * 
 * @since		1.0
 */

// default - alignment is left for both, blue font, white background
public panel_twolabels (String left, String right, boolean balanced)
{
	if (balanced == true)
	{
		// set the layout
		setLayout (new GridLayout (1, 2));
		
		// the left label
		l_left = new JLabel (left, JLabel.LEFT);
		add (l_left);
		
		// the right label
		l_right = new JLabel (right, JLabel.LEFT);
		add (l_right);
	}
	else
	{
		// set the layout
		setLayout (new BorderLayout (10, 1));
	
		// the left label
		l_left = new JLabel (left, JLabel.LEFT);
		add (l_left, BorderLayout.WEST);
	
		// the right label
		l_right = new JLabel (right, JLabel.LEFT);
		add (l_right, BorderLayout.CENTER);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////
// mutator functions
////////////////////////////////////////////////////////////////////////////////////////////////

/**  Sets the text of the left label.
 * 
 * @param		value		the value to be displayed
 * 
 * @since		1.1
 */

public void setLeft (String value)
{
	l_left.setText (value);
}

/**  Sets the text of the right label.
 * 
 * @param		value		the value to be displayed
 * 
 * @since		1.0
 */

public void setRight (String value)
{
	l_right.setText (value);
}
	
}