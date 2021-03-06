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
package jp.co.ntt.fw.spring.functionaltest.app.exhn;

import javax.inject.Inject;

import jp.co.ntt.fw.spring.functionaltest.domain.model.Employee;
import jp.co.ntt.fw.spring.functionaltest.domain.service.exhn.EmployeeService;

import com.github.dozermapper.core.Mapper;
import org.springframework.stereotype.Component;

@Component
public class EmployeeHelper {

    @Inject
    Mapper beanMapper;

    @Inject
    EmployeeService employeeService;

    void convertToForm(EmployeeForm form) {
        Employee employee = employeeService.findEmployee(1);
        beanMapper.map(employee, form);
    }

    Employee convertToEntity(EmployeeForm form) {
        Employee employee = beanMapper.map(form, Employee.class);
        // 更新対象は、ID 1のユーザのみ
        employee.setEmployeeId(1);
        return employee;
    }

}
