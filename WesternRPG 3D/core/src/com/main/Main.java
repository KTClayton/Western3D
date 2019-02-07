package com.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;

public class Main extends ApplicationAdapter{
	public static ObjectManager om;
	public static GameData gm;
	public PerspectiveCamera camera;
	public Environment environment;
	public static ModelBatch modelBatch;
	
	public boolean Collision(int x, int y, int z, int w, int h, int d
			,int x1, int y1, int z1, int w1, int h1, int d1) {	
	
		return false;
	}
	
	
	public void cameraMovement() {
	//	Gdx.input.setCursorCatched(true);
		Gdx.input.setCursorPosition(1529/2, 1019/2);
	}
	
	
	public void create() {
		modelBatch = new ModelBatch();
		camera = new PerspectiveCamera(75, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		camera.position.set(2, 5 , 3f);
		camera.near = 0.1f;
		camera.far = 300f;
		gm = new GameData();
		om = new ObjectManager();
		om.create();
		
		environment = new Environment();
		environment.add(new DirectionalLight());
		environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.8f, 0.8f, 0.8f, 1f));
	}
	
	public void render() {
		cameraMovement();
		camera.lookAt(gm.playerX, gm.playerY, gm.playerZ);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT|GL20.GL_DEPTH_BUFFER_BIT);
		camera.update();
		modelBatch.begin(camera);
		om.playerMain.render();
		om.worldBuilder.render();
		modelBatch.end();
	}

}
