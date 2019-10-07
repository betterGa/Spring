package com.bit.Pack;

import com.bit.po.Orderdetail;
import com.bit.po.UserEx;

import java.util.List;

public class UserPacking {
    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    private UserEx userEx;

    private List<Integer> ids;

    public UserEx getUserEx() {
        return userEx;
    }

    public void setUserEx(UserEx userEx) {
        this.userEx = userEx;
    }
}
