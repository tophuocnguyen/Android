package Javabasic;
import java.awt.*;        
import java.awt.event.*;

public class Conter extends Frame implements ActionListener{
	private Label lblCount;    
	   private TextField tfCount; 
	   private Button btnCount;   
	   private int count = 0;     
	 
	   public Conter() {
	      setLayout(new FlowLayout());
	       
	 
	      lblCount = new Label("Máy Đếm");  
	      add(lblCount);                    
	 
	      tfCount = new TextField("0", 10); 
	      tfCount.setEditable(false);       
	      add(tfCount);                     
	 
	      btnCount = new Button("Đếm");   
	      add(btnCount);                    
	 
	      btnCount.addActionListener(this);	 
	      setTitle("Counter");  
	      setSize(250, 100);        
	 
	 
	      setVisible(true);         
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conter app = new Conter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		++count; 
	      tfCount.setText(count + "");
	}

}
