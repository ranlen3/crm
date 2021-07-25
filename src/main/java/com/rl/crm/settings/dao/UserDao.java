package com.rl.crm.settings.dao;

import com.rl.crm.settings.domain.User;

import java.util.Map;

public interface UserDao {
    User login(Map<String, String> map);
}
