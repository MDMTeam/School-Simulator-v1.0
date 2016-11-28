package com.mumikcz.level.tile.spawn;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.level.tile.Tile;
import com.mumikcz.screen.Screen;

public class SpawnWallTile extends Tile {
    public SpawnWallTile(Sprite spawn_wall1) {
        super(spawn_wall1);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    public boolean solid() {
        return true;
    }
}
