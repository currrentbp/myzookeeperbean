package com.currentbp.agreement;

/**
 * 协议：kv格式
 *  永久保存（目前只做保存到内存中）
 */
public class KVPermanentSaveAgreement  {
    /**
     * 类型
     */
    private int type;
    /**
     * key
     */
    private String key ;
    /**
     * value
     */
    private String value;
    /**
     * 能否覆盖
     */
    private boolean canOver;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isCanOver() {
        return canOver;
    }

    public void setCanOver(boolean canOver) {
        this.canOver = canOver;
    }

    @Override
    public String toString() {
        return "KVPermanentSaveAgreement{" +
                "type=" + type +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", canOver=" + canOver +
                '}';
    }
}
