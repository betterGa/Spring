package com.bit.mapper;

import com.bit.po.Orderdetail;
import com.bit.po.Orders;
import com.bit.po.OrdersEx;

import java.util.List;

public interface OrderMapper {
    public List<OrdersEx> queryOrdersByUser() throws Exception;
    public List<Orderdetail> queryOrderByOrderdetails()throws Exception;
    public List<Orders>queryOrderByItems()throws Exception;

}
