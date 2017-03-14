
class CD{
  public String mName;
  public String mAlbum;
  public int mYear;
  public double mPrice;

  public String getName(){
    return mName;
  }

  public String getAlbum(){
    return mAlbum;
  }

  public int getYear(){
    return mYear;
  }

  public double getPrice(){
    return mPrice;
  }

  public void setPrice(double price){
    mPrice = price;
  }
  //override System.out.println
  public String toString(){
    return "Artist:" + mName + ", Album: " + mAlbum + ", Year: " + mYear + ", Price: $" + mPrice;
  }
}
