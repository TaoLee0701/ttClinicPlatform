package clinicplatform.shiroconfig;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ShiroExceptionHandler {
	@ExceptionHandler(UnauthorizedException.class)
	public String UnauthorizedException() {
		return "redirect:/deny";
	}
}
