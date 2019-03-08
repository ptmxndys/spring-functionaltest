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
package jp.co.ntt.fw.spring.functionaltest.app.cdls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("cdls")
@Controller
public class CDLS04Controller {

    @ModelAttribute
    public CodeListForm setUpCodeListForm() {
        return new CodeListForm();
    }

    @RequestMapping(value = "0403/001", method = RequestMethod.GET)
    public String handle03001(Model model) {
        return "cdls/codeListVariation";
    }

    @RequestMapping(value = "0403/002", method = RequestMethod.GET)
    public String handle03002(Model model) {
        return "cdls/codeListVariation";
    }

    @RequestMapping(value = "0403/003", method = RequestMethod.GET)
    public String handle03003(Model model) {
        return "cdls/codeListVariation";
    }
}