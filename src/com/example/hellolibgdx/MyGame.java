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
		 * ���캯���е���5����������˼�ֱ�����:
		 * texture:��Ҫ��ȡ��texture
		 * x: ��ȡ�����Ͻǵ�λ�õ�x�������
		 * y: ��ȡ�����Ͻǵ�λ�õ�y�������
		 * width: ��Ҫ��ȡ�Ŀ��
		 * height: ��Ҫ��ȡ�ĸ߶�
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
//		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClearColor(0, 0, 0, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		batch.begin();
		/**
		 * ʹ��batch����ʱ���������½�Ϊ����ԭ��..
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
