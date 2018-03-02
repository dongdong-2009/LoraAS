package Nankai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ly 用于数据分页，对数据库进行操作
 */
public class Page implements Serializable {
	private int currentPage ; // 当前页数
	private int pageSize = 2; // 每页数目
	private int pageTotal; // 总页数目
	private int recordTotal ;// 总记录数
	private int previousPage; // 前一页
	private int nextPage; // 下一页
	private int firstPage = 1; // 第一页
	private int lastPage; // 最后一页
	private int startPage; // 起始页
	private int endPage; // 结束页
	private int numCount = 10; // 页号式导航, 最多显示页号数量为numCount+1;这里显示11页。

	// 要显示的页数
	public List<Integer> showPageNum = new ArrayList<Integer>();

	/**
	 * @param currentPage
	 *            设置要显示的页号
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            设置每页大小
	 * 
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRecordTotal() {
		return recordTotal;
	}

	/**
	 * @param recordTotal
	 *            设置总行数
	 *
	 */
	public void setRecordTotal(int recordTotal) {
		this.recordTotal = recordTotal;
		otherAttr();
	}

	/**
	 * 设置其他参数
	 */
	private void otherAttr() {
		// TODO Auto-generated method stub
		this.pageTotal = (this.recordTotal - 1) / (this.pageSize) + 1; // 总页数

		this.firstPage = 1; // 第一页

		this.lastPage = this.pageTotal; // 最后一页

		// 前一页
		if (this.currentPage > 1) {
			this.previousPage = this.currentPage - 1;

		} else {
			this.previousPage = this.currentPage;
		}

		// 下一页
		if (this.currentPage < this.lastPage) {
			this.nextPage = this.currentPage + 1;
		} else {
			this.nextPage = this.lastPage;
		}

		// 计算page控制

		startPage = Math.max(this.currentPage - numCount / 2, firstPage);
		endPage = Math.min(startPage + numCount, lastPage);

		/**
		 * 查看所有的数字翻页是否大于设置的默认数字翻页个数 如果不大于 那就说明总的页数小于默认设置要显示的数字翻页的个数或者等于
		 * 那么就从第1页的数字翻页开始显示 一直到总的页数
		 */
		if (endPage - startPage < numCount) {
			startPage = Math.max(endPage - numCount, 1);
		}
		/**
		 * 编写数字翻页集合利于页面迭代取出相应的数字翻页。
		 */
		for (int i = startPage; i <= endPage; i++) {
			showPageNum.add(i);
		}

		
		
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getNumCount() {
		return numCount;
	}

	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}

	public List<Integer> getShowPageNum() {
		return showPageNum;
	}

	public void setShowPageNum(List<Integer> showPageNum) {
		this.showPageNum = showPageNum;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	  @Override
	    public String toString() {
	        return "Pager [currentPage=" + currentPage + ", pageSize=" + pageSize
	                + ", pageTotal=" + pageTotal + ", recordTotal=" + recordTotal
	                + ", previousPage=" + previousPage + ", nextPage=" + nextPage
	                + ", firstPage=" + firstPage + ", lastPage=" + lastPage
	                + ", startPage=" + startPage + ", endPage=" + endPage + "]"; 
	    }
	
}
