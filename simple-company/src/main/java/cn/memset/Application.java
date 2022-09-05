package cn.memset;

import cn.memset.spi.InternetService;

import java.io.IOException;
import java.util.ServiceLoader;

/**
 * @author turboyou
 */
public class Application {
    public static void main(String[] args) throws IOException {
        ServiceLoader<InternetService> loader =
                ServiceLoader.load(InternetService.class);
        for(InternetService provide : loader) {
            provide.connectInternet();
        }
    }
}
