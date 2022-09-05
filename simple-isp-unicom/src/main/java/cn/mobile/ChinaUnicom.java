package cn.mobile;

import cn.memset.spi.InternetService;

public class ChinaUnicom implements InternetService {
    @Override
    public void connectInternet() {
        System.out.println("connect Internet by [ChinaUnion]");
    }
}
