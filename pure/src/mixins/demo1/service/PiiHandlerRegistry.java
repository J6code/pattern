package mixins.demo1.service;

import mixins.demo1.service.impl.PiiContent;
import mixins.demo1.service.impl.PiiDomainFieldHandlerFactory;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hj.luo
 * @Date 2023-11-20 15:10
 * @descripition
 * @version: 1.0
 */
public class PiiHandlerRegistry {
    private static Map<String, PiiDomainFieldHandler> piiDomainFieldHandlerMap = new HashMap<>();

    public static void putHandler(String piiDomainFieldName, PiiDomainFieldHandler piiDomainFieldHandler) {
        if (piiDomainFieldName == null || piiDomainFieldName == "") {
            return;
        }
        if (piiDomainFieldHandler == null) {
            return;
        }
        if (!piiDomainFieldHandlerMap.containsKey(piiDomainFieldName)) {
            piiDomainFieldHandlerMap.put(piiDomainFieldName, piiDomainFieldHandler);
        }
    }

    public static <T extends Object> int handlerRead(T domain, Field domainField, PiiContent piiContent) {
        int num = 0;
        for (Map.Entry<String, PiiDomainFieldHandler> piiDomainFieldHandlerEntry : piiDomainFieldHandlerMap.entrySet()) {
            if (piiDomainFieldHandlerEntry.getValue().isSupport(domain, domainField)) {
                piiDomainFieldHandlerEntry.getValue().handlerRead(domain, domainField, piiContent);
            }
        }
        return num;
    }

    public static <T extends Object> int handlerWrite(T domain, Field domainField, PiiContent piiContent) {
        int num = 0;
        for (Map.Entry<String, PiiDomainFieldHandler> piiDomainFieldHandlerEntry : piiDomainFieldHandlerMap.entrySet()) {
            if (piiDomainFieldHandlerEntry.getValue().isSupport(domain, domainField)) {
                piiDomainFieldHandlerEntry.getValue().handlerWrite(domain, domainField, piiContent);
            }
        }
        return num;
    }

    public static Map<String, PiiDomainFieldHandler> getPiiDomainFieldHandlerMap() {
        return piiDomainFieldHandlerMap;
    }

    public static void init() {
        List<PiiDomainFieldHandler> piiDomainFieldHandlerList = PiiDomainFieldHandlerFactory
                .createPiiDomainFieldHandler();
        if (piiDomainFieldHandlerList != null && piiDomainFieldHandlerList.size() > 0) {
            for (PiiDomainFieldHandler piiDomainFieldHandler :
                    piiDomainFieldHandlerList) {
                putHandler(piiDomainFieldHandler.getPiiDomainMeta(), piiDomainFieldHandler);
            }
        }
    }
}
