package filterchain.demo1.main;

import filterchain.demo1.service.FilterChain;
import filterchain.demo1.service.impl.ForTest1Filter;
import filterchain.demo1.service.impl.ForTest2Filter;
import filterchain.demo1.service.impl.StandardFilterChain;
import filterchain.demo1.service.impl.StandardHttpRequest;

/**
 *
 * 例如常见的web请求场景
 *
 * 过滤器(Filter)----实际处理业务的节点
 *
 * 过滤链(FilterChain)----串联过滤器的链条
 *
 * @author hj.luo
 * @Date 2023-11-20 14:45
 * @descripition
 * @version: 1.0
 */
public class FilterClient {
    public static void main(String[] args) {
        // 构建责任链
        FilterChain filterChain = new StandardFilterChain();
        // 添加责任
        filterChain.addFilter(new ForTest1Filter());
        filterChain.addFilter(new ForTest2Filter());
        // 执行
        filterChain.doFilter(new StandardHttpRequest());
    }
}
