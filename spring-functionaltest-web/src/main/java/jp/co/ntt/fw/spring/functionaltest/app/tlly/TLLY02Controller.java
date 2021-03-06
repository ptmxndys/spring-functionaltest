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
package jp.co.ntt.fw.spring.functionaltest.app.tlly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tlly")
public class TLLY02Controller {

    @RequestMapping(value = "0201/001")
    public String handle0201001() {
        return "redirect:/tlly/staff/update";
    }

    @RequestMapping(value = "0201/002")
    public String handle0201002() {
        return "redirect:/tlly/staff/search";
    }

    @RequestMapping(value = "0202/001")
    public String handle0202001() {
        return "redirect:/tlly/staff/update";
    }

}
