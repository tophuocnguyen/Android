package javabasic;
import java.awt.*;
import java.awt.event.*;

public class KeyEvent extends Frame implements KeyListener{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		new KeyEvent();
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		taDisplay.append("You have typed " + evt.getKeyChar() + "\n");
	}

}
