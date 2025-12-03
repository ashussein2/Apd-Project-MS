package com.hotel.security;

import org.mindrot.jbcrypt.BCrypt;

public class AuthService {

    public String hashPassword(String plain) {
        return BCrypt.hashpw(plain, BCrypt.gensalt());
    }

    public boolean checkPassword(String plain, String hashed) {
        return BCrypt.checkpw(plain, hashed);
    }
}
