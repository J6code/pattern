package pipeline.demo1.service.impl;

import pipeline.demo1.service.PipelineContext;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 标准通道上下文
 *
 * @author hj.luo
 * @Date 2023-11-20 13:44
 * @descripition
 * @version: 1.0
 */
public class StandardPipelineContext implements PipelineContext {
    private Map<String, Object> contentMap = new ConcurrentHashMap<>();

    @Override
    public void set(String contextKey, Object contextValue) {
        contentMap.put(contextKey, contextValue);
    }

    @Override
    public Object get(String contextKey) {
        Object value = contentMap.get(contextKey);
        return value;
    }
}
