package ca.thekillams.widgets.icons;

import java.awt.*;

/**
 * The icon class displays an icon with a box with an x in it.
 * 
 * <BR>Version 1.0 - 04/09/2002 - this
 * 
 * @author	Andrew Killam
 * @version	1.0 - 04/09/2002
 */

public class icon_exit extends icon_base
{
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  constructor
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
/**  This constructor specicifies the colour of the contents.
 * 
 * @param		c		the color of the contents
 * 
 * @since		1.0
 */
	
public icon_exit (Color c)
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
	Graphics2D g2d = (Graphics2D) g;
	
	g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.setRenderingHint (RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	g2d.setRenderingHint (RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
	g2d.setRenderingHint (RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	 
	// cache the width and height of the icon
	int height = getIconHeight ();
	int width = getIconWidth ();

	// set co-ordinates to behave more simply (i.e. we start drawing at (0, 0))
	g2d.translate (x, y);
		
	// white background
	g2d.setColor (Color.white);
	g2d.fillRect (0, 0, width, height);
		
	// black border
	g2d.setColor (Color.black);
	g2d.drawRect (0, 0, width, height);
		
	// coloured "X"
	g2d.setColor (getIconColour ());
	g2d.drawLine (4, 4, width - 4, height - 4);
	g2d.drawLine (width - 4, 4, 4, height - 4);
		
	// restore the co-ordinate system
	g2d.translate (-x, -y);
		
	// restore the colour to black
	g2d.setColor (Color.black);
}

}