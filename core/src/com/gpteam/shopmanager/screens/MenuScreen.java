package com.gpteam.shopmanager.screens;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.gpteam.shopmanager.Init;
import com.gpteam.shopmanager.engine.Engine;

public class MenuScreen extends ScreenAdapter {
    private SpriteBatch batch;
    private OrthographicCamera camera;
    private FPSLogger fpsLogger;
    private BitmapFont balanceFont;
    private Engine engine;

public MenuScreen(Init init, Engine engine) {
    batch = init.batch;
    camera = init.camera;
    fpsLogger = init.fpsLogger;;
    this.engine = engine;
}

    @Override
    public void render(float delta) {
        super.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}