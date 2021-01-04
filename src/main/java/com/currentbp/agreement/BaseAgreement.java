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
    /**
     * 消息类型
     */
    private int type;
    /**
     * 消息体
     */
    private String body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "BaseAgreement{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", body='" + body + '\'' +
                '}';
    }
}
