package com.main;

import com.Environment.WorldBuilder;
import com.models.ModelAtlas;
import com.player.PlayerMain;

public class ObjectManager extends Main{
	public ModelAtlas modelAtlas;
	public WorldBuilder worldBuilder;
	public PlayerMain playerMain;
	
	public void create() {
		modelAtlas = new ModelAtlas();
		modelAtlas.create();
		worldBuilder = new WorldBuilder();
		worldBuilder.create();
		playerMain = new PlayerMain();
	}

	

}
