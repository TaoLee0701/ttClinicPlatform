package clinicplatform.shiroconfig;

import java.util.Locale;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogoutFilter extends LogoutFilter {
	//private static final Logger log = LoggerFactory.getLogger(CustomLogoutFilter.class);

	
	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		Subject subject = this.getSubject(request, response);
        if (this.isPostOnlyLogout() && !WebUtils.toHttp(request).getMethod().toUpperCase(Locale.ENGLISH).equals("POST")) {
            return this.onLogoutRequestNotAPost(request, response);
        } else {
            try {
                subject.logout();
            } catch (SessionException var6) {
                //log.debug("Encountered session exception during logout.  This can generally safely be ignored.", var6);
            }
            String redirectUrl = "/logout";
            this.issueRedirect(request, response, redirectUrl);
            return false;
        }

	}
}
