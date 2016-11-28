package com.mumikcz.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import com.mumikcz.main.Game;

public class Menu {
	
	public void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		if (Game.state == Game.STATE.MENU) {
			
			Rectangle play = new Rectangle(Game.getWindowWidth() / 3 + 120, 150, 100, 50);
			Rectangle help = new Rectangle(Game.getWindowWidth() / 3 + 120, 250, 100, 50);
			Rectangle quit = new Rectangle(Game.getWindowWidth() / 3 + 120, 350, 100, 50);
			
			Font fnt = new Font("arial", Font.BOLD, 50);
			g.setFont(fnt);
			g.setColor(Color.WHITE);
		
			g.drawString("Alej Simulator", Game.getWindowWidth() / 3, 100);
		
			Font fnt1 = new Font("arial", Font.BOLD, 30);
			g.setFont(fnt1);
			g.drawString("Hrat", play.x + 18, play.y + 35);
			g.drawString("Help", help.x + 17, help.y + 35);
			g.drawString("Odejit", quit.x + 7, quit.y + 35);
		
			g2d.draw(play);
			g2d.draw(help);
			g2d.draw(quit);
			
		}
		
		g.dispose();
		g2d.dispose();
		
	}
	
	
	
}
