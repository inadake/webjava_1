package jp.co.systena.tigerscave.ShoppingCart.application.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.ShoppingCart.application.model.Item;



@Service
public class ListService {

  public List<Item> getItemList(){      //これstaticつけたらダメ？
    List<Item> items = new ArrayList<Item>();  //商品A,B,Cのオブジェクト作る
    items.add(new Item("商品A", 100));
    items.add(new Item("商品B", 200));
    items.add(new Item("商品C", 300));

    return items;
  }


}
