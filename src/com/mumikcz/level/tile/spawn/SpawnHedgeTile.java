package com.mumikcz.level.tile.spawn;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.level.tile.Tile;
import com.mumikcz.screen.Screen;

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
