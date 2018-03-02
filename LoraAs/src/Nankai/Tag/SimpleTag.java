package Nankai.Tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;

public class SimpleTag implements javax.servlet.jsp.tagext.SimpleTag {
		
	JspContext pc=null;
	
	@Override
	public void doTag() throws JspException, IOException {
		PageContext pc1=(PageContext) pc;
		String ip=pc1.getRequest().getRemoteAddr();
		pc1.getOut().write(ip);
	}

	@Override
	public JspTag getParent() {
		return null;
	}

	@Override
	public void setJspBody(JspFragment arg0) {
		
	}
	
	@Override
	public void setJspContext(JspContext pc) {
			this.pc=pc;
	}

	@Override
	public void setParent(JspTag arg0) {
		// TODO Auto-generated method stub

	}

}
