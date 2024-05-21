Run `gradle assemble` 

Open `build/js/packages/kotlin-jsexport-duplicate-module2/kotlin/kotlin-jsexport-duplicate-module1.js`.

Find `function $jsExportAll$(_)`

You will see 

```js
  function $jsExportAll$(_) {
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    $com$example.Module1Data2Class = Module1Data2Class;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    $com$example.Module1DataClass = Module1DataClass;
  }
```

Duplicate code:

```js
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
```
