package com.Environment;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.main.Main;

public class WorldBuilder extends Main{
	
	public ArrayList<Float> TileX = new ArrayList<Float>();
	public ArrayList<Float> TileY = new ArrayList<Float>();
	public ArrayList<Float> TileZ = new ArrayList<Float>();
	public ArrayList<Float> TileID = new ArrayList<Float>();
	
	public BufferedImage worldImage;
	
	public void create() {
		try {
			worldImage = ImageIO.read(new File("C:\\Users\\Clayton\\Desktop\\WesternRPG 3D\\"
					+ "core\\src\\com\\Environment\\WorldImage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < worldImage.getWidth(); i++) {
			for(int j = 0;j < worldImage.getHeight(); j++) {
				createTile(i, j);
			}
		}
	}
	
	public void createTile(int x, int y) {
		TileX.add(2f*x-20);
		TileY.add(-2f);
		TileZ.add(2f*y-20);
	}
	
	public void render() {
		for(int i = 0; i < TileX.size();i++) {
			modelBatch.render(new ModelInstance(om.modelAtlas.DesertTiles, TileX.get(i), TileY.get(i), TileZ.get(i)));
		}
		
	}
	
}
