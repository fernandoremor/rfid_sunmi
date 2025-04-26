package com.sunmi.pay.hardware.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.emv.EMVOpt;
import com.sunmi.pay.hardware.aidl.pinpad.PinPadOpt;
import com.sunmi.pay.hardware.aidl.readcard.ReadCardOpt;
import com.sunmi.pay.hardware.aidl.security.SecurityOpt;
import com.sunmi.pay.hardware.aidl.system.BasicOpt;

public interface DeviceProvide extends IInterface {
   BasicOpt getBasicOpt() throws RemoteException;

   ReadCardOpt getReadCardOpt() throws RemoteException;

   PinPadOpt getPinPadOpt() throws RemoteException;

   EMVOpt getEMVOpt() throws RemoteException;

   SecurityOpt getSecurityOpt() throws RemoteException;

   int setBinder(IBinder var1) throws RemoteException;

   public abstract static class Stub extends Binder implements DeviceProvide {
      private static final String DESCRIPTOR = "com.sunmi.pay.hardware.aidl.DeviceProvide";
      static final int TRANSACTION_getBasicOpt = 1;
      static final int TRANSACTION_getReadCardOpt = 2;
      static final int TRANSACTION_getPinPadOpt = 3;
      static final int TRANSACTION_getEMVOpt = 4;
      static final int TRANSACTION_getSecurityOpt = 5;
      static final int TRANSACTION_setBinder = 6;

      public Stub() {
         this.attachInterface(this, "com.sunmi.pay.hardware.aidl.DeviceProvide");
      }

      public static DeviceProvide asInterface(IBinder obj) {
         if (obj == null) {
            return null;
         } else {
            IInterface iin = obj.queryLocalInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            return (DeviceProvide)(iin != null && iin instanceof DeviceProvide ? (DeviceProvide)iin : new DeviceProvide.Stub.Proxy(obj));
         }
      }

      public IBinder asBinder() {
         return this;
      }

      public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
         switch(code) {
         case 1:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            BasicOpt _result = this.getBasicOpt();
            reply.writeNoException();
            reply.writeStrongBinder(_result != null ? _result.asBinder() : null);
            return true;
         case 2:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            ReadCardOpt _result = this.getReadCardOpt();
            reply.writeNoException();
            reply.writeStrongBinder(_result != null ? _result.asBinder() : null);
            return true;
         case 3:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            PinPadOpt _result = this.getPinPadOpt();
            reply.writeNoException();
            reply.writeStrongBinder(_result != null ? _result.asBinder() : null);
            return true;
         case 4:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            EMVOpt _result = this.getEMVOpt();
            reply.writeNoException();
            reply.writeStrongBinder(_result != null ? _result.asBinder() : null);
            return true;
         case 5:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            SecurityOpt _result = this.getSecurityOpt();
            reply.writeNoException();
            reply.writeStrongBinder(_result != null ? _result.asBinder() : null);
            return true;
         case 6:
            data.enforceInterface("com.sunmi.pay.hardware.aidl.DeviceProvide");
            IBinder _arg0 = data.readStrongBinder();
            int _result = this.setBinder(_arg0);
            reply.writeNoException();
            reply.writeInt(_result);
            return true;
         case 1598968902:
            reply.writeString("com.sunmi.pay.hardware.aidl.DeviceProvide");
            return true;
         default:
            return super.onTransact(code, data, reply, flags);
         }
      }

      private static class Proxy implements DeviceProvide {
         private IBinder mRemote;

         Proxy(IBinder remote) {
            this.mRemote = remote;
         }

         public IBinder asBinder() {
            return this.mRemote;
         }

         public String getInterfaceDescriptor() {
            return "com.sunmi.pay.hardware.aidl.DeviceProvide";
         }

         public BasicOpt getBasicOpt() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            BasicOpt _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.DeviceProvide");
               this.mRemote.transact(1, _data, _reply, 0);
               _reply.readException();
               _result = BasicOpt.Stub.asInterface(_reply.readStrongBinder());
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public ReadCardOpt getReadCardOpt() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            ReadCardOpt _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.DeviceProvide");
               this.mRemote.transact(2, _data, _reply, 0);
               _reply.readException();
               _result = ReadCardOpt.Stub.asInterface(_reply.readStrongBinder());
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public PinPadOpt getPinPadOpt() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            PinPadOpt _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.DeviceProvide");
               this.mRemote.transact(3, _data, _reply, 0);
               _reply.readException();
               _result = PinPadOpt.Stub.asInterface(_reply.readStrongBinder());
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public EMVOpt getEMVOpt() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            EMVOpt _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.DeviceProvide");
               this.mRemote.transact(4, _data, _reply, 0);
               _reply.readException();
               _result = EMVOpt.Stub.asInterface(_reply.readStrongBinder());
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public SecurityOpt getSecurityOpt() throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            SecurityOpt _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.DeviceProvide");
               this.mRemote.transact(5, _data, _reply, 0);
               _reply.readException();
               _result = SecurityOpt.Stub.asInterface(_reply.readStrongBinder());
            } finally {
               _reply.recycle();
               _data.recycle();
            }

            return _result;
         }

         public int setBinder(IBinder client) throws RemoteException {
            Parcel _data = Parcel.obtain();
            Parcel _reply = Parcel.obtain();

            int _result;
            try {
               _data.writeInterfaceToken("com.sunmi.pay.hardware.aidl.DeviceProvide");
               _data.writeStrongBinder(client);
               this.mRemote.transact(6, _data, _reply, 0);
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
