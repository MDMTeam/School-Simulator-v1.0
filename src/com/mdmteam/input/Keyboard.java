package com.mdmteam.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

    private boolean[] keys = new boolean[120];
    public boolean up, down, left, right, enter, esc;
    public boolean enterPressed = false;
    public boolean escPressed = false;

    public void update() {
        up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
        enter = keys[KeyEvent.VK_ENTER];
        esc = keys[KeyEvent.VK_ESCAPE];
    }

    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
    		enterPressed = true;
    		//System.out.println("Space Pressed");
    	}
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
    		escPressed = true;
    		//System.out.println("Space Pressed");
    	}
    }

    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    public void keyTyped(KeyEvent e) {
    	
    }

}
