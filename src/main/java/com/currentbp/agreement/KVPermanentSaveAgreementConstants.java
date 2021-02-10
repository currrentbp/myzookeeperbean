package com.currentbp.agreement;

/**
 * baseAgreement协议内部的
 */
public class KVPermanentSaveAgreementConstants {

    public enum KVAgreementType {
        PULL(1,"存数据"),
        PUSH(2,"获取数据")
        ;
        private int value;
        private String description;
        KVAgreementType(int value, String description){
            this.value = value;
            this.description = description;
        }

        public static KVAgreementType valueOf(int value) {
            switch (value) {
                case 1:
                    return PULL;
                case 2:
                    return PUSH;
                default:
                    return null;
            }
        }

        public int getValue() {
            return value;
        }

        public String getDescription() {
            return description;
        }
    }
}
