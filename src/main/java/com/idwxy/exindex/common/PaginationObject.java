package com.idwxy.exindex.common;

// 分页查询类，封装了结果等属性
public class PaginationObject {

    // 结果
    private Object list;

    // 第几页
    private Integer pageNum;

    // 每页记录个数
    private Integer pageSize;

    // 记录总数
    private long total;

    // 构造函数
    public PaginationObject() {
        super();
    }

    public PaginationObject(Object list, Integer pageNum, Integer pageSize, long total) {
        super();
        this.list = list;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
    }

    public Object getList() {
        return list;
    }

    public void setList(Object list) {
        this.list = list;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "PaginationObject [list=" + list +
                ",pageNum=" + pageNum +
                ",pageSize=" + pageSize +
                ",total=" + total + "]";
    }
}
