package com.mdmteam.entity.mob;

import com.mdmteam.entity.Entity;
import com.mdmteam.entity.projectile.GunProjectile;
import com.mdmteam.entity.projectile.Projectile;
import com.mdmteam.graphics.Sprite;

public abstract class Mob extends Entity{

    protected Sprite sprite;
    protected int dir = 0;
    protected boolean moving = false;
    protected boolean walking = false;
    
    public void move(int xa, int ya) {
        if (xa != 0 && ya != 0) {
            move(xa, 0);
            move(0, ya);
            return;
        }

        if (xa > 0) dir = 1;
        if (xa < 0) dir = 3;
        if (ya > 0) dir = 2;
        if (ya < 0) dir = 0;

        if (!collision(xa, ya)) {
            x += xa;
            y += ya;
        }
    }

    public void update() {
    	
    }
    
    protected void shoot(int x, int y, double direction) {
    	//direction *= 180 / Math.PI;
    	Projectile p = new GunProjectile(x, y, direction);
    	level.addProjectile(p);
    	
    }

    private boolean collision(int xa, int ya) {
        boolean solid = false;
        for (int c = 0; c < 4; c++) {
            int xt = ((x + xa) + c % 2 * 12 - 8) / 16;
            int yt = ((y + ya) + c / 2 * 10 + 2) / 16;
            if (level.getTile(xt, yt).solid()) solid = true;
        }
        return solid;
    }

    public void render() {

    }

}
