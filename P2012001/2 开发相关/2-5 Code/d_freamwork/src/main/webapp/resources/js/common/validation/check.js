// type的值
// 名称 01
// 密码 02
// 邮箱 03
// 验证码 04
// 电话 05
// 邮政编码 06
// 船体编号 07
// 船舶呼号 08
/**
 * 给校验的画面绑定事件(页面加载时调用)
 * @param {} checkArray 画面check项数组
 * name 入力框的名字
 * requireFlag 是否为必填，必填：true
 * minLen 最小值
 * maxLen 最大值
 * message 输入提示消息 可以为""
 * callBack 需要后台校验时使用（注意callBack需要一个参数async,true为异步请求,false为同步请求。返回值：true 后台校验通过; false 调用默认错误消息 ;直接返回错误消息 ）
 * type 验证类型 01-08
 */
function bindChecks(checkArray) {
    // 验证参数的合法性
    if (! jQuery.isArray(checkArray)) {
        alert("请传递数组! 例如\n [{name:'name',requireFlag:'true',minLen:2,maxLen:20,message:'',callBack:'',type:'01'}\n,{name:'name',requireFlag:'true',minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
        return;
    }
    // 验证参数的合法性
    for (var i = 0; i < checkArray.length; i++) {
        // 默认值
        var defaultObj = {
            requireFlag : false,
            message : '',
            callBack : ''
        };
        // 设置默认值
        checkArray[i] = $.extend(defaultObj, checkArray[i]);
        if (checkArray[i].name == undefined) {
            alert("第"
                    + i
                    + "个，请设置name!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
        if (checkArray[i].minLen == undefined) {
            alert("第"
                    + i
                    + "个，请设置minLen!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
        if (checkArray[i].maxLen == undefined) {
            alert("第"
                    + i
                    + "个，请设置maxLen!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
        if (checkArray[i].type == undefined) {
            alert("第"
                    + i
                    + "个，请设置type!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
    }
    // 循环checkArray数组，分别绑定事件
    for (var i = 0; i < checkArray.length; i++) {
        // 循环对象
        var $obj = $("#" + checkArray[i].id);
        // 如果对象不存在，则忽略
        if ($obj.length == 0) {
            continue;
        }
        // 如果控件可用，则设置为其绑定方法
        if (! $obj.is(":disabled")) {
            // 给对象绑定check名称方法
            $obj.bindZZCheck(
                checkArray[i].name,
                checkArray[i].requireFlag,
                checkArray[i].minLen,
                checkArray[i].maxLen,
                checkArray[i].message,
                checkArray[i].callBack,
                checkArray[i].type
            );
        }
    }
}
/**
 * check所有checkArray(保存、修改按钮使用)
 * @param {} 画面check项数组
 * @return 是否有错误check
 */
function check(checkArray) {
    // 验证参数的合法性
    if (! jQuery.isArray(checkArray)) {
        alert("请传递数组! 例如\n [{name:'name',requireFlag:'true',minLen:2,maxLen:20,message:'',callBack:'',type:'01'}\n,{name:'name',requireFlag:'true',minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
        return;
    }
    // 验证参数的合法性
    for (var i = 0; i < checkArray.length; i++) {
        // 默认值
        var defaultObj = {
            requireFlag : false,
            message : '',
            callBack : ''
        };
        // 设置默认值
        checkArray[i] = $.extend(defaultObj, checkArray[i]);
        if (checkArray[i].name == undefined) {
            alert("第"
                    + i
                    + "个，请设置name!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
        if (checkArray[i].minLen == undefined) {
            alert("第"
                    + i
                    + "个，请设置minLen!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
        if (checkArray[i].maxLen == undefined) {
            alert("第"
                    + i
                    + "个，请设置maxLen!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
        if (checkArray[i].type == undefined) {
            alert("第"
                    + i
                    + "个，请设置type!例如\n [{name:'name',requireFlag:true,minLen:2,maxLen:20,message:'',callBack:'',type:'01'}]");
            return;
        }
    }
    // 默认焦点位置
    var focusPosition = - 1;
    // 循环checkArray
    for (var i = 0; i < checkArray.length; i++) {
        // 循环对象
        var $obj = $("#" + checkArray[i].id);
        // 如果对象不存在，则忽略
        if ($obj.length == 0) {
            continue;
        }
        // 如果控件可用，则执行
        if (! $obj.is(":disabled")) {
            // 解除绑定上的事件
            $obj.unbind("focus").unbind("keypress").unbind("blur");
            if (! $obj.ZZCheck(
                checkArray[i].name,
                checkArray[i].requireFlag,
                checkArray[i].minLen,
                checkArray[i].maxLen,
                checkArray[i].message,
                checkArray[i].callBack,
                checkArray[i].type
            )) {
                // 如果没有修改过，则修改为当前位置
                if (focusPosition == - 1) {
                    focusPosition = i;
                }
            }
        }
    }
    // 如果没有错误，返回true
    if (focusPosition == - 1) {
        bindChecks(checkArray);
        return true;
    }
    // 如果有错误，则设置焦点
    else {
        $('#' + checkArray[focusPosition].id).focus();
        setTimeout(function() {
            bindChecks(checkArray);
        }, 100);
        return false;
    }
}
;
// 追加的check方法
(function($) {
    // 返回check的方法
    function getFuntionName(type) {
        switch (type) {
            case "01" :
                return "ZZcheckName";
            case "02" :
                return "ZZcheckPassWord";
            case "03" :
                return "ZZcheckMail";
            case "04" :
                return "ZZcheckValidateCode";
            case "05" :
                return "ZZcheckTel";
            case "06" :
                return "ZZcheckPostcode";
            case "07" :
                return "ZZcheckVesselCode1";
            case "08" :
                return "ZZcheckVesselCode2";
            case "09" :
                return "ZZcheckUrl";
        }
    }
    // 名称校验方法
    $.fn.bindZZCheck = function(name, requireFlag, minLen, maxLen, message, callBack, type) {
        // 为文本框注册事件
        if ($(this).val() == '请输入' + name) {
            $(this).addClass("fontGray");
        }
        // 当鼠标得到焦点
        $(this).focus(function() {
            $(this).removeClass("fontGray");
            // 获取param_name文本框的内容 如果是“请输入变量名”将其清空
            if ("请输入" + name == $(this).val()) {
                $(this).val("");
            }
            if (message != "") {
                addMessage($(this).attr("id"), message, "msgblue", false);
            }
            else {
                addMessage($(this).attr("id"), "请输入" + minLen + "-" + maxLen + "个字符，推荐使用中文", "msgblue", false);
            }
        });
        // 当鼠标得到焦点
        $(this).keypress(function() {
            if (message != "") {
                addMessage($(this).attr("id"), message, "msgblue", false);
            }
            else {
                addMessage($(this).attr("id"), "请输入" + minLen + "-" + maxLen + "个字符，推荐使用中文", "msgblue", false);
            }
        });
        // 下拉框必选项校验
        if (requireFlag && $(this)[0].tagName == 'SELECT') {
            // 当鼠标点击文本框之后离开文本框并且点击其他位置时，文本框将恢复原来默认的文字
            $(this).change(function() {
                // 是必填项，并且结果为空
                if ("" == $.trim($(this).val())) {
                    addMessage($(this).attr("id"), "此项为必填项", "msgred", true);
                    return;
                }
                else {
                    addMessage($(this).attr("id"), "", "msggreen", false);
                }
            });
        }
        // 普通input框校验
        else {
            // 当鼠标点击文本框之后离开文本框并且点击其他位置时，文本框将恢复原来默认的文字
            $(this).blur(function() {
                // 不是必填项，并且内容为空
                if (! requireFlag && "" == $.trim($(this).val())) {
                    // 清空消息
                    clearMessage($(this).attr("id"));
                    return;
                }
                // 是必填项，并且结果为空
                if (requireFlag && "" == $.trim($(this).val())) {
                    addMessage($(this).attr("id"), "此项为必填项", "msgred", true);
                    return;
                }
                // 定义布尔类型变量
                var checkRepairyardSalsType = true;
                // 验证变量名是否合法
                checkRepairyardSalsType = eval(getFuntionName(type) + '($(this).val(), {min : minLen,max : maxLen})');
                // 如果不合法就返回
                if (! checkRepairyardSalsType) {
                    addMessage($(this).attr("id"), name + "格式不正确", "msgred", true);
                    return;
                }
                // 如果有callback
                if (callBack != null && callBack != "") {
                    // 同步aysn:false
                    callBack(false);
                }
                else {
                    addMessage($(this).attr("id"), "", "msggreen", false);
                }
            });
        }
    }
    // check
    $.fn.ZZCheck = function(name, requireFlag, minLen, maxLen, message, callBack, type) {
        // 不是必填项，并且内容为空
        if (! requireFlag && "" == $.trim($(this).val())) {
            // 清空消息
            clearMessage($(this).attr("id"));
            return true;
        }
        // 如果是空，并且为必填项
        if (requireFlag && "" == $.trim($(this).val())) {
            addMessage($(this).attr("id"), "此项为必填项", "msgred", true);
            return false;
        }
        // 定义布尔类型变量
        var checkRepairyardSalsType = true;
        // 验证变量名是否合法
        checkRepairyardSalsType = eval(getFuntionName(type) + '($(this).val(), {min : minLen,max : maxLen})');
        // 如果不合法就返回
        if (! checkRepairyardSalsType) {
            addMessage($(this).attr("id"), name + "格式不正确", "msgred", true);
            return false;
        }
        // TODO 如果有callback
        if (callBack != null && callBack != "") {
            // 返回的result 有时是boolean类型(调用check方法时,回调涵数中有返回值),有时是undefined(绑定验证时,回调涵数中没有返回值)
            var callBackResult = callBack();
            if (callBackResult != undefined) {
                return callBackResult;
            }
        }
        else {
            addMessage($(this).attr("id"), "", "msggreen", false);
        }
        return true;
    }
    /**
     * 在输入框中显示灰色的"请输入XXX"
     */
    $.fn.bindPleaseInput = function(name, message) {
        name_pleaseInput = name;
        message_pleaseInput = message;
        // 为param_name文本框注册事件
        if ($(this).val() == '请输入' + name) {
            $(this).addClass("fontGray");
        }
        $(this).focus(function() {
            // 获取param_name文本框的内容 如果是“请输入变量名”将其清空
            if ("请输入" + name == $(this).val()) {
                $(this).removeClass("fontGray");
                $(this).val("");
            }
        });
        // 当鼠标点击文本框之后离开文本框并且点击其他位置时，文本框将恢复原来默认的文字
        $(this).blur(function() {
            if ("" == $(this).val()) {
                $(this).val("请输入" + name);
                $(this).addClass("fontGray");
            }
        });
    }
    /**
     * 给输入框中赋值
     */
    $.fn.setValuePleaseInput = function(value, name, message) {
        if (value == '') {
            $(this).val('请输入' + name);
            $(this).addClass("fontGray");
        }
        else {
            $(this).val(value);
            $(this).removeClass("fontGray");
        }
    }
    /**
     * 取得输入框中的值
     */
    $.fn.getValuePleaseInput = function(name, message) {
        if ($(this).val() == '请输入' + name) {
            return '';
        }
        else {
            return $(this).val();
        }
    }
})(jQuery);
/**
 * check名称
 * @param value 传递的值
 * @param options 传递参数(默认值:required:false,min:2,max:20)
 * @return boolean
 */
function ZZcheckName(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        required : false,
        min : 2,
        max : 20
    }, options);
    var reg = /[!"#$%&'()*+\:;<=>?[\]^`|~\t\n\x0B\f\r￥]+/;
    // 如果是必填项
    if (options.required) {
        if (value == null || value == "") {
            return false;
        }
    }
    else {
        // 如果不是必填项，并且为空，则返回true
        if (value == null || value == "") {
            return true;
        }
        // 如果不为空，则判断长度
        else {
            if (value.length < options.min || value.length > options.max) {
                return false;
            }
        }
    }
    // 校验字符串
    if (! reg.test(value)) {
        return true;
    }
    // 如果校验未成功,不显示提示信息
    else {
        return false;
    }
}
/**
 * 密码check
 * @param value 传递的值
 * @param options 传递参数(默认值:min:6,max:20)
 * @return boolean
 */
function ZZcheckPassWord(value, options) {
    options = jQuery.extend({
        min : 6,
        max : 20
    }, options);
    if (value.length < options.min || value.length > options.max) {
        return false;
    }
    return true;
}
/**
 * mailcheck
 * @param value 传递的值
 * @param options 传递参数(默认值:min:1,max:99)
 * @return boolean
 */
function ZZcheckMail(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 1,
        max : 99
    }, options);
    // 判断邮箱是否按规则填写
    var reg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}
/**
 * ValidateCodecheck
 * @param value 传递的值
 * @param options 传递参数(默认值:min:4,max:4)
 * @return boolean
 */
function ZZcheckValidateCode(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 4,
        max : 4
    }, options);
    // 判断邮箱是否按规则填写
    var reg = /^[a-zA-Z0-9]+$/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}
/**
 * 电话check
 * @param value 传递的值
 * @param options 传递参数(默认值:min:1,max:20)
 * @return boolean
 */
function ZZcheckTel(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 1,
        max : 20
    }, options);
    // 判断邮箱是否按规则填写
    var reg = /(^[0-9\+\-]+$)/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}
/**
 * 邮编check
 * @param value 传递的值
 * @param options 传递参数(默认值:min:6,max:6)
 * @return boolean
 */
function ZZcheckPostcode(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 6,
        max : 6
    }, options);
    // 判断邮箱是否按规则填写
    var reg = /^[0-9]*$/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}
/**
 * check船体编号
 * @param value 传递的值
 * @param options 传递参数(默认值:min:2,max:20)
 * @return boolean
 */
function ZZcheckVesselCode1(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 2,
        max : 20
    }, options);
    var reg = /^[a-zA-Z0-9-_]+$/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}
/**
 * check船舶呼号
 * @param value 传递的值
 * @param options 传递参数(默认值:min:2,max:8)
 * @return boolean
 */
function ZZcheckVesselCode2(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 2,
        max : 8
    }, options);
    var reg = /^[a-zA-Z0-9-_]+$/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}
/**
 * check网址
 * @param value 传递的值
 * @param options 传递参数(默认值:min:2,max:8)
 * @return boolean
 */
function ZZcheckUrl(value, options) {
    // 去除首尾空格
    value = $.trim(value);
    options = jQuery.extend({
        min : 2,
        max : 8
    }, options);
    var reg = /[A-Za-z0-9]+\.[A-Za-z0-9]+[\/=\?%\-&_~`@[\]\':+!]*([^<>\"\"])*$/;
    // 如果不是必填项，并且为空，则返回true
    if (value == null || value == "") {
        return true;
    }
    // 如果不为空，则判断长度
    else {
        if (value.length < options.min || value.length > options.max || ! reg.test(value)) {
            return false;
        }
        return true;
    }
}