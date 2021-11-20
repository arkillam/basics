package ca.thekillams.widgets.icons;

import java.awt.*;

/**
 * The icon class displays an icon with a box with horizontal lines.
 * 
 * <BR>Version 1.0 - 04/09/2002 - this
 * 
 * @author	Andrew Killam
 * @version	1.0 - 04/09/2002
 */

public class icon_view extends icon_base
{
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
// constructor
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
/**  This constructor specicifies the colour of the contents.
 * 
 * @param		c		the color of the contents
 * 
 * @since		1.0
 */
	
public icon_view (Color c)
{
	super ();
	setIconColour (c);
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
	
	// set co-ordinates to behave more simply (i.e. we start drawing at (0, 0))
	g.translate (x, y);
		
	// white background
	g.setColor (Color.white);
	g.fillRect (0, 0, width, height);
		
	// black border
	g.setColor (Color.black);
	g.drawRect (0, 0, width, height);
		
	// internal black border
	g.setColor (Color.black);
	g.drawRect (4, 2, width - 8, height - 4);
		
	// lines
	g.setColor (getIconColour ());
	for (int i = 2; i <= (height - 2); i += 2)
	{
		g.drawLine (4, i, width - 4, i);
	}
		
	// restore the co-ordinate system
	g.translate (-x, -y);
		
	// restore the colour to black
	g.setColor (Color.black);
}

}