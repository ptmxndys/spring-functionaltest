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
package jp.co.ntt.fw.spring.functionaltest.app.dmly;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class DeliveryOrderListFormMethodArgumentResolver implements
                                                         HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return DeliveryOrderListForm.class.equals(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter,
            ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
            WebDataBinderFactory binderFactory) throws Exception {
        DeliveryOrderListForm params = new DeliveryOrderListForm();
        params.setFromAcceptDatetime(LocalDateTime.parse(webRequest
                .getParameter("fromAcceptDatetime"), DateTimeFormat.forPattern(
                        "yyyy/MM/dd HH:mm:ss")));
        params.setToAcceptDatetime(LocalDateTime.parse(webRequest.getParameter(
                "toAcceptDatetime"), DateTimeFormat.forPattern(
                        "yyyy/MM/dd HH:mm:ss")));
        params.setUpdateCompletionDatetime(LocalDateTime.parse(webRequest
                .getParameter("updateCompletionDatetime"), DateTimeFormat
                        .forPattern("yyyy/MM/dd HH:mm:ss")));
        return params;
    }

}
