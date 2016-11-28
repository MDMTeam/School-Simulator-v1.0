package com.mumikcz.level.tile.spawn;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.level.tile.Tile;
import com.mumikcz.screen.Screen;

public class SpawnFloorTile extends Tile {
    public SpawnFloorTile(Sprite spawn_floor) {
        super(spawn_floor);
    }
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
}
