package com.wencom.lt.core.service.mapper;

import com.wencom.lt.core.domain.User;
import com.wencom.lt.core.service.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface UserMapper extends EntityMapper<UserDTO, User> {

    default User fromId(Long id) {
        if (id == null) {
            return null;
        }

        User user = new User();
        user.setId(id);
        return user;
    }
}
