package filterchain.demo1.service.impl;

import filterchain.demo1.service.Filter;
import filterchain.demo1.service.FilterChain;
import filterchain.demo1.service.HttpRequest;

/**
 * @author hj.luo
 * @Date 2023-11-20 14:20
 * @descripition
 * @version: 1.0
 */
public class ForTest2Filter implements Filter {
    @Override
    public void doFilter(HttpRequest httpRequest, FilterChain filterChain) {
        System.out.println(this.getClass().getSimpleName() + "before" + System.currentTimeMillis());
        filterChain.doFilter(httpRequest);
        System.out.println(this.getClass().getSimpleName() + "end" + System.currentTimeMillis());
    }
}
