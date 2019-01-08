package org.birwhisper.SpringBootQuickInit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: RenKeMuHua
 * @date: Created in 18:52 2019.1.7
 * @Description:
 */
@RestController
public class GetVBySourceController {

    @Value("${local}")
    private String local;

    @Value("${ms.name}")
    private String ms;

    @RequestMapping("/getVbA")
    public String getS(){
        return "local:"+local+"\n\rms:"+ms;
    }


}
