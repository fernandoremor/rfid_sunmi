package com.sunmi.pay.hardware.aidl;

import sunmi.paylib.R.string;

public enum SPErrorCode {
   SUCCESS(0, string.sp_success),
   CLOSED(-10100, string.sp_closed),
   TIME_OUT(-10101, string.sp_timeout),
   LRC_ERROR(-10102, string.sp_lrc_error),
   SEQ_UNMATCH(-10103, string.sp_seq_unmatch),
   INITIALIZING(-10104, string.sp_initializing),
   REBOOTING(-10105, string.sp_rebooting),
   RECONNECTING(-10106, string.sp_reconnecting),
   BUSY(-10107, string.sp_busy),
   DL_COPY_FILE_FAILED(-10200, string.sp_dl_copy_file_failed),
   DL_UPGRADING(-10201, string.sp_dl_upgrading),
   DL_CONN_FAILED(-10202, string.sp_dl_conn_failed),
   DL_OPEN_FILE_FAILED(-10203, string.sp_dl_open_file_failed),
   DL_DATA_PKG_TIMEOUT(-10204, string.sp_dl_data_pkg_timeout),
   DL_DATA_PKG_PROCESS_ERROR(-10205, string.sp_dl_data_pkg_process_error),
   DL_STRING_OVERLONG(-10206, string.sp_dl_string_overlong),
   DL_FAILED(-10207, string.sp_dl_failed),
   DL_GET_WRONG_SDK_VERSION(-10208, string.sp_dl_get_wrong_sdk_version),
   DL_GET_SAME_SDK_VERSION(-10209, string.sp_dl_get_same_sdk_version),
   DL_QUERY_DEFAULT_INFO_FAILED(-10210, string.sp_dl_query_default_info_failed),
   DL_VERSION_NOT_DOWNGRADE(-10211, string.sp_dl_version_not_downgrade),
   BI_INPUT_PARAM_ERROR(-10300, string.sp_bi_input_param_error),
   BI_ILLEGAL_DATA_LENGTH(-10301, string.sp_bi_illegal_data_length),
   BI_RSP_DATA_PARSE_ERROR(-10302, string.sp_bi_rsp_data_parse_error),
   KL_KERNEL_REBOOTED(-10400, string.sp_kl_kernel_rebooted),
   PARAM_COUNT_LENGTH_ERR(-100, string.sp_param_count_length_err),
   DC_UNSUPPORTED_CMD(-101, string.sp_dc_unsupported_cmd),
   CARD_ERR_DECODE(-2100, string.sp_card_err_decode),
   CARD_ERR_PARAM(-2000, string.sp_card_err_param),
   CARD_ERR_NOCARD(-2001, string.sp_card_err_nocard),
   CLS_ERR_MULT(-2002, string.sp_cls_err_mult),
   CLS_HAL_ERR_MODULE(-2500, string.sp_cls_hal_err_module),
   CLS_HAL_ERR_CORE(-2501, string.sp_cls_hal_err_core),
   CLS_HAL_ERR_POWERDWN(-2502, string.sp_cls_hal_err_powerdwn),
   CLS_HAL_ERR_CARRIEROFF(-2503, string.sp_cls_hal_err_carrieroff),
   CLS_HAL_ERR_TIMEOUT(-2520, string.sp_cls_hal_err_timeout),
   CLS_HAL_ERR_FIFO(-2521, string.sp_cls_hal_err_fifo),
   CLS_HAL_ERR_FRAME(-2522, string.sp_cls_hal_err_frame),
   CLS_HAL_ERR_PARITY(-2523, string.sp_cls_hal_err_parity),
   CLS_HAL_ERR_COLL(-2524, string.sp_cls_hal_err_coll),
   CLS_HAL_ERR_PROT(-2525, string.sp_cls_hal_err_prot),
   CLS_HAL_ERR_CRC(-2526, string.sp_cls_hal_err_crc),
   CLS_HAL_ERR_M1AUTH(-2527, string.sp_cls_hal_err_m1auth),
   CLS_HAL_ERR_M1PARAM(-2528, string.sp_cls_hal_err_m1param),
   CLS_HAL_ERR_CARDEXIST(-2529, string.sp_cls_hal_err_cardexist),
   CLS_TYPEA_ERR_NUMBER(-2540, string.sp_cls_typea_err_number),
   CLS_TYPEA_ERR_ATQA(-2541, string.sp_cls_typea_err_atqa),
   CLS_TYPEA_ERR_BCC(-2542, string.sp_cls_typea_err_bcc),
   CLS_TYPEA_ERR_UIDTAG(-2543, string.sp_cls_typea_err_uidtag),
   CLS_TYPEA_ERR_TL(-2544, string.sp_cls_typea_err_tl),
   CLS_TYPEA_ERR_T0(-2545, string.sp_cls_typea_err_t0),
   CLS_TYPEA_ERR_TA1(-2546, string.sp_cls_typea_err_ta1),
   CLS_TYPEA_ERR_TB1(-2547, string.sp_cls_typea_err_tb1),
   CLS_TYPEA_ERR_TC1(-2548, string.sp_cls_typea_err_tc1),
   CLS_TYPEB_ERR_NUMBER(-2550, string.sp_cls_typeb_err_number),
   CLS_TYPEB_ERR_ATQB0(-2551, string.sp_cls_typeb_err_atqb0),
   CLS_TYPEB_ERR_PTYPE(-2552, string.sp_cls_typeb_err_ptype),
   CLS_TYPEB_ERR_CID(-2553, string.sp_cls_typeb_err_cid),
   CLS_TYPEB_ERR_HLTB(-2554, string.sp_cls_typeb_err_hltb),
   CLS_ERR_PROTOCOL(-2560, string.sp_cls_err_protocol),
   CLS_ERR_BLOCK_TYPE(-2561, string.sp_cls_err_block_type),
   CLS_ERR_IBLOCK_PROTOCOL(-2562, string.sp_cls_err_iblock_protocol),
   CLS_ERR_IBLOCK_ATCHAIN(-2563, string.sp_cls_err_iblock_atchain),
   CLS_ERR_IBLOCK_SN(-2564, string.sp_cls_err_iblock_sn),
   CLS_ERR_RBLOCK_PROTOCOL(-2565, string.sp_cls_err_rblock_protocol),
   CLS_ERR_RBLOCK_NAK(-2566, string.sp_cls_err_rblock_nak),
   CLS_ERR_RBLOCK_SN(-2567, string.sp_cls_err_rblock_sn),
   CLS_ERR_SBLOCK_PROTOCOL(-2568, string.sp_cls_err_sblock_protocol),
   CLS_ERR_SBLOCK_NOWTX(-2569, string.sp_cls_err_sblock_nowtx),
   CLS_ERR_SBLOCK_WTX(-2570, string.sp_cls_err_sblock_wtx),
   CLS_ERR_EXCEED_FSD(-2571, string.sp_cls_err_exceed_fsd),
   SMC_HAL_ERR_PARITY(-2800, string.sp_smc_hal_err_parity),
   SMC_HAL_ERR_TIMEOUT(-2801, string.sp_smc_hal_err_timeout),
   SMC_HAL_ERR_STEP(-2802, string.sp_smc_hal_err_step),
   SCI_ERR_ATR_DATA(-2803, string.sp_sci_err_atr_data),
   SCI_ERR_COMMU(-2804, string.sp_sci_err_commu),
   SEC_RET_OK(0, string.sp_sec_ret_ok),
   SEC_RET_PARAM_ERROR(-3000, string.sp_sec_ret_param_error),
   SEC_ROOTKEY_ERROR(-3001, string.sp_sec_rootkey_error),
   SEC_ERR_LOCKED(-3002, string.sp_sec_err_locked),
   SEC_ERR_DATA(-3003, string.sp_sec_err_data),
   SEC_ERR_KEYINDEX(-3004, string.sp_sec_err_keyindex),
   SEC_ERR_KEYFAIL(-3005, string.sp_sec_err_keyfail),
   SEC_ERR_NOPIN(-3006, string.sp_sec_err_nopin),
   SEC_ERR_INPUT_CANCEL(-3007, string.sp_sec_err_input_cancel),
   SEC_ERR_PIN_TIMEOUT(-3008, string.sp_sec_err_pin_timeout),
   SEC_ERR_SMALL_INTERVAL(-3009, string.sp_sec_err_small_interval),
   SEC_ERR_KCV_MODE(-3010, string.sp_sec_err_kcv_mode),
   SEC_ERR_KCV_FAIL(-3011, string.sp_sec_err_kcv_fail),
   SEC_ERR_KCV_ODD(-3012, string.sp_sec_err_kcv_odd),
   SEC_ERR_NO_MATCH(-3013, string.sp_sec_err_no_match),
   SEC_ERR_KEYTPYE(-3014, string.sp_sec_err_keytpye),
   SEC_ERR_KEYLEN(-3015, string.sp_sec_err_keylen),
   SEC_ERR_EXPLEN(-3016, string.sp_sec_err_explen),
   SEC_ERR_DSTKEY_INDEX(-3017, string.sp_sec_err_dstkey_index),
   SEC_ERR_SRCKEY_INDEX(-3018, string.sp_sec_err_srckey_index),
   SEC_ERR_SRCKEY_TYPE(-3019, string.sp_sec_err_srckey_type),
   SEC_ERR_GROUP_INDEX(-3020, string.sp_sec_err_group_index),
   SEC_ERR_NOKCV(-3022, string.sp_sec_err_nokcv),
   SEC_ERR_DUKPT_OVERFLOW(-3023, string.sp_sec_err_dukpt_overflow),
   SEC_ERR_DUKPT_KEYTYPE(-3024, string.sp_sec_err_dukpt_keytype),
   SEC_ERR_NEED_ADD_KSN(-3025, string.sp_sec_err_need_add_ksn),
   SEC_ERR_KEY_USAGE(-3026, string.sp_sec_err_key_usage),
   SEC_ERR_MODE_OF_KEY_USE(-3027, string.sp_sec_err_mode_of_key_use),
   SEC_ERR_NOT_SUPPORT(-3028, string.sp_sec_err_not_support),
   SEC_ERR_KEYATTR_NOT_MATCH(-3029, string.sp_sec_err_keyattr_not_match),
   SEC_ERR_NO_AUTH(-3030, string.sp_sec_err_no_auth),
   EMV_CVM_REENTER_PIN_LAST(7, string.sp_emv_cvm_reenter_pin_last),
   EMV_CVM_REENTER_PIN(6, string.sp_emv_cvm_reenter_pin),
   EMV_CVM_STEP_NEXT(5, string.sp_emv_cvm_step_next),
   EMV_TRY_AGAIN(4, string.sp_emv_try_again),
   EMV_SELECT_NEXT_APP(3, string.sp_emv_select_next_app),
   EMV_ONLINE_REQUEST(2, string.sp_emv_online_request),
   EMV_APPROVE(1, string.sp_emv_approve),
   EMV_OK_CONTINUE(0, string.sp_emv_ok_continue),
   EMV_DECLINED(-4000, string.sp_emv_declined),
   EMV_TRY_ANOTHER_INTERFACE(-4001, string.sp_emv_try_another_interface),
   EMV_ENDAPPLICATION(-4002, string.sp_emv_endapplication),
   ENDAPPLICATION_CMD_ERR(-4100, string.sp_endapplication_cmd_err),
   ENDAPPLICATION_CMD_TIMEOUT(-4101, string.sp_endapplication_cmd_timeout),
   ENDAPPLICATION_CMD_SWAB_6985(-4102, string.sp_endapplication_cmd_swab_6985),
   ENDAPPLICATION_CMD_RSP_ERR(-4103, string.sp_endapplication_cmd_rsp_err),
   ENDAPPLICATION_CARD_BLOCK(-4104, string.sp_endapplication_card_block),
   ENDAPPLICATION_APP_BLOCK(-4105, string.sp_endapplication_app_block),
   ENDAPPLICATION_TMAPP_EMPTY(-4106, string.sp_endapplication_tmapp_empty),
   ENDAPPLICATION_NO_SCAPP(-4107, string.sp_endapplication_no_scapp),
   ENDAPPLICATION_DATA_ERR(-4108, string.sp_endapplication_data_err),
   ENDAPPLICATION_DATA_DUPLICATE(-4109, string.sp_endapplication_data_duplicate),
   ENDAPPLICATION_NOT_ACCEPT(-4110, string.sp_endapplication_not_accept),
   ENDAPPLICATION_CARD_EXPIRED(-4111, string.sp_endapplication_card_expired),
   EMV_INVALID_PARAM(-4500, string.sp_emv_invalid_param),
   EMV_SUM_ERR(-4501, string.sp_emv_sum_err),
   EMV_PARAM_NOT_EXIST(-4502, string.sp_emv_param_not_exist),
   EMV_PARAM_DATA_ERROR(-4503, string.sp_emv_param_data_error),
   PBOC_NO_LOG(-4504, string.sp_pboc_no_log),
   PBOC_LOG_DATA_ERR(-4505, string.sp_pboc_log_data_err),
   UNKNOWN(Integer.MIN_VALUE, string.sp_unknown);

   private final int code;
   private final int resId;

   private SPErrorCode(int code, int resId) {
      this.code = code;
      this.resId = resId;
   }

   public int getCode() {
      return this.code;
   }

   public int getResId() {
      return this.resId;
   }

   public static SPErrorCode valueOf(int errCode) {
      SPErrorCode[] var1 = values();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         SPErrorCode code = var1[var3];
         if (code.code == errCode) {
            return code;
         }
      }

      return UNKNOWN;
   }
}
