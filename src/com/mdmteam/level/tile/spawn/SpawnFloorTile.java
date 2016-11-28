package com.mdmteam.level.tile.spawn;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class SpawnFloorTile extends Tile {
    public SpawnFloorTile(Sprite spawn_floor) {
        super(spawn_floor);
    }
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
}
