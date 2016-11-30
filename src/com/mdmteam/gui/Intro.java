package com.mdmteam.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.mdmteam.main.Game;

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
		g.drawImage(image, 0, 0, 1200, 672, null);
	}
	
	public static void setMenuEnum() {
		Game.state = Game.STATE.MENU; 
	}

}
