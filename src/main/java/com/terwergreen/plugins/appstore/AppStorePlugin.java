package com.terwergreen.plugins.appstore;

import com.terwergreen.plugins.BugucmsPlugin;
import org.pf4j.PluginException;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 插件
 *
 * @author Terwer
 * @version 1.0
 * 2018/12/19 22:10:47
 **/
public class AppStorePlugin extends BugucmsPlugin {
    private static final Logger logger = LoggerFactory.getLogger(AppStorePlugin.class);

    public AppStorePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() throws PluginException {
        super.start();
        logger.info("AppStorePlugin started");
    }

    @Override
    public void stop() {
        super.stop();
        logger.info("AppStorePlugin stoped");
    }
}
