package pipeline.demo1.service.abstracts;

import pipeline.demo1.service.PipelineContext;
import pipeline.demo1.service.PipelineValue;

/**
 * @author hj.luo
 * @Date 2023-11-20 13:34
 * @descripition
 * @version: 1.0
 */
public abstract class AbstractPipelineValue implements PipelineValue {
    @Override
    public boolean execute(PipelineContext pipelineContext) {
        System.out.println(this.getClass().getSimpleName() + "start");
        boolean executeResult = doExec(pipelineContext);
        System.out.println(this.getClass().getSimpleName() + "end");
        return executeResult;
    }

    protected abstract boolean doExec(PipelineContext pipelineContext);
}
