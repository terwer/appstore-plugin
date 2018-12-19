package com.terwergreen.plugins.appstore.service.impl;

import com.alibaba.fastjson.JSON;
import com.terwergreen.core.CommonService;
import com.terwergreen.plugins.appstore.service.AppStoreService;
import com.terwergreen.pojo.SiteConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务实现
 *
 * @author Terwer
 * @version 1.0
 * 2018/12/19 22:10:47
 **/
@Service
public class AppStoreServiceImpl implements AppStoreService {
    private static final Logger logger = LoggerFactory.getLogger(AppStoreServiceImpl.class);

    @Autowired
    private CommonService commonService;

    @Override
    public String getAppStoreInfo() {
        SiteConfig siteConfig = commonService.getSiteConfig();
        if (null != siteConfig) {
            return JSON.toJSONString(siteConfig);
        }
        return "no data";
    }
}
