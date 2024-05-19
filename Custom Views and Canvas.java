View.java:
  
import android.content.Context; 
import  android.graphics.Canvas; 
import android.graphics.Color; 
import android.graphics.Paint; 
import  android.util.AttributeSet; 
import android.view.View;

public  class  CustomAnimatedView  extends  View  {
  
  private Paint paint; 
  private float radius = 50; 
  private float x = 0;
  private float y = 0;
  private  int  directionX  =  1; 
  private  int  directionY  =  1;
  
  public  CustomAnimatedView(Context  context)  { 
   super(context);
   init();
  }
  public  CustomAnimatedView(Context  context,  AttributeSet  attrs)  { 
   super(context, attrs);
   init();
  }
  public  CustomAnimatedView(Context  context,  AttributeSet  attrs,  int  defStyle)  { 
   super(context, attrs, defStyle);
   init();
  } 

  private void init() { 
    paint  =  new  Paint();
    paint.setColor(Color.RED);
  }
  
  @Override
  protected  void  onDraw(Canvas  canvas)  { 
    super.onDraw(canvas);
    
    //  Update  the  position 
    x += 5 * directionX; 
    y += 5 * directionY;
    
    //  Check  if  the  ball  hits the  boundaries
    if  (x  +  radius >  getWidth() ||  x -  radius <  0)  { 
      directionX *= -1;
    }
    if  (y  + radius >  getHeight() ||  y -  radius < 0)  { 
      directionY *= -1;
    }
    
    //  Draw  the  ball
    canvas.drawCircle(x, y, radius, paint);
    
    //  Trigger  redraw 
    invalidate();
  }
} 

CustomAnimatedView.xml:
  
<LinearLayout  xmlns:android="http://schemas.android.com/apk/res/android"
  xmlns:tools="http://schemas.android.com/tools" 
  android:layout_width="match_parent" 
  android:layout_height="match_parent"
  android:orientation="vertical" 
  tools:context=".MainActivity">
  
  <com.example.myapp.CustomAnimationView 
    android:layout_width="match_parent" 
    android:layout_height="match_parent" />
</LinearLayout>
