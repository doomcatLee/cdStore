
class CD{
  public String mName;
  public String mAlbum;
  public int mYear;
  public int mPrice;

  public String getName(){
    return mName;
  }

  public String getAlbum(){
    return mAlbum;
  }

  public int getYear(){
    return mYear;
  }

  public int getPrice(){
    return mPrice;
  }
  //override System.out.println
  public String toString(){
    return "Artist:" + mName + ", Album: " + mAlbum + ", Year: " + mYear + ", Price: $" + mPrice;
  }
}
