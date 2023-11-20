package mixins.demo1.service.abstracts;

import mixins.demo1.service.PiiDomainFieldHandler;
import mixins.demo1.service.impl.PiiContent;

import java.lang.reflect.Field;

/**
 * @author hj.luo
 * @Date 2023-11-20 15:11
 * @descripition
 * @version: 1.0
 */
public class PiiDomainFieldHandlerBase implements PiiDomainFieldHandler {
    @Override
    public <T> boolean handlerRead(T domain, Field domainField, PiiContent piiContent) {
        return true;
    }

    @Override
    public <T> boolean handlerWrite(T domain, Field domainField, PiiContent piiContent) {
        return true;
    }

    @Override
    public <T> boolean isSupport(T domain, Field domainField) {
        return false;
    }

    @Override
    public String getPiiDomainMeta() {
        return null;
    }
}
