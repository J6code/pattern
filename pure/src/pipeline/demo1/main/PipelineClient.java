package pipeline.demo1.main;

import pipeline.demo1.service.Pipeline;
import pipeline.demo1.service.PipelineContext;
import pipeline.demo1.service.impl.ForTestValue;
import pipeline.demo1.service.impl.GraySwitchValue;
import pipeline.demo1.service.impl.StandardPipeline;
import pipeline.demo1.service.impl.StandardPipelineContext;

/**
 * 入口类
 * 当你的数据流需要经过很多同等逻辑处理时，可以考虑使用此套路，便于后续扩展
 *
 * 管道(Pipeline)----用于串联阀门的管道通路
 *
 * 阀门(PipelineValue)----用于每一个节点处理实际业务诉求
 *
 * 管道上下文(PipelineContext)----用于管道上下文中数据的扭转
 *
 * @author hj.luo
 * @Date 2023-11-20 13:53
 * @descripition
 * @version: 1.0
 */
public class PipelineClient {
    public static void main(String[] args) {
        // 管道初始化
        Pipeline pipeline = new StandardPipeline();

        // value 扩展
        GraySwitchValue graySwitchValue = new GraySwitchValue();
        ForTestValue forTestValue = new ForTestValue();

        PipelineContext pipelineContext = new StandardPipelineContext();

        pipeline.addValue(graySwitchValue);
        pipeline.addValue(forTestValue);

        // 调用管道
        pipeline.invoke(pipelineContext);
    }
}
