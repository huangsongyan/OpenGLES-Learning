package com.hsy.opengl;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hsy.opengl.render.TextureRender;

public class TextureActivity extends AppCompatActivity {
    private GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();
    }

    private void setupViews() {
        mGLSurfaceView = new GLSurfaceView(this);
        setContentView(mGLSurfaceView);
        //设置gl版本为3
        mGLSurfaceView.setEGLContextClientVersion(3);
        GLSurfaceView.Renderer renderer = new TextureRender(this);
        mGLSurfaceView.setRenderer(renderer);
    }
}
