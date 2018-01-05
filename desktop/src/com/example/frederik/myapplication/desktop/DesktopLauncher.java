package com.example.frederik.myapplication.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.example.frederik.myapplication.BigShaq;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = BigShaq.WIDTH;
		config.height = BigShaq.HEIGHT;
		config.title = BigShaq.TITLE;


		new LwjglApplication(new BigShaq(), config);
	}
}
