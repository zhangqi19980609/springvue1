package com.example.springvue1.pojo;

import java.io.Serializable;

public class ListUrl implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listurl.ListUrl_id
     *
     * @mbggenerated
     */
    private Byte listurlId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listurl.LIstUrl_name
     *
     * @mbggenerated
     */
    private String listurlName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listurl.Url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table listurl
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listurl.ListUrl_id
     *
     * @return the value of listurl.ListUrl_id
     *
     * @mbggenerated
     */
    public Byte getListurlId() {
        return listurlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listurl.ListUrl_id
     *
     * @param listurlId the value for listurl.ListUrl_id
     *
     * @mbggenerated
     */
    public void setListurlId(Byte listurlId) {
        this.listurlId = listurlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listurl.LIstUrl_name
     *
     * @return the value of listurl.LIstUrl_name
     *
     * @mbggenerated
     */
    public String getListurlName() {
        return listurlName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listurl.LIstUrl_name
     *
     * @param listurlName the value for listurl.LIstUrl_name
     *
     * @mbggenerated
     */
    public void setListurlName(String listurlName) {
        this.listurlName = listurlName == null ? null : listurlName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listurl.Url
     *
     * @return the value of listurl.Url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listurl.Url
     *
     * @param url the value for listurl.Url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listurl
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", listurlId=").append(listurlId);
        sb.append(", listurlName=").append(listurlName);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}