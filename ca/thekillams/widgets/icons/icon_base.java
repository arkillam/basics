package ca.thekillams.widgets.icons;

import java.awt.*;
import javax.swing.*;

/**
 * The icon class is to be used to implement other icons.  It specifies a standard size (16x16) and 
 * provides functinos to get this value.
 * 
 * <BR>Version 1.0 - 04/09/2002 - this
 * 
 * @author	Andrew Killam
 * @version	1.0 - 04/09/2002
 */

abstract public class icon_base implements Icon
{

//////////////////////////////////////////////////////////////////////////////////////////////////////////
// private objects
//////////////////////////////////////////////////////////////////////////////////////////////////////////

private				Color				colour;				// the colour of the icon	
private				int					height;				// the icon's height
private				int					width;				// the icon's width

//////////////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
//////////////////////////////////////////////////////////////////////////////////////////////////////////

/**  This is the default constructor, which creates an icon of size 16x16.
 * 
 * @since		1.0
 */

public icon_base ()
{
	// a 16 x 16 icon
	height = 16;
	width = 16;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
// accessors
//////////////////////////////////////////////////////////////////////////////////////////////////////////

/**  Returns the main colour of the icon
 * 
 * @return		the main colour of the icon
 * 
 * @since		1.0
 */

public Color getIconColour ()
{
	return colour;
}

/**  Returns the height of the icon
 * 
 * @return		the height of the icon
 * 
 * @since		1.0
 */

public int getIconHeight ()
{
	return height;
}

/**  Returns the width of the icon
 * 
 * @return		the width of the icon
 * 
 * @since		1.0
 */

public int getIconWidth ()
{
	return width;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
// mutators
//////////////////////////////////////////////////////////////////////////////////////////////////////////

/**  Sets the main colour of the icon
 * 
 * @param		c		the main colour of the icon
 * 
 * @since		1.0
 */

public void setIconColour (Color c)
{
	colour = c;
}

}