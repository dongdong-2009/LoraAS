package Nankai.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ly �������ݷ�ҳ�������ݿ���в���
 */
public class Page implements Serializable {
	private int currentPage ; // ��ǰҳ��
	private int pageSize = 2; // ÿҳ��Ŀ
	private int pageTotal; // ��ҳ��Ŀ
	private int recordTotal ;// �ܼ�¼��
	private int previousPage; // ǰһҳ
	private int nextPage; // ��һҳ
	private int firstPage = 1; // ��һҳ
	private int lastPage; // ���һҳ
	private int startPage; // ��ʼҳ
	private int endPage; // ����ҳ
	private int numCount = 10; // ҳ��ʽ����, �����ʾҳ������ΪnumCount+1;������ʾ11ҳ��

	// Ҫ��ʾ��ҳ��
	public List<Integer> showPageNum = new ArrayList<Integer>();

	/**
	 * @param currentPage
	 *            ����Ҫ��ʾ��ҳ��
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize
	 *            ����ÿҳ��С
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
	 *            ����������
	 *
	 */
	public void setRecordTotal(int recordTotal) {
		this.recordTotal = recordTotal;
		otherAttr();
	}

	/**
	 * ������������
	 */
	private void otherAttr() {
		// TODO Auto-generated method stub
		this.pageTotal = (this.recordTotal - 1) / (this.pageSize) + 1; // ��ҳ��

		this.firstPage = 1; // ��һҳ

		this.lastPage = this.pageTotal; // ���һҳ

		// ǰһҳ
		if (this.currentPage > 1) {
			this.previousPage = this.currentPage - 1;

		} else {
			this.previousPage = this.currentPage;
		}

		// ��һҳ
		if (this.currentPage < this.lastPage) {
			this.nextPage = this.currentPage + 1;
		} else {
			this.nextPage = this.lastPage;
		}

		// ����page����

		startPage = Math.max(this.currentPage - numCount / 2, firstPage);
		endPage = Math.min(startPage + numCount, lastPage);

		/**
		 * �鿴���е����ַ�ҳ�Ƿ�������õ�Ĭ�����ַ�ҳ���� ��������� �Ǿ�˵���ܵ�ҳ��С��Ĭ������Ҫ��ʾ�����ַ�ҳ�ĸ������ߵ���
		 * ��ô�ʹӵ�1ҳ�����ַ�ҳ��ʼ��ʾ һֱ���ܵ�ҳ��
		 */
		if (endPage - startPage < numCount) {
			startPage = Math.max(endPage - numCount, 1);
		}
		/**
		 * ��д���ַ�ҳ��������ҳ�����ȡ����Ӧ�����ַ�ҳ��
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
