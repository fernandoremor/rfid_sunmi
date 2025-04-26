package sunmi.paylib;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

class UIUtils {
   protected static final int SYSTEM_UI_FLAG_SUNMI_SEC = 8;

   public static void setSunmiSecStatusBar(View view) {
      int systemUiVisibility = view.getSystemUiVisibility();
      int flags = 8;
      systemUiVisibility |= flags;
      view.setSystemUiVisibility(systemUiVisibility);
   }

   public static void banPowerKey(Window window) {
      if (window != null) {
         window.setFlags(4, 4);
      }

   }

   public static void banVolumeKey(Dialog dialog) {
      dialog.setOnKeyListener(new OnKeyListener() {
         public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
            String tag = "onKeyDown";
            if (keyCode == 25) {
               Log.e(tag, "KEYCODE_VOLUME_DOWN");
               return true;
            } else if (keyCode == 24) {
               Log.e(tag, "KEYCODE_VOLUME_UP");
               return true;
            } else {
               return false;
            }
         }
      });
   }

   public static void screenMonopoly(Window window) {
      banPowerKey(window);
      setSunmiSecStatusBar(window.getDecorView());
      window.addFlags(128);
   }

   public static void screenMonopoly(Dialog dialog) {
      Window window = dialog.getWindow();
      window.addFlags(128);
      banPowerKey(window);
      setSunmiSecStatusBar(window.getDecorView());
      banVolumeKey(dialog);
   }

   public static void setLight(Activity context, int brightness) {
      LayoutParams lp = context.getWindow().getAttributes();
      lp.screenBrightness = Float.valueOf((float)brightness) * 0.003921569F;
      context.getWindow().setAttributes(lp);
   }
}
