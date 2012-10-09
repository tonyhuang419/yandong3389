function logout() {
    var scripts = document.getElementsByTagName("script");
    var importAlertFlag = false;
    var src;
    for (var i = 0; i < scripts.length; ++i) {
        src = scripts[i].src;
        if (src.indexOf("jquery.alerts.js") > 0) {
            importAlertFlag = true;
            break;
        }
    }

    if (importAlertFlag) {
        confirm('确认要退出系统吗？', function(result) {
            if (result) {
                window.location.href = 'ZZ0101Action_logout.action';
            }
        });
    }
    else {
        if (confirm('确认要退出系统吗？')) {
            window.location.href = 'ZZ0101Action_logout.action';
        }
    }
}