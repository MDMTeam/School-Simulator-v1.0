package com.mdmteam.level.tile.spawn;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class SpawnHedgeTile extends Tile {
    public SpawnHedgeTile(Sprite spawn_hedge) {
        super(spawn_hedge);
    }
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    public boolean solid() {
        return false;
    }

}
