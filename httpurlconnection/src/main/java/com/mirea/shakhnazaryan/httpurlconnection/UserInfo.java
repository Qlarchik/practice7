package com.mirea.shakhnazaryan.httpurlconnection;

public class UserInfo {
    private String ip;
    private String region;
    private String country;

    public UserInfo(String ip, String region, String country) {
        this.ip = ip;
        this.region = region;
        this.country = country;
    }

    public String getIp() { return ip; }

    public String getRegion() { return region; }

    public String getCountry() { return country; }
}
