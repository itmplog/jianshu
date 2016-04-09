package top.itmp.jianshu.model;

import java.util.ArrayList;

import top.itmp.dummy.Dummy;

/**
 * Created by hz on 2016/4/7.
 */
public class MenuItem {
    public ArrayList<String> dummys = Dummy.dummys(5);

    private String title;
    private int resId;

    public MenuItem(String title, int resId) {
        this.title = title;
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResourceId() {
        return resId;
    }

    public void setResourceId(int resId) {
        this.resId = resId;
    }


}
