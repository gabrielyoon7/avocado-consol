package kr.ac.kyonggi.avocado_consol.handler.action.main.user;

import kr.ac.kyonggi.avocado_consol.common.controller.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupAction implements Action {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "RequestDispatcher:jsp/main/account/signup.jsp";
    }
}
