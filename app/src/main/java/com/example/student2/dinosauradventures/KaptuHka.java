package com.example.student2.dinosauradventures;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by student2 on 28.12.16.
 */
public class KaptuHka {
    public Bitmap kartina;
    public Rect src,dst;
    public Paint paint;
    public void draw(Rect dst, Paint paint, Canvas canvas){
        this.dst=dst;
        this.paint=paint;
        canvas.drawBitmap(this.kartina,this.src,this.dst,this.paint);
    }
    public KaptuHka(Bitmap kartina,Rect src){
        this.kartina=kartina;
        this.src=src;
    }
}
