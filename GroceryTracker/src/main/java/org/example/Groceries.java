package org.example;

public class Groceries {
    private String name;
    private String ingredient;
    private String instructions;
    private Category category;

    public Groceries(String name, String ingredient, String instructions, Category category) {
        this.name = name;
        this.ingredient = ingredient;
        this.instructions = instructions;
        this.category = category;
    }

    public Groceries(String name, String ingredient, String instructions) {
        this.name = name;
        this.ingredient = ingredient;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredent() {
        return ingredient;
    }

    public void setIngredent(String ingredent) {
        this.ingredient = ingredent;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
