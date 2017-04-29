import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui_Main extends JFrame
{
	private static final long serialVersion = 1L;
	public Gui_Main(String title)
	{
		setTitle(title);
		JPanel pnFlow = new JPanel();
		pnFlow.setLayout(new FlowLayout());
		pnFlow.setBackground(Color.PINK);
		JButton btn1 = new JButton("Thu");
		btn1.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent arg0){
						JOptionPane.showMessageDialog(null, "Da click");
					}
				});
		JButton btn2 = new JButton("Add control");
		pnFlow.add(btn1);
		pnFlow.add(btn2);
		Container con = getContentPane();
		con.add(pnFlow);
	}
	
	public static void main(String[] args)
	{
		Gui_Main mygui = new Gui_Main("Gui_Test");
		mygui.setSize(600, 100);
		mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mygui.setLocationRelativeTo(null);
		mygui.setVisible(true);
	}
}
