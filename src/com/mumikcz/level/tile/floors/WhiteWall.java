package com.mumikcz.level.tile.floors;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.level.tile.Tile;
import com.mumikcz.screen.Screen;

public class WhiteWall extends Tile {

	public WhiteWall(Sprite sprite) {
		super(sprite);
		// TODO Auto-generated constructor stub
	}
	
	public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
	}

}
