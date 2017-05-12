package Javabacsic;
import java.awt.*;        
import java.awt.event.*;

public class Accumulator extends Frame implements ActionListener{
	private Label lblInput;     
	   private Label lblOutput;    
	   private TextField tfInput;  
	   private TextField tfOutput; 
	   private int sum = 0;        
	 
	   
	   public Accumulator() {
	      setLayout(new FlowLayout());
	 
	      lblInput = new Label("Nhập số nguyên: "); 
	      add(lblInput);               
	 
	      tfInput = new TextField(10); 
	      add(tfInput);                
	 
	      tfInput.addActionListener(this);
	         
	 
	      lblOutput = new Label("Tổng các số nguyên là: ");  
	      add(lblOutput);               
	 
	      tfOutput = new TextField(10); 
	      tfOutput.setEditable(false);  
	      add(tfOutput);                
	 
	      setTitle("AWT Accumulator");  
	      setSize(350, 120);  
	      setVisible(true);
	   }
	public static void main(String[] args) {
		new Accumulator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int numberIn = Integer.parseInt(tfInput.getText());
	      sum += numberIn;      
	      tfInput.setText("");  
	      tfOutput.setText(sum + ""); 
	}

}
