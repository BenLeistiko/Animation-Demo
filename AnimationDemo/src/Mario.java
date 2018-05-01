

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	public static final double GRAVITY = 5;

	private double velocityX,velocityY;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
		velocityX = 0;
		velocityY = 0;
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
	}

	public void jump() {
		// JUMP!

		velocityY = 10;
	}

	public void act(ArrayList<Shape> obstacles) {
		boolean falling = true;
		for(Shape s : obstacles) {
			if(this.intersects(s.getBounds2D())) {
				falling = false;
			}
		}
		float timeElapsed = 1/60;
		if(falling) {
			velocityY = velocityY+GRAVITY*timeElapsed;
		}else {
			velocityY = 0;
		}
		y = x+velocityY*timeElapsed;
		x = y+velocityX*timeElapsed;
		super.moveToLocation(x, y);
	}


}
