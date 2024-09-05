package raisetech.task;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  // 有効な電話番号の正規表現パターン
  private static final String PHONE_NUMBER_PATTERN = "^(070|080|090)\\d{8}$";

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        System.out.print("'-'なしで携帯電話番号を入力してください(終了するには 'exit' と入力): ");
        String input = scanner.nextLine().trim();

        // プログラム終了条件
        if (input.equalsIgnoreCase("exit")) {
          System.out.println("プログラムを終了します。");
          break;
        }

        // 入力が空文字の場合
        if (input.isEmpty()) {
          throw new IllegalArgumentException("入力が空です。携帯電話番号を入力してください。");
        }

        // 数字のみが入力されているか確認
        if (!input.matches("\\d+")) {
          throw new IllegalArgumentException("数字を入力してください。");
        }

        // 正規表現を使った検証
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(input);

        // 検証結果の表示
        if (matcher.matches()) {
          System.out.println(input + " は有効な携帯電話番号です。");
        } else {
          System.out.println(input + " は無効な携帯電話番号です。");
        }

      } catch (IllegalArgumentException e) {
        System.out.println("エラー: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("予期しないエラーが発生しました。お問い合わせセンターへ連絡してください");
      }
    }
    scanner.close();
  }
}
