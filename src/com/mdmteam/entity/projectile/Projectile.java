package com.mdmteam.entity.projectile;

import java.util.Random;

import com.mdmteam.entity.Entity;
import com.mdmteam.graphics.Sprite;

public abstract class Projectile extends Entity {

	protected final int xOrigin, yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double x, y;
	protected double nx, ny;
	protected double distance;
	protected double speed, range, damage;
	
	protected final Random random = new Random();
	
	public Projectile(int x, int y, double dir) {
		xOrigin = x;
		yOrigin = y;
		angle = dir;
		this.x = x;
		this.y = y;
	}
	
	public Sprite getSprite(Sprite sprite) {
		return sprite;
	}
	
	public int getSpriteSize() {
		return sprite.SIZE;
	}
	
	protected void move() {
		
	}

	/*private int x_pos;
	private int y_pos;

    private boolean collision(int xa, int ya) {
        boolean solid = false;
        for (int c = 0; c < 4; c++) {
            int xt = ((x_pos + xa) + c % 2 * 12 - 8) / 16;
            int yt = ((y_pos + ya) + c / 2 * 10 + 2) / 16;
            if (level.getTile(xt, yt).solid()) solid = true;
        }
        return solid;
    }*/
	
}
