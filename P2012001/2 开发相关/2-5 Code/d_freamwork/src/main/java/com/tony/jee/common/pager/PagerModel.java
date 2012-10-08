package com.tony.jee.common.pager;

import java.util.Collections;
import java.util.List;


/**
 * 分页模型
 * @author Lawliet
 */
public class PagerModel<T> {

    /** 查询起始记录数 */
    private int offset = 0;
    
    /** 总记录数 */
    private int total;

    /** 当前页的结果集 */
    private List<T> datas;

    /** 每页显示条件 */
    private int perpage = 15;
    
    public int getPerpage() {
        return perpage;
    }

    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @SuppressWarnings("unchecked")
    public List<T> getDatas() {
        return datas == null ? Collections.EMPTY_LIST : datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}