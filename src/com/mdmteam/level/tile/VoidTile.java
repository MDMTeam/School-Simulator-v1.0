package com.mdmteam.level.tile;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.screen.Screen;

public class VoidTile extends Tile {

    public VoidTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

}
