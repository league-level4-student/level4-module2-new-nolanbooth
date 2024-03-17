package _06_Console_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Armani extends Food{
	public Armani() {
		
			this.item = "armani1.jpg";
		
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
