package com.umore.umore;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class PictureActivity extends AppCompatActivity {
    private Button btnBack;
    private Button btnAnalyze;
    private ImageView ivPic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        btnBack= (Button)findViewById(R.id.button_X);
        btnAnalyze= (Button)findViewById(R.id.button_Analyze);
        ivPic=(ImageView) findViewById(R.id.ivPic);
        File imgFile = new File(Environment.getExternalStorageDirectory()+"/pic.jpg");

        if(imgFile.exists()){
            Bitmap myBitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath());
            ivPic.setImageBitmap(myBitmap);
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PictureActivity.this, CameraActivity.class));
            }
        });
        btnAnalyze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
