package com.homepage.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>基本的用户信息</h1>
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private Long id;
    private String username;
    private String email;

    
    public UserInfo(Long id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}


	public static UserInfo invalid() {
        return new UserInfo(-1L, "", "");
    }
}