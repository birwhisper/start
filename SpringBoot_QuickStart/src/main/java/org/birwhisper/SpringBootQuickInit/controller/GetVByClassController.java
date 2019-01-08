package org.birwhisper.SpringBootQuickInit.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: RenKeMuHua
 * @date: Created in 19:06 2019.1.7
 * @Description:
 */
@RestController
@ConfigurationProperties(prefix = "ms")
public class GetVByClassController {

    private String sql;

    private String nosql;

    @RequestMapping("/getVbC")
    public String getV(){
        return "回调--"+"sql port:"+ sql +"\r\n"+ "nosql port:" +nosql;
    }


    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setNosql(String nosql) {
        this.nosql = nosql;
    }
}
