package com.mumikcz.level.tile.spawn;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.level.tile.Tile;
import com.mumikcz.screen.Screen;

public class SpawnWaterTile extends Tile {
    public SpawnWaterTile(Sprite spawn_water) {
        super(spawn_water);
    }
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
}
