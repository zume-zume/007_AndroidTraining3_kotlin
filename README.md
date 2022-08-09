# Androidアプリをkotlinで作ってみようの場

## ListView

### イベントの検知
```
list.setOnItemClickListener { av, view, position, id} -> {
  adapter.remove((view as TextView).text as String)
}
```

### aaaaa
aaa

### 単一選択可能なリスト
複数のリスト項目から選択可能なリストを作れる  
activity_main.xml  
```
android:choiceMode="singleChoice"
```

## キャスト
### 案セーフキャスト
### セーフキャスト
