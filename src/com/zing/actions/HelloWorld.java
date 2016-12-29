package com.zing.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zing.domain.User;
import org.apache.struts2.StrutsStatics;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhang on 2016/12/28.
 */
public class HelloWorld extends ActionSupport implements ModelDriven<User>{

    private final String HELLOWORLD = "success";
    private String message;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String helloWorld(){
        System.out.println(HELLOWORLD);
        return SUCCESS;
    }
    public String getMethod(){
        ActionContext actionContext = ActionContext.getContext(); //上下文对象相当于request范围
        HttpServletRequest request = (HttpServletRequest)actionContext.get(StrutsStatics.HTTP_REQUEST);
        HttpSession session = request.getSession(false);
        ServletContext application = session.getServletContext();
        this.message = application.getServerInfo();
        System.out.println("getMethod");
        return "getMethod";
    }

    public String postMethod() throws Exception {
        ActionContext context = ActionContext.getContext();//相当于request
        Map<String, Object> application = context.getApplication();
        User model = getModel();
        application.put("user",model);
        System.out.println(model);
        return "success";
    }

    @Override
    public User getModel() {
        if(user == null){
            return user = new User();
        }
        return user;
    }
}
