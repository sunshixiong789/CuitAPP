/**
 * 
 */
package cn.edu.cuit.cuitapp.handler;

import cn.edu.cuit.cuitapp.common.CommonResult;
import cn.edu.cuit.cuitapp.properties.CuitProperties;
import cn.edu.cuit.cuitapp.properties.LoginTpye;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;

/**
 * 浏览器登录成功处理器
 * @author sunshixiong
 *
 */
@Component("browserAuthenticationSuccessHandler")
public class BrowserAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Autowired
	private ObjectMapper objectMapper;
	@Autowired
	private CuitProperties cuitProperties;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

		if (LoginTpye.JSON.equals(cuitProperties.getBrower().getLoginTpye())) {
			response.setContentType("application/json;charset=UTF-8");
			CommonResult result = new CommonResult();
			result.setCode(200);
			result.setSuccess(true);
			result.setMessage("登录成功");
			response.getWriter().write(objectMapper.writeValueAsString(result));
		} else {
			HttpSession session = request.getSession();
			User user = (User) authentication.getPrincipal();
			session.setAttribute("username",user.getUsername());
			super.onAuthenticationSuccess(request, response, authentication);
		}

	}

}
