<<<<<<< HEAD
package clinicplatform.shiroconfig;

import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

	// 设置权限提供程序Realm
	@Bean
	public Realm realm() {
		return new WebRealm();
	}

	// 设置安全上下文
	@Bean
	public DefaultWebSecurityManager defaultWebSecurityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		// 为 Shiro 配置默认的内存缓存，此外还可以整合Redis、EhCache等第三方缓存
		securityManager.setCacheManager(new MemoryConstrainedCacheManager());
		return securityManager;
	}

	// 设置授权过滤器
	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean() {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

		// 获取filters
        Map<String, Filter> filters = shiroFilterFactoryBean.getFilters();
        // 将自定义的FormAuthenticationFilter注入shiroFilter中
        filters.put("authc", new MyFormAuthenticationFilter());
        // 将自定义的LogoutFilter注入shiroFilter中
        //filters.put("logout", new MyLogoutFilter());
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager());
        // 拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        filterChainDefinitionMap.put("/home/**", "anon");
        filterChainDefinitionMap.put("/doctor/**", "anon");
        filterChainDefinitionMap.put("/static/**", "anon");   
        filterChainDefinitionMap.put("/favicon.ico","anon");
        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setLoginUrl("login.html");
        
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        

		return shiroFilterFactoryBean;
	}

	@Bean
	public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
		return defaultAdvisorAutoProxyCreator;
	}

}
=======
package clinicplatform.shiroconfig;

import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

	// 设置权限提供程序Realm
	@Bean
	public Realm realm() {
		return new WebRealm();
	}

	// 设置安全上下文
	@Bean
	public DefaultWebSecurityManager defaultWebSecurityManager() {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(realm());
		// 为 Shiro 配置默认的内存缓存，此外还可以整合Redis、EhCache等第三方缓存
		securityManager.setCacheManager(new MemoryConstrainedCacheManager());
		return securityManager;
	}

	// 设置授权过滤器
	@Bean
	public ShiroFilterFactoryBean shiroFilterFactoryBean() {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

		// 获取filters
        Map<String, Filter> filters = shiroFilterFactoryBean.getFilters();
        // 将自定义的FormAuthenticationFilter注入shiroFilter中
        filters.put("authc", new MyFormAuthenticationFilter());
        // 将自定义的LogoutFilter注入shiroFilter中
        //filters.put("logout", new MyLogoutFilter());
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager());
        // 拦截器.
        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
        filterChainDefinitionMap.put("/home/**", "anon");
		filterChainDefinitionMap.put("/ttPlatform/login", "anon");
        filterChainDefinitionMap.put("/ttPlatform/check-login", "anon");
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/favicon.ico", "anon");

        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setLoginUrl("/login.html");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);


		return shiroFilterFactoryBean;
	}

	@Bean
	public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
		defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
		return defaultAdvisorAutoProxyCreator;
	}

}
>>>>>>> refs/heads/test
