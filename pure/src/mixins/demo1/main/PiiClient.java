package mixins.demo1.main;

import mixins.demo1.service.PiiDomainFieldHandler;
import mixins.demo1.service.PiiHandlerRegistry;
import mixins.demo1.service.impl.ForTestNotSupportFieldHandler;
import mixins.demo1.service.impl.ForTestSupportFieldHandler;
import mixins.demo1.service.impl.PiiContent;

import java.util.Map;

/**
 * 适合于有共性、后续持续扩展的场景
 *
 * 处理器注册器----用于存储处理器的集合
 *
 * 处理器工厂----用于创建处理器
 *
 * 处理器----实际的处理器以及扩展的实现
 *
 * 处理器上下文----处理器上下文，用于参数的传递
 * @author hj.luo
 * @Date 2023-11-20 15:52
 * @descripition
 * @version: 1.0
 */
public class PiiClient {
    public static void main(String[] args) {
        PiiHandlerRegistry.init();

        // 遍历处理器
        for (Map.Entry<String, PiiDomainFieldHandler> entryHandler :
                PiiHandlerRegistry.getPiiDomainFieldHandlerMap().entrySet()) {
            System.out.println(entryHandler.getKey() + "\t" + entryHandler.getValue().getPiiDomainMeta());
        }

        //
        PiiContent piiContent = new PiiContent();
        piiContent.putPiiContext(PiiContent.FORTEST, PiiContent.FORTEST);

        // 请求处理
        System.out.println("ForTestSupportFieldHandler start");
        PiiHandlerRegistry.handlerRead(new ForTestSupportFieldHandler(), null, piiContent);
        System.out.println("ForTestSupportFieldHandler end");

        // 请求处理
        System.out.println("ForTestNotSupportFieldHandler start");
        PiiHandlerRegistry.handlerRead(new ForTestNotSupportFieldHandler(), null, piiContent);
        System.out.println("ForTestNotSupportFieldHandler end");

    }
}
