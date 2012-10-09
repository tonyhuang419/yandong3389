// 定义映射关系集合
var pauseConditionMap = {};

/**
 * 用来暂停后续程序执行的方法
 * @param {} obj 目标对象
 * @param {} condition 判断执行后续程序的条件
 */
function pause(obj, condition) {
    if (pauseConditionMap[condition] >= 0) {
        return;
    }

    if (window.eventList == null) {
        window.eventList = new Array();
    }

    var index = - 1;
    for (var i = 0; i < window.eventList.length; ++i) {
        if (window.eventList[i] == null) {
            window.eventList[i] = obj;
            index = i;
            break;
        }
    }
    if (index == - 1) {
        index = window.eventList.length;
        window.eventList[index] = obj;
    }

    add(condition, index);

    var timer = setInterval(function() {
        if (eval(condition)) {
            var obj = window.eventList[pauseConditionMap[condition]];

            window.eventList[pauseConditionMap[condition]] = null;
            delete pauseConditionMap[condition];

            clearTimeout(timer);

            if (obj && obj.nextStep) {
                obj.nextStep();
            }
            else if (obj) {
                obj();
            }
        }
    }, 50);
}

/**
 * 将JSON对象转换为字符串
 * @param {} obj JSON对象
 * @return {} 字符串
 */
function jsonToString(obj) {
    var isArray = obj instanceof Array;
    var r = [];
    for (var i in obj) {
        var value = obj[i];
        if (typeof value == 'string') {
            value = '"' + value + '"';
        }
        else if (value != null && typeof value == 'object') {
            value = toJsonString(value);
        }
        r.push((isArray ? '' : i + ':') + value);
    }
    if (isArray) {
        return '[' + r.join(',') + ']';
    }
    else {
        return '{' + r.join(',') + '}';
    }
} 

/**
 * 将字符串转换为JSON对象
 * @param {} str 字符串
 * @return {} JSON对象
 */
function stringToJson(str) {
    try {
        return eval('(' + str + ')');
    }
    catch (e) {
        return null;
    }
}

/**
 * 为JSON对象添加键值对
 * @param {} condition 键
 * @param {} index 值
 */
function add(condition, index) {
    var str = jsonToString(pauseConditionMap);
    var str = str.substring(0, str.length - 1);

    var elem;
    if (str == "{") {
        elem = '\'' + condition + '\':' + index + '}';
    } else {
        elem = ',\'' + condition + '\':' + index + '}';
    }

    str = str.concat(elem);

    pauseConditionMap = stringToJson(str);
}

/**
 * 清除暂停事件
 * @param {} condition 判断执行后续程序的条件
 */
function clear(condition) {
    if (window.eventList != null && pauseConditionMap[condition] >= 0) {
        window.eventList[pauseConditionMap[condition]] = null;
        delete pauseConditionMap[condition];
    }
}

/**
 * 清除所有暂停事件
 */
function clearAll() {
    for (var key in pauseConditionMap) {
        window.eventList[pauseConditionMap[key]] = null;
        delete pauseConditionMap[key];
    }
}