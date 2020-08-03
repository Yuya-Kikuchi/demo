package com.example.demo.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.sun.istack.NotNull;
/**
 * @author yuya 
 *
 */
public class SignUpForm {
    /** <dd>エンティティ：名前 */
    @NotNull
    @Size(min = 1,max = 50)
    private String name;

    /** <dd>エンティティ：メールアドレス  */
    @Email
    @NotNull
    private String email;

    /** <dd>エンティティ：パスワード */
    @NotNull
    @Size(min = 4,max = 20)
    private String passWord;

    /**
     * @return ユーザー名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name ユーザー名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return　メールアドレス
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email メールアドレス
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return　パスワード
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord ぱｳﾜｰﾄﾞ
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
