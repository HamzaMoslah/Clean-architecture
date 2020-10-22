package com.clean.sample.sha256;

import com.clean.sample.domain.port.PasswordEncoder;
import org.apache.commons.codec.digest.DigestUtils;

public class Sha256PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String s) {
        return DigestUtils.sha256Hex(s);
    }
}
