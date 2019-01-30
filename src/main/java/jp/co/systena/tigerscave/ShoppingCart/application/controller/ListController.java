package jp.co.systena.tigerscave.ShoppingCart.application.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.ShoppingCart.application.model.Item;
import jp.co.systena.tigerscave.ShoppingCart.application.service.ListService;


@Controller
public class ListController {

  //ここにAutowired
  @Autowired
  HttpSession session;

  @RequestMapping(value = "/ListView", method = RequestMethod.GET)
  public ModelAndView show(ModelAndView mav) {     //商品の一覧を表示する

//    ListForm listForm = (ListForm) session.getAttribute("form");
//    session.removeAttribute("form");
//    if (listForm != null) {
//      mav.addObject("listForm", listForm.getItems()+"を購入しました");
//    }
//    mav.addObject("listForm", new ListForm());

    ListService listservice = new ListService();    //非staticメソッドを参照する
    //List<Item> items = (List<Item>) session.getAttribute("itemList");
    List<Item> items = listservice.getItemList();
    if( items == null) {
        items = new ArrayList<Item>();
        session.setAttribute("itemList", items);
    }


    //List<Item> items = listservice.getItemList();
    mav.addObject("items", items);

    //System.out.println("item!");  //確認用

//    BindingResult bindingResult = (BindingResult) session.getAttribute("result");
//    if (bindingResult != null) {
//      mav.addObject("bindingResult", bindingResult);
//    }

    mav.setViewName("ListView");
    return mav;


  }
}