package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;

	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(0, 1, 0, 1);
		shapeRenderer.circle(200, 100, 75);
		shapeRenderer.end();
	}

	@Override
	public void dispose () {
		shapeRenderer.dispose();
	}

//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(.15f, .25f, .65f, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//	}
}
