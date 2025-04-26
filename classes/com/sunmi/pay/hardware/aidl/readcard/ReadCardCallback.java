package com.sunmi.pay.hardware.aidl.readcard;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.CardInfo;

public interface ReadCardCallback extends IInterface {
   void onCardDetected(CardInfo var1) throws RemoteException;

   void onError(int var1, String var2) throws RemoteException;

   void onStartCheckCard() throws RemoteException;

   public abstract static class Stub extends Binder implements ReadCardCallback {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback";
      static final int TRANSACTION_onCardDetected = 1;
      static final int TRANSACTION_onError = 2;
      static final int TRANSACTION_onStartCheckCard = 3;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
      }

      public static ReadCardCallback asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
            return (ReadCardCallback)(iin != null && iin instanceof ReadCardCallback ? (ReadCardCallback)iin : new ReadCardCallback.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
            CardInfo _arg0;
            if (0 != data.readInt()) {
               _arg0 = (CardInfo)CardInfo.CREATOR.createFromParcel(data);
            } else {
               _arg0 = null;
            }

            this.onCardDetected(_arg0);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
            int _arg0 = data.readInt();
            String _arg1 = data.readString();
            this.onError(_arg0, _arg1);
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
            this.onStartCheckCard();
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements ReadCardCallback {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback";
         }

         public void onCardDetected(CardInfo cardInfo) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
               if (cardInfo != null) {
                  _data.writeInt(1);
                  cardInfo.writeToParcel(_data, 0);
               } else {
                  _data.writeInt(0);
               }

               this.mRemote.transact(1, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onError(int code, String message) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
               _data.writeInt(code);
               _data.writeString(message);
               this.mRemote.transact(2, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onStartCheckCard() throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardCallback");
               this.mRemote.transact(3, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }
      }
   }
}
