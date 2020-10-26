package com.sash.restfulwebservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYwMzg3MjI4OSwiaWF0IjoxNjAzMjY3NDg5fQ.cBXb00o5FEkVKSEAd20oBO7DtprhGtgwYkZ9JuJyQJNOKBstCEqz2fzFjUads7T1N3G7ZUEWMiuX-vk2_84cVg"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

