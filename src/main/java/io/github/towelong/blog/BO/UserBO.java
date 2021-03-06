/**
 * @作者 WeLong
 * @博客 $ https://towelong.cn
 * @开源项目 $ https://github.com/ToWeLong
 * @创建时间 2020/4/17 19:04
 */
package io.github.towelong.blog.BO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBO {
    private Long id;
    private String nickname;
    private String email;
    private String account;
    private String password;
    private Long group_id;
    private String oldPassword;
}
