package com.moko.beacon.entity;

import java.io.Serializable;

/**
 * @Date 2017/12/14 0014
 * @Author wenzheng.liu
 * @Description
 * @ClassPath com.moko.beacon.entity.BeaconDeviceInfo
 */
public class BeaconDeviceInfo implements Serializable{
    // 软件版本
    public String softVersion;
    // 制造商
    public String firmname;
    // 产品型号
    public String deviceName;
    // 生产日期
    public String iBeaconDate;
    // MAC地址
    public String iBeaconMac;
    // 芯片型号
    public String chipModel;
    // 硬件版本
    public String hardwareVersion;
    // 固件版本
    public String firmwareVersion;
    // 运行时间
    public String runtime;

    @Override
    public String toString() {
        return "BeaconDeviceInfo{" +
                "softVersion='" + softVersion + '\'' +
                ", firmname='" + firmname + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", iBeaconDate='" + iBeaconDate + '\'' +
                ", iBeaconMac='" + iBeaconMac + '\'' +
                ", chipModel='" + chipModel + '\'' +
                ", hardwareVersion='" + hardwareVersion + '\'' +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                ", runtime='" + runtime + '\'' +
                '}';
    }
}
