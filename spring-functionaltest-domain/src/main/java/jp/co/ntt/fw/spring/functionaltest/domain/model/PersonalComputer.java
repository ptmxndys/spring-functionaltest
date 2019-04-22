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
package jp.co.ntt.fw.spring.functionaltest.domain.model;

import java.io.Serializable;

public class PersonalComputer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int personalComputerId;

    private String personalComputerName;

    private String os;

    private String cpu;

    private String ram;

    private String videocard;

    private String hdd;

    private String power;

    private int price;

    public int getPersonalComputerId() {
        return personalComputerId;
    }

    public void setPersonalComputerId(int personalComputerId) {
        this.personalComputerId = personalComputerId;
    }

    public String getPersonalComputerName() {
        return personalComputerName;
    }

    public void setPersonalComputerName(String personalComputerName) {
        this.personalComputerName = personalComputerName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
