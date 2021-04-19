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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisIsolateDBInstancesRequest extends AbstractModel{

    /**
    * 资源ID列表
    */
    @SerializedName("DBInstanceIdSet")
    @Expose
    private String [] DBInstanceIdSet;

    /**
    * 包年包月实例解隔离时购买时常 以月为单位
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 是否使用代金券
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 代金券id列表
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * Get 资源ID列表 
     * @return DBInstanceIdSet 资源ID列表
     */
    public String [] getDBInstanceIdSet() {
        return this.DBInstanceIdSet;
    }

    /**
     * Set 资源ID列表
     * @param DBInstanceIdSet 资源ID列表
     */
    public void setDBInstanceIdSet(String [] DBInstanceIdSet) {
        this.DBInstanceIdSet = DBInstanceIdSet;
    }

    /**
     * Get 包年包月实例解隔离时购买时常 以月为单位 
     * @return Period 包年包月实例解隔离时购买时常 以月为单位
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 包年包月实例解隔离时购买时常 以月为单位
     * @param Period 包年包月实例解隔离时购买时常 以月为单位
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 是否使用代金券 
     * @return AutoVoucher 是否使用代金券
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否使用代金券
     * @param AutoVoucher 是否使用代金券
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 代金券id列表 
     * @return VoucherIds 代金券id列表
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 代金券id列表
     * @param VoucherIds 代金券id列表
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DBInstanceIdSet.", this.DBInstanceIdSet);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

