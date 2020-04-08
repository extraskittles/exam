package Framework.Mybatis.util;

import com.github.pagehelper.Page;

public class MyPage<E> {
    private int pageNum;
    private int pageSize;
    private long total;
    private E data;
    public MyPage(Page page,E data){
        pageNum=page.getPageNum();
        pageSize=page.getPageSize();
        total=page.getTotal();
        this.data=data;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }


}
