package com.currentbp.agreement;

/**
 * 基础协议
 *
 * @author baopan
 * @createTime 20201211
 */
public class BaseAgreement {
    /**
     * 消息id
     */
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseAgreement{" +
                "id='" + id + '\'' +
                '}';
    }
}
