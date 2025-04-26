package com.sunmi.pay.hardware.aidl.readcard;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.TransData;

public interface ReadCardOpt extends IInterface {
   void checkBankCard(int var1, ReadCardCallback var2, int var3) throws RemoteException;

   void checkCard(int var1, ReadCardCallback var2, int var3) throws RemoteException;

   void cancelCheckCard() throws RemoteException;

   int smartCardExchange(int var1, byte[] var2, byte[] var3) throws RemoteException;

   int cardOff(int var1) throws RemoteException;

   int mifareAuth(int var1, int var2, byte[] var3) throws RemoteException;

   int mifareReadBlock(int var1, byte[] var2) throws RemoteException;

   int mifareWriteBlock(int var1, byte[] var2) throws RemoteException;

   int mifareIncValue(int var1, byte[] var2) throws RemoteException;

   int mifareDecValue(int var1, byte[] var2) throws RemoteException;

   int initTransData(TransData var1) throws RemoteException;

   public abstract static class Stub extends Binder implements ReadCardOpt {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt";
      static final int TRANSACTION_checkBankCard = 1;
      static final int TRANSACTION_checkCard = 2;
      static final int TRANSACTION_cancelCheckCard = 3;
      static final int TRANSACTION_smartCardExchange = 4;
      static final int TRANSACTION_cardOff = 5;
      static final int TRANSACTION_mifareAuth = 6;
      static final int TRANSACTION_mifareReadBlock = 7;
      static final int TRANSACTION_mifareWriteBlock = 8;
      static final int TRANSACTION_mifareIncValue = 9;
      static final int TRANSACTION_mifareDecValue = 10;
      static final int TRANSACTION_initTransData = 11;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
      }

      public static ReadCardOpt asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            return (ReadCardOpt)(iin != null && iin instanceof ReadCardOpt ? (ReadCardOpt)iin : new ReadCardOpt.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         int _result;
         int _result;
         int _result;
         int _arg0;
         byte[] _arg1;
         byte[] _arg2;
         ReadCardCallback _arg1;
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = ReadCardCallback.Stub.asInterface(data.readStrongBinder());
            _result = data.readInt();
            this.checkBankCard(_arg0, _arg1, _result);
            reply.writeNoException();
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = ReadCardCallback.Stub.asInterface(data.readStrongBinder());
            _result = data.readInt();
            this.checkCard(_arg0, _arg1, _result);
            reply.writeNoException();
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            this.cancelCheckCard();
            reply.writeNoException();
            return true;
         case 4:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _arg2 = data.createByteArray();
            _result = this.smartCardExchange(_arg0, _arg1, _arg2);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            reply.writeByteArray(_arg2);
            return true;
         case 5:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _result = this.cardOff(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 6:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _result = data.readInt();
            _arg2 = data.createByteArray();
            _result = this.mifareAuth(_arg0, _result, _arg2);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg2);
            return true;
         case 7:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = this.mifareReadBlock(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 8:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = this.mifareWriteBlock(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 9:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = this.mifareIncValue(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 10:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = this.mifareDecValue(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 11:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            TransData _arg0;
            if (0 != data.readInt()) {
               _arg0 = (TransData)TransData.CREATOR.createFromParcel(data);
            } else {
               _arg0 = null;
            }

            _result = this.initTransData(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements ReadCardOpt {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt";
         }

         public void checkBankCard(int cardType, ReadCardCallback callback, int timeOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(cardType);
               _data.writeStrongBinder(callback != null ? callback.asBinder() : null);
               _data.writeInt(timeOut);
               this.mRemote.transact(1, _data, _reply, 0);
               _reply.readException();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

         }

         public void checkCard(int cardType, ReadCardCallback callback, int timeOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(cardType);
               _data.writeStrongBinder(callback != null ? callback.asBinder() : null);
               _data.writeInt(timeOut);
               this.mRemote.transact(2, _data, _reply, 0);
               _reply.readException();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

         }

         public void cancelCheckCard() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               this.mRemote.transact(3, _data, _reply, 0);
               _reply.readException();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

         }

         public int smartCardExchange(int cardType, byte[] apduSend, byte[] apduRecv) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(cardType);
               _data.writeByteArray(apduSend);
               _data.writeByteArray(apduRecv);
               this.mRemote.transact(4, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(apduSend);
               _reply.readByteArray(apduRecv);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int cardOff(int cardType) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(cardType);
               this.mRemote.transact(5, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int mifareAuth(int keyType, int block, byte[] key) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(keyType);
               _data.writeInt(block);
               _data.writeByteArray(key);
               this.mRemote.transact(6, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(key);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int mifareReadBlock(int block, byte[] blockData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(block);
               _data.writeByteArray(blockData);
               this.mRemote.transact(7, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(blockData);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int mifareWriteBlock(int block, byte[] blockData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(block);
               _data.writeByteArray(blockData);
               this.mRemote.transact(8, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(blockData);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int mifareIncValue(int block, byte[] value) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(block);
               _data.writeByteArray(value);
               this.mRemote.transact(9, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(value);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int mifareDecValue(int block, byte[] value) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               _data.writeInt(block);
               _data.writeByteArray(value);
               this.mRemote.transact(10, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(value);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int initTransData(TransData transData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt");
               if (transData != null) {
                  _data.writeInt(1);
                  transData.writeToParcel(_data, 0);
               } else {
                  _data.writeInt(0);
               }

               this.mRemote.transact(11, _data, _reply, 0);
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
