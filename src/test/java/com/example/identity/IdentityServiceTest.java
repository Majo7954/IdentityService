package com.example.identity;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IdentityServiceTest {

    @Autowired
    private IdentityService identityService;

    @Test
    public void testCheckIfIdentityExists() {
        String existingCi = "12345678";
        String nonExistingCi = "87654321";

        identityService.addIdentity(existingCi);

        assertTrue(identityService.checkIfIdentityExists(existingCi));
        assertFalse(identityService.checkIfIdentityExists(nonExistingCi));
    }
}
