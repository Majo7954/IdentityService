package com.example.identity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityService {

    @Autowired
    private IdentityRepository identityRepository;

    public boolean checkIfIdentityExists(String ci) {
        return identityRepository.existsByCi(ci);
    }

    public void addIdentity(String ci) {
        identityRepository.save(new Identity(ci));
    }
}
