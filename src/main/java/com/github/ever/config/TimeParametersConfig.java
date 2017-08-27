package com.github.ever.config;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.style.ToStringStyler;

/**
 * Created by ever on 2017/8/27.
 */
@ConfigurationProperties(prefix = "parameter.time")
public class TimeParametersConfig {
    // 航班抵达后多长时间开始在行李转盘上显示，单位秒，默认20分钟
    public int timeInSsAfterArr;
    // 航班在行李转盘上显示多长时间，单位秒， 默认25分钟
    public int displayTimeInSs4Belt;
    // 候机厅登机屏显上的航班动态信息，需显示多长时间内起飞的航班，单位分钟，默认3小时
    public int displayTimeInMi4Dep;
    // 分拣处抵达屏显上的航班动态信息，需显示多长时间内抵达的航班，单位分钟，默认3小时
    public int displayTimeInMi4Arr;

    public int getTimeInSsAfterArr() {
        return timeInSsAfterArr;
    }

    public void setTimeInSsAfterArr(int timeInSsAfterArr) {
        this.timeInSsAfterArr = timeInSsAfterArr;
    }

    public int getDisplayTimeInSs4Belt() {
        return displayTimeInSs4Belt;
    }

    public void setDisplayTimeInSs4Belt(int displayTimeInSs4Belt) {
        this.displayTimeInSs4Belt = displayTimeInSs4Belt;
    }

    public int getDisplayTimeInMi4Dep() {
        return displayTimeInMi4Dep;
    }

    public void setDisplayTimeInMi4Dep(int displayTimeInMi4Dep) {
        this.displayTimeInMi4Dep = displayTimeInMi4Dep;
    }

    public int getDisplayTimeInMi4Arr() {
        return displayTimeInMi4Arr;
    }

    public void setDisplayTimeInMi4Arr(int displayTimeInMi4Arr) {
        this.displayTimeInMi4Arr = displayTimeInMi4Arr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
