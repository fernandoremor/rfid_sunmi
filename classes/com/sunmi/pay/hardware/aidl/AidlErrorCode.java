package com.sunmi.pay.hardware.aidl;

import android.content.Context;
import sunmi.paylib.SunmiPayKernel;
import sunmi.paylib.R.string;

public enum AidlErrorCode {
   UNKNOWN(Integer.MIN_VALUE, getString(string.unknown)),
   SPBASE_ERROR(Integer.MIN_VALUE, getString(string.unknown)),
   INVOKING_REPEAT(-20001, getString(string.invoking_repeat_invok)),
   INVOKING_WAIT_UPDATE(-20002, getString(string.invoking_wait_update)),
   INVOKING_ERROR_PARAMS(-20003, getString(string.invoking_error_params)),
   INVOKING_THREAD_EXCEPTION(-20004, getString(string.invoking_thread_exception)),
   FIRMWARE_UPDATE_FAIL(-20005, getString(string.firmware_update_fail)),
   FIRMWARE_VERIFY_FAIL(-20006, getString(string.firmware_verify_fail)),
   READ_CARD_FAIL(-30001, getString(string.readcard_fail)),
   READ_CARD_UNKNOWN_TYPE(-30002, getString(string.readcard_unknown_type)),
   READ_CARD_FAIL_NFC(-30003, getString(string.readcard_nfc_fail)),
   READ_CARD_FAIL_IC(-30004, getString(string.readcard_ic_fail)),
   READ_CARD_TIMEOUT(-30005, getString(string.readcard_timeout)),
   READ_CARD_TRACK1(-30006, getString(string.readcard_track1_error)),
   READ_CARD_TRACK2(-30007, getString(string.readcard_track2_error)),
   READ_CARD_TRACK3(-30008, getString(string.readcard_track3_error)),
   READ_CARD_TRACK1_2_3(-30009, getString(string.readcard_track123_error)),
   READ_CARD_TRACK1_2(-30010, getString(string.readcard_track12_error)),
   READ_CARD_TRACK1_3(-30011, getString(string.readcard_track13_error)),
   READ_CARD_TRACK2_3(-30012, getString(string.readcard_track23_error)),
   READ_CARD_FALLBACK(-30013, getString(string.readcard_downgrade_transaction)),
   READ_CARD_BUILD_APP_TIMEOUT(-30014, getString(string.readcard_candidate_list_timeout)),
   READ_CARD_EXCHANGE(-30015, getString(string.readcard_interactive_fail)),
   READ_CARD_EXCHANGE_PARAMETER(-30016, getString(string.readcard_error_params_apdu)),
   EMV_PREPARE_FAIL(-50002, getString(string.emv_prepare_fail)),
   EMV_TRANS_PROCESS_FAIL(-50003, getString(string.emv_trans_process_fail)),
   EMV_KERNEL_EXCEPTION(-50004, getString(string.emv_kernel_exception)),
   EMV_PAN_ERROR(-50005, getString(string.emv_pan_error)),
   EMV_PINPAD_CALLBACK_ERROR(-50006, getString(string.emv_pinpad_callback_error)),
   EMV_KERNEL_MSG_NULL(-50007, getString(string.emv_kernel_msg_null)),
   EMV_KEYBOARD_PARAMS_ERROR(-50008, getString(string.emv_keyboard_params_error)),
   EMV_IN_PROCESS(-50009, getString(string.emv_in_process)),
   EMV_TRANS_TYPE_UNSUPPORT(-50010, getString(string.emv_trans_type_unsupport)),
   EMV_CONFIRM_CARD_INFO_ERROE(-50011, getString(string.emv_confirm_card_info_erroe)),
   EMV_NFC_CVM_ERROR(-50012, getString(string.emv_nfc_cvm_error)),
   EMV_DB_OPT_ERROR(-50013, getString(string.emv_db_opt_error)),
   EMV_DB_NO_MATCHED_CAPK(-50014, getString(string.emv_db_no_matched_capk)),
   EMV_DB_SAVE_TERM_ERROR(-50015, getString(string.emv_db_save_term_error)),
   EMV_DB_NO_MATCHED_AID(-50016, getString(string.emv_db_no_matched_aid)),
   EMV_CARDINFO_ERROR(-50017, getString(string.emv_cardinfo_error)),
   EMV_TIMING_ERROR(-50018, getString(string.emv_timing_error)),
   EMV_TRANSDATA_INVALID(-50019, getString(string.emv_transdata_invalid)),
   EMV_PIN_CANCELED(-50020, getString(string.emv_pin_canceled)),
   EMV_PIN_ERROR(-50021, getString(string.emv_pin_error)),
   ERROR_VERIFY_APK_SIGN(-40001, getString(string.security_verify_apk_sign_fail)),
   ERROR_LENGTH(-40002, getString(string.security_key_length_error)),
   ERROR_CHECK_VALUE(-40003, getString(string.security_check_value_error)),
   ERROR_SAVE_FAIL(-40004, getString(string.security_save_fail)),
   ERROR_MAC(-40005, getString(string.security_mac_error)),
   ERROR_ENCRYPT(-40006, getString(string.security_encrypt_fail)),
   ERROR_BAD_ARRAY_LENGTH(-40007, getString(string.security_bad_array_length)),
   ERROR_MAC_TYPE(-40008, getString(string.security_mac_type_unsuppor)),
   ERROR_CHECKVALUE_LENGTH(-40009, getString(string.security_checkvalue_length_error)),
   ERROR_KEY_INDEX(-40010, getString(string.security_key_index_error)),
   ERROR_DECRYPT(-40011, getString(string.security_decrypt_fail)),
   ERROR_KEY_LENGTH(-40012, getString(string.security_key_len_error)),
   GEN_RANDOM_KEY_FAIL(-40013, getString(string.security_gen_random_key_fail)),
   ERROR_INDEX_NO_KEY(-40014, getString(string.security_index_no_key)),
   ERROR_SAVE_PK_FAIL(-40015, getString(string.security_save_pk_fail)),
   VERIFY_ERROR(-40016, getString(string.security_verify_fail)),
   GET_SMSTATUS_ERROR(-40017, getString(string.security_get_smstatus_fail)),
   ERROR_INPUT_TIMEOUT(-60001, getString(string.pinpad_pin_input_timeout)),
   ERROR_START_PINPAD(-60002, getString(string.pinpad_start_up_pinpad_fail)),
   ERROR_PINPAD_TYPE(-60003, getString(string.pinpad_pinpad_type_error)),
   ERROR_RETURN_PINBLOCK(-60004, getString(string.pinpad_return_pinblock_error)),
   ERROR_INTERRUPTED(-60005, getString(string.pinpad_thread_interrupted));

   private int code;
   private String msg;

   private AidlErrorCode(int code, String msg) {
      this.code = code;
      this.msg = msg;
   }

   public int getCode() {
      return this.code;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public static AidlErrorCode valueOf(int errCode) {
      SPErrorCode errorCode = SPErrorCode.valueOf(errCode);
      if (!errorCode.equals(SPErrorCode.UNKNOWN)) {
         SPBASE_ERROR.setCode(errorCode.getCode());
         SPBASE_ERROR.setMsg(getString(errorCode.getResId()));
         return SPBASE_ERROR;
      } else {
         AidlErrorCode[] var2 = values();
         int var3 = var2.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            AidlErrorCode code = var2[var4];
            if (code.code == errCode) {
               return code;
            }
         }

         return UNKNOWN;
      }
   }

   public static String getString(int id) {
      Context appContext = SunmiPayKernel.getInstance().getAppContext();
      return appContext == null ? "unknown error" : appContext.getString(id);
   }
}
