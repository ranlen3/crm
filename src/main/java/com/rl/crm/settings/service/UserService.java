package com.rl.crm.settings.service;

import com.rl.crm.exception.LoginException;
import com.rl.crm.settings.domain.User;

public interface UserService {

    User login(String loginAct, String loginPwd, String ip) throws LoginException;
}
