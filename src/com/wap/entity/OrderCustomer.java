package com.wap.entity;

import java.util.Date;

public class OrderCustomer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_customer.del_flag
     *
     * @mbggenerated
     */
    private Boolean delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer.id
     *
     * @return the value of order_customer.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer.id
     *
     * @param id the value for order_customer.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer.mobile
     *
     * @return the value of order_customer.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer.mobile
     *
     * @param mobile the value for order_customer.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer.password
     *
     * @return the value of order_customer.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer.password
     *
     * @param password the value for order_customer.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer.create_time
     *
     * @return the value of order_customer.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer.create_time
     *
     * @param createTime the value for order_customer.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_customer.del_flag
     *
     * @return the value of order_customer.del_flag
     *
     * @mbggenerated
     */
    public Boolean getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_customer.del_flag
     *
     * @param delFlag the value for order_customer.del_flag
     *
     * @mbggenerated
     */
    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }
}