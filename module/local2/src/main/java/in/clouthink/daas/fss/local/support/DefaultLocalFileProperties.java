package in.clouthink.daas.fss.local.support;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class DefaultLocalFileProperties implements LocalFileProperties, InitializingBean {

    private String storePath;

    private String name;
    private String pathRule;
    private String type;

    @Override
    public String getStorePath() {
        return storePath;
    }

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(storePath);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathRule() {
        return pathRule;
    }

    public void setPathRule(String pathRule) {
        this.pathRule = pathRule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
