package com.yuan.newbeecopy.utils;

import java.util.*;

public class PageQueryUtil extends LinkedHashMap<String, Object> {
    //当前页数
    private int currPage;
    //每页条数
    private int limit;

    public PageQueryUtil(Map<String,Object> params) {
        this.putAll(params);
        this.currPage = Integer.parseInt(params.get("page").toString());
        this.limit = Integer.parseInt(params.get("limit").toString());
        this.put("start",(currPage-1)*limit);
        this.put("page",currPage);
        this.put("limit",limit);
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageQueryUtil{" +
                "currPage=" + currPage +
                ", limit=" + limit +
                '}';
    }
}
