package javabasic;
import java.awt.*;
import java.awt.event.*;

public class MouseEvent1 extends Frame implements MouseListener{
	private TextField tfMouseX; 
	   private TextField tfMouseY; 
	 
	  
	   public MouseEvent1() {
	      setLayout(new FlowLayout());
	 
	      // Label (anonymous)
	      add(new Label("X-Click: "));
	 
	      // TextField
	      tfMouseX = new TextField(10);
	      tfMouseX.setEditable(false);
	      add(tfMouseX);                
	 
	      // Label (anonymous)
	      add(new Label("Y-Click: ")); 
	 
	      // TextField
	      tfMouseY = new TextField(10);
	      tfMouseY.setEditable(false);  
	      add(tfMouseY);                
	 
	      addMouseListener(this);

	 
	      setTitle("MouseEvent Demo"); 
	      setSize(350, 100);           
	      setVisible(true);           
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent1();
	}

	@Override
	public void mouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		tfMouseX.setText(evt.getX() + "");
	      tfMouseY.setText(evt.getY() + "");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
