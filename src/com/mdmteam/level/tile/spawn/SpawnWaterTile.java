package com.mdmteam.level.tile.spawn;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class SpawnWaterTile extends Tile {
    public SpawnWaterTile(Sprite spawn_water) {
        super(spawn_water);
    }
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
}
