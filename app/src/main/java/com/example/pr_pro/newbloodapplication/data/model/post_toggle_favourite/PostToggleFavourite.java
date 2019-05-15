
package com.example.pr_pro.newbloodapplication.data.model.post_toggle_favourite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostToggleFavourite {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private PostToggleFavouriteData data;

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

    public PostToggleFavouriteData getData() {
        return data;
    }

    public void setData(PostToggleFavouriteData postToggleFavouriteData) {
        this.data = postToggleFavouriteData;
    }

}
