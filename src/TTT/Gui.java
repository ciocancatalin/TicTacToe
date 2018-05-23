package TTT;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {

	JFrame jf;
	Draw draw;
	JButton buttonReset;
	
	static JButton btn[] = new JButton[9];
	static int[] state = new int[9];
	static int movesLeft = 9;
	static int player = 0;
	static int winner = 0;
	
	public Gui() {
		
		jf = new JFrame();
		jf.setSize(800,600);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setTitle("Tic Tac Toe");
		jf.setVisible(true);
		
		for(int i = 0; i < btn.length; i++){
			btn[i] = new JButton();
			btn[i].setVisible(true);
			btn[i].addActionListener(new ActionHandler());
			btn[i].setFocusPainted(false);
			btn[i].setContentAreaFilled(false);
			btn[i].setBorder(null);	
			jf.add(btn[i]);
			
		}
		ButtonPlacement.place();
		
		buttonReset = new JButton("Reset");
		buttonReset.setBounds(675, 500, 100, 40);
		buttonReset.setVisible(true);
		buttonReset.setFocusPainted(false);
		buttonReset.setBackground(new Color(51, 102, 153));
		buttonReset.setForeground(Color.WHITE);
		buttonReset.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						BTNReset.reset();
					}
		});
		jf.add(buttonReset);
		draw = new Draw();
		draw.setVisible(true);
		draw.setBounds(0,0,800,600);
		jf.add(draw);
		
	}

}
