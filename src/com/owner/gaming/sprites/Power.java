package com.owner.gaming.sprites;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Power extends Sprite {
	private String playerName;
	public Power(int x , String playerName) {
		this.x  = x;
		y = 30;
		h = 15;
		health = MAX_HEALTH;
		w=10;
		
		this.playerName = playerName;
	}

	public void setHealth() {
		 health = health - (int)(MAX_HEALTH * 0.03);
		 
	}
	
	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void printBox(Graphics pen) {
		pen.setColor(Color.RED);
		pen.fillRect(x, y, w, h);
		pen.setColor(Color.GREEN);
		pen.fillRect(x, y, health, h);
		pen.setColor(Color.WHITE);
		pen.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 20));
		pen.drawString(playerName, x, y + h + 20);
	}

}
