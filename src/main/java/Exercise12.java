import java.util.List;
import java.util.Scanner;

public class Exercise12 {

  public static void main(String[] args) {

    //書籍リストの生成
    List<Book> bookList = List.of(
        new Book("ドラえもん", "藤子不二雄", 1),
        new Book("吾輩は猫である", "夏目漱石", 2),
        new Book("若草物語", "アンネ・フランク", 3)

    );
    //書籍リストをもつ図書館オブジェクトを生成
    Library library = new Library(bookList);

    Scanner scanner = new Scanner(System.in);
    System.out.println("ようこそ！");
    System.out.println("書籍を検索できます。\n");
    System.out.println("1: タイトル検索　2: 著者検索　3: 番号検索");
    System.out.print("検索する番号を選んでください : ");
    int input = Integer.parseInt(scanner.nextLine());
    // 入力値によってタイトルを変更させる
    Book serchBook = null;
    switch (input) {
      case 1 -> {
        System.out.print("お探しのタイトルを入力してください : ");
        serchBook = library.searchTitle(scanner.nextLine());
      }
      case 2 -> {
        System.out.print("お探しの著者を入力してください : ");
        serchBook = library.searchAuthor(scanner.nextLine());
      }
      case 3 -> {
        System.out.print("お探しの番号を入力してください : ");
        serchBook = library.searchNumber(scanner.nextInt());
      }
    }
    System.out.println();
    try {

      if (serchBook != null) {
        //検索結果が存在した場合
        System.out.println("検索結果です。");
        serchBook.displayInfo();
      } else {
        //存在しない場合は例外にする
        throw new BusinessException("検索した本はありませんでした。");
      }

    } catch (BusinessException e) {
      e.getStackTrace();
      System.out.println(e.getMessage());
      System.out.println(e.getStackTrace());
    }
  }
}
