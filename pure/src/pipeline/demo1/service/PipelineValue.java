package pipeline.demo1.service;

public interface PipelineValue {
    /**
     * 节点执行
     *
     * @param pipelineContext
     * @return
     */
    boolean execute(PipelineContext pipelineContext);
}
