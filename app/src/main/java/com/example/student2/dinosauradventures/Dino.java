package com.example.student2.dinosauradventures;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by student2 on 26.12.16.
 */
public class Dino extends View {
    //Поля
    Paint paint=new Paint();
    private Bitmap bird,yee,pig,google;
    private Rect bSrc,ySrc,pSrc,gSrc;
    private int t=0,x,y,k=0;

    //Конструктор
    public Dino(Context context){
        super(context);
        //Присвоили битмапам соответствующие картинки
        bird=BitmapFactory.decodeResource(getResources(),R.drawable.birddino);
        yee=BitmapFactory.decodeResource(getResources(),R.drawable.yee);
        pig=BitmapFactory.decodeResource(getResources(),R.drawable.pig);
        google=BitmapFactory.decodeResource(getResources(),R.drawable.googledino);
        //Делаем оболочку для ресурсов
        bSrc=new Rect(0,0,bird.getWidth(),bird.getHeight());
        ySrc=new Rect(0,0,yee.getWidth(),yee.getHeight());
        pSrc=new Rect(0,0,pig.getWidth(),pig.getHeight());
        gSrc=new Rect(0,0,google.getWidth(),google.getHeight());
    }

    //Рисуем
    @Override
    protected void onDraw(Canvas canvas){
        t++;
    }

    //Обрабатываем касания
    @Override
    public boolean onTouchEvent(MotionEvent event){

        return super.onTouchEvent(event);
    }
}
