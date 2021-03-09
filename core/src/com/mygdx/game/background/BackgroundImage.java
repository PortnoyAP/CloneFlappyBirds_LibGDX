package com.mygdx.game.background;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class BackgroundImage {

    private Texture backGroundImage;
    private Vector2 position;

    public BackgroundImage( Vector2 position) {
        this.backGroundImage = new Texture("background.png");
        this.position = position;
    }

    public Texture getBackGroundImage() {
        return backGroundImage;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position.x = position;
    }
}
