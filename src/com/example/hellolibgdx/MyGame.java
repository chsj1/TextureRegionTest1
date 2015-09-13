package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {
	Texture texture;
	SpriteBatch batch;
	TextureRegion region;
	TextureRegion region1;
	
	@Override
	public void create() {
//		texture = new Texture(Gdx.files.internal("data/test1.jpg"));
//		texture = new Texture(Gdx.files.internal("data/shopabg.jpg"));
		texture = new Texture(Gdx.files.internal("data/feiji.png"));
		/**
		 * TextureRegion(Texture texture, int x, int y, int width, int height)
		 * 构造函数中的这5个参数的意思分别如下:
		 * texture:需要截取的texture
		 * x: 截取的左上角的位置的x轴的坐标
		 * y: 截取的左上角的位置的y轴的坐标
		 * width: 需要截取的宽度
		 * height: 需要截取的高度
		 */
		region1 = new TextureRegion(texture, 0, 0, 256, 256);
		region = new TextureRegion(texture);
		batch = new SpriteBatch();
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}
	@Override
	public void render() {
//		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClearColor(0, 0, 0, 1);// 设置背景为黑色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		batch.begin();
		/**
		 * 使用batch画的时候是以左下角为坐标原点..
		 */
		batch.draw(region, 100, 200,250,250);
		batch.draw(region1,50, 30,150,150);
//		batch.draw(region, 100, 100, 150, 150);
//		batch.draw(region, 0, 0, texture.getWidth(), texture.getHeight()/2);
		batch.end();
	}
	@Override
	public void resize(int arg0, int arg1) {
	}
	@Override
	public void resume() {
	}
}
