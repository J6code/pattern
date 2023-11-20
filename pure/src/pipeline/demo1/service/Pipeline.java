package pipeline.demo1.service;

public interface Pipeline {
    /**
     * 执行
     *
     * @return
     */
    boolean invoke(PipelineContext context);

    /**
     * 添加值
     *
     * @param pipelineValue
     * @return
     */
    boolean addValue(PipelineValue pipelineValue);

    /**
     * 移除值
     *
     * @param pipelineValue
     * @return
     */
    boolean removeValue(PipelineValue pipelineValue);
}
