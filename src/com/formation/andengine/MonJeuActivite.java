package com.formation.andengine;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.ui.activity.BaseGameActivity;

public class MonJeuActivite extends BaseGameActivity {

	private Camera camera;
	private static final int CAMERA_LARGEUR = 480;
	private static final int CAMERA_HAUTEUR = 320;
	
	@Override
	public void onLoadComplete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Engine onLoadEngine() {
		camera = new Camera(0, 0, CAMERA_LARGEUR, CAMERA_HAUTEUR);
		return new Engine(new EngineOptions(true, 
				ScreenOrientation.LANDSCAPE, 
				new RatioResolutionPolicy(CAMERA_LARGEUR, CAMERA_HAUTEUR), 
				camera));
	}

	@Override
	public void onLoadResources() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Scene onLoadScene() {
		final Scene scene = new Scene(1);
		return scene;
	}

}