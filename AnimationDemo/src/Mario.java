

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	public static final double GRAVITY = 5;

	private double velocityX,velocityY;
	
	private long timeLastUpdated;
	
	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
		velocityX = 0;
		velocityY = 0;
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
		x+=3*dir;
	}

	public void jump() {
		// JUMP!
		
		
	}

	public void act(ArrayList<Shape> obstacles) {
		
		//stuff
		//code
		
	}


}
