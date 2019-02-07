package com.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector3;
import com.main.Main;

public class PlayerMain extends Main{
	
	
	public void playerMovement() {
		om.modelAtlas.playerInstance.transform.setToTranslation(gm.playerX, gm.playerY, gm.playerZ);
		om.modelAtlas.playerInstance.transform.setToRotation(new Vector3(0, 1, 0), gm.playerRotate);
		
	}
	
	public void render() {
		playerMovement();
		modelBatch.render(om.modelAtlas.playerInstance, environment);
	}
}
