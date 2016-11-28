package com.mdmteam.level.tile.spawn;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class SpawnGrassTile extends Tile {

    public SpawnGrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}
