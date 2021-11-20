package ca.thekillams.widgets.panels;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

/**
 * This class provides a circular dial representing a percentage value.  For
 * values above 0.80, green is used, below 0.20 red is used, and otherwise
 * yellow is the colour for the pie slice. 
 * 
 * <UL>
 * <LI>Version 1.0 - 07/01/2003 - the original class
 * <LI>Version 1.1 - 05/25/2004 - added an optional title
 * </UL>
 * 
 * @author	Andrew Killam
 * @version	1.1 - 05/25/2004
 */

public class panel_dial extends JPanel
{
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  private objects
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/** stores the percentage to be displyaed */	
private float percentage;

/** a short string to display over the dial face */
private String title = null;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  constructor
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**		Constructs a dial without a title.
 * 
 * 		@param		initial		the initial percentage to display
 * 
 * 		@since		1.0
 */

public panel_dial (float initial)
{
	// call the superclass' constructor (just in case :)
	super ();
	
	// smaller than this, and you don't have a good look
	// (setMinimumSize seems to be ignored by Swing, so I'm using
	// setPreferredSize instead) 
	setPreferredSize (new Dimension (20, 20));
	setMinimumSize (new Dimension (20, 20));
	
	// set the initial percentage
	setPercentage (initial);
	
	// no title to display
	title = null;	
}

/**		Constructs a dial with a title.
 * 
 * 		@param		t			the title to display
 * 		@param		initial		the initial percentage to display
 * 
 * 		@since		1.1
 */

public panel_dial (String t, float initial)
{
	// call the superclass' constructor (just in case :)
	super ();
	
	// smaller than this, and you don't have a good look
	// (setMinimumSize seems to be ignored by Swing, so I'm using
	// setPreferredSize instead) 
	setPreferredSize (new Dimension (20, 20));
	setMinimumSize (new Dimension (20, 20));
	
	// set the initial percentage
	setPercentage (initial);
	
	// set the title to display
	title = t;	
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  functions
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**		Overrides the JPanel's paint function.
 * 
 * 		@param		g		the panel's associated graphics object
 * 
 * 		@since		1.0 
 */
	
public void paint (Graphics g)
{
	// get the width and height of the component	
	int width = getWidth ();
	int height = getHeight ();
	
	// create the image buffer and it's Graphics2D instance
	BufferedImage buffer = new BufferedImage (width, height, BufferedImage.TYPE_INT_ARGB);
	Graphics2D g2d = (Graphics2D) buffer.getGraphics ();
	
	// suggest:
	// anti-aliasing, text anti-aliasing, rendering and colour rendering all be
	// performed for optimal quality (as opposed to speed)
	g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	g2d.setRenderingHint (RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	g2d.setRenderingHint (RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
	g2d.setRenderingHint (RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	
	// rotate the display 90 degrees counter-clockwise so that arc's start at
	// 12:00 instead of 3:00
	//g2d.rotate(Math.toRadians (-90.0), (double) buffer.getWidth (), (double) buffer.getHeight ());
	
	// determine the smaller measurement
	// (thus rectangular panels still get perfect circles, not the
	// vastly inferior ellipses :)
	int size =  Math.min (width - 2, height - 2);
	if (size < 2) size = 2;
	
	// calculate half the length of the smaller measurement
	int half = size / 2;
	if (half < 1) half = 1;
	
	// determine the centre point of the panel
	int cx = (width / 2) - 1;
	if (cx < 1) cx = 1;
	int cy = (height / 2) - 1;
	if (cy < 1) cy = 1;
	
	// draw the background colour
	g2d.setColor (getBackground ());
	g2d.fillRect (0, 0, width, height);
	
	// fill the circle's background
	//g.setColor (Color.WHITE);
	g2d.setColor (new Color (250, 50, 50));
	g2d.fillArc (cx - half + 1, cy - half + 1, size, size, 0, 360);
	
	// draw the filled-in part (reflects the value of the percentage)
	//if (percentage > 0.80f)		g.setColor (new Color (50, 250, 50));
	//else if (percentage < 0.20f)	g.setColor (new Color (250, 50, 50));
	//else							g.setColor (Color.YELLOW);
	g2d.setColor (new Color (50, 250, 50));
	g2d.fillArc (cx - half + 1, cy - half + 1, size, size, 0, (int)(360 * percentage));
	
	// draw the circle's black outline
	g2d.setColor (Color.black);
	g2d.drawArc (cx - half + 1, cy - half + 1, size, size, 0, 360);
	
	// draw the title
	if (title != null)
	{
		g2d.setColor (Color.white);
		FontMetrics fm = g2d.getFontMetrics ();
		g2d.drawString (title, (width >> 1) - (fm.stringWidth(title) >> 1), (height >> 1) + (fm.getHeight () >> 2));
		//g2d.drawString (title, cx, cy);
	} 
	
	// draw the buffered image to the screen
	g.drawImage (buffer, 0, 0, null);
}

/**		Overrides the JPanel's update function.
 * 
 * 		@param		g		the panel's associated graphics object
 * 
 * 		@since		1.0 
 */
	
public void update (Graphics g)
{
	paint (g);
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  mutators
////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**		Sets the percentage to be displayed.
 * 
 * 		@param		p		the percentage to be set
 * 
 * 		@since		1.0 
 */

public void setPercentage (float p)
{
	// bounds checking
	if (p < 0.0000f) p = 0.0000f;
	if (p > 1.0f) p = 1.0f;
	
	// set the percentage
	percentage = p;
	
	// request an update for this componenet to reflect
	// the new value
	repaint ();
}

}
