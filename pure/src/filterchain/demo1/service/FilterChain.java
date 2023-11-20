package filterchain.demo1.service;

/**
 * @author hj.luo
 * @Date 2023-11-20 14:04
 * @descripition
 * @version: 1.0
 */
public interface FilterChain {
    void doFilter(HttpRequest httpRequest);

    void addFilter(Filter filter);
}
