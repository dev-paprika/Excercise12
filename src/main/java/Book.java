public class Book {

  private String title;
  private String author;
  private int number;

  /**
   * デフォルトコンストラクタ
   */
  public Book(){

  }

  /**
   * 引数ありのコンストラクタ
   *
   * @param title  　タイトル
   * @param author 　著者
   * @param number 　番号
   */
  public Book(String title, String author, int number) {
    this.title = title;
    this.author = author;
    this.number = number;
  }

  /**
   * 本の情報を表示するメソッド
   */
  public void displayInfo() {
    System.out.println("タイトル：" + this.title);
    System.out.println("著者：" + this.author);
    System.out.println("番号：" + this.number);
  }

  //getter , setter
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
