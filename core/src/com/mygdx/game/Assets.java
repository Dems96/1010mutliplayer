package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class Assets {

    public static Texture[] blocksColors;
    public static BitmapFont font;

	public static Texture retryButton;
//on initialise la couleur des formes
    public static void init(){
    	blocksColors = new Texture[3];
   	    blocksColors[0] = new Texture(Gdx.files.internal("data/grey.png"));
    	blocksColors[1] = new Texture(Gdx.files.internal("data/blue.png"));
    	blocksColors[2] = new Texture(Gdx.files.internal("data/pink.png"));


		retryButton = new Texture(Gdx.files.internal("data/retryButton.png"));
    	font = new BitmapFont();

    }

    public static void dispose(){
        for(int x = 0; x < 3; x++){
        	blocksColors[x].dispose();
        }
		retryButton.dispose();
	}
}
