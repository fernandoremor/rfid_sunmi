package com.sunmi.pay.hardware.aidl;

public class AidlConstants {
   public static class PowerManage {
      public static final int SYS_POWER_SLEEP = 1;
   }

   public static class LedLight {
      public static final int RED_LIGHT = 1;
      public static final int YELLOW_LIGHT = 3;
      public static final int BLUE_LIGHT = 4;
      public static final int GREEN_LIGHT = 2;
   }

   public static class SysParam {
      public static final String SDK_VERSION = "SDKVersion";
      public static final String HARDWARE_VERSION = "HardwareVersion";
      public static final String FIRMWARE_VERSION = "FirmwareVersion";
      public static final String SN = "SN";
      public static final String PN = "PN";
      public static final String TUSN = "TUSN";
      public static final String DEVICE_CODE = "DeviceCode";
      public static final String DEVICE_MODEL = "DeviceModel";
   }

   public static class EMV {
      public static final int FORCE_ONLINE = 0;
      public static final int NO_ONLINE = 1;
      public static final int EXIST_ALL_NOT = -1;
      public static final int EXIST_ALL = 0;
      public static final int EXIST_CAPK_NOT = 1;
      public static final int EXIST_AID_NOT = 2;
      public static final int EMV_RESULT_FINISHED = 36864;
      public static final int EMV_RESULT_TERMINATION = 36865;
      public static final int EMV_ERROR_PINBLOCK = 36866;
      public static final int EMV_UNSUPPORTED_TRANS = 36867;

      public static class PinPad {
         public static final int EMV_PINPAD_TIMEOUT = 6001;
         public static final int EMV_PINPAD_CANCEL = 6002;
         public static final int EMV_PINPAD_CONNFIRM = 6003;
      }

      public static class CAPK {
         public static final int ACTION_CAPK_ADD = 0;
         public static final int ACTION_CAPK_DEL = 1;
      }

      public static class AID {
         public static final int ACTION_AID_ADD = 0;
         public static final int ACTION_AID_DEL = 1;
      }
   }

   public static class Security {
      public static final int KEY_TYPE_KEK = 1;
      public static final int KEY_TYPE_TMK = 2;
      public static final int KEY_TYPE_PIK = 3;
      public static final int KEY_TYPE_MAK = 4;
      public static final int KEY_TYPE_TDK = 5;
      public static final int KEY_TYPE_REC = 6;
      public static final int KEY_ALG_TYPE_3DES = 1;
      public static final int KEY_ALG_TYPE_AES = 2;
      public static final int MAC_ALG_ISO_9797_1_MAC_ALG1 = 1001;
      public static final int MAC_ALG_ISO_9797_1_MAC_ALG3 = 1003;
      public static final int MAC_ALG_ISO_16609_MAC_ALG1 = 2000;
      public static final int MAC_ALG_FAST_MODE = 3000;
      public static final int MAC_ALG_X9_19 = 3001;
      public static final int MAC_ALG_CBC = 3002;
      public static final int SEC_STATUS_MONITOR_ZERO = 1;
      public static final int SEC_STATUS_MONITOR_ONE = 2;
      public static final int SEC_STATUS_MONITOR_TWO = 4;
      public static final int SEC_STATUS_MONITOR_THREE = 8;
      public static final int AUTH_TYPE_DEBUGMODE = 1;
      public static final String DEBUGMODE_YES = "Yes";
      public static final String DEBUGMODE_NO = "No";
   }

   public static class CertType {
      public static final int IDCARD = 536911872;
      public static final int ARMYCARD = 536911873;
      public static final int PASSPORT = 536911874;
      public static final int TEMPIDCARD = 536911876;
      public static final int OTHERCARD = 536911877;
   }

   public static enum CardType {
      MAGNETIC(1, "MAG"),
      NFC(4, "SCCL0"),
      IC(2, "SCC0"),
      PSAM0(16, "SAM0"),
      MIFARE(8, "Mifare");

      private int value;
      private String deviceId;

      private CardType(int value, String text) {
         this.value = value;
         this.deviceId = text;
      }

      public int getValue() {
         return this.value;
      }

      public String getMessage() {
         return this.deviceId;
      }

      public static String getDeviceId(int value) {
         AidlConstants.CardType[] var1 = values();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            AidlConstants.CardType card = var1[var3];
            if (card.value == value) {
               return card.deviceId;
            }
         }

         return "";
      }
   }
}
