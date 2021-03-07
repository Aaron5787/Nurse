package com.app.elenurse.domain;


import lombok.Data;

import java.util.Date;
@Data
public class User {

    private String id;
    private String userCode;
    private String userName;
    private String userPhone;
    private String userPassword;
    private String userStatus;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;

}
