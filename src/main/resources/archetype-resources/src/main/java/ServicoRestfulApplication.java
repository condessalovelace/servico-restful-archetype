#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author condessalovelace
 *
 */
@SpringBootApplication(scanBasePackages = "br.*")
public class ServicoRestfulApplication {
	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) {
		ctx = SpringApplication.run(ServicoRestfulApplication.class, args);
	}

	public static void shutDown() {
		ctx.close();
	}
}
