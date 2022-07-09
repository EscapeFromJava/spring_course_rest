package com.arturreske.spring.rest.exception_handling;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
