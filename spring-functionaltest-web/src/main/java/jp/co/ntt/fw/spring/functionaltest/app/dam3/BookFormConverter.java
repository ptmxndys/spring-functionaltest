/*
 * Copyright(c) 2014 NTT Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.ntt.fw.spring.functionaltest.app.dam3;

import com.github.dozermapper.core.DozerConverter;
import org.springframework.security.crypto.codec.Hex;

public class BookFormConverter extends DozerConverter<String, byte[]> {
    public BookFormConverter() {
        super(String.class, byte[].class);
    }

    @Override
    public byte[] convertTo(String source, byte[] destination) {
        byte[] dest = null;
        if (source != null) {
            dest = Hex.decode(source);
        }
        return dest;
    }

    @Override
    public String convertFrom(byte[] source, String destination) {
        String src = null;
        if (source != null) {
            src = new String(Hex.encode(source)).toUpperCase();
        }
        return src;
    }
}
