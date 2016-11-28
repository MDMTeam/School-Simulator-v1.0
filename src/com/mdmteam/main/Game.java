package com.mdmteam.main;
//20, 54
import com.mdmteam.entity.mob.Player;
import com.mdmteam.input.Keyboard;
import com.mdmteam.input.Mouse;
import com.mdmteam.level.Level;
import com.mdmteam.level.SpawnLevel;
import com.mdmteam.level.TileCoordinate;
import com.mdmteam.screen.Screen;
import com.mdmteam.gui.Help;
import com.mdmteam.gui.Intro;
import com.mdmteam.gui.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Game extends Canvas implements Runnable {

    private static int width = 300;
    private static int height = 168;
    private static int scale = 3;
    public static double version = 1.1;
    public static String title = "Alej Simulator";

    private Thread thread;
    private JFrame frame;
    private Keyboard key;
    private Level level;
    private Player player;
    private Menu menu;
    private Help help;
    private Intro intro;
    
    private boolean running = false;

    private Screen screen;

    private BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();
    
    public static enum STATE {
    	MENU,
    	GAME,
    	HELP,
    	INTRO
    };
    
    public static STATE state = STATE.INTRO;

    public Game() {
        Dimension size = new Dimension(width * scale, height * scale);
        setPreferredSize(size);

        screen = new Screen(width, height);
        frame = new JFrame();
        key = new Keyboard();
        level = new SpawnLevel("/levels/floor_0.png");
        menu = new Menu();
        help = new Help();
        intro = new Intro();
        TileCoordinate playerSpawn = new TileCoordinate(21, 7);
        player = new Player(playerSpawn.x(), playerSpawn.y(), key);
        player.init(level);

        addKeyListener(key);

        Mouse mouse = new Mouse();
        addMouseListener(mouse);
        addMouseMotionListener(mouse);
        frame.setFocusable(true);
    }
    
    public static int getWindowWidth() {
    	return width * scale;
    }
    
    public static int getWindowHeight() {
    	return height * scale;
    }

    public synchronized void start() {
        running = true;
        thread = new Thread(this, "Display");
        thread.start();
    }

    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 60.0;
        double delta = 0;
        int frames = 0;
        int updates = 0;
        while (running == true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns ;
            lastTime = now;
            while (delta >= 1) {
                update();
                updates++;
                delta--;
            }
            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println(updates + " ups, " + frames + " fps");
                frame.setTitle(title + " v " + version + "  |  " + updates + " ups, " + frames + " fps");
                updates = 0;
                frames = 0;
            }
        }
        stop();
    }

    public void update() {
    	if (state == STATE.INTRO) {
    		key.update();
    	}
    	if (state == STATE.INTRO && key.enterPressed) {
    		state = STATE.MENU;
    	}
    	if (state == STATE.HELP && key.escPressed) {
    		state = STATE.MENU;
    	}
    	if (state == STATE.GAME) {
    		key.update();
        	player.update();
        	level.update();
    	} 	
    	
    }
    public void render() {
        Toolkit.getDefaultToolkit().sync();
        BufferStrategy bs = getBufferStrategy();
        if (bs == null) {
            createBufferStrategy(3);
            return;
        }
        screen.clear();
        
        Graphics g = bs.getDrawGraphics();
        
        g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        
        if (state == STATE.GAME) {
        	int xScroll = player.x - screen.width / 2;
        	int yScroll = player.y - screen.height / 2;
        	level.render(xScroll, yScroll, screen);
        	player.render(screen);
        	
        	for (int i = 0; i < pixels.length; i++) {
            	pixels[i] = screen.pixels[i];
        	}
        	
        } else if (state == STATE.MENU) {
        	menu.render(g);
        } else if (state == STATE.HELP) {
        	help.render(g);
        } else if (state == STATE.INTRO) {
        	intro.render(g);
        }

        g.dispose();
        bs.show();
        
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.frame.setResizable(false);
        game.frame.setTitle(game.title);
        game.frame.add(game);
        game.frame.pack();
        game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.frame.setLocationRelativeTo(null);
        game.frame.setVisible(true);

        game.start();
    }

}
