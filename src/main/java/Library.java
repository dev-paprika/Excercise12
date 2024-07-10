import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Library {

  private List<Book> bookList; //書籍リスト

  /**
   * デフォルトコンストラクタ
   */
  public Library(){

  }

  /**
   * 引数ありコンストラクタ
   *
   * @param bookList 　書籍リスト
   */
  public Library(List<Book> bookList) {
    this.bookList = bookList;
  }

  /**
   * タイトルで検索してみつかったら該当の本を返す
   *
   * @param title タイトル
   * @return Book 本
   */
  public Book searchTitle(String title) {
    Book targetBook = null;
    Optional<Book> book = bookList.stream()
        .filter(v -> v.getTitle().equals(title))
        .findFirst();
    if(book.isPresent()){
      targetBook =  (Book) book.get();
    }
    return  targetBook;

  }

  /*別解答
   *
   * 部分検索のメソッド
   * @param title
   * @return 書籍リスト

  public List<Book> searchPartialTitles(String title) {
    // titleをエスケープして、正規表現で使えるようにする
    String regex = ".*" + Pattern.quote(title) + ".*";
    List<Book> matchingBooks = bookList.stream()
        .filter(v -> v.getTitle().matches(regex))
        .toList();

    return matchingBooks;
  }
   */

  /**
   * 著者で検索してみつかったら該当の本を返す
   *
   * @param author タイトル
   * @return Book 本
   */
  public Book searchAuthor(String author) {
    Book targetBook = null;
    Optional<Book> book = bookList.stream().filter(v -> v.getAuthor().equals(author)).findFirst();
    if(book.isPresent()){
      targetBook =  (Book) book.get();
    }
    return  targetBook;
  }

  /**
   * 番号で検索してみつかったら該当の本を返す
   *
   * @param number タイトル
   * @return Book 本
   */
  public Book searchNumber(int number) {
    Book targetBook = null;
    Optional<Book> book = bookList.stream().filter(v -> v.getNumber() == number).findFirst();
    if(book.isPresent()){
      targetBook =  (Book) book.get();
    }
    return  targetBook;
  }

  //getter,setter

  public List<Book> getBookList() {
    return bookList;
  }

  public void setBookList(ArrayList<Book> bookList) {
    this.bookList = bookList;
  }
}
