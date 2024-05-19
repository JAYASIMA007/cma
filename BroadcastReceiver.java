BroadcastReceiver.java:
  
import  android.content.BroadcastReceiver; 
import android.content.Context;
import  android.content.Intent; 
import android.util.Log;

public  class  MyBroadcastReceiver  extends  BroadcastReceiver  { 
  
  private static final String TAG = "MyBroadcastReceiver";
  
  @Override
  public  void  onReceive(Context  context,  Intent  intent)  { 
     String action = intent.getAction();
    
     if  (action  !=  null)  { 
      switch  (action) {
        case  Intent.ACTION_POWER_CONNECTED: 
           Log.d(TAG, "Power connected");
           //  TODO:  Handle  power  connected  event 
           break;
        case  Intent.ACTION_POWER_DISCONNECTED:
           Log.d(TAG, "Power disconnected");
           //  TODO:  Handle  power  disconnected  event 
           break;
        case  Intent.ACTION_BOOT_COMPLETED: 
           Log.d(TAG, "Boot completed");
           //  TODO:  Handle  boot  completed  event 
           break;
        default:
          Log.d(TAG,  "Unknown  action:  "  +  action); 
          break; 

       }
    }
  }
}

AndroidManifest.xml:
  
<receiver  android:name=".MyBroadcastReceiver">
   <intent-filter>
     <action 
android:name="android.intent.action.ACTION_POWER_CONNECTED"  />
     <action 
android:name="android.intent.action.ACTION_POWER_DISCONNECTED"  />
     <action  android:name="android.intent.action.BOOT_COMPLETED"  />
   </intent-filter>
</receiver>
