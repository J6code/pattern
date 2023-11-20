package mixins.demo1.service.impl;

import mixins.demo1.service.abstracts.PiiDomainFieldHandlerBase;

import java.lang.reflect.Field;

/**
 * @author hj.luo
 * @Date 2023-11-20 15:50
 * @descripition
 * @version: 1.0
 */
public class ForTestSupportFieldHandler extends PiiDomainFieldHandlerBase {
    @Override
    public <T> boolean isSupport(T domain, Field domainField) {

        if (this.getClass().getSimpleName().equalsIgnoreCase(domain.getClass().getSimpleName())) {

            // to do business

            System.out.println(this.getClass().getSimpleName() + " is support, to do some business");

            return true;
        }

        return false;
    }

    @Override
    public String getPiiDomainMeta() {
        return this.getClass().getSimpleName();
    }
}
