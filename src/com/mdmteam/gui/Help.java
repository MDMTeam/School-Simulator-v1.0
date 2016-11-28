package com.mdmteam.gui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Help {
	
	private BufferedImage image;
	
	public Help() {
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/help.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void render(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

}
