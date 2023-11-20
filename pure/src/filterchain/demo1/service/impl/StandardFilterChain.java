package filterchain.demo1.service.impl;

import filterchain.demo1.service.Filter;
import filterchain.demo1.service.FilterChain;
import filterchain.demo1.service.HttpRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hj.luo
 * @Date 2023-11-20 14:25
 * @descripition
 * @version: 1.0
 */
public class StandardFilterChain implements FilterChain {
    private List<Filter> filterList = new ArrayList<>();

    private int currentIndex = 0;

    @Override
    public void doFilter(HttpRequest httpRequest) {
        if (currentIndex == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(currentIndex);
        currentIndex ++ ;
        filter.doFilter(httpRequest, this);
    }

    @Override
    public void addFilter(Filter filter) {
        if (filterList.contains(filter)){
            return;
        }
        filterList.add(filter);
    }
}
