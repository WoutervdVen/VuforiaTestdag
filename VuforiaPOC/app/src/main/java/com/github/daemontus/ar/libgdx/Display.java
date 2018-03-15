package com.github.daemontus.ar.libgdx;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Environment;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.github.daemontus.ar.vuforia.AppSession;
import com.github.daemontus.ar.vuforia.VuforiaRenderer;

import java.io.File;

/**
 * Screen implementation responsible for model loading and calling renderer properly.
 */
public class Display implements Screen {

    public ModelInstance modelInstance;
    public Model model;

    private Renderer mRenderer;

    public Display(VuforiaRenderer vuforiaRenderer, String loadModel, Context context) {

        mRenderer = new Renderer(vuforiaRenderer, context);
        AssetManager assets = new AssetManager();

        switch(loadModel) {

            case "jet":
                assets.load("jet.g3db", Model.class);
                assets.finishLoading();
                model = assets.get("jet.g3db", Model.class);
                break;
            case "myler":
                assets.load("myler2.g3dj", Model.class);
                assets.finishLoading();
                model = assets.get("myler2.g3dj", Model.class);
                break;
            case "teapot":
                assets.load("teapot.g3db", Model.class);
                assets.finishLoading();
                model = assets.get("teapot.g3db", Model.class);
                break;
            case "tree":
                assets.load("funky_palm_tree.g3db", Model.class);
                assets.finishLoading();
                model = assets.get("funky_palm_tree.g3db", Model.class);
                break;
            case "cube":
                assets.load("cube.g3dj", Model.class);
                assets.finishLoading();
                model = assets.get("cube.g3dj", Model.class);
                break;
        }

        modelInstance = new ModelInstance(model);


    }


    @Override
    public void render(float delta) {
        mRenderer.render(this, delta);
    }

    @Override
    public void dispose() {
        mRenderer.dispose();
    }


    @Override
    public void resize(int i, int i2) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }
}
