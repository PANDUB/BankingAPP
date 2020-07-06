package com.main.app.controller;

import com.main.app.entity.DepAccount;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepController {

    @PostMapping("/createDep")
    public String createDepAccount(@RequestBody DepAccount dep)
    {



        return "Dep Account Created";

    }

}
