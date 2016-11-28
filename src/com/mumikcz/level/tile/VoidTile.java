package com.mumikcz.level.tile;

import com.mumikcz.graphics.Sprite;
import com.mumikcz.screen.Screen;

public class VoidTile extends Tile {

    public VoidTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}
