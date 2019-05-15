
package com.example.pr_pro.newbloodapplication.data.model.donation_request_creat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DonationRequestCreat {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private DonationRequestCreatData data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DonationRequestCreatData getData() {
        return data;
    }

    public void setData(DonationRequestCreatData donationRequestCreatData) {
        this.data = donationRequestCreatData;
    }

}
