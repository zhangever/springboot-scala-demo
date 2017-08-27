package com.github.ever.controller;

import com.github.ever.action.ListAllParameters;
import com.github.ever.enums.ResponseStatus;
import com.github.ever.pojo.*;
import com.github.ever.config.TimeParametersConfig;
import com.github.ever.pojo.DemoBean;
import com.github.ever.util.BizUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ever on 2017/8/16.
 */
@RestController
@RequestMapping("/demo/")
@Transactional(value = "localTm", rollbackFor = Exception.class)
public class DemoRestController {
    @Resource
    private TimeParametersConfig timeParametersConfig;

    @RequestMapping(value = "/config", method = RequestMethod.GET)
    public TimeParametersConfig config() {
        return timeParametersConfig;
    }

    @RequestMapping(value = "/listAllParameters", method = RequestMethod.GET)
    public ResponseData listAllParameters() {
        List<TParameter> params = new ListAllParameters().action();
        return new ResponseData(ResponseStatus.SUCCESS, params, null);
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exception() throws MyException {
        throw new MyException("异常范例");
    }

    @ApiOperation(value = "乘法器", notes = "对输入参数做乘法")
    @ApiImplicitParam(name = "bean", value = "参数实体", required = true, dataType = "DemoBean")
    @RequestMapping(value = "/multi", method = RequestMethod.POST)
    public int multi(@RequestBody DemoBean bean) {
        return BizUtil.multiply(bean.getV1(), bean.getV2());
    }

    @ApiOperation(value = "除法器", notes = "对输入参数做除法")
    @ApiImplicitParam(name = "bean", value = "参数实体", required = true, dataType = "DemoBean")
    @RequestMapping(value = "/divid", method = RequestMethod.POST)
    public int divid(@RequestBody DemoBean bean) {
        return BizUtil.divid(bean.getV1(), bean.getV2());
    }
}

