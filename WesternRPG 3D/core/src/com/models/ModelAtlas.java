package com.models;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.main.Main;

public class ModelAtlas extends Main {
	
	private ModelBuilder modelBuilder;
	public Model tempPlayer;
	public Model DesertTiles;
	public ModelInstance playerInstance;
	public void create() {

		modelBuilder = new ModelBuilder();
		createTempPlayer();
		createTiles();
	}
	public void createTempPlayer() {
		tempPlayer = modelBuilder.createBox(1, 2,  1, 
				new Material(ColorAttribute.createDiffuse(Color.BLUE)), 
				VertexAttributes.Usage.Normal|VertexAttributes.Usage.Position);
	playerInstance = new ModelInstance(tempPlayer, gm.playerX, gm.playerY, gm.playerZ);
	}
	public void createTiles() {
		DesertTiles = modelBuilder.createBox(2, 0.1f, 2, new Material(ColorAttribute.createDiffuse(Color.ORANGE)),
				VertexAttributes.Usage.Normal|VertexAttributes.Usage.Position);
	}
	
	
	

}
