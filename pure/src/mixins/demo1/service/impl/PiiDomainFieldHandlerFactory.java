package mixins.demo1.service.impl;

import mixins.demo1.service.PiiDomainFieldHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hj.luo
 * @Date 2023-11-20 15:10
 * @descripition
 * @version: 1.0
 */
public class PiiDomainFieldHandlerFactory {

    /**
     * 创建领域处理器
     *
     * @return
     */
    public static List<PiiDomainFieldHandler> createPiiDomainFieldHandler() {
        List<PiiDomainFieldHandler> piiDomainFieldHandlerList = new ArrayList<>();

        //
        piiDomainFieldHandlerList.add(new ForTestSupportFieldHandler());
        piiDomainFieldHandlerList.add(new ForTestNotSupportFieldHandler());

        return piiDomainFieldHandlerList;
    }
}
