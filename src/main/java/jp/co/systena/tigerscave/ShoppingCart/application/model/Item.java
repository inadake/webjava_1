package jp.co.systena.tigerscave.ShoppingCart.application.model;

public class Item {

  //商品名と価格
  private String name;
  private int price;

  //コンストラクタってやつ
  public Item(String name, int price){
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }



  /*必要なし　後で消す
  Item item_1 = new Item("商品A", 100);
  Item item_2 = new Item("商品B", 200);
  Item item_3 = new Item("商品C", 300);
  */

}
