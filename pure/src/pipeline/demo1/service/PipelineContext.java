package pipeline.demo1.service;

/**
 * 管道上下文
 */
public interface PipelineContext {
    String FOR_TEST = "forTest";

    /**
     * 设置
     *
     * @param contextKey
     * @param contextValue
     */
    void set(String contextKey, Object contextValue);

    /**
     * 获取值
     *
     * @param contextKey
     * @return
     */
    Object get(String contextKey);
}
