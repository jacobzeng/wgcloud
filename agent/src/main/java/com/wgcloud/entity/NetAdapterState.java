package com.wgcloud.entity;

import java.util.Date;

public class NetAdapterState extends BaseEntity {

    /**
     * host名称
     */
    private String hostname;

    private String name;

    private String ipv4Address;

    private String ipv4Netmask;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpv4Address() {
        return ipv4Address;
    }

    public void setIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    public String getIpv4Netmask() {
        return ipv4Netmask;
    }

    public void setIpv4Netmask(String ipv4Netmask) {
        this.ipv4Netmask = ipv4Netmask;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
