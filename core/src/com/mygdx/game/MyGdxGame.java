package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.background.Background;
import com.mygdx.game.bird.Bird;

public class MyGdxGame extends ApplicationAdapter {


	SpriteBatch batch; //  область адрессов котороая используеться для отрисовки  и управление обьектами.
	Background background;
	Bird bird;



	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Background();
		bird = new Bird();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		batch.begin();
		background.render(batch);
		bird.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
