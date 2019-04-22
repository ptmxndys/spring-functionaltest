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
package jp.co.ntt.fw.spring.functionaltest.app.thym;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
// @RequestMapping("thym/0803")
public class THYM0803Controller {

    @ModelAttribute
    public Item setUpItem() {
        Item item = new Item();
        item.setName("Orange");
        return item;
    }

    @RequestMapping(value = "javascript/{jsTemplate}.js", method = RequestMethod.GET)
    public String handle001(@PathVariable("jsTemplate") String jsTemplate,
            Model model) {

        return jsTemplate;
    }

    @RequestMapping(value = "resources/**/{jsTemplate}.js", method = RequestMethod.GET)
    public String handle002(@PathVariable("jsTemplate") String jsTemplate) {

        return jsTemplate;
    }

}
