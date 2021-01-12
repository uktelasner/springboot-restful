package com.wencom.restful.domain.Enum;

import com.sun.istack.NotNull;

public enum  SexType implements EnumClass<Integer> {

    MALE(0),
    FEMALE(1);

    private Integer id;

    SexType(Integer value) {
        this.id = value;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @NotNull
    private static SexType fromId(Integer id) {
        for (SexType st: SexType.values()) {
            if(st.getId().equals(id)) {
                return st;
            }
        }
        return null;
    }
}
