package com.mdmteam.level.tile.floors;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;


public class FloorWhiteTile extends Tile {
    public FloorWhiteTile(Sprite white_floor) {
        super(white_floor);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    
}
