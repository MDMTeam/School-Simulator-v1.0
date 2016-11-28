package com.mdmteam.level.tile;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.screen.Screen;

public class RockTile extends Tile {

    public RockTile(Sprite sprite) {
        super(sprite);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    @Override
    public boolean solid() {
        return true;
    }

}
