package com.wencom.restful.service.dto;

import com.wencom.restful.domain.Enum.SexType;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 200)
    private String name;

    private Integer age;

    private Integer sex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SexType getSex() {
        return SexType.fromId(this.sex);
    }

    public void setSex(SexType sex) {
        this.sex = sex.getId();
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + SexType.fromId(sex) +
                '}';
    }
}
