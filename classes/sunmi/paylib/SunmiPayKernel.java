package sunmi.paylib;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.view.Window;
import com.sunmi.pay.hardware.aidl.DeviceProvide;
import com.sunmi.pay.hardware.aidl.emv.EMVOpt;
import com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt;
import com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt;
import com.sunmi.pay.hardware.aidl.security.SecurityOpt;
import com.sunmi.pay.hardware.aidl.system.BasicOpt;

public class SunmiPayKernel {
   private static DeviceProvide mDeviceProvide;
   public PinPadOpt mPinPadOpt;
   public BasicOpt mBasicOpt;
   public ReadCardOpt mReadCardOpt;
   public EMVOpt mEMVOpt;
   public SecurityOpt mSecurityOpt;
   private SunmiPayKernel.ConnCallback mConnCallback;
   private boolean isBind = false;
   private Context appContext;
   private static SunmiPayKernel mSunmiPayKernel = new SunmiPayKernel();
   private ServiceConnection mServiceConnection = new ServiceConnection() {
      public void onServiceConnected(ComponentName name, IBinder service) {
         SunmiPayKernel.mDeviceProvide = DeviceProvide.Stub.asInterface(service);

         try {
            if (SunmiPayKernel.mDeviceProvide.setBinder(new Binder()) < 0) {
               return;
            }

            if (SunmiPayKernel.this.mConnCallback != null) {
               SunmiPayKernel.this.mPinPadOpt = SunmiPayKernel.mDeviceProvide.getPinPadOpt();
               SunmiPayKernel.this.mBasicOpt = SunmiPayKernel.mDeviceProvide.getBasicOpt();
               SunmiPayKernel.this.mReadCardOpt = SunmiPayKernel.mDeviceProvide.getReadCardOpt();
               SunmiPayKernel.this.mEMVOpt = SunmiPayKernel.mDeviceProvide.getEMVOpt();
               SunmiPayKernel.this.mSecurityOpt = SunmiPayKernel.mDeviceProvide.getSecurityOpt();
               SunmiPayKernel.this.mConnCallback.onServiceConnected();
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }

      }

      public void onServiceDisconnected(ComponentName name) {
         SunmiPayKernel.mDeviceProvide = null;
         if (SunmiPayKernel.this.mConnCallback != null) {
            SunmiPayKernel.this.mConnCallback.onServiceDisconnected();
         }

      }
   };

   private SunmiPayKernel() {
   }

   public static SunmiPayKernel getInstance() {
      return mSunmiPayKernel;
   }

   public Context getAppContext() {
      return this.appContext;
   }

   public void setAppContext(Context appContext) {
      this.appContext = appContext;
   }

   public void connectPayService(Context context, SunmiPayKernel.ConnCallback connCallback) {
      this.mConnCallback = connCallback;
      Intent intent = new Intent("sunmi.intent.action.PAY_HARDWARE");
      intent.setPackage("com.sunmi.pay.hardware_v3");
      this.appContext = context.getApplicationContext();
      this.appContext.startService(intent);
      this.isBind = context.getApplicationContext().bindService(intent, this.mServiceConnection, 4);
   }

   public void unbindPayService(Context mContext) {
      if (this.mServiceConnection != null && this.isBind) {
         mContext.getApplicationContext().unbindService(this.mServiceConnection);
         this.isBind = false;
      }

   }

   public static void screenMonopoly(Window window) {
      UIUtils.screenMonopoly(window);
   }

   public static void screenMonopoly(Dialog dialog) {
      UIUtils.screenMonopoly(dialog);
   }

   public interface ConnCallback {
      void onServiceConnected();

      void onServiceDisconnected();
   }
}
