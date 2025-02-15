/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQosRequest extends AbstractModel{

    /**
    * 加速业务源地址信息，SrcIpv6和（SrcIpv4+SrcPublicIpv4）二选一，目前Ipv6不可用，全部填写以Ipv4参数为准。
    */
    @SerializedName("SrcAddressInfo")
    @Expose
    private SrcAddressInfo SrcAddressInfo;

    /**
    * 加速业务目标地址信息
    */
    @SerializedName("DestAddressInfo")
    @Expose
    private DestAddressInfo DestAddressInfo;

    /**
    * 加速套餐
T100K：上/下行保障 100kbps
T200K：上/下行保障 200kbps
T400K：上/下行保障 400kbps
BD1M：下行带宽保障1Mbps
BD2M：下行带宽保障2Mbps
BD4M：下行带宽保障4Mbps
BU1M：上行带宽保障1Mbps
BU2M：上行带宽保障2Mbps
BU4M：上行带宽保障4Mbps
    */
    @SerializedName("QosMenu")
    @Expose
    private String QosMenu;

    /**
    * 申请加速的设备信息，包括运营商，操作系统，设备唯一标识等。
    */
    @SerializedName("DeviceInfo")
    @Expose
    private DeviceInfo DeviceInfo;

    /**
    * 期望加速时长（单位分钟），默认值30分钟
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 接口能力扩展，如果是电信用户，必须填充CTCC Token字段
    */
    @SerializedName("Capacity")
    @Expose
    private Capacity Capacity;

    /**
    * 应用模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 加速业务源地址信息，SrcIpv6和（SrcIpv4+SrcPublicIpv4）二选一，目前Ipv6不可用，全部填写以Ipv4参数为准。 
     * @return SrcAddressInfo 加速业务源地址信息，SrcIpv6和（SrcIpv4+SrcPublicIpv4）二选一，目前Ipv6不可用，全部填写以Ipv4参数为准。
     */
    public SrcAddressInfo getSrcAddressInfo() {
        return this.SrcAddressInfo;
    }

    /**
     * Set 加速业务源地址信息，SrcIpv6和（SrcIpv4+SrcPublicIpv4）二选一，目前Ipv6不可用，全部填写以Ipv4参数为准。
     * @param SrcAddressInfo 加速业务源地址信息，SrcIpv6和（SrcIpv4+SrcPublicIpv4）二选一，目前Ipv6不可用，全部填写以Ipv4参数为准。
     */
    public void setSrcAddressInfo(SrcAddressInfo SrcAddressInfo) {
        this.SrcAddressInfo = SrcAddressInfo;
    }

    /**
     * Get 加速业务目标地址信息 
     * @return DestAddressInfo 加速业务目标地址信息
     */
    public DestAddressInfo getDestAddressInfo() {
        return this.DestAddressInfo;
    }

    /**
     * Set 加速业务目标地址信息
     * @param DestAddressInfo 加速业务目标地址信息
     */
    public void setDestAddressInfo(DestAddressInfo DestAddressInfo) {
        this.DestAddressInfo = DestAddressInfo;
    }

    /**
     * Get 加速套餐
T100K：上/下行保障 100kbps
T200K：上/下行保障 200kbps
T400K：上/下行保障 400kbps
BD1M：下行带宽保障1Mbps
BD2M：下行带宽保障2Mbps
BD4M：下行带宽保障4Mbps
BU1M：上行带宽保障1Mbps
BU2M：上行带宽保障2Mbps
BU4M：上行带宽保障4Mbps 
     * @return QosMenu 加速套餐
T100K：上/下行保障 100kbps
T200K：上/下行保障 200kbps
T400K：上/下行保障 400kbps
BD1M：下行带宽保障1Mbps
BD2M：下行带宽保障2Mbps
BD4M：下行带宽保障4Mbps
BU1M：上行带宽保障1Mbps
BU2M：上行带宽保障2Mbps
BU4M：上行带宽保障4Mbps
     */
    public String getQosMenu() {
        return this.QosMenu;
    }

    /**
     * Set 加速套餐
T100K：上/下行保障 100kbps
T200K：上/下行保障 200kbps
T400K：上/下行保障 400kbps
BD1M：下行带宽保障1Mbps
BD2M：下行带宽保障2Mbps
BD4M：下行带宽保障4Mbps
BU1M：上行带宽保障1Mbps
BU2M：上行带宽保障2Mbps
BU4M：上行带宽保障4Mbps
     * @param QosMenu 加速套餐
T100K：上/下行保障 100kbps
T200K：上/下行保障 200kbps
T400K：上/下行保障 400kbps
BD1M：下行带宽保障1Mbps
BD2M：下行带宽保障2Mbps
BD4M：下行带宽保障4Mbps
BU1M：上行带宽保障1Mbps
BU2M：上行带宽保障2Mbps
BU4M：上行带宽保障4Mbps
     */
    public void setQosMenu(String QosMenu) {
        this.QosMenu = QosMenu;
    }

    /**
     * Get 申请加速的设备信息，包括运营商，操作系统，设备唯一标识等。 
     * @return DeviceInfo 申请加速的设备信息，包括运营商，操作系统，设备唯一标识等。
     */
    public DeviceInfo getDeviceInfo() {
        return this.DeviceInfo;
    }

    /**
     * Set 申请加速的设备信息，包括运营商，操作系统，设备唯一标识等。
     * @param DeviceInfo 申请加速的设备信息，包括运营商，操作系统，设备唯一标识等。
     */
    public void setDeviceInfo(DeviceInfo DeviceInfo) {
        this.DeviceInfo = DeviceInfo;
    }

    /**
     * Get 期望加速时长（单位分钟），默认值30分钟 
     * @return Duration 期望加速时长（单位分钟），默认值30分钟
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 期望加速时长（单位分钟），默认值30分钟
     * @param Duration 期望加速时长（单位分钟），默认值30分钟
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 接口能力扩展，如果是电信用户，必须填充CTCC Token字段 
     * @return Capacity 接口能力扩展，如果是电信用户，必须填充CTCC Token字段
     */
    public Capacity getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 接口能力扩展，如果是电信用户，必须填充CTCC Token字段
     * @param Capacity 接口能力扩展，如果是电信用户，必须填充CTCC Token字段
     */
    public void setCapacity(Capacity Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get 应用模板ID 
     * @return TemplateId 应用模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 应用模板ID
     * @param TemplateId 应用模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public CreateQosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQosRequest(CreateQosRequest source) {
        if (source.SrcAddressInfo != null) {
            this.SrcAddressInfo = new SrcAddressInfo(source.SrcAddressInfo);
        }
        if (source.DestAddressInfo != null) {
            this.DestAddressInfo = new DestAddressInfo(source.DestAddressInfo);
        }
        if (source.QosMenu != null) {
            this.QosMenu = new String(source.QosMenu);
        }
        if (source.DeviceInfo != null) {
            this.DeviceInfo = new DeviceInfo(source.DeviceInfo);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Capacity != null) {
            this.Capacity = new Capacity(source.Capacity);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SrcAddressInfo.", this.SrcAddressInfo);
        this.setParamObj(map, prefix + "DestAddressInfo.", this.DestAddressInfo);
        this.setParamSimple(map, prefix + "QosMenu", this.QosMenu);
        this.setParamObj(map, prefix + "DeviceInfo.", this.DeviceInfo);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamObj(map, prefix + "Capacity.", this.Capacity);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

