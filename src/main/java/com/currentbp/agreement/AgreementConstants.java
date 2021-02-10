package com.currentbp.agreement;

/**
 * 协议相关的
 */
public class AgreementConstants {

    public enum AgreementType{
        KV(1,"kv模式")
        ;

        private int value;
        private String description;
        AgreementType(int value,String description){
            this.value = value;
            this.description = description;
        }

        public static AgreementType valueOf(int value) {
            switch (value) {
                case 1:
                    return KV;
                case 2:

                default:
                    return null;
            }
        }
    }
}
