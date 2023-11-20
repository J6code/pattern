package mixins.demo1.service.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hj.luo
 * @Date 2023-11-20 15:14
 * @descripition
 * @version: 1.0
 */
public class PiiContent {
    public static String FORTEST="fortest";

    private Map<String, Object> piiDataMap = new HashMap<>();

    private Map<String, Object> piiContextMap = new HashMap<>();

    public void putPiiData(String domainFieldName, Object domainFieldValue) {
        piiDataMap.put(domainFieldName, domainFieldValue);
    }

    public Object getPiiData(String domainFieldName) {
        return piiDataMap.get(domainFieldName);
    }

    public void putPiiContext(String contextName, Object contextNameValue) {
        piiContextMap.put(contextName, contextNameValue);
    }

    public Object getPiiContext(String contextName) {
        return piiContextMap.get(contextName);
    }
}
