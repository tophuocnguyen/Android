package ptbac1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ptb1 extends JFrame {
	private JTextField textA;
	private JTextField textB;
	private JTextField textKQ;
	private float kq = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ptb1 frame = new ptb1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ptb1() {
		setTitle("Gi\u1EA3i ph\u01B0\u01A1ng tr\u00ECnh b\u1EADc 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel PTB1 = new JLabel("Ax+B=C");
		PTB1.setBounds(147, 25, 78, 27);
		getContentPane().add(PTB1);
		
		JLabel lblA = new JLabel("A =");
		lblA.setBounds(101, 78, 46, 14);
		getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B =");
		lblB.setBounds(101, 106, 46, 14);
		getContentPane().add(lblB);
		
		textA = new JTextField();
		textA.setBounds(147, 75, 86, 20);
		getContentPane().add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setBounds(147, 103, 86, 20);
		getContentPane().add(textB);
		textB.setColumns(10);
		
		JButton btnGiai = new JButton("Gi\u1EA3i");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Object source = e.getSource();
			        if(source == btnGiai)
			        {   
			        	 float a = Float.parseFloat(textA.getText());
			        	 float b = Float.parseFloat(textB.getText());
			        	 kq =  -b/a;
			        	 textKQ.setText(kq+"");
			        }
			}
		});
		btnGiai.setBounds(243, 102, 89, 23);
		getContentPane().add(btnGiai);
		
		JLabel lblKQ = new JLabel("K\u1EBFt qu\u1EA3 :");
		lblKQ.setBounds(90, 150, 46, 14);
		getContentPane().add(lblKQ);
		
		textKQ = new JTextField();
		textKQ.setEditable(false);
		textKQ.setBounds(146, 147, 86, 20);
		getContentPane().add(textKQ);
		textKQ.setColumns(10);
	}
}
