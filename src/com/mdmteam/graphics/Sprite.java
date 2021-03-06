package com.mdmteam.graphics;

public class Sprite {

    public final int SIZE;
    private int x, y;
    private int width, height;
    public int[] pixels;
    private SpriteSheet sheet;

    public static String projectile_type;

    //Basic sprites

    public static Sprite grass = new Sprite(16, 0, 5, SpriteSheet.tiles);
    public static Sprite flower = new Sprite(16, 2, 0, SpriteSheet.tiles);
    public static Sprite brick = new Sprite(16, 3, 0, SpriteSheet.tiles);

    //spawn Level sprites

    public static Sprite spawn_grass = new Sprite(16, 0, 0, SpriteSheet.spawn);
    public static Sprite spawn_hedge = new Sprite(16, 1, 0, SpriteSheet.spawn);
    public static Sprite spawn_wall1 = new Sprite(16, 0, 1, SpriteSheet.spawn);
    public static Sprite spawn_wall2 = new Sprite(16, 0, 2, SpriteSheet.spawn);
    public static Sprite spawn_water = new Sprite(16, 2, 0, SpriteSheet.spawn);
    public static Sprite spawn_floor = new Sprite(16, 1, 1, SpriteSheet.spawn);

    //Void sprite

    public static Sprite voidSprite = new Sprite(16, 0x1B87E0);

    //Player sprites

    public static Sprite player_forward = new Sprite(32, 0, 6, SpriteSheet.tiles);
    public static Sprite player_back = new Sprite(32, 2, 6, SpriteSheet.tiles);
    public static Sprite player_left = new Sprite(32, 3, 6, SpriteSheet.tiles);
    public static Sprite player_right = new Sprite(32, 1, 6, SpriteSheet.tiles);

    public static Sprite player_forward1 = new Sprite(32, 0, 7, SpriteSheet.tiles);

    public static Sprite player_left1 = new Sprite(32, 3, 7, SpriteSheet.tiles);

    public static Sprite player_right1 = new Sprite(32, 1, 7, SpriteSheet.tiles);

    public static Sprite player_back1 = new Sprite(32, 2, 7, SpriteSheet.tiles);

    //Projectiles

    public static Sprite gun_projectile = new Sprite(16, 0, 0, SpriteSheet.projectiles);
    public static Sprite shuriken_projectile = new Sprite(16, 1, 0, SpriteSheet.projectiles);

    //First floor

    public static Sprite white_floor = new Sprite(16, 0, 0, SpriteSheet.floors);
    public static Sprite white_bench_floor = new Sprite(16, 1, 0, SpriteSheet.floors);

    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        SIZE = size;
        this.width = size;
        this.height = size;
        pixels = new int[SIZE * SIZE];
        this.x = x * size;
        this.y = y * size;
        this.sheet = sheet;
        load();
    }

    public Sprite(int width, int height, int color) {
        SIZE = -1;
        this.width = width;
        this.height = height;
        pixels = new int[width * height];
        setColor(color);
    }

    public Sprite(int size, int color) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        setColor(color);
    }

    private void setColor(int color) {
        for (int i = 0; i < width * height; i++) {
            pixels[i] = color;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    private void load() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
            }
        }
    }
}