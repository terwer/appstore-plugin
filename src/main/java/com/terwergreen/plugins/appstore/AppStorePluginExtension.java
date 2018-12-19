package com.terwergreen.plugins.appstore;

import com.terwergreen.plugins.PluginInterface;
import com.terwergreen.plugins.appstore.front.AppStoreApi;
import com.terwergreen.plugins.appstore.front.AppStoreController;
import com.terwergreen.plugins.appstore.service.impl.AppStoreServiceImpl;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.reactive.function.server.RouterFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 扩展点
 *
 * @author Terwer
 * @version 1.0
 * 2018/12/19 22:10:47
 **/
@Extension
public class AppStorePluginExtension implements PluginInterface {
    private static final Logger logger = LoggerFactory.getLogger(AppStorePluginExtension.class);
    private GenericApplicationContext applicationContext;

    public AppStorePluginExtension(GenericApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        logger.info("AppStorePluginExtension contructor");
        // 注册插件依赖
        registerBeans();
    }

    private void registerBeans() {
        applicationContext.registerBean(AppStoreController.class);
        logger.info("AppStorePluginExtension registerBean " + AppStoreController.class + " in applicationContext " + applicationContext);
        applicationContext.registerBean(AppStoreApi.class);
        logger.info("AppStorePluginExtension registerBean " + AppStoreApi.class + " in applicationContext " + applicationContext);
        applicationContext.registerBean(AppStoreServiceImpl.class);
        logger.info("AppStorePluginExtension registerBean " + AppStoreServiceImpl.class + " in applicationContext " + applicationContext);
    }

    @Override
    public String identify() {
        return "AppStorePlugin identify in plugin";
    }

    @Override
    public List<?> reactiveRoutes() {
        return new ArrayList<RouterFunction<?>>() {{
        }};
    }

    @Override
    public Map data() {
        Map dataMap = new HashMap();
        dataMap.put("appstore", "AppStore");
        return dataMap;
    }
}
