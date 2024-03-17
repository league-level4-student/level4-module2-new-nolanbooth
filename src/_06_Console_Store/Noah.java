package _06_Console_Store;
import java.util.Random;

import javax.swing.JLabel;

public class Noah extends Food {
	public Noah() {
		
			this.item = "noah1.jpg";
		
		
			
		
	}

	@Override
	public JLabel getFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
}
