package com.wencom.liteTree.service.mapper;

import com.wencom.liteTree.domain.User;
import com.wencom.liteTree.service.dto.UserDTO;
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
