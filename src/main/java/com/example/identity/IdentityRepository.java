package com.example.identity;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class IdentityRepository {

    private Set<String> identities = new HashSet<>();

    public boolean existsByCi(String ci) {
        return identities.contains(ci);
    }

    public void save(Identity identity) {
        identities.add(identity.getCi());
    }
}

