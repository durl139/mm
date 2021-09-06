/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.dcnet.www.object;

/**
 *
 * @author user
 */
public class Book {

    private int id;
    private String name;
    private String lang;
    private int inventory;
    private String email;

    public Book(int id, String name, String lang, int inventory) {
        this.id = id;
        this.name = name;
        this.lang = lang;
        this.inventory = inventory;
    }

    public Book() {
    }

    

 

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", lang=" + lang + ", inventory=" + inventory + '}';
    }

}
