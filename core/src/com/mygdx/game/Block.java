package com.mygdx.game;

/* ici nous gérons le changement des couleurs des blocs lorsque nous posons une piece*/

import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Block {
	
	public static final int BLOCK_GREY = 0;
	
	int color;
	
	public int row;
	public int col;
	
	int animationSize;
	boolean isAlive;
	
	public Block(int color){
		this.color = color;
		this.isAlive = true;
		this.animationSize = Configs.BLOCK_SIZE;
		this.row = -1;
		this.col = -1;
	}
	
	public void anim(SpriteBatch batch){
		if(isAlive){
			this.animationSize-=2;
			batch.draw(Assets.blocksColors[this.color], Configs.WIDTH_MARGIN + col*Configs.BLOCK_SIZE, Configs.HEIGHT_MARGIN+row *Configs.BLOCK_SIZE, animationSize, animationSize);
			if(animationSize <= 0)isAlive = false;
		}
	}
}
