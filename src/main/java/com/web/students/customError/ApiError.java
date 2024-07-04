package com.web.students.customError;

import java.util.Date;

public class ApiError {
    Integer status ;

    String message ;

    Long timeStamp;

    String path;


    public ApiError(Integer status, String message, Long timeStamp, String path) {
        this.status = status;
        this.message = message;
        this.timeStamp =new Date().getTime();
        this.path = path;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
