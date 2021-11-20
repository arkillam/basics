package ca.thekillams.widgets.tinyapps;
import java.awt.*;
import java.awt.image.*;
import java.net.*;
import javax.swing.*;

public class Valentine extends JApplet implements Runnable
{
	
public static final int IMAGES = 4;
	
public static final String HEART = "http://thekillams.ca/valentine/heart.gif";

public static final String HEART2 = "http://thekillams.ca/valentine/heart2.gif";

public static final String HEART3 = "http://thekillams.ca/valentine/heart3.gif";

public static final String MESSAGE[] = {
	"Love is patient, love is kind.",
	"It does not envy, it does not boast, it is not proud.",
	"It is not rude, it is not self-seeking, it is not easily angered,",
	"it keeps no record of wrongs. Love does not delight in evil,",
	"but rejoices with the truth. It always protects, always trusts,",
	"always hopes, always perseveres.  Love never fails.",
	"Happy Valentine's Day, Perpetua!",
	"love, Andrew"};

public static final String TEDDY = "http://thekillams.ca/valentine/heart_with_teddy.gif";

public static final String TEDDY2 = "http://thekillams.ca/valentine/heart_with_teddy2.gif";

public Font font;

public Image images[];

public int x[], y[], dx[], dy[];

public Thread thread;

public Toolkit toolkit;
	
public void paint (Graphics g)
{
	int width = getWidth ();
	int height = getHeight ();
	
	BufferedImage buffer = new BufferedImage (width, height, BufferedImage.TYPE_INT_RGB);
	Graphics2D g2d = (Graphics2D) buffer.getGraphics ();
	g2d.setFont (font);
	
	FontMetrics fm = g2d.getFontMetrics ();
	
	Color background = new Color (250, 100, 100);
	g2d.setColor (background);
	g2d.fillRect (0, 0, width, height);
	
	g2d.setColor (Color.white);
	for (int i = 0; i < MESSAGE.length; i++)
	{
		int str_width = fm.stringWidth (MESSAGE[i]);
		int x = (width >> 1) - (str_width >> 1);
		g2d.drawString (MESSAGE[i], x, 50 * (i + 1));
	}
	
	for (int i = 0; i < IMAGES; i++)
	{
		g2d.drawImage (images[i], x[i], y[i], this);
	}	
	
	g.drawImage (buffer, 0, 0, null);
}

public void run ()
{
	Thread me = Thread.currentThread( );
	
	while (thread == me)
	{
		int width = getWidth ();
		int height = getHeight ();

		for (int i = 0; i < IMAGES; i++)
		{
			x[i] += dx[i];
			if (x[i] < 0)
			{
				x[i] = 0;
				dx[i] *= -1;
			}
			else if ((x[i] + images[i].getWidth (this)) > width)
			{
				x[i] = width - images[i].getWidth (this); 
				dx[i] *= -1;
			}

			y[i] += dy[i];
			if (y[i] < 0)
			{
				y[i] = 0;
				dy[i] *= -1;
			}
			else if ((y[i] + images[i].getHeight (this)) > height)
			{
				y[i] = height - images[i].getHeight (this); 
				dy[i] *= -1;
			}
		}	
		
		repaint ();
		
		try
		{
			Thread.sleep (33);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace ();
		}
	}
}
	
public void start ()
{
	toolkit = Toolkit.getDefaultToolkit ();
	
	font = new Font ("SansSerif", Font.PLAIN, 16);
	
	images = new Image[IMAGES];
	
	x = new int[IMAGES];
	y = new int[IMAGES];
	dx = new int[IMAGES];
	dy = new int[IMAGES];
	
	for (int i = 0; i < IMAGES; i++)
	{
		x[i] = 0;
		y[i] = 0;
		dx[i] = (i << 1) + 1;
		dy[i] = (i << 1) + 1;
		
		try
		{
			if (i > 0)
			{
				images[i] = toolkit.createImage (new URL (HEART3));
			}
			else
			{
				images[i] = toolkit.createImage (new URL (TEDDY2));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace ();
		}
	}
	
	if (thread == null)
	{
		thread = new Thread (this);
		thread.start ();
	}
}

public void stop ()
{
}

public void update (Graphics g)
{
	paint (g);
}

}
