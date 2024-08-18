package com.companyksi.todoapp.app.models;


import jakarta.persistence.*;

@Entity
@Table(name = "todoapp")
public class Todoapp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_todo")
    private Long codTodo;
    @Column(name = "title_todo")
    private String titleTodo;
    @Column(name = "description_todo")
    private String descriptionTodo;

    public Long getCodTodo() {
        return codTodo;
    }

    public void setCodTodo(Long codTodo) {
        this.codTodo = codTodo;
    }

    public String getTitleTodo() {
        return titleTodo;
    }

    public void setTitleTodo(String titleTodo) {
        this.titleTodo = titleTodo;
    }

    public String getDescriptionTodo() {
        return descriptionTodo;
    }

    public void setDescriptionTodo(String descriptionTodo) {
        this.descriptionTodo = descriptionTodo;
    }
}
