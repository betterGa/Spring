package com.bit.controller;

import com.bit.vo.items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//处理器Handler（控制器‘C’）

@WebServlet
public class showItemsController implements Controller {


    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
      List<items> itemsList=new ArrayList<items>();
      items items1=new items();
      items1.setItemsID(1);
      items1.setItemsName("thinkpad T590");
      items1.setItemsPrice("12000");
      items1.setItemsCreateTime(new Date());

        items items2=new items();
        items2.setItemsID(2);
        items2.setItemsName("thinkpad x390");
        items2.setItemsPrice("13800");
        items2.setItemsCreateTime(new Date());


        items items3=new items();
        items1.setItemsID(3);
        items1.setItemsName("Mac pro");
        items1.setItemsPrice("23000");
        items1.setItemsCreateTime(new Date());

      itemsList.add(items1);
      itemsList.add(items2);
      itemsList.add(items3);

      ModelAndView modelAndView=new ModelAndView();
      //request.setAttribute(key,value)
      modelAndView.addObject("itemsListKey",itemsList);
      //request.getRequestDispatcher("showItemList.jsp").forward(request,response);
      modelAndView.setViewName("showItemsList");

  return modelAndView;










    }
}
