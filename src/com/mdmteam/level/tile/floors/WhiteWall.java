package com.mdmteam.level.tile.floors;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class WhiteWall extends Tile {

	public WhiteWall(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
	}

}
