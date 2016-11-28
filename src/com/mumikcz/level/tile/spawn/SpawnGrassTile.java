package com.mumikcz.level.tile.spawn;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.level.tile.Tile;
import com.mumikcz.screen.Screen;

public class SpawnGrassTile extends Tile {

    public SpawnGrassTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}
