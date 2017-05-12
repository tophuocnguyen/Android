package javabasic;
import java.awt.*;
import java.awt.event.*;
public class CounterEdit extends Frame {
	private TextField tfCount;
	   private Button btnCountUp, btnCountDown, btnReset;
	   private int count = 0;
	 
	   public CounterEdit () {
	      setLayout(new FlowLayout());
	      add(new Label("Counter"));   
	      tfCount = new TextField("0", 10);
	      tfCount.setEditable(false);  
	      add(tfCount);               
	 
	      btnCountUp = new Button("Đếm tới");
	      add(btnCountUp);
	      btnCountUp.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	            ++count;
	            tfCount.setText(count + "");
	         }
	      });
	 
	      btnCountDown = new Button("Đếm lùi");
	      add(btnCountDown);
	      btnCountDown.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	            count--;
	            tfCount.setText(count + "");
	         }
	      });
	 
	      btnReset = new Button("Làm lại");
	      add(btnReset);
	      btnReset.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent evt) {
	            count = 0;
	            tfCount.setText("0");
	         }
	      });
	 
	      setTitle("Counter");
	      setSize(400, 100);
	      setVisible(true);
	   }
	public static void main(String[] args) {
		new CounterEdit();
	}

}
