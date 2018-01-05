package com.example.frederik.myapplication.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.example.frederik.myapplication.BigShaq;

/**
 * Created by Frederik on 12/12/2017.
 */

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;
    private Texture shaqCartoon;
    private Texture shaqCartoonFlip;
    public MenuState (GameStateManager gsm){
        super(gsm);
        background = new Texture("BACKGROUND.png");
        playBtn = new Texture("PlayButton.png");
        shaqCartoon = new Texture("BIGSHAQCARTOON.png");
        shaqCartoonFlip = new Texture("BIGSHAQCARTOONFLIPPED.png");
    }
    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0,0, BigShaq.WIDTH, BigShaq.HEIGHT);
        sb.draw(playBtn, 325, 277,150 , 70);
        sb.draw(shaqCartoon, 500,280,250,225);
        sb.draw(shaqCartoonFlip, 65, 280, 250, 225);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
        shaqCartoon.dispose();
        shaqCartoonFlip.dispose();
    }
}
