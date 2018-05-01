

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	public static final double GRAVITY = 2;

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
		super.moveByAmount(dir*3, 0);
	}

	public void jump() {
		// JUMP!
		velocityY = -10;

	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
		
		super.moveByAmount(velocityX, velocityY);
		velocityY+=GRAVITY;
		
		for(Shape o:obstacles) {
			if(this.intersects(o.getBounds()))
				velocityY = 0;
		}




	}


}
