package com.sunmi.pay.hardware.aidl.security;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface SecurityOpt extends IInterface {
   int saveKey(int var1, byte[] var2, byte[] var3, int var4, int var5, int var6, boolean var7) throws RemoteException;

   int dataEncrypt(int var1, byte[] var2, byte[] var3) throws RemoteException;

   int calcMac(int var1, int var2, byte[] var3, byte[] var4) throws RemoteException;

   int getEncryptTUSN(String var1, byte[] var2) throws RemoteException;

   int storeSM4Key(byte[] var1) throws RemoteException;

   int encryptDataBySM4Key(byte[] var1, byte[] var2) throws RemoteException;

   int getSecStatus() throws RemoteException;

   int verifyApkSign(byte[] var1, byte[] var2) throws RemoteException;

   String getAuthStatus(int var1) throws RemoteException;

   String getTermStatus() throws RemoteException;

   int setTermStatus() throws RemoteException;

   int sysRequestAuth(byte var1, int var2, String var3, byte[] var4) throws RemoteException;

   int sysConfirmAuth(byte[] var1) throws RemoteException;

   int saveTerminalKey(byte[] var1, byte[] var2) throws RemoteException;

   int readTerminalPuk(byte[] var1) throws RemoteException;

   int getTerminalCertData(byte[] var1, byte[] var2) throws RemoteException;

   int saveBaseKey(int var1, byte[] var2) throws RemoteException;

   public abstract static class Stub extends Binder implements SecurityOpt {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.security.SecurityOpt";
      static final int TRANSACTION_saveKey = 1;
      static final int TRANSACTION_dataEncrypt = 2;
      static final int TRANSACTION_calcMac = 3;
      static final int TRANSACTION_getEncryptTUSN = 4;
      static final int TRANSACTION_storeSM4Key = 5;
      static final int TRANSACTION_encryptDataBySM4Key = 6;
      static final int TRANSACTION_getSecStatus = 7;
      static final int TRANSACTION_verifyApkSign = 8;
      static final int TRANSACTION_getAuthStatus = 9;
      static final int TRANSACTION_getTermStatus = 10;
      static final int TRANSACTION_setTermStatus = 11;
      static final int TRANSACTION_sysRequestAuth = 12;
      static final int TRANSACTION_sysConfirmAuth = 13;
      static final int TRANSACTION_saveTerminalKey = 14;
      static final int TRANSACTION_readTerminalPuk = 15;
      static final int TRANSACTION_getTerminalCertData = 16;
      static final int TRANSACTION_saveBaseKey = 17;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.security.SecurityOpt");
      }

      public static SecurityOpt asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            return (SecurityOpt)(iin != null && iin instanceof SecurityOpt ? (SecurityOpt)iin : new SecurityOpt.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         int _arg0;
         byte[] _arg1;
         int _result;
         int _result;
         int _result;
         int _result;
         byte[] _arg0;
         int _arg1;
         String _arg0;
         byte[] _arg3;
         byte[] _arg2;
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _arg2 = data.createByteArray();
            _result = data.readInt();
            _result = data.readInt();
            _result = data.readInt();
            boolean _arg6 = 0 != data.readInt();
            int _result = this.saveKey(_arg0, _arg1, _arg2, _result, _result, _result, _arg6);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = data.readInt();
            if (_result < 0) {
               _arg2 = null;
            } else {
               _arg2 = new byte[_result];
            }

            _result = this.dataEncrypt(_arg0, _arg1, _arg2);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg2);
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.readInt();
            _arg1 = data.readInt();
            _arg2 = data.createByteArray();
            _result = data.readInt();
            if (_result < 0) {
               _arg3 = null;
            } else {
               _arg3 = new byte[_result];
            }

            _result = this.calcMac(_arg0, _arg1, _arg2, _arg3);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg3);
            return true;
         case 4:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.readString();
            _result = data.readInt();
            if (_result < 0) {
               _arg1 = null;
            } else {
               _arg1 = new byte[_result];
            }

            _result = this.getEncryptTUSN(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 5:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.createByteArray();
            _arg1 = this.storeSM4Key(_arg0);
            reply.writeNoException();
            reply.writeInt(_arg1);
            return true;
         case 6:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.createByteArray();
            _result = data.readInt();
            if (_result < 0) {
               _arg1 = null;
            } else {
               _arg1 = new byte[_result];
            }

            _result = this.encryptDataBySM4Key(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 7:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = this.getSecStatus();
            reply.writeNoException();
            reply.writeInt(_arg0);
            return true;
         case 8:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.createByteArray();
            _arg1 = data.createByteArray();
            _result = this.verifyApkSign(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 9:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.readInt();
            String _result = this.getAuthStatus(_arg0);
            reply.writeNoException();
            reply.writeString(_result);
            return true;
         case 10:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = this.getTermStatus();
            reply.writeNoException();
            reply.writeString(_arg0);
            return true;
         case 11:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = this.setTermStatus();
            reply.writeNoException();
            reply.writeInt(_arg0);
            return true;
         case 12:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            byte _arg0 = data.readByte();
            _arg1 = data.readInt();
            String _arg2 = data.readString();
            _result = data.readInt();
            if (_result < 0) {
               _arg3 = null;
            } else {
               _arg3 = new byte[_result];
            }

            _result = this.sysRequestAuth(_arg0, _arg1, _arg2, _arg3);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg3);
            return true;
         case 13:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.createByteArray();
            _arg1 = this.sysConfirmAuth(_arg0);
            reply.writeNoException();
            reply.writeInt(_arg1);
            return true;
         case 14:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.createByteArray();
            _arg1 = data.createByteArray();
            _result = this.saveTerminalKey(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 15:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg1 = data.readInt();
            if (_arg1 < 0) {
               _arg0 = null;
            } else {
               _arg0 = new byte[_arg1];
            }

            _result = this.readTerminalPuk(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg0);
            return true;
         case 16:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.createByteArray();
            _result = data.readInt();
            if (_result < 0) {
               _arg1 = null;
            } else {
               _arg1 = new byte[_result];
            }

            _result = this.getTerminalCertData(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 17:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = this.saveBaseKey(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements SecurityOpt {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.security.SecurityOpt";
         }

         public int saveKey(int keyType, byte[] keyValue, byte[] checkValue, int encryptIndex, int encryptType, int keyIndex, boolean isEncrypt) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeInt(keyType);
               _data.writeByteArray(keyValue);
               _data.writeByteArray(checkValue);
               _data.writeInt(encryptIndex);
               _data.writeInt(encryptType);
               _data.writeInt(keyIndex);
               _data.writeInt(isEncrypt ? 1 : 0);
               this.mRemote.transact(1, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int dataEncrypt(int keyIndex, byte[] dataIn, byte[] dataOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeInt(keyIndex);
               _data.writeByteArray(dataIn);
               if (dataOut == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(dataOut.length);
               }

               this.mRemote.transact(2, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(dataOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int calcMac(int keyIndex, int macType, byte[] dataIn, byte[] dataOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeInt(keyIndex);
               _data.writeInt(macType);
               _data.writeByteArray(dataIn);
               if (dataOut == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(dataOut.length);
               }

               this.mRemote.transact(3, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(dataOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int getEncryptTUSN(String dataIn, byte[] dataOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeString(dataIn);
               if (dataOut == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(dataOut.length);
               }

               this.mRemote.transact(4, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(dataOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int storeSM4Key(byte[] dataIn) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByteArray(dataIn);
               this.mRemote.transact(5, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int encryptDataBySM4Key(byte[] dataIn, byte[] dataOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByteArray(dataIn);
               if (dataOut == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(dataOut.length);
               }

               this.mRemote.transact(6, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(dataOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int getSecStatus() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               this.mRemote.transact(7, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int verifyApkSign(byte[] hashMessage, byte[] signData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByteArray(hashMessage);
               _data.writeByteArray(signData);
               this.mRemote.transact(8, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public String getAuthStatus(int type) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            String _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeInt(type);
               this.mRemote.transact(9, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readString();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public String getTermStatus() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            String _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               this.mRemote.transact(10, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readString();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int setTermStatus() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               this.mRemote.transact(11, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int sysRequestAuth(byte reqType, int authCode, String SN, byte[] authData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByte(reqType);
               _data.writeInt(authCode);
               _data.writeString(SN);
               if (authData == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(authData.length);
               }

               this.mRemote.transact(12, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(authData);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int sysConfirmAuth(byte[] dataIn) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByteArray(dataIn);
               this.mRemote.transact(13, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int saveTerminalKey(byte[] dataInPuk, byte[] dataInPvk) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByteArray(dataInPuk);
               _data.writeByteArray(dataInPvk);
               this.mRemote.transact(14, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int readTerminalPuk(byte[] dataOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               if (dataOut == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(dataOut.length);
               }

               this.mRemote.transact(15, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(dataOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int getTerminalCertData(byte[] dataIn, byte[] dataOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeByteArray(dataIn);
               if (dataOut == null) {
                  _data.writeInt(-1);
               } else {
                  _data.writeInt(dataOut.length);
               }

               this.mRemote.transact(16, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(dataOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int saveBaseKey(int destinationIndex, byte[] keyData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.security.SecurityOpt");
               _data.writeInt(destinationIndex);
               _data.writeByteArray(keyData);
               this.mRemote.transact(17, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }
      }
   }
}
