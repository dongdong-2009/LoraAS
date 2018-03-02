package Nankai.Tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class ShowIpTag implements Tag {
	private PageContext pc=null;

	
	
	@Override
	public int doEndTag() throws JspException {
		return 0;
	}

	@Override
	public int doStartTag() throws JspException {
		try {
			String ip = pc.getRequest().getRemoteAddr();
			pc.getOut().write(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Eval_Body_Include -- ��ʼ��ǩ֮��ı�ǩ����Ҫִ��
		//Skip_Body -- ��ʼ��ǩ֮��ı�ǩ�岻��Ҫִ��
		return 0;
	}

	@Override
	public Tag getParent() {
		return null;
	}

	@Override
	public void release() {

	}

	@Override
	public void setPageContext(PageContext pc) {
		this.pc = pc;
	}

	@Override
	public void setParent(Tag t) {

	}

}
