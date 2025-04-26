package com.sunmi.pay.hardware.aidl.pinpad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface PinPadListener extends IInterface {
   void onPinLength(int var1) throws RemoteException;

   void onConfirm(int var1, byte[] var2) throws RemoteException;

   void onCancel() throws RemoteException;

   void onError(int var1) throws RemoteException;

   public abstract static class Stub extends Binder implements PinPadListener {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.pinpad.PinPadListener";
      static final int TRANSACTION_onPinLength = 1;
      static final int TRANSACTION_onConfirm = 2;
      static final int TRANSACTION_onCancel = 3;
      static final int TRANSACTION_onError = 4;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
      }

      public static PinPadListener asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
            return (PinPadListener)(iin != null && iin instanceof PinPadListener ? (PinPadListener)iin : new PinPadListener.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         int _arg0;
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
            _arg0 = data.readInt();
            this.onPinLength(_arg0);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
            _arg0 = data.readInt();
            byte[] _arg1 = data.createByteArray();
            this.onConfirm(_arg0, _arg1);
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
            this.onCancel();
            return true;
         case 4:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
            _arg0 = data.readInt();
            this.onError(_arg0);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements PinPadListener {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.pinpad.PinPadListener";
         }

         public void onPinLength(int length) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
               _data.writeInt(length);
               this.mRemote.transact(1, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onConfirm(int type, byte[] pinBlock) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
               _data.writeInt(type);
               _data.writeByteArray(pinBlock);
               this.mRemote.transact(2, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onCancel() throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
               this.mRemote.transact(3, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public void onError(int errorCode) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.pinpad.PinPadListener");
               _data.writeInt(errorCode);
               this.mRemote.transact(4, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }
      }
   }
}
