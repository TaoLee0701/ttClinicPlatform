package clinicplatform.shiroconfig;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
	
	/**
     * 重写登录地址
     */
	
	@Override
	protected void redirectToLogin(ServletRequest request, ServletResponse response) throws IOException {
		 HttpServletRequest req = (HttpServletRequest) request;
	     String loginUrl = getLoginUrl();
	     String url = req.getRequestURI();
	     
	     if (url.contains("/doctor/")) {
	    	 loginUrl = "/home/doctor-login";
	     }else if(url.contains("/ttPlatform/")) {
	    	 loginUrl = "/home/platform-login";
	     }else if(url.contains("/clinicback/")) {
	    	 loginUrl = "/home/clinicback-login";
	     }
	     
	     WebUtils.issueRedirect(request, response, loginUrl);

	}

}
