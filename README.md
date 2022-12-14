# View

## ListView

### イベントの検知
```
list.setOnItemClickListener { av, view, position, id} -> {
  adapter.remove((view as TextView).text as String)
}
```

### 単一選択可能なリスト
複数のリスト項目から選択可能なリストを作れる  
activity_main.xml  
```
android:choiceMode="singleChoice"
```

# Adapter

## SimpleAdapter
SimpleAdapterによるカスタマイズは比較的簡単に実装できるが、  
データはTextViewにしか割り当てることができない、データソースはMap型のオブジェクトである必要がある。など、  
いくつかの制約がある。  
より柔軟なカスタマイズで実装したい場合には、自前のAdapterで実装する必要がある。

# Dialog

## 標準で利用できるダイアログ
  
| ダイアログ | 概要 |
----|---- 
| AlertDialog | 警告ダイアログ（オプションでボタン、ラジオボタン、チェックボックス等を表示可能） |
| DatePickerDialog | 日付選択ダイアログ |
| TimePickerDialog | 時刻選択ダイアログ |

## onCreateDialogメソッド
Dialogが生成されたタイミングで呼び出されるメソッド  
ダイアログを生成するためのコードはここに記述すること  


## 実装のポイント
* （アクティビティではなく、）フラグメントに実装するのが基本

# AndroidManufest.xml

## ポイント的な

```
<action android:name="android.intent.action.MAIN" />
<category android:name="android.intent.category.LAUNCHER" />
```
~~MAINは、そのアクティビティがエントリーポイントであることを示している。  
~~LAUNCHERは、アクティビティをランチャーに表示することを意味する。  

# 文法

## キャスト

### アンセーフキャスト
as演算子を利用すると、型キャストを行うことができる。  
もしキャストに失敗した場合はClassCastExceptionという例外がスローされてしまう。  
例外は適切に処理されなければ不具合のもとになるため、Kotlinではアンセーフキャストと呼ばれている。  
  
### セーフキャスト
as?演算子でnull安全の仕組みを利用して安全なキャストをすることができる。
こちらは、キャストしようとしてできなかった場合、nullが返る。
つまり、そもそも適切に処理をしないとビルドエラーになり、実行することができない。
