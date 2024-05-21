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
    $com$example.Module1Data3Class = Module1Data3Class;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    $com$example.Module1DataClass = Module1DataClass;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    var $com$example$sub = $com$example.sub || ($com$example.sub = {});
    $com$example$sub.SubModule1Data2Class = SubModule1Data2Class;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    var $com$example$sub = $com$example.sub || ($com$example.sub = {});
    $com$example$sub.SubModule1Data3Class = SubModule1Data3Class;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    var $com$example$sub = $com$example.sub || ($com$example.sub = {});
    $com$example$sub.SubModule1DataClass = SubModule1DataClass;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    var $com$example$sub = $com$example.sub || ($com$example.sub = {});
    var $com$example$sub$amm = $com$example$sub.amm || ($com$example$sub.amm = {});
    $com$example$sub$amm.SubModule1Data2Class = SubModule1Data2Class_0;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    var $com$example$sub = $com$example.sub || ($com$example.sub = {});
    var $com$example$sub$amm = $com$example$sub.amm || ($com$example$sub.amm = {});
    $com$example$sub$amm.SubModule1Data3Class = SubModule1Data3Class_0;
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
    var $com$example$sub = $com$example.sub || ($com$example.sub = {});
    var $com$example$sub$amm = $com$example$sub.amm || ($com$example$sub.amm = {});
    $com$example$sub$amm.SubModule1DataClass = SubModule1DataClass_0;
}
```

Duplicate code:

```js
    var $com = _.com || (_.com = {});
    var $com$example = $com.example || ($com.example = {});
```
