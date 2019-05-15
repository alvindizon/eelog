
package com.alvindizon.eelog.network.model;

import com.squareup.moshi.Json;

public class Subscription {

    @Json(name = "id")
    private Integer id;
    @Json(name = "type")
    private String type;
    @Json(name = "startDate")
    private String startDate;
    @Json(name = "endDate")
    private String endDate;
    @Json(name = "periodStartDate")
    private Object periodStartDate;
    @Json(name = "periodEndDate")
    private Object periodEndDate;
    @Json(name = "status")
    private String status;
    @Json(name = "couponCode")
    private Object couponCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Object getPeriodStartDate() {
        return periodStartDate;
    }

    public void setPeriodStartDate(Object periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public Object getPeriodEndDate() {
        return periodEndDate;
    }

    public void setPeriodEndDate(Object periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(Object couponCode) {
        this.couponCode = couponCode;
    }

}
