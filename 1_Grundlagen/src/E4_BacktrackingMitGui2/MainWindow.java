package E4_BacktrackingMitGui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame implements ActionListener{
	
	private JPanel panel;
	
	private JButton solve;
	private JButton generate;
	
	public MainWindow() throws IOException {
		
		solve = new JButton("Solve a Maze!");
		generate = new JButton("Generate a Maze!");
		
		solve.addActionListener(this);
		generate.addActionListener(this);
		
		panel = new JPanel();
		
		panel.add(solve);
		panel.add(generate);
		
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == solve) {
			try {
				Solver solver = new Solver();
				solver.solve();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if (e.getSource() == generate) {
			try {
				Generator generator = new Generator();
				generator.generate();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
