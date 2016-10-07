package com.peter.codewarstest;

import com.peter.codewars.SecretDetective;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecretRecoveryTest {

    private SecretDetective detective;

    @Before public void setup() {
        detective = new SecretDetective();
    }

    @Test public void secret1() {
        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        assertEquals("whatisup", detective.recoverSecret(triplets));
    }
}
