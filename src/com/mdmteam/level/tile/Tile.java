package com.mdmteam.level.tile;

import com.mdmteam.graphics.Sprite;
import com.mdmteam.level.tile.floors.FloorWhiteBenchTile;
import com.mdmteam.level.tile.floors.FloorWhiteTile;
import com.mdmteam.level.tile.spawn.*;
import com.mdmteam.screen.Screen;

public class Tile {

    public int x, y;
    public Sprite sprite;

    public static Tile grass = new GrassTile(Sprite.grass);
    public static Tile flower = new FlowerTile(Sprite.flower);
    public static Tile brick = new BrickTile(Sprite.brick);

    public static Tile spawn_grass = new SpawnGrassTile(Sprite.spawn_grass);
    public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
    public static Tile spawn_wall1 = new SpawnWallTile(Sprite.spawn_wall1);
    public static Tile spawn_wall2 = new SpawnWallTile(Sprite.spawn_wall2);
    public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
    public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);

    public static Tile white_floor = new FloorWhiteTile(Sprite.white_floor);
    public static Tile white_floor_bench = new FloorWhiteBenchTile(Sprite.white_bench_floor);
    
    public static final int color_spawn_grass = 0xFF00FF00;
    public static final int color_spawn_hedge = 0;
    public static final int color_spawn_water = 0;
    public static final int color_spawn_wall1 = 0xFF808080;
    public static final int color_spawn_wall2 = 0xFF000000;
    public static final int color_spawn_floor = 0xFF965E0F;

    public static final int color_floors_white_tile = 0xFFCCCCCC;
    public static final int color_floors_white_bench = 0xFFB5B5B5;

    public static Tile voidTile = new VoidTile(Sprite.voidSprite);

    public Tile(Sprite sprite) {
        this.sprite = sprite;
    }

    public void render(int x, int y, Screen screen) {

    }

    public boolean solid() {
        return false;
    }

}
