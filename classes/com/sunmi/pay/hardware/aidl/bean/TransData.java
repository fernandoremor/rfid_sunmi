package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TransData implements Parcelable {
   public String amount;
   public String transType = "00";
   public int isForceOnline;
   public static final Creator<TransData> CREATOR = new Creator<TransData>() {
      public TransData createFromParcel(Parcel in) {
         return new TransData(in);
      }

      public TransData[] newArray(int size) {
         return new TransData[size];
      }
   };

   protected TransData(Parcel in) {
      this.amount = in.readString();
      this.transType = in.readString();
      this.isForceOnline = in.readInt();
   }

   public TransData() {
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel dest, int flags) {
      dest.writeString(this.amount);
      dest.writeString(this.transType);
      dest.writeInt(this.isForceOnline);
   }
}
