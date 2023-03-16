package com.API_Crud_operation.demo.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - nitin created on 16 Mar,2023 6:07 pm
 */
@RestController
public class ServerStatus {

    @GetMapping("/status")
    public String serverStatus() {
        return "Server is up !!";
    }

}
