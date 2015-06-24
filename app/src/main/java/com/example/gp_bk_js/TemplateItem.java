package com.example.gp_bk_js;

/**
 * Represents an item in a ToDo list
 */
public class TemplateItem {

    /**
     * Item title
     */
    @com.google.gson.annotations.SerializedName("title")
    private String mTitle;

    /**
     * Item content
     */
    @com.google.gson.annotations.SerializedName("content")
    private String mContent;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * ToDoItem constructor
     */
    public TemplateItem() {

    }

    @Override
    public String toString() {
        return getTitle();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param text
     *            The item text
     * @param id
     *            The item id
     */
    public TemplateItem(String text, String id) {
        this.setTitle(text);
        this.setId(id);
    }

    /**
     * Returns the item text
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Sets the item text
     *
     * @param text
     *            text to set
     */
    public final void setTitle(String text) {
        mTitle = text;
    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }


    @Override
    public boolean equals(Object o) {
        return o instanceof TemplateItem && ((TemplateItem) o).mId == mId;
    }
}