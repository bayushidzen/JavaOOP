package org.example.hw1;

public class User {
    protected String login;
    protected String password;
    protected Basket userBasket;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUser_basket() {
        return userBasket;
    }

    public void setUser_basket(Basket user_basket) {
        this.userBasket = userBasket;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", user_basket=" + userBasket +
                '}';
    }

    public User(String login, String password, Basket user_basket) {
        this.login = login;
        this.password = password;
        this.userBasket = user_basket;
    }
}
