package pipeline.demo1.service.impl;

import pipeline.demo1.service.PipelineContext;
import pipeline.demo1.service.abstracts.AbstractPipelineValue;

/**
 * 测试处理2
 *
 * @author hj.luo
 * @Date 2023-11-20 13:43
 * @descripition
 * @version: 1.0
 */
public class ForTestValue extends AbstractPipelineValue {
    @Override
    protected boolean doExec(PipelineContext pipelineContext) {
        return true;
    }
}