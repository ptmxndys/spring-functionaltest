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
package jp.co.ntt.fw.spring.functionaltest.app.bnmp;

import java.util.Date;

import com.github.dozermapper.core.DozerConverter;
import org.joda.time.DateTime;

public class DateToJodaDateTimeConverter extends
                                         DozerConverter<Date, DateTime> {

    public DateToJodaDateTimeConverter() {
        super(Date.class, DateTime.class);
    }

    @Override
    public DateTime convertTo(Date source, DateTime destination) {
        return new DateTime(source);
    }

    @Override
    public Date convertFrom(DateTime source, Date destination) {
        return source.toDate();
    }
}
