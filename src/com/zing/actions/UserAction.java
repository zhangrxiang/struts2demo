package com.zing.actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zing.domain.User;
import com.zing.service.UserService;

import java.util.Map;

/**
 * Created by zhang on 2016/12/29.
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{

    private User user;
    private UserService userService = new UserService();

    public String isLogin(){
        ActionContext context = ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        User user = (User) session.get("user");
        System.out.println(user);
        if(user!=null){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
    public String login(){
        ActionContext context = ActionContext.getContext();
        Map<String, Object> session = context.getSession();
        Map<String, Object> application = context.getApplication();
        for (int i = 0; i < 10; i++){
            application.put(""+i, new User("zing ---"+i,"pwd"+i));
        }
        User userModel = getModel();
        session.put("user", userModel);
        boolean isLogin = userService.login(userModel.getUsername(),userModel.getPassword());
        System.out.println(userModel);

        application.putAll(userService.getAllUser());

        if(isLogin)
            return "login";
        else {
            return "error";
        }
    }

    @Override
    public User getModel() {
        if(user == null){
            user = new User();
        }
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
