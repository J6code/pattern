package filterchain.demo1.service;

/**
 * 责任接口
 *
 * @author hj.luo
 * @Date 2023-11-20 14:03
 * @descripition
 * @version: 1.0
 */
public interface Filter {
    void doFilter(HttpRequest httpRequest, FilterChain filterChain);
}
