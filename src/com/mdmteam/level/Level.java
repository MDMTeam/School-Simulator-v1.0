package com.mdmteam.level;

import java.util.ArrayList;
import java.util.List;

import com.mdmteam.entity.Entity;
import com.mdmteam.entity.projectile.Projectile;
import com.mdmteam.level.tile.Tile;
import com.mdmteam.screen.Screen;

public class Level {

    protected int width, height;
    protected int[] tilesInts;
    protected int[] tiles;
    
    private List<Entity> entities = new ArrayList<Entity>();    
    private List<Projectile> projectiles = new ArrayList<Projectile>();


    public static Level spawn = new SpawnLevel("/levels/spawn.png");

    public Level(int width, int height) {
        this.height = height;
        this.width = width;
        tilesInts = new int[width * height];
        generateLevel();
    }

    public Level(String path) {
        loadLevel(path);
        generateLevel();
    }

    protected void generateLevel() {

    }

    protected void loadLevel(String path) {

    }

    public void update() {
    	for (int i = 0; i < entities.size(); i++) {
    		entities.get(i).update();
    	}
    	for (int i = 0; i < projectiles.size(); i++) {
    		projectiles.get(i).update();
    	}
    }
    
    public List<Projectile> getProjectiles() {
    	return projectiles;
    }

    private void time() {

    }

    public void render(int xScroll, int yScroll, Screen screen) {
        screen.setOffset(xScroll, yScroll);
        int x0 = xScroll >> 4;
        int x1 = (xScroll + screen.width + 16) >> 4;
        int y0 = yScroll >> 4;
        int y1 = (yScroll + screen.height + 16) >> 4;
        for (int y = y0; y < y1; y++) {
            for (int x = x0; x < x1; x++) {
                getTile(x, y).render(x, y, screen);
            }
        }
        for (int i = 0; i < entities.size(); i++) {
    		entities.get(i).render(screen);
    	}
        for (int i = 0; i < projectiles.size(); i++) {
    		projectiles.get(i).render(screen);
    	}
    }
    
    public void add(Entity e){
    	entities.add(e);
    }
    
    public void addProjectile(Projectile p) {
    	projectiles.add(p);
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) return Tile.voidTile;
        if (tiles[x + y * width] == Tile.color_spawn_floor) return Tile.spawn_floor;
        if (tiles[x + y * width] == Tile.color_spawn_hedge) return Tile.spawn_hedge;
        if (tiles[x + y * width] == Tile.color_spawn_wall1) return Tile.spawn_wall1;
        if (tiles[x + y * width] == Tile.color_spawn_wall2) return Tile.spawn_wall2;
        if (tiles[x + y * width] == Tile.color_spawn_water) return Tile.spawn_water;
        if (tiles[x + y * width] == Tile.color_spawn_grass) return Tile.spawn_grass;
        if (tiles[x + y * width] == Tile.color_floors_white_tile) return Tile.white_floor;
        if (tiles[x + y * width] == Tile.color_floors_white_bench) return Tile.white_floor_bench;
        return Tile.voidTile;
    }

}
