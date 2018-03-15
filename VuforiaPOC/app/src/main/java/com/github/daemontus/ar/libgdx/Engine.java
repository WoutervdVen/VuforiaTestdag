package com.github.daemontus.ar.libgdx;

import android.content.Context;
import android.util.Log;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.FPSLogger;

import com.github.daemontus.ar.vuforia.AppSession;
import com.github.daemontus.ar.vuforia.VuforiaRenderer;

/**
 * Instance of libgdx Game class responsible for rendering 3D content over augmented reality.
 */
public class Engine extends Game {

    private FPSLogger fps;
    private VuforiaRenderer vuforiaRenderer;
    private String model;
    private Context context;

    public Engine(VuforiaRenderer vuforiaRenderer, String model, Context context) {
        this.vuforiaRenderer = vuforiaRenderer;
        this.model = model;
        this.context = context;
    }

    @Override
    public void create () {
        Display mDisplay = new Display(vuforiaRenderer, model, context);
        setScreen(mDisplay);
        vuforiaRenderer.initRendering();
        fps = new FPSLogger();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        Log.d("ENGINE", "Resize: "+width+"x"+height);
        vuforiaRenderer.onSurfaceChanged(width, height);
    }

    @Override
    public void render () {
        super.render();
        fps.log();
    }

}
