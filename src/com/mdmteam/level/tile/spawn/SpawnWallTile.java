package com.mdmteam.level.tile.spawn;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

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
