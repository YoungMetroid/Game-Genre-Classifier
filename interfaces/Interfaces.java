package main.interfaces; 

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Interfaces extends JPanel implements ChangeListener{

	
	private JSlider[] sliders = new JSlider[6];
	private JPanel[] panels = new JPanel[6];
	private JLabel[] labels = new JLabel[12];
	private String[] labelNames = {"Linear","Open World",
									"No leveling System","Lots of atributes to level up",
										"No Items to Collect","Lots of Items to Collect",
										"Cartoon Graphics","Realistic Graphics",
										"No Killing ","Lots of Killing",
										"",""};
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	public void Interfaces()
	{
		setLayout(new GridLayout(7,1,0,0));
		
		
	}

}
