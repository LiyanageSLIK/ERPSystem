package com.EPRSystem.demo.dto;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResponseWrapper {
    private String message;
    private String error;
    private List<Object> data;
    private int status;

    public ResponseWrapper(int status, List<Object> data) {
        this.data = data;
        this.status = status;
        this.message = "Successful";
    }

    public ResponseWrapper(int status, Object Dto) {
        this.data = new ArrayList<>();
        data.add(Dto);
        this.status = status;
        this.message = "Successful";

    }

    public ResponseWrapper(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Collection<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
