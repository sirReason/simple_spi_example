package cn.mobile;

import cn.memset.spi.InternetService;

public class BeijingChinaMobile implements InternetService {

    @Override
    public void connectInternet() {
        System.out.println("connect internet by [BeijingChinaMobile]");
    }
}
