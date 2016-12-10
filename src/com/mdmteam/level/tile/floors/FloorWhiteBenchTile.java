package com.mdmteam.level.tile.floors;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class FloorWhiteBenchTile extends Tile {
    public FloorWhiteBenchTile(Sprite white_bench_floor) {
        super(white_bench_floor);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    @Override
    public boolean solid() {
        return true;
    }
}
