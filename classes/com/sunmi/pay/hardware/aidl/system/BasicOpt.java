package com.sunmi.pay.hardware.aidl.system;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface BasicOpt extends IInterface {
   String getSysParam(String var1) throws RemoteException;

   int setSysParam(String var1, String var2) throws RemoteException;

   int buzzerOnDevice(int var1) throws RemoteException;

   int ledStatusOnDevice(int var1, int var2) throws RemoteException;

   int setScreenMode(int var1) throws RemoteException;

   void resetSP() throws RemoteException;

   int sysPowerManager(int var1) throws RemoteException;

   int sysGetRandom(byte[] var1, int var2) throws RemoteException;

   public abstract static class Stub extends Binder implements BasicOpt {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.system.BasicOpt";
      static final int TRANSACTION_getSysParam = 1;
      static final int TRANSACTION_setSysParam = 2;
      static final int TRANSACTION_buzzerOnDevice = 3;
      static final int TRANSACTION_ledStatusOnDevice = 4;
      static final int TRANSACTION_setScreenMode = 5;
      static final int TRANSACTION_resetSP = 6;
      static final int TRANSACTION_sysPowerManager = 7;
      static final int TRANSACTION_sysGetRandom = 8;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.system.BasicOpt");
      }

      public static BasicOpt asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            return (BasicOpt)(iin != null && iin instanceof BasicOpt ? (BasicOpt)iin : new BasicOpt.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         int _arg1;
         int _result;
         int _arg0;
         String _arg0;
         String _arg1;
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            _arg0 = data.readString();
            _arg1 = this.getSysParam(_arg0);
            reply.writeNoException();
            reply.writeString(_arg1);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            _arg0 = data.readString();
            _arg1 = data.readString();
            _result = this.setSysParam(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            _arg0 = data.readInt();
            _arg1 = this.buzzerOnDevice(_arg0);
            reply.writeNoException();
            reply.writeInt(_arg1);
            return true;
         case 4:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            _arg0 = data.readInt();
            _arg1 = data.readInt();
            _result = this.ledStatusOnDevice(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 5:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            _arg0 = data.readInt();
            _arg1 = this.setScreenMode(_arg0);
            reply.writeNoException();
            reply.writeInt(_arg1);
            return true;
         case 6:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            this.resetSP();
            reply.writeNoException();
            return true;
         case 7:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            _arg0 = data.readInt();
            _arg1 = this.sysPowerManager(_arg0);
            reply.writeNoException();
            reply.writeInt(_arg1);
            return true;
         case 8:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            byte[] _arg0 = data.createByteArray();
            _arg1 = data.readInt();
            _result = this.sysGetRandom(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg0);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.system.BasicOpt");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements BasicOpt {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.system.BasicOpt";
         }

         public String getSysParam(String key) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            String _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeString(key);
               this.mRemote.transact(1, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readString();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int setSysParam(String key, String value) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeString(key);
               _data.writeString(value);
               this.mRemote.transact(2, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int buzzerOnDevice(int times) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeInt(times);
               this.mRemote.transact(3, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int ledStatusOnDevice(int ledIndex, int ledStatus) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeInt(ledIndex);
               _data.writeInt(ledStatus);
               this.mRemote.transact(4, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int setScreenMode(int mode) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeInt(mode);
               this.mRemote.transact(5, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public void resetSP() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               this.mRemote.transact(6, _data, _reply, 0);
               _reply.readException();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

         }

         public int sysPowerManager(int mode) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeInt(mode);
               this.mRemote.transact(7, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int sysGetRandom(byte[] randData, int len) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.system.BasicOpt");
               _data.writeByteArray(randData);
               _data.writeInt(len);
               this.mRemote.transact(8, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(randData);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }
      }
   }
}
