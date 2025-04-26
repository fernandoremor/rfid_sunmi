package com.sunmi.pay.hardware.aidl.emv;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.EmvTermParam;
import java.util.ArrayList;
import java.util.List;

public interface EMVOpt extends IInterface {
   int updateAID(int var1, String var2) throws RemoteException;

   int updateCAPK(int var1, String var2) throws RemoteException;

   int insertAID(List<String> var1) throws RemoteException;

   int insertCAPK(List<String> var1) throws RemoteException;

   int syncParam() throws RemoteException;

   int setTerminalParam(EmvTermParam var1) throws RemoteException;

   int isExistCapkAndAID() throws RemoteException;

   void transactProcess(EMVListener var1) throws RemoteException;

   int readKernelData(String[] var1, byte[] var2) throws RemoteException;

   int importResponseData(int var1, byte[] var2, int var3, byte[] var4) throws RemoteException;

   int readTransLog(int var1, List<String> var2) throws RemoteException;

   void importPinInputStatus(int var1, int var2) throws RemoteException;

   public abstract static class Stub extends Binder implements EMVOpt {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.emv.EMVOpt";
      static final int TRANSACTION_updateAID = 1;
      static final int TRANSACTION_updateCAPK = 2;
      static final int TRANSACTION_insertAID = 3;
      static final int TRANSACTION_insertCAPK = 4;
      static final int TRANSACTION_syncParam = 5;
      static final int TRANSACTION_setTerminalParam = 6;
      static final int TRANSACTION_isExistCapkAndAID = 7;
      static final int TRANSACTION_transactProcess = 8;
      static final int TRANSACTION_readKernelData = 9;
      static final int TRANSACTION_importResponseData = 10;
      static final int TRANSACTION_readTransLog = 11;
      static final int TRANSACTION_importPinInputStatus = 12;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.emv.EMVOpt");
      }

      public static EMVOpt asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            return (EMVOpt)(iin != null && iin instanceof EMVOpt ? (EMVOpt)iin : new EMVOpt.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         int _arg0;
         int _result;
         int _result;
         byte[] _arg1;
         String _arg1;
         ArrayList _arg0;
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.readInt();
            _arg1 = data.readString();
            _result = this.updateAID(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.readInt();
            _arg1 = data.readString();
            _result = this.updateCAPK(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.createStringArrayList();
            _result = this.insertAID(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 4:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.createStringArrayList();
            _result = this.insertCAPK(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 5:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = this.syncParam();
            reply.writeNoException();
            reply.writeInt(_arg0);
            return true;
         case 6:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            EmvTermParam _arg0;
            if (0 != data.readInt()) {
               _arg0 = (EmvTermParam)EmvTermParam.CREATOR.createFromParcel(data);
            } else {
               _arg0 = null;
            }

            _result = this.setTerminalParam(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 7:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = this.isExistCapkAndAID();
            reply.writeNoException();
            reply.writeInt(_arg0);
            return true;
         case 8:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            EMVListener _arg0 = EMVListener.Stub.asInterface(data.readStrongBinder());
            this.transactProcess(_arg0);
            return true;
         case 9:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            String[] _arg0 = data.createStringArray();
            _arg1 = data.createByteArray();
            _result = this.readKernelData(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            return true;
         case 10:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.readInt();
            _arg1 = data.createByteArray();
            _result = data.readInt();
            byte[] _arg3 = data.createByteArray();
            int _result = this.importResponseData(_arg0, _arg1, _result, _arg3);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeByteArray(_arg1);
            reply.writeByteArray(_arg3);
            return true;
         case 11:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.readInt();
            List<String> _arg1 = new ArrayList();
            _result = this.readTransLog(_arg0, _arg1);
            reply.writeNoException();
            reply.writeInt(_result);
            reply.writeStringList(_arg1);
            return true;
         case 12:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            _arg0 = data.readInt();
            _result = data.readInt();
            this.importPinInputStatus(_arg0, _result);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements EMVOpt {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.emv.EMVOpt";
         }

         public int updateAID(int actType, String aid) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeInt(actType);
               _data.writeString(aid);
               this.mRemote.transact(1, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int updateCAPK(int actType, String capk) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeInt(actType);
               _data.writeString(capk);
               this.mRemote.transact(2, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int insertAID(List<String> aidList) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeStringList(aidList);
               this.mRemote.transact(3, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int insertCAPK(List<String> capkList) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeStringList(capkList);
               this.mRemote.transact(4, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int syncParam() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               this.mRemote.transact(5, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int setTerminalParam(EmvTermParam emvTermParam) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               if (emvTermParam != null) {
                  _data.writeInt(1);
                  emvTermParam.writeToParcel(_data, 0);
               } else {
                  _data.writeInt(0);
               }

               this.mRemote.transact(6, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int isExistCapkAndAID() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               this.mRemote.transact(7, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public void transactProcess(EMVListener listener) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeStrongBinder(listener != null ? listener.asBinder() : null);
               this.mRemote.transact(8, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }

         public int readKernelData(String[] tags, byte[] outData) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeStringArray(tags);
               _data.writeByteArray(outData);
               this.mRemote.transact(9, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(outData);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int importResponseData(int onlineResult, byte[] tagIn, int tagInLength, byte[] tagOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeInt(onlineResult);
               _data.writeByteArray(tagIn);
               _data.writeInt(tagInLength);
               _data.writeByteArray(tagOut);
               this.mRemote.transact(10, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readByteArray(tagIn);
               _reply.readByteArray(tagOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int readTransLog(int cardType, List<String> infoOut) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeInt(cardType);
               this.mRemote.transact(11, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readInt();
               _reply.readStringList(infoOut);
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public void importPinInputStatus(int pinType, int inputResult) throws RemoteException {
            Parcel _data = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.emv.EMVOpt");
               _data.writeInt(pinType);
               _data.writeInt(inputResult);
               this.mRemote.transact(12, _data, (Parcel)null, 1);
            } finally {
               _data.recycle();
            }

         }
      }
   }
}
