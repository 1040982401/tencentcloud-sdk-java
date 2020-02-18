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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamedComputeEnv extends AbstractModel{

    /**
    * 计算环境名称
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * 计算节点期望个数
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * 计算环境描述
    */
    @SerializedName("EnvDescription")
    @Expose
    private String EnvDescription;

    /**
    * 计算环境管理类型
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 计算环境具体参数
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * 数据盘挂载选项
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * 授权信息
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * 输入映射信息
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * agent运行模式，适用于Windows系统
    */
    @SerializedName("AgentRunningMode")
    @Expose
    private AgentRunningMode AgentRunningMode;

    /**
    * 通知信息
    */
    @SerializedName("Notifications")
    @Expose
    private Notification Notifications;

    /**
    * 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
    */
    @SerializedName("ActionIfComputeNodeInactive")
    @Expose
    private String ActionIfComputeNodeInactive;

    /**
     * Get 计算环境名称 
     * @return EnvName 计算环境名称
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set 计算环境名称
     * @param EnvName 计算环境名称
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get 计算节点期望个数 
     * @return DesiredComputeNodeCount 计算节点期望个数
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set 计算节点期望个数
     * @param DesiredComputeNodeCount 计算节点期望个数
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get 计算环境描述 
     * @return EnvDescription 计算环境描述
     */
    public String getEnvDescription() {
        return this.EnvDescription;
    }

    /**
     * Set 计算环境描述
     * @param EnvDescription 计算环境描述
     */
    public void setEnvDescription(String EnvDescription) {
        this.EnvDescription = EnvDescription;
    }

    /**
     * Get 计算环境管理类型 
     * @return EnvType 计算环境管理类型
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 计算环境管理类型
     * @param EnvType 计算环境管理类型
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 计算环境具体参数 
     * @return EnvData 计算环境具体参数
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * Set 计算环境具体参数
     * @param EnvData 计算环境具体参数
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * Get 数据盘挂载选项 
     * @return MountDataDisks 数据盘挂载选项
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * Set 数据盘挂载选项
     * @param MountDataDisks 数据盘挂载选项
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * Get 授权信息 
     * @return Authentications 授权信息
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * Set 授权信息
     * @param Authentications 授权信息
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * Get 输入映射信息 
     * @return InputMappings 输入映射信息
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * Set 输入映射信息
     * @param InputMappings 输入映射信息
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * Get agent运行模式，适用于Windows系统 
     * @return AgentRunningMode agent运行模式，适用于Windows系统
     */
    public AgentRunningMode getAgentRunningMode() {
        return this.AgentRunningMode;
    }

    /**
     * Set agent运行模式，适用于Windows系统
     * @param AgentRunningMode agent运行模式，适用于Windows系统
     */
    public void setAgentRunningMode(AgentRunningMode AgentRunningMode) {
        this.AgentRunningMode = AgentRunningMode;
    }

    /**
     * Get 通知信息 
     * @return Notifications 通知信息
     */
    public Notification getNotifications() {
        return this.Notifications;
    }

    /**
     * Set 通知信息
     * @param Notifications 通知信息
     */
    public void setNotifications(Notification Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * Get 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。 
     * @return ActionIfComputeNodeInactive 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     */
    public String getActionIfComputeNodeInactive() {
        return this.ActionIfComputeNodeInactive;
    }

    /**
     * Set 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     * @param ActionIfComputeNodeInactive 非活跃节点处理策略，默认“RECREATE”，即对于实例创建失败或异常退还的计算节点，定期重新创建实例资源。
     */
    public void setActionIfComputeNodeInactive(String ActionIfComputeNodeInactive) {
        this.ActionIfComputeNodeInactive = ActionIfComputeNodeInactive;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "EnvDescription", this.EnvDescription);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamObj(map, prefix + "AgentRunningMode.", this.AgentRunningMode);
        this.setParamObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "ActionIfComputeNodeInactive", this.ActionIfComputeNodeInactive);

    }
}

