package ca.thekillams.widgets.icons;

import java.awt.*;

/**
 * The icon class displays an icon with a box with one or more characters in it.
 * 
 * <BR>Version 1.0 - 04/09/2002 - this
 * 
 * @author	Andrew Killam
 * @version	1.0 - 04/09/2002
 */

public class icon_character extends icon_base
{

//////////////////////////////////////////////////////////////////////////////////////////////////////////
// private objects
//////////////////////////////////////////////////////////////////////////////////////////////////////////

/** the character(s) in the icon */
private String character;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  constructor
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**  This constructor specicifies the character to display, and the colour it should be displayed in.
 * 
 * @param		c		the color of the contents
 * @param		s		the character to display
 * 
 * @since		1.0
 */
	
public icon_character (Color c, char s)
{
	super ();
	setIconColour (c);
	
	// store the character in an array, so that
	// it can be made into a string
	char temp[] = new char[1];
	temp[0] = s;
	character = new String (temp);
}

/**  This constructor specicifies multiple characters to display, and the colour they should be displayed in.
 * 
 * @param		c		the color of the contents
 * @param		s		the characters to display
 * 
 * @since		1.0
 */
	
public icon_character (Color c, String s)
{
	super ();
	setIconColour (c);
	
	// store the characters in a string
	character = s;
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  paint function
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**  Paints the icon.
 * 
 * @param		c		the component this icon is in
 * @param		g		the graphics context of the component
 * @param		x		the x-offset, so that we are drawing at (0, 0)
 * @param		y		the y-offset, so that we are drawing at (0, 0)
 * 
 * @since		1.0
 */

public void paintIcon (Component c, Graphics g, int x, int y)
{
	// cache the width and height of the icon
	int height = getIconHeight ();
	int width = getIconWidth ();
	
	Graphics2D g2d = (Graphics2D) g;
	
	g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.setRenderingHint (RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	g2d.setRenderingHint (RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
	g2d.setRenderingHint (RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	
	// set co-ordinates to behave more simply (i.e. we start drawing at (0, 0))
	g2d.translate (x, y);
		
	// white background
	g2d.setColor (Color.white);
	g2d.fillRect (0, 0, width, height);
		
	// black border
	g2d.setColor (Color.black);
	g2d.drawRect (0, 0, width, height);
		
	// centered character
	g2d.setColor (getIconColour ());
	int dx = (width >> 1) - (g.getFontMetrics ().stringWidth (character) >> 1) + 1;
	g2d.drawString (character, dx, height - 4);
		
	// restore the co-ordinate system
	g2d.translate (-x, -y);
		
	// restore the colour to black
	g2d.setColor (Color.black);
}

}