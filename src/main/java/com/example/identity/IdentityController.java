package com.example.identity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    @GetMapping("/api/identity/exists")
    public boolean checkIdentityExists(@RequestParam String ci) {
        return identityService.checkIfIdentityExists(ci);
    }

    @PostMapping("/api/identity/add")
    public void addIdentity(@RequestParam String ci) {
        identityService.addIdentity(ci);
    }
}
