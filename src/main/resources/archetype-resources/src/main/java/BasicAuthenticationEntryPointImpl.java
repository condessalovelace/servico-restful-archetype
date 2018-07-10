#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class BasicAuthenticationEntryPointImpl extends BasicAuthenticationEntryPoint {
	@Override
	public void afterPropertiesSet() throws Exception {
		setRealmName("servicorestful");
		super.afterPropertiesSet();
	}
}
