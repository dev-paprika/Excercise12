public class BusinessException extends  Exception{

  /**
   * 業務エラー用のException
   * @param message　メッセージ
   */
  public BusinessException(String message){
    super(message);
  }
}
