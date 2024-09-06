# 初級理解度チェック
## 問題３
正規表現を使用して、ハイフン付きの国内携帯電話番号の有効性をチェックするプログラムを作成してください。有効な携帯電話番号の条件を自分で定義し、その条件に合致するかどうかを判定してください。
入力例:
    携帯電話番号を入力してください: 080-1234-5678

期待される出力例:
    080-1234-5678 は有効な携帯電話番号です。

入力例:
    携帯電話番号を入力してください: 08012345678

期待される出力例:
    08012345678 は無効な携帯電話番号です。

## 動作確認
有効な数字を入力した場合  
![有効な数字を入力した場合](https://github.com/user-attachments/assets/c521f543-649b-44e5-abfb-334a094b5cc4)
  
無効な数字を入力した場合  
![無効な数字を入力した場合](https://github.com/user-attachments/assets/0e43687b-2c01-4f74-90c8-9f280f34a1ea)
  
入力を空にした場合
![入力を空にした場合](https://github.com/user-attachments/assets/b4b498e1-b653-44b9-9a1b-61194247f796)
  
数字ではない文字を入力した場合  
![数字ではない文字を入力した場合](https://github.com/user-attachments/assets/d7803d43-b6a1-4a2b-939d-486361da5e89)
  
プログラムを終了する場合  
![プログラムを終了する場合](https://github.com/user-attachments/assets/40713f41-5498-487a-9de1-4727c89a0abd)
  
メモリ不足など、システムレベルの問題が発生した場合などで、予期しないバグが起きたときの例外も追加  
(例外は再現できなかったため、コードの写真を貼り付けました)  
![予期しないエラーが発生した場合](https://github.com/user-attachments/assets/a431b64a-a991-4593-92dd-37c7a5df9e29)

README
