package com.sunmi.pay.hardware.aidl.pinpad;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.bean.PinPadConfig;
import com.sunmi.pay.hardware.aidl.bean.PinPadData;

public interface PinPadOpt extends IInterface {
   String initPinPad(PinPadConfig var1, PinPadListener var2) throws RemoteException;

   void importPinPadData(PinPadData var1) throws RemoteException;

   public abstract static class Stub extends Binder implements PinPadOpt {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt";
      static final int TRANSACTION_initPinPad = 1;
      static final int TRANSACTION_importPinPadData = 2;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
      }

      public static PinPadOpt asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
            return (PinPadOpt)(iin != null && iin instanceof PinPadOpt ? (PinPadOpt)iin : new PinPadOpt.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
            PinPadConfig _arg0;
            if (0 != data.readInt()) {
               _arg0 = (PinPadConfig)PinPadConfig.CREATOR.createFromParcel(data);
            } else {
               _arg0 = null;
            }

            PinPadListener _arg1 = PinPadListener.Stub.asInterface(data.readStrongBinder());
            String _result = this.initPinPad(_arg0, _arg1);
            reply.writeNoException();
            reply.writeString(_result);
            if (_arg0 != null) {
               reply.writeInt(1);
               _arg0.writeToParcel(reply, 1);
            } else {
               reply.writeInt(0);
            }

            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
            PinPadData _arg0;
            if (0 != data.readInt()) {
               _arg0 = (PinPadData)PinPadData.CREATOR.createFromParcel(data);
            } else {
               _arg0 = null;
            }

            this.importPinPadData(_arg0);
            reply.writeNoException();
            if (_arg0 != null) {
               reply.writeInt(1);
               _arg0.writeToParcel(reply, 1);
            } else {
               reply.writeInt(0);
            }

            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements PinPadOpt {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt";
         }

         public String initPinPad(PinPadConfig config, PinPadListener listerner) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            String _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
               if (config != null) {
                  _data.writeInt(1);
                  config.writeToParcel(_data, 0);
               } else {
                  _data.writeInt(0);
               }

               _data.writeStrongBinder(listerner != null ? listerner.asBinder() : null);
               this.mRemote.transact(1, _data, _reply, 0);
               _reply.readException();
               _result = _reply.readString();
               if (0 != _reply.readInt()) {
                  config.readFromParcel(_reply);
               }
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public void importPinPadData(PinPadData data) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt");
               if (data != null) {
                  _data.writeInt(1);
                  data.writeToParcel(_data, 0);
               } else {
                  _data.writeInt(0);
               }

               this.mRemote.transact(2, _data, _reply, 0);
               _reply.readException();
               if (0 != _reply.readInt()) {
                  data.readFromParcel(_reply);
               }
            } finally {
               _reply.recycle();
               _data.recycle();
            }

         }
      }
   }
}
