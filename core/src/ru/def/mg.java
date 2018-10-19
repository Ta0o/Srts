package ru.def;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class mg extends ApplicationAdapter {

    SpriteBatch batch;
    Texture t;
    Texture w;

    @Override
    public void create() {
        batch = new SpriteBatch();
        t = new Texture(Gdx.files.internal("tree.png"));
        w = new Texture(Gdx.files.internal("warrior.png"));
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(.5f, .5f, .5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        float s = 32;
        World world;
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

    public void create () {
        size(512, 512);

        world = new World(16, 16);
    }

    public void draw() {
        world.update();
        world.draw();
    }
}