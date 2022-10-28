package com.EPRSystem.demo.dto;


import org.apache.catalina.webresources.Cache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResponseWrapper {
    private String message;
    private String error;
    private ArrayList<Object> data;
    private int status;


    public ResponseWrapper(int status, Object Dto) {
        try {
            this.data = new ArrayList<>();
            for (Object to : (ArrayList) Dto) {
                data.add(to);
            }}catch(Exception e){
                data.add(Dto);
            }
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

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
