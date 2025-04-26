package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PinPadConfig implements Parcelable {
   private int PinPadType;
   private int PinType = 0;
   private boolean isOrderNumKey = false;
   private byte[] Pan;
   private int PinKeyIndex;
   private int MaxInput = 6;
   private int MinInput = 0;
   private int Timeout = 60000;
   public static final Creator<PinPadConfig> CREATOR = new Creator<PinPadConfig>() {
      public PinPadConfig createFromParcel(Parcel in) {
         return new PinPadConfig(in);
      }

      public PinPadConfig[] newArray(int size) {
         return new PinPadConfig[size];
      }
   };

   public PinPadConfig() {
   }

   public int getPinPadType() {
      return this.PinPadType;
   }

   public void setPinPadType(int pinPadType) {
      this.PinPadType = pinPadType;
   }

   public int getPinType() {
      return this.PinType;
   }

   public void setPinType(int pinType) {
      this.PinType = pinType;
   }

   public boolean isOrderNumKey() {
      return this.isOrderNumKey;
   }

   public void setOrderNumKey(boolean orderNumKey) {
      this.isOrderNumKey = orderNumKey;
   }

   public byte[] getPan() {
      return this.Pan;
   }

   public void setPan(byte[] pan) {
      this.Pan = pan;
   }

   public int getPinKeyIndex() {
      return this.PinKeyIndex + 1;
   }

   public void setPinKeyIndex(int pinKeyIndex) {
      this.PinKeyIndex = pinKeyIndex;
   }

   public int getMaxInput() {
      return this.MaxInput;
   }

   public void setMaxInput(int maxInput) {
      this.MaxInput = maxInput;
   }

   public int getMinInput() {
      return this.MinInput;
   }

   public void setMinInput(int minInput) {
      this.MinInput = minInput;
   }

   public int getTimeout() {
      return this.Timeout;
   }

   public void setTimeout(int timeout) {
      this.Timeout = timeout;
   }

   protected PinPadConfig(Parcel in) {
      this.PinPadType = in.readInt();
      this.PinType = in.readInt();
      this.isOrderNumKey = in.readByte() != 0;
      this.Pan = in.createByteArray();
      this.PinKeyIndex = in.readInt();
      this.MaxInput = in.readInt();
      this.MinInput = in.readInt();
      this.Timeout = in.readInt();
   }

   public void readFromParcel(Parcel in) {
      this.PinPadType = in.readInt();
      this.PinType = in.readInt();
      this.isOrderNumKey = in.readByte() != 0;
      this.Pan = in.createByteArray();
      this.PinKeyIndex = in.readInt();
      this.MaxInput = in.readInt();
      this.MinInput = in.readInt();
      this.Timeout = in.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel dest, int flags) {
      dest.writeInt(this.PinPadType);
      dest.writeInt(this.PinType);
      dest.writeByte((byte)(this.isOrderNumKey ? 1 : 0));
      dest.writeByteArray(this.Pan);
      dest.writeInt(this.PinKeyIndex);
      dest.writeInt(this.MaxInput);
      dest.writeInt(this.MinInput);
      dest.writeInt(this.Timeout);
   }
}
