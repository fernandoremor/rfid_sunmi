package com.sunmi.pay.hardware.aidl.emv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface EMVListener extends IInterface {
   void requestShowPinPad(int var1) throws RemoteException;

   void onProcessEnd() throws RemoteException;

   void onError(int var1) throws RemoteException;

   public abstract static class Stub extends Binder implements EMVListener {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.emv.EMVListener";
      static final int TRANSACTION_requestShowPinPad = 1;
      static final int TRANSACTION_onProcessEnd = 2;
      static final int TRANSACTION_onError = 3;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.emv.EMVListener");
      }

      public static EMVListener asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.emv.EMVListener");
            return (EMVListener)(iin != null && iin instanceof EMVListener ? (EMVListener)iin : new EMVListener.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         int _arg0;
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVListener");
            _arg0 = data.readInt();
            this.requestShowPinPad(_arg0);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVListener");
            this.onProcessEnd();
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVListener");
            _arg0 = data.readInt();
            this.onError(_arg0);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.emv.EMVListener");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements EMVListener {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.emv.EMVListener";
         }

         public void requestShowPinPad(int pinType) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVListener");
               _data.writeInt(pinType);
               this.mRemote.transact(1, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onProcessEnd() throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVListener");
               this.mRemote.transact(2, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onError(int erroCode) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVListener");
               _data.writeInt(erroCode);
               this.mRemote.transact(3, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }
      }
   }
}
