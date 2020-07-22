package com.example.springvue1.pojo;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Uid
     *
     * @mbggenerated
     */
    private Byte uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Jid
     *
     * @mbggenerated
     */
    private Byte jid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Uname
     *
     * @mbggenerated
     */
    private String uname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Upassword
     *
     * @mbggenerated
     */
    private String upassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Jlx
     *
     * @mbggenerated
     */
    private String jlx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Uid
     *
     * @return the value of user.Uid
     *
     * @mbggenerated
     */
    public Byte getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Uid
     *
     * @param uid the value for user.Uid
     *
     * @mbggenerated
     */
    public void setUid(Byte uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Jid
     *
     * @return the value of user.Jid
     *
     * @mbggenerated
     */
    public Byte getJid() {
        return jid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Jid
     *
     * @param jid the value for user.Jid
     *
     * @mbggenerated
     */
    public void setJid(Byte jid) {
        this.jid = jid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Uname
     *
     * @return the value of user.Uname
     *
     * @mbggenerated
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Uname
     *
     * @param uname the value for user.Uname
     *
     * @mbggenerated
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Upassword
     *
     * @return the value of user.Upassword
     *
     * @mbggenerated
     */
    public String getUpassword() {
        return upassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Upassword
     *
     * @param upassword the value for user.Upassword
     *
     * @mbggenerated
     */
    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Jlx
     *
     * @return the value of user.Jlx
     *
     * @mbggenerated
     */
    public String getJlx() {
        return jlx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Jlx
     *
     * @param jlx the value for user.Jlx
     *
     * @mbggenerated
     */
    public void setJlx(String jlx) {
        this.jlx = jlx == null ? null : jlx.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", jid=").append(jid);
        sb.append(", uname=").append(uname);
        sb.append(", upassword=").append(upassword);
        sb.append(", jlx=").append(jlx);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}