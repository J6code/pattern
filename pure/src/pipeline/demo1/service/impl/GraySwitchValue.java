package pipeline.demo1.service.impl;

import pipeline.demo1.service.PipelineContext;
import pipeline.demo1.service.abstracts.AbstractPipelineValue;

/**
 * 测试处理
 *
 * @author hj.luo
 * @Date 2023-11-20 13:37
 * @descripition
 * @version: 1.0
 */
public class GraySwitchValue extends AbstractPipelineValue {
    @Override
    protected boolean doExec(PipelineContext pipelineContext) {
        pipelineContext.set(PipelineContext.FOR_TEST, true);
        return true;
    }
}
