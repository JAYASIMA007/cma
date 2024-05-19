import  android.media.MediaPlayer; 
import android.os.Bundle;
import  android.support.v7.app.AppCompatActivity; 
import android.view.View;
import  android.widget.Button;

public  class  MusicPlayerActivity  extends  AppCompatActivity  { 
    
  private MediaPlayer mediaPlayer;
  private Button playButton; 
  private  boolean  isPlaying  =  false;

  @Override
  protected  void  onCreate(Bundle  savedInstanceState)  { 
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_music_player);
    
    //  Initialize  MediaPlayer  with  the  desired  audio  file
    mediaPlayer = MediaPlayer.create(this,  R.raw.background_music);
    
    playButton = findViewById(R.id.play_button); 
    playButton.setOnClickListener(new  View.OnClickListener()  {
      @Override
      public  void  onClick(View  v)  { 
        if (isPlaying) {
         pauseMusic();
        }  else {
         playMusic();
        }
     }
}); 
}
  
  private  void  playMusic()  {
    if (!mediaPlayer.isPlaying()) { 
      mediaPlayer.start(); 
      playButton.setText("Pause"); 
      isPlaying = true;
   }
}
  
  private  void  pauseMusic()  {
    if (mediaPlayer.isPlaying()) { 
      mediaPlayer.pause(); 
      playButton.setText("Play"); 
      isPlaying = false;
   }
 }
  
 @Override
 protected  void  onDestroy()  { 
   super.onDestroy();
   if  (mediaPlayer !=  null)  { 
     mediaPlayer.release(); 
     mediaPlayer = null;
  }
 }
}
