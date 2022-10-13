package com.amitaymolko.examplelistview;

public class MyItem {
    private int iconId;
    private String title;
    private String subtitle;

    public MyItem(int iconId, String title, String subtitle) {
        this.iconId = iconId;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
