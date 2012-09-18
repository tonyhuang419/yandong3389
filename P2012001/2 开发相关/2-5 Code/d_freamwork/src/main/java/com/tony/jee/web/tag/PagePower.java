package com.tony.jee.web.tag;

import java.io.Writer;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;

import com.opensymphony.xwork2.util.ValueStack;

@StrutsTag(name = "PagePower", tldTagClass = "com.clbus.common.tag.PagePowerTag", description = "权限标签")
public class PagePower extends Component {
    /** Context Map Key 为的是如果后面跟着struts2的else标签能够使用 */
    public static final String ANSWER = "struts.if.answer";

    /** 返回值 */
    private Boolean answer;

    /** 页面参数接收使用：模块 */
    private String model;

    /** 页面参数接收使用：画面 */
    private String page;

    /**
     * @param model
     *            接收从PowerTag传过来的model值
     */
    @StrutsTagAttribute(description = "模块", required = true)
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param page
     *            接收从PowerTag传过来的page值
     */
    @StrutsTagAttribute(description = "画面", required = true)
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * 通过值栈为基本类赋值
     * 
     * @param stack
     */
    public PagePower(ValueStack stack) {
        super(stack);
    }

    /**
     * 标记开始处理业务逻辑 通过返回值来确定标签包含的内容是否显示
     */
    public boolean start(Writer writer) {

        // TODO 追加业务判断
        return true;
    }

    /**
     * 标签结束业务处理逻辑 返回值为true或false不影响标签包含的内容显示效果
     */
    public boolean end(Writer writer, String body) {
        this.stack.getContext().put(ANSWER, this.answer);
        return super.end(writer, body);
    }
}
