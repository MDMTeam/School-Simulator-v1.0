package com.mumikcz.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.mumikcz.gui.Menu;
import com.mumikcz.main.Game;

public class Mouse implements MouseListener, MouseMotionListener {

    private static int mouseX = -1;
    private static int mouseY = -1;
    private static int mouseB = -1;

    public static int getX() {
        return mouseX;
    }

    public static int getY() {
        return mouseY;
    }

    public static int getButton() {
        return mouseB;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        mouseB = mouseEvent.getButton();
        int mx = mouseEvent.getX();
        int my = mouseEvent.getY();
        
        if (Game.state == Game.STATE.MENU) {
        
        	if (mx >= Game.getWindowWidth() / 3 + 120 && mx <= Game.getWindowWidth() / 3 + 220) {
        		if (my >= 150 && my <= 200) {
        			Game.state = Game.STATE.GAME;
        		}
        	}
        

        	if (mx >= Game.getWindowWidth() / 3 + 120 && mx <= Game.getWindowWidth() / 3 + 220) {
        		if (my >= 250 && my <= 300) {
        			Game.state = Game.STATE.HELP;
        		}
        	}

        	if (mx >= Game.getWindowWidth() / 3 + 120 && mx <= Game.getWindowWidth() / 3 + 220) {
        		if (my >= 350 && my <= 400) {
        			System.exit(1);
        		}
        	}
        }
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        mouseB = -1;
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
    	mouseX = mouseEvent.getX();
    	mouseY = mouseEvent.getY();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        mouseX = mouseEvent.getX();
        mouseY = mouseEvent.getY();
    }
}
