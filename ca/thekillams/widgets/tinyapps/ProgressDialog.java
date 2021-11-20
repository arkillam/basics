package ca.thekillams.widgets.tinyapps;

// written by Andrew Killam
// October 19th, 2005

import java.awt.*;
import javax.swing.*;

public class ProgressDialog extends JDialog
{

private JProgressBar bar;

public ProgressDialog (String title, int size)
{
	setUndecorated (true);
	setTitle (" ");
	setDefaultCloseOperation (JDialog.HIDE_ON_CLOSE);
	
	setAlwaysOnTop (true);
	setModal (false);
	
	bar = new JProgressBar ();
	bar.setMinimum (0);
	bar.setMaximum (size);
	bar.setValue (0);
	
	JPanel panel = new JPanel (new GridLayout (2, 1));
	panel.setBorder (BorderFactory.createEtchedBorder ());
	setContentPane (panel);
	add (new JLabel (title, JLabel.CENTER));
	add (bar);
	
	pack ();
		
	// centre the dialog window
	Dimension d = getSize ();
	Dimension scr = Toolkit.getDefaultToolkit ().getScreenSize ();
	int x = (scr.width >> 1) - (d.width >> 1);
	int y = (scr.height >> 1) - (d.height >> 1);
	setLocation (x, y);
	
	setVisible (true);
}

public void increment ()
{
	if (bar.getValue () < bar.getMaximum ())
	{
		bar.setValue (bar.getValue () + 1);
	}
}

public void set (int x)
{
	if (x < 0) x = 0;
	if (x > bar.getMaximum ()) x = bar.getMaximum ();
	
	bar.setValue (x);
}

}
