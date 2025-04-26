package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class EmvTermParam implements Parcelable {
   public String tag9F1E = "3030303030393035";
   public String tag9F35 = "22";
   public String tag9F1A = "0156";
   public boolean forceOnline = false;
   public boolean getDataPIN = true;
   public boolean surportPSESel = true;
   public boolean useTermAIPFlg = true;
   public boolean termAIP = true;
   public boolean bypassAllFlg;
   public boolean bypassPin = true;
   public boolean batchCapture;
   public boolean ectSiFlg = true;
   public boolean ectSiVal = true;
   public boolean ectTlFlg = true;
   public String ectTlVal = "100000";
   public String tag9F33 = "E068C8";
   public String tag9F40 = "0300C00000";
   public boolean scriptMode;
   public boolean adviceFlag = true;
   public boolean isSupportSM = true;
   public boolean isSupportTransLog = true;
   public boolean isSupportMultiLang = true;
   public boolean isSupportExceptFile = true;
   public boolean isSupportAccountSelect = true;
   public String TTQ = "26000080";
   public boolean IsReadLogInCard;
   private byte[] reserved = new byte[3];
   public static final Creator<EmvTermParam> CREATOR = new Creator<EmvTermParam>() {
      public EmvTermParam createFromParcel(Parcel in) {
         return new EmvTermParam(in);
      }

      public EmvTermParam[] newArray(int size) {
         return new EmvTermParam[size];
      }
   };

   public EmvTermParam() {
   }

   protected EmvTermParam(Parcel in) {
      this.tag9F1E = in.readString();
      this.tag9F35 = in.readString();
      this.tag9F1A = in.readString();
      this.forceOnline = in.readByte() != 0;
      this.getDataPIN = in.readByte() != 0;
      this.surportPSESel = in.readByte() != 0;
      this.useTermAIPFlg = in.readByte() != 0;
      this.termAIP = in.readByte() != 0;
      this.bypassAllFlg = in.readByte() != 0;
      this.bypassPin = in.readByte() != 0;
      this.batchCapture = in.readByte() != 0;
      this.ectSiFlg = in.readByte() != 0;
      this.ectSiVal = in.readByte() != 0;
      this.ectTlFlg = in.readByte() != 0;
      this.ectTlVal = in.readString();
      this.tag9F33 = in.readString();
      this.tag9F40 = in.readString();
      this.scriptMode = in.readByte() != 0;
      this.adviceFlag = in.readByte() != 0;
      this.isSupportSM = in.readByte() != 0;
      this.isSupportTransLog = in.readByte() != 0;
      this.isSupportMultiLang = in.readByte() != 0;
      this.isSupportExceptFile = in.readByte() != 0;
      this.isSupportAccountSelect = in.readByte() != 0;
      this.TTQ = in.readString();
      this.IsReadLogInCard = in.readByte() != 0;
      this.reserved = in.createByteArray();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel dest, int flags) {
      dest.writeString(this.tag9F1E);
      dest.writeString(this.tag9F35);
      dest.writeString(this.tag9F1A);
      dest.writeByte((byte)(this.forceOnline ? 1 : 0));
      dest.writeByte((byte)(this.getDataPIN ? 1 : 0));
      dest.writeByte((byte)(this.surportPSESel ? 1 : 0));
      dest.writeByte((byte)(this.useTermAIPFlg ? 1 : 0));
      dest.writeByte((byte)(this.termAIP ? 1 : 0));
      dest.writeByte((byte)(this.bypassAllFlg ? 1 : 0));
      dest.writeByte((byte)(this.bypassPin ? 1 : 0));
      dest.writeByte((byte)(this.batchCapture ? 1 : 0));
      dest.writeByte((byte)(this.ectSiFlg ? 1 : 0));
      dest.writeByte((byte)(this.ectSiVal ? 1 : 0));
      dest.writeByte((byte)(this.ectTlFlg ? 1 : 0));
      dest.writeString(this.ectTlVal);
      dest.writeString(this.tag9F33);
      dest.writeString(this.tag9F40);
      dest.writeByte((byte)(this.scriptMode ? 1 : 0));
      dest.writeByte((byte)(this.adviceFlag ? 1 : 0));
      dest.writeByte((byte)(this.isSupportSM ? 1 : 0));
      dest.writeByte((byte)(this.isSupportTransLog ? 1 : 0));
      dest.writeByte((byte)(this.isSupportMultiLang ? 1 : 0));
      dest.writeByte((byte)(this.isSupportExceptFile ? 1 : 0));
      dest.writeByte((byte)(this.isSupportAccountSelect ? 1 : 0));
      dest.writeString(this.TTQ);
      dest.writeByte((byte)(this.IsReadLogInCard ? 1 : 0));
      dest.writeByteArray(this.reserved);
   }

   public String toString() {
      return "EmvTermParam{tag9F1E='" + this.tag9F1E + '\'' + ", tag9F35='" + this.tag9F35 + '\'' + ", tag9F1A='" + this.tag9F1A + '\'' + ", forceOnline=" + this.forceOnline + ", getDataPIN=" + this.getDataPIN + ", surportPSESel=" + this.surportPSESel + ", useTermAIPFlg=" + this.useTermAIPFlg + ", termAIP=" + this.termAIP + ", bypassAllFlg=" + this.bypassAllFlg + ", bypassPin=" + this.bypassPin + ", batchCapture=" + this.batchCapture + ", ectSiFlg=" + this.ectSiFlg + ", ectSiVal=" + this.ectSiVal + ", ectTlFlg=" + this.ectTlFlg + ", ectTlVal='" + this.ectTlVal + '\'' + ", tag9F33='" + this.tag9F33 + '\'' + ", tag9F40='" + this.tag9F40 + '\'' + ", scriptMode=" + this.scriptMode + ", adviceFlag=" + this.adviceFlag + ", isSupportSM=" + this.isSupportSM + ", isSupportTransLog=" + this.isSupportTransLog + ", isSupportMultiLang=" + this.isSupportMultiLang + ", isSupportExceptFile=" + this.isSupportExceptFile + ", isSupportAccountSelect=" + this.isSupportAccountSelect + ", TTQ='" + this.TTQ + '\'' + ", IsReadLogInCard=" + this.IsReadLogInCard + ", reserved=" + Arrays.toString(this.reserved) + '}';
   }
}
