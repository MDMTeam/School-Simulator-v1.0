package com.mumikcz.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import com.mumikcz.input.Keyboard;
import com.mumikcz.main.Game;

public class Intro {
	
	private BufferedImage image;
	
	public Intro() {
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/MDM-LOGO-COMPLETE.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void render(Graphics g) {
		g.drawImage(image, 0, 0, 900, 504, null);
	}
	
	public static void setMenuEnum() {
		Game.state = Game.STATE.MENU; 
	}

}
